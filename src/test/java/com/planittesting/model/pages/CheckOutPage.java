package com.planittesting.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public CheckOutPage setCheckOutForm(String firstName, String lastName, String zipCode) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(zipCode);
        return this;
    }

    public CheckOutPage clickCheckOutButton() {
        driver.findElement(By.id("continue")).click();
        return this;
    }

    public String getPaymentInformation() {
        return driver.findElement(By.className("summary_value_label")).getText();
    }

    public Double totalPriceInCheckout() {
        var listOfPrices = driver.findElements(By.className("inventory_item_price"));
        Double totalPrice = 0.0;

        for (int i = 0; i < listOfPrices.size(); i++) {
            Double price = Double.parseDouble(listOfPrices.get(i).getText().replace("$", ""));
            totalPrice = totalPrice + price;
        }

        return totalPrice;
    }
}
