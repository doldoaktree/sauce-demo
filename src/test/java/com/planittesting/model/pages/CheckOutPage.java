package com.planittesting.model.pages;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;
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

    public double totalPriceInCheckout() {
        var listOfPrices = driver.findElements(By.className("inventory_item_price"));
        double itemTotal = 0.0;
        double totalPriceBeforeTax = 0.0;

        for (int i = 0; i < listOfPrices.size(); i++) {
            totalPriceBeforeTax = Double.parseDouble(listOfPrices.get(i).getText().replace("$", ""));
            itemTotal = itemTotal + totalPriceBeforeTax;
        }

        double tax = itemTotal * 0.08;
        double priceAfterTax = itemTotal + tax;

        
        double output = Double.parseDouble(Double.toString(priceAfterTax));

        String formatter = "##.##";
        DecimalFormat df = new DecimalFormat(formatter);

        return Double.parseDouble(df.format(output));
    }
}
