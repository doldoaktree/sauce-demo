package com.planittesting.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    
    public String findProductTitle() {
        return driver.findElement(By.className("title")).getText();
    }
}
