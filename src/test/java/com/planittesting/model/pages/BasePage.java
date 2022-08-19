package com.planittesting.model.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    
    public String findProductTitle() {
        return driver.findElement(By.className("title")).getText();
    }
    
    public List<WebElement> getShoppingCartBadge() {
        return driver.findElements(By.className("shopping_cart_badge"));
     } 
}
