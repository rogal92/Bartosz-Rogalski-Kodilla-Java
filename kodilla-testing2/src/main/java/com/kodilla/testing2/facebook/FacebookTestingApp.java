package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {

    public static final String XPATH_SELECTDAY = "//div[contains(@class, \"_5k_5/span/span/select[1]";
    public static final String XPATH_SELECTMONTH = "//div[contains(@class, \"_5k_5/span/span/select/select[2]";
    public static final String XPATH_SELECTYEAR = "//div[contains(@class, \"_5k_5/span/span/select/select/select[3]";

    public static void main(String[] args) {

        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        WebElement selectCombo = webDriver.findElement(By.xpath(XPATH_SELECTDAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);

        WebElement selectComboTwo = webDriver.findElement(By.xpath(XPATH_SELECTMONTH));
        Select selectBoard = new Select(selectComboTwo);
        selectBoard.selectByIndex(2);

        WebElement selectComboThree = webDriver.findElement(By.xpath(XPATH_SELECTYEAR));
        Select selectBoard = new Select(selectComboThree);
        selectBoard.selectByIndex(3);
    }
}