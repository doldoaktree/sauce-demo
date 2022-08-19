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

    public InventoryPage clickAddToCart(int index) {
        driver.findElements(By.className("btn_inventory")).get(index).click();
        return this;
    }

    public InventoryPage clickBurgerMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        return this;
    }

    public Boolean isShoppingCartBadgeVisible() {
        return !getShoppingCartBadge().isEmpty();
    }

    public Boolean isLogoutButtonDisplayed() {
        return new WebDriverWait(driver, Duration.ofSeconds(4))
                .until(driver -> {
                    var element = driver.findElement(By.id("logout_sidebar_link"));
                    return element.getText().trim().toUpperCase().equals("LOGOUT");
                });
    }

    public WebElement getRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public CartPage clickShoppingCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
        return new CartPage(driver);
    }

}
