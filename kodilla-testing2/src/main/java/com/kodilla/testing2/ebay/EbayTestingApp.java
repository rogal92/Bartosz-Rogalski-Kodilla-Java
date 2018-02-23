package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {

    public static final String NAME = "gh-la";
    public static void main(String [] args) {

        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.ebay.com");

        WebElement searchField = webDriver.findElement(By.name(NAME));
        searchField.sendKeys("laptop");
        searchField.submit();
    }
}
