package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.planittesting.model.pages.LoginPage;

public class InventoryTests extends BaseTest {
    @Test
    public void verifyShoppingCartBadgeDisplayed() {
        var isShoppingCartBadgeDisplayed = new LoginPage(driver)
            .setCredentials (
                "standard_user", 
                "secret_sauce"
                )    
            .clickLoginButton() //now on inventory page
            .clickAddToCart()
            .isShoppingCartBadgeVisible();

        assertEquals(true, isShoppingCartBadgeDisplayed);
    }
}
