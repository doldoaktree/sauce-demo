package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.planittesting.model.pages.LoginPage;

public class CartTests extends BaseTest {

    @Test
    public void verifyProductInCart() {
        var cartPage = new LoginPage(driver)
                .setCredentials(
                        "standard_user",
                        "secret_sauce")
                .clickLoginButton()
                .clickAddToCart(0)
                .clickAddToCart(1)
                .clickShoppingCart(); // now on CartPage

        var productName1 = cartPage.getProductName(0);
        var productName2 = cartPage.getProductName(1);

        assertEquals("Sauce Labs Backpack", productName1);
        assertEquals("Sauce Labs Bike Light", productName2);
    }
}
