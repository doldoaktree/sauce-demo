package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planittesting.model.pages.LoginPage;

public class LoginTest extends BaseTest {
    // @Test
    // public void verifyRequiredFieldsError() {
    //     var requiredFieldsError = new LoginPage(driver)
    //         .clickLoginButton()
    //         .getRequiredFieldsError();
        
    //     assertEquals("Epic sadface: Username is required", requiredFieldsError);
    // }

    // @Test
    // public void verifySuccessfulLogin() {
    //     var isThereLogout = new LoginPage(driver)
    //         .setUserName("standard_user")
    //         .setPassword("secret_sauce")
    //         .clickLoginButton()
    //         .clickBurgerMenu()
    //         .isLogoutOptionVisible();
        
    //         assertEquals(true, isThereLogout);
    // }
}
