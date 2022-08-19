TEST CASES FOR https://www.saucedemo.com/

user flow 
    non logged in user
    log in
    add item 
    goto shopping cart 
    checkout 
    checkout step 1 page fill up information
    checkout step 2 page - finish
    checkout complete page 

1. Verify successful login.
2. Be able to click "Add To Cart", see item(s) on shopping cart and pay.
3. Be able to see products in shopping cart and remove button working.
4. Be able to click checkout successfully.
5. Verify First Name, Last Name and Postal Code are saved to database when continue button is clicked.
6. Verify correct product and total price showing in checkout overview (step 2).
7. Click finish button and verify "THANK YOU FOR YOUR ORDER" is shown.

Implement:
Inventory Page
    Checking add to cart and remove button
   
1.Click Add to cart
   Assert remove button is displayed.

2. Click Add to cart 
    Assert shopping cart badge is shown.

3. Click Add to cart (multiple times)
    Assert shopping cart badge number increasing corresponds to times clicked.

Cart Page

1. Verify that product clicked is displayed in cart page.
    ClickAddtoCart
    ClickShoppingCart
    
    Assert product title is correct.
    Assert price is correct.
    Assert quantity is correct.


2.
    ClickCheckoutButton
    SetFirstName
    SetLastName
    SetZipCode

    Assert payment information is correct.
    Assert total price is the sum of 2 products.

    clickFinishButton

    Assert checkout is complete by checking for confirmation.





