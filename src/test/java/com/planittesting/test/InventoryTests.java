package com.planittesting.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.planittesting.model.pages.LoginPage;

public class InventoryTests extends BaseTest {
    @Test
    public void verifyShoppingCartBadgeDisplayed() {
        var inventoryPage = new LoginPage(driver)
                .setCredentials(
                        "standard_user",
                        "secret_sauce")
                .clickLoginButton() // now on inventory page
                .clickAddToCart(0)
                .clickAddToCart(1);

        var isShoppingCartBadgeDisplayed = inventoryPage.isShoppingCartBadgeVisible();
        var numberOfCartItems = Integer.parseInt(inventoryPage.getShoppingCartBadge().get(0).getText());

        assertEquals(true, isShoppingCartBadgeDisplayed);
        assertEquals(2, numberOfCartItems);
    }

    // Inventory Page
    // Checking add to cart and remove button

    // 1.Click Add to cart
    // Assert remove button is displayed.

    // 2. Click Add to cart
    // Assert shopping cart badge is shown.

    // 3. Click Add to cart (multiple times)
    // Assert shopping cart badge number increasing corresponds to times clicked.

    @Test
    public void verifyRemoveButtonisDisplayed() {
        var removeButton = new LoginPage(driver)
                .setCredentials("standard_user",
                        "secret_sauce")
                .clickLoginButton() // now on inventory page
                .clickAddToCart(0)
                .getRemoveButton();

        assertEquals("REMOVE", removeButton.getText());
    }

}
