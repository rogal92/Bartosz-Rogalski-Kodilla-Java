package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("ProductOne");
        Item item = new Item(product, new BigDecimal("500"),1000,new BigDecimal("1000"));
        Invoice invoice = new Invoice( "number");
        invoice.addItem(item);

        //When
        invoiceDao.save(invoice);

        //Then
    }
}
