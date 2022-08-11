package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.planittesting.model.pages.InventoryPage;
import com.planittesting.model.pages.LoginPage;

public class InventoryTests extends BaseTest {
    @Test
    public void verifyShoppingCartBadgeVisible() {
        new LoginPage(driver)
            .setCredentials (
                "standard_user", 
                "secret_sauce"
                )    
            .clickLoginButton(); //now on inventory page

        var isShoppingCartBadgeDisplayed = new InventoryPage(driver)
                                .clickAddToCart()
                                .isShoppingCartBadgeVisible(); 

        assertEquals("1", isShoppingCartBadgeDisplayed.getText());
    }
}
