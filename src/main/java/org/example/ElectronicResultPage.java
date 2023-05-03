package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class ElectronicResultPage extends Utils {
    private By _result = By.className("result");

    String expectedMessage ="product not adding";

    public void verifyUserBeAbleToAddElectronicsItems(){


        Assert.assertEquals(getTextFromElement(_result),expectedMessage,"product not adding");




}}
