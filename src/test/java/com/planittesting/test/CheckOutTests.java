package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planittesting.model.pages.LoginPage;

public class CheckOutTests extends BaseTest {

    @Test
    public void verifyCheckoutInformation() {
        var checkOutPage = new LoginPage(driver)
                .setCredentials(
                        "standard_user",
                        "secret_sauce")
                .clickLoginButton()
                .clickAddToCart(0)
                .clickAddToCart(1)
                .clickShoppingCart()
                .clickCheckOutButton()
                .setCheckOutForm("Bear", "Smith", "1234")
                .clickCheckOutButton();

        var paymentInformation = checkOutPage.getPaymentInformation();
        var totalPrice = checkOutPage.totalPriceInCheckout();

        assertEquals("SauceCard #31337", paymentInformation);
        assertEquals(43.18, totalPrice);
    }
}
