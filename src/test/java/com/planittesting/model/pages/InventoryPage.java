package com.planittesting.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public InventoryPage clickAddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        return this;
    }

    public String findShoppingCartBadge() {
       return driver.findElement(By.id("shopping_cart_badge")).getText();
    }
}
