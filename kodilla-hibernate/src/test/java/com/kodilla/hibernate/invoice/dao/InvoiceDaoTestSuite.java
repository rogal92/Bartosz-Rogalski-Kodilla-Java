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
        Product productTwo = new Product( "ProductTwo");
        Item item = new Item(product, new BigDecimal("500"),1000,new BigDecimal("1000"));
      //  Item itemTwo = new Item();
        Invoice invoice = new Invoice( "number");
        invoice.addItem(item);
      //  invoice.addItem(itemTwo);

        //When
        invoiceDao.save(invoice);

        //Then
    }
}
