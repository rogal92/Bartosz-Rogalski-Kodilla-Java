package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
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
        Product productTwo = new Product("ProductTwo");
        Product productThree = new Product("ProductThree");
        Item item = new Item(product, new BigDecimal("500"),1000,new BigDecimal("1000"));
        Item itemTwo = new Item(productTwo, new BigDecimal("300"),2000,new BigDecimal("500"));
        Item itemThree = new Item(productThree,new BigDecimal("350"),2000,new BigDecimal("600"));
        Invoice invoice = new Invoice( "number");
        invoice.addItem(item);
        invoice.addItem(itemTwo);
        invoice.addItem(itemThree);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findOne(id);
        Assert.assertEquals(id,readInvoice.getId());
    }
}
