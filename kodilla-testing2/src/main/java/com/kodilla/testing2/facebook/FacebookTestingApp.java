package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECTDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECTMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECTYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        WebElement selectCombo = webDriver.findElement(By.xpath(XPATH_SELECTDAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(31);

        WebElement selectComboTwo = webDriver.findElement(By.xpath(XPATH_SELECTMONTH));
        Select selectBoardTwo = new Select(selectComboTwo);
        selectBoardTwo.selectByIndex(10);

        WebElement selectComboThree = webDriver.findElement(By.xpath(XPATH_SELECTYEAR));
        Select selectBoardThree = new Select(selectComboThree);
        selectBoardThree.selectByIndex(27);
    }
}