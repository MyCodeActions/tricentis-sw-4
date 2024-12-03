package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElectronicsPage extends Utility {

    By electronicsTab = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
    By cellPhonesLink = By.partialLinkText("Cell");
    By cellPhonesHeaderText = By.xpath("//h1[normalize-space()='Cell phones']");
    By viewAsDropdown = By.xpath("//select[@id='products-viewmode']");
    By smartphoneLink = By.xpath("//a[normalize-space()='Smartphone']");
    By smartphoneHeaderText = By.xpath("//h1[normalize-space()='Smartphone']");
    By priceText = By.xpath("(//span[@class='price-value-43'])[1]");
    By quantityInput = By.xpath("(//input[@id='addtocart_43_EnteredQuantity'])[1]");
    By addToCartButton = By.xpath("(//input[@id='add-to-cart-button-43'])[1]");
    By greenBarMessage = By.xpath("(//p[@class='content'])[1]");
    By closeBarButton = By.xpath("//span[@title='Close']");
    By shoppingCartIcon = By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']");
    By shoppingCartHeader = By.xpath("//span[normalize-space()='Shopping cart']");
    By agreeTermsCheckbox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By registerButton = By.xpath("//input[@value='Register']");
    By registerHeader = By.tagName("h1");
    By genderMaleRadio = By.xpath("//input[@id='gender-male']");
    By firstNameInput = By.xpath("//input[@id='FirstName']");
    By lastNameInput = By.xpath("//input[@id='LastName']");
    By emailInput = By.xpath("//input[@id='Email']");
    By passwordInput = By.xpath("//input[@id='Password']");
    By confirmPasswordInput = By.xpath("//input[@id='ConfirmPassword']");
    By registerSubmitButton = By.xpath("//input[@id='register-button']");
    By billingContinueButton = By.xpath("//input[@onclick='Billing.save()']");
    By shippingContinueButton = By.xpath("//input[@onclick='Shipping.save()']");
    By shippingMethodRadio = By.xpath("(//input[@id='shippingoption_2'])[1]");
    By shippingMethodContinueButton = By.xpath("(//input[@class='button-1 shipping-method-next-step-button'])[1]");
    By paymentMethodRadio = By.xpath("(//input[@id='paymentmethod_2'])[1]");
    By paymentMethodContinueButton = By.xpath("(//input[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardTypeDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardholderNameInput = By.xpath("//input[@id='CardholderName']");
    By cardNumberInput = By.xpath("//input[@id='CardNumber']");
    By expireMonthDropdown = By.xpath("//select[@id='ExpireMonth']");
    By expireYearDropdown = By.xpath("//select[@id='ExpireYear']");
    By cardCodeInput = By.xpath("//input[@id='CardCode']");
    By paymentInfoContinueButton = By.xpath("(//input[@class='button-1 payment-info-next-step-button'])[1]");
    By confirmOrderButton = By.xpath("//input[@value='Confirm']");
    By thankYouHeader = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessMessage = By.tagName("strong");
    By logoutLink = By.xpath("//a[normalize-space()='Log out']");
    By addToCartCheckOut = By.cssSelector("#add-to-cart-button-43");


    public void hoverOnElectronicsTab() {
        mouseToElement(electronicsTab);
    }

    public void clickOnCellPhones() {
        mouseHoverAndClick(cellPhonesLink);
    }

    public String getCellPhonesHeaderText() {
        return getTextFromElement(cellPhonesHeaderText);
    }

    public void navigateToCellPhones() {
        mouseToElement(electronicsTab);
        mouseHoverAndClick(cellPhonesLink);
    }

    public void selectViewAsList() {
        selectFromDropDown(viewAsDropdown, "List");
    }

    public void selectSmartphone() {
        clickOnElement(smartphoneLink);
    }


    public void addToCart(String quantity) {
        WebElement qtyInput = driver.findElement(quantityInput);
        qtyInput.clear();
        qtyInput.sendKeys(quantity);
        //  clickOnElement(addToCartButton);
    }

    public void addToCardCheckOutClick() {
        clickOnElement(addToCartCheckOut);
    }

    public void tickcheckboxTerms() {
        clickOnElement(agreeTermsCheckbox);

    }

    public void proceedToCheckout() {
        clickOnElement(checkoutButton);
    }


    public void registerUser(String firstName, String lastName, String email, String password) {
        clickOnElement(registerButton);
        clickOnElement(genderMaleRadio);
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(confirmPasswordInput).sendKeys(password);
        clickOnElement(registerSubmitButton);
    }

    public void completeOrder(String cardHolderName, String cardNumber, String month, String year, String code) {
        clickOnElement(paymentMethodRadio);
        clickOnElement(paymentMethodContinueButton);
        selectFromDropDown(creditCardTypeDropdown, "Visa");
        driver.findElement(cardholderNameInput).sendKeys(cardHolderName);
        driver.findElement(cardNumberInput).sendKeys(cardNumber);
        selectFromDropDown(expireMonthDropdown, month);
        selectFromDropDown(expireYearDropdown, year);
        driver.findElement(cardCodeInput).sendKeys(code);
        clickOnElement(paymentInfoContinueButton);
        clickOnElement(confirmOrderButton);
    }

    public void verifySmartphoneDetails(String smartphone, String s) {
    }
}

