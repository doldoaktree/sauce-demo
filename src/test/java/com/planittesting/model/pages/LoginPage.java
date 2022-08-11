package com.planittesting.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
        return this;
    }

    public String getRequiredFieldsError() {
       return driver.findElement(By.className("error-message-container")).getText();
    }

    public LoginPage setUserName(String userName) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        return this;
    }

    public LoginPage setPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }
}
