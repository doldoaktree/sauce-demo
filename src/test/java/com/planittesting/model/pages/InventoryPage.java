package com.planittesting.model.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public InventoryPage clickAddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        return this;
    }

    public InventoryPage clickBurgerMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        return this;
    }

    public WebElement isShoppingCartBadgeVisible() {
        return driver.findElement(By.className("shopping_cart_badge"));
    }

    public Boolean isLogoutOptionVisible() {
        return new WebDriverWait(driver, Duration.ofSeconds(4))
            .until(driver -> {
               var element = driver.findElement(By.id("logout_sidebar_link"));
               return element.getText().trim().toUpperCase().equals("LOGOUT");
            });
    }
}
