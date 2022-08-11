package com.planittesting.model.pages;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public InventoryPage clickAddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        return this;
    }

    // public Boolean isShoppingCartBadgeVisible() {
    //     return new WebDriverWait(driver, Duration.ofSeconds(4))
    //         .until(driver -> {
    //             var isThereShoppingBadge = driver.findElement(By.id("shopping_cart_badge"));            
    //         });
    // }

    public WebElement isShoppingCartBadgeVisible() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
           return wait.until(driver -> driver.findElement(By.className("shopping_cart_badge")));
    }
}
