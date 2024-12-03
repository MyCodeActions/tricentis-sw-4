package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    ComputerPage computerPage = new ComputerPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        // Navigate to desktops
        computerPage.navigateToDesktops();

        // Select Sort By option "Name: Z to A"
        computerPage.sortProductsByName("Name: Z to A");

        //  Verify the products are arranged in descending order
        List<String> actualProductNames = new ArrayList<>();
        for (WebElement product : computerPage.getListOfProduct()) {
            actualProductNames.add(product.getText());
        }

        // Create a sorted copy of the product names in descending order
        List<String> expectedProductNames = new ArrayList<>(actualProductNames);
        Collections.sort(expectedProductNames, Collections.reverseOrder());

        // Assert that the product names are sorted correctly
        Assert.assertEquals(actualProductNames, expectedProductNames, "Products are not sorted in descending order!");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

        // Click on the the Desktop.
        computerPage.navigateToDesktops();

        // Select Sort By option "Name: A to Z"
        computerPage.sortProductsByName("Name: A to Z");

        //  Click on the "Add To Cart" button of the product name ‘Build your own computer’
        computerPage.clickOnBuildYourOwnComputer();

        //  Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = computerPage.verifyProductTitle();
        Assert.assertEquals(actualText, expectedText, "Product text does not match.");


        //  Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        computerPage.selectProcessor(2);

        //  Select HDD radio button "400 GB [+$100.00]"
        computerPage.selectHDD();

        //  Select the OS radio button "Windows 10 [+$60.00]"
        computerPage.selectOS();

        // Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computerPage.selectMicrosoftOffice();

        //  Verify the price "1200.00"
        String expectedPrice = "1200.00";
        String actualPrice = computerPage.verifyPrice();
        Assert.assertEquals(actualPrice, expectedPrice);

        //  Click on the "Add to card" Button
        computerPage.addToCart();

        // Verify the Message "The product has been added to your shopping cart" on the Top green Bar
        String expectedMessageGreenBar = "The product has been added to your shopping cart";
        String actualMesageGreenBar = computerPage.verifyGreenBarMessage();
        Assert.assertEquals(actualMesageGreenBar, expectedMessageGreenBar);

        // After that close the bar by clicking on the cross button.
        computerPage.closeGreenBar();

        // Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        computerPage.proceedToShoppingCart();

        // Verify the message "Shopping cart"
        String expectedShoppinngCartMessage = "Shopping cart";
        String actualShoppinngCartMessage = computerPage.verifyShoppingCartPage();
        Assert.assertEquals(actualShoppinngCartMessage, expectedShoppinngCartMessage);

        // Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.updateCartQuantity("2");

        // click on the checkbox “I agree with the terms of service”
        computerPage.agreeToTermsAndCheckout();
        //   Thread.sleep(2000);

        computerPage.checkOutAsGuest();

        computerPage.fillBillingDetails("Prashant", "Patel", "patel123@gmail.com", "United Kingdom", "London", "Oxford Street", "NA1 2AB", "079876543");
        computerPage.proceedToShippingMethod();

        computerPage.selectPaymentMethod();
        computerPage.enterPaymentDetails("Master card", "Prashant P", "567583940349293",
                "08", "2029", "325");

        // Confirm the order
        computerPage.confirmOrder();

        // Verify order confirmation
        String expectedPaymentMethod = "Shopping cart";
        String actualPaymentMethod = computerPage.verifyShoppingCartPage();
        Assert.assertEquals(actualShoppinngCartMessage, expectedShoppinngCartMessage);

        // Finalize order and verify welcome message
        computerPage.finalizedOrder();

    }
}
