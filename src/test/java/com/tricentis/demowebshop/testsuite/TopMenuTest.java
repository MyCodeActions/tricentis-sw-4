package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {


    // create a method with the name "selectMenu()" It has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        clickOnElement(By.xpath(menu));
    }

    //  create the @Test method name verifyPageNavigation(). Use the selectMenu() method to select the Menu and click on it and verify the page navigation
    @Test
    public void verifyPageNavigation() {

        selectMenu("Books");
        String expectedText = "BOOKS";
        String actualText = driver.findElement(By.xpath("(//a[normalize-space()='Books'])[1]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
