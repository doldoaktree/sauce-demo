package com.planittesting.model.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    
    public String findProductTitle() {
        return driver.findElement(By.className("title")).getText();
    }

    public InventoryPage clickBurgerMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        return new InventoryPage(driver);
    }

    public Boolean isLogoutOptionVisible() {
        return new WebDriverWait(driver, Duration.ofSeconds(4))
            .until(driver -> {
               var element = driver.findElement(By.id("logout_sidebar_link"));
               return element.getText().trim().toUpperCase().equals("LOGOUT");
            });
    }
}
