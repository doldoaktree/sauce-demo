package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planittesting.model.pages.InventoryPage;

public class InventoryTests extends BaseTest {
    @Test
    public void verifyShoppingCartBadgeVisible() {
         var isShoppingCartBadgeVisible = new InventoryPage(driver)
            .clickAddToCart()
            .findShoppingCartBadge(); 

            assertEquals("1", isShoppingCartBadgeVisible);
    }
}
