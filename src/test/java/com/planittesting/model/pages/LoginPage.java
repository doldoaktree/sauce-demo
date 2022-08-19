package com.planittesting.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setCredentials(String userName, String password) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public InventoryPage clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
        return new InventoryPage(driver);
    }

    public LoginPage clickLoginButtonFailure() {
        driver.findElement(By.id("login-button")).click();
        return this;
    }

    public String getRequiredFieldsError() {
        return driver.findElement(By.className("error-message-container")).getText();
    }
}
