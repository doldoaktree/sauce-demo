package com.planittesting.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends LoginPage{

    public CartPage (WebDriver driver) {
        super(driver);
    }

    public String getProductName(int index) {
        return driver.findElements(By.className("inventory_item_name")).get(index).getText();
    }

    public CheckOutPage clickCheckOutButton() {
        driver.findElement(By.id("checkout")).click();
        return new CheckOutPage(driver);
    }
}
