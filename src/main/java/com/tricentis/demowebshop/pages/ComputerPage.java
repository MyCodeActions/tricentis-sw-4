package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComputerPage extends Utility {

    By computersMenu = By.xpath("(//a[normalize-space()='Computers'])[1]");
    By productElements = By.xpath("//h2[@class='product-title']/a");
    By desktopsOption = By.linkText("Desktops");
    By sortByDropdown = By.xpath("//select[@id='products-orderby']");
    By buildYourOwnComputer = By.partialLinkText("Build your own computer");
    By buildYourOwnComputerText = By.tagName("h1");
    By processorDropdown = By.xpath("(//select[@id='product_attribute_16_6_5'])[1]");
    By hddRadioButton = By.xpath("(//input[@id='product_attribute_16_3_6_19'])[1]");
    By osRadioButton = By.xpath("(//input[@id='product_attribute_16_4_7_21'])[1]");
    By microsoftOfficeCheckbox = By.xpath("(//input[@id='product_attribute_16_8_8_24'])[1]");
    By priceText = By.xpath("(//span[@class='price-value-16'])[1]");
    By addToCartButton = By.id("add-to-cart-button-16");
    By greenBarMessage = By.xpath("//p[@class='content']");
    By closeBarButton = By.xpath("//span[@title='Close']");
    By shoppingCartMenu = By.xpath("//span[normalize-space()='Shopping cart']");
    By goToCartButton = By.xpath("//input[@value='Go to cart']");
    By shoppingCartText = By.xpath("(//h1[normalize-space()='Shopping cart'])[1]");
    By quantityInput = By.cssSelector(".qty-input");
    By updateCartButton = By.name("updatecart");
    By totalPriceText = By.xpath("//span[@class='product-subtotal']");
    By agreeTermsCheckbox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.id("checkout");
    By welcomeText = By.tagName("h1");
    By checkoutAsGuestButton = By.xpath("//input[@value='Checkout as Guest']");
    By firstNameInput = By.id("BillingNewAddress_FirstName");
    By lastNameInput = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailInput = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityInput = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressInput = By.xpath("(//input[@id='BillingNewAddress_Address1'])[1]");
    By zipInput = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneInput = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By billingContinueButton = By.xpath("//input[@onclick='Billing.save()']");
    By shippingContinueButton = By.xpath("//input[@onclick='Shipping.save()']");
    By nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_1']");
    By shippingMethodContinueButton = By.xpath("(//input[@class='button-1 shipping-method-next-step-button'])[1]");
    By creditCardRadioButton = By.xpath("(//input[@id='paymentmethod_2'])[1]");
    By paymentMethodContinueButton = By.xpath("(//input[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameInput = By.xpath("//input[@id='CardholderName']");
    By cardNumberInput = By.xpath("//input[@id='CardNumber']");
    By cardExpireMonthDropdown = By.xpath("//select[@id='ExpireMonth']");
    By cardExpireYearDropdown = By.xpath("//select[@id='ExpireYear']");
    By cardCodeInput = By.xpath("//input[@id='CardCode']");
    By paymentInfoContinueButton = By.xpath("(//input[@class='button-1 payment-info-next-step-button'])[1]");
    By paymentMethodText = By.xpath("//li[@class='payment-method']");
    By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    By orderTotalPrice = By.xpath("//span[@class='product-price order-total']//strong[contains(text(),'2980.00')]");
    By confirmOrderButton = By.xpath("//input[@value='Confirm']");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By welcomeToStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");


    public void navigateToDesktops() {
        clickOnElement(computersMenu);
        clickOnElement(desktopsOption);
    }

    public void sortProductsByName(String sortByOption) {
        selectFromDropDown(sortByDropdown, sortByOption);
    }

    public List<WebElement> getListOfProduct(){
        return getWebElements(productElements);
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
    }

    // For Assert
    public String verifyProductTitle() {
        return getTextFromElement(buildYourOwnComputerText);
    }


    public void selectProcessor(int index) {
        selectByIndexFromDropdown(processorDropdown, index);
    }

    public void selectHDD() {
        clickOnElement(hddRadioButton);
    }

    public void selectOS() {
        clickOnElement(osRadioButton);
    }

    public void selectMicrosoftOffice() {
        clickOnElement(microsoftOfficeCheckbox);
    }

    public String verifyPrice() {
        return getTextFromElement(priceText);
    }

    public void addToCart() {
        clickOnElement(addToCartButton);
    }

    public String verifyGreenBarMessage() {
        return getTextFromElement(greenBarMessage);
    }

    public void closeGreenBar() {
        clickOnElement(closeBarButton);
    }

    public void proceedToShoppingCart() {
        mouseToElement(shoppingCartMenu);
        clickOnElement(goToCartButton);
    }

    public String verifyShoppingCartPage() {
        return getTextFromElement(shoppingCartText);
    }

    public void updateCartQuantity(String quantity) {
        WebElement qty = driver.findElement(quantityInput);
        qty.clear();
        qty.sendKeys(quantity);
        clickOnElement(updateCartButton);
    }

    public void agreeToTermsAndCheckout() {
        clickOnElement(agreeTermsCheckbox);
        clickOnElement(checkoutButton);
    }

    public void checkOutAsGuest() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void fillBillingDetails(String firstName, String lastName, String email, String country, String city, String address, String zip, String phone) {
        sendTextToElement(firstNameInput, firstName);
        sendTextToElement(lastNameInput, lastName);
        sendTextToElement(emailInput, email);
        selectFromDropDown(countryDropdown, country);
        sendTextToElement(cityInput, city);
        sendTextToElement(addressInput, address);
        sendTextToElement(zipInput, zip);
        sendTextToElement(phoneInput, phone);
        clickOnElement(billingContinueButton);
    }

    public void proceedToShippingMethod() {
        clickOnElement(shippingContinueButton);
        clickOnElement(nextDayAirRadioButton);
        clickOnElement(shippingMethodContinueButton);
    }

    public void selectPaymentMethod() {
        clickOnElement(creditCardRadioButton);
        clickOnElement(paymentMethodContinueButton);
    }

    public void enterPaymentDetails(String cardType, String cardHolderName, String cardNumber, String expireMonth, String expireYear, String cardCode) {
        selectFromDropDown(creditCardDropdown, cardType);
        sendTextToElement(cardHolderNameInput, cardHolderName);
        sendTextToElement(cardNumberInput, cardNumber);
        selectFromDropDown(cardExpireMonthDropdown, expireMonth);
        selectFromDropDown(cardExpireYearDropdown, expireYear);
        sendTextToElement(cardCodeInput, cardCode);
        clickOnElement(paymentInfoContinueButton);
    }

    public void confirmOrder() {
        clickOnElement(confirmOrderButton);
    }

    public void finalizedOrder() {
        clickOnElement(continueButton);
    }

}







