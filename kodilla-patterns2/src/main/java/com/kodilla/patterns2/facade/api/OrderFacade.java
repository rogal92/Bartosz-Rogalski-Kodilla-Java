package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.Order;
import com.kodilla.patterns2.facade.ShopService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class  OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);


    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
    "&& args(userId) && target(order)")

    public void processOrder(final OrderDto order, final Long userId)
        throws OrderProcessingException {

        LOGGER.info("Order: " + order.getItems().iterator() + ", Args: " + userId);

        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new order, ID: " + orderId);
        if(orderId < 0) {
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORIZED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORIZED);
        }
        try {
            for (ItemDto orderItem : order.getItems()) {
                LOGGER.info("Adding item " + orderItem.getProductId() + "," +
                orderItem.getQuantity() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Order value is: "+ value + " USD");
            if(!shopService.doPayment(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_NOT_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_NOT_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order was done");
            if(!shopService.verifyOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if(!shopService.submitOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("Order " + orderId + " submitted");
        } finally {
            if (wasError) {
                LOGGER.info("Cancelling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }
}
