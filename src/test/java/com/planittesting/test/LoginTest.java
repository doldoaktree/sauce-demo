package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planittesting.model.pages.InventoryPage;
import com.planittesting.model.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void verifyRequiredFieldsError() {
        var requiredFieldsError = new LoginPage(driver)
            .clickLoginButton()
            .getRequiredFieldsError();
        
        assertEquals("Epic sadface: Username is required", requiredFieldsError);
    }

    @Test
    public void verifySuccessfulLogin() {
        new LoginPage(driver)
            .setCredentials(
                "standard_user", 
                "secret_sauce")
            .clickLoginButton(); //now on Inventory Page
            
        var isThereLogout = new InventoryPage(driver)
            .clickBurgerMenu()
            .isLogoutOptionVisible();
        
            assertEquals(true, isThereLogout);
    }
}
