package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.ElectronicsPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // Mouse Hover on Electronics Tab
        electronicsPage.hoverOnElectronicsTab();

        // Mouse Hover and Click on Cell Phones
        electronicsPage.clickOnCellPhones();

        // Verify the text "Cell Phones
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getCellPhonesHeaderText();
        Assert.assertEquals(actualText, expectedText, "Cell phones page is not displayed!");
    }

    @Test
    public void verifyProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        // Navigate to Cell Phones
        electronicsPage.navigateToCellPhones();

        // Select Smartphone and verify details
        electronicsPage.selectViewAsList();
        electronicsPage.selectSmartphone();
        electronicsPage.verifySmartphoneDetails("Smartphone", "100.00");

        // Add to cart
        electronicsPage.addToCart("2");
        electronicsPage.addToCardCheckOutClick();
        // Proceed to Checkout
        electronicsPage.tickcheckboxTerms();
        electronicsPage.proceedToCheckout();
        // Register User
        electronicsPage.registerUser("Prashant", "Patel", "233prashant@gmail.com", "123456");

        // Complete Order
        electronicsPage.completeOrder("Prashant K", "567583940349293", "07", "2027", "231");

    }
}
