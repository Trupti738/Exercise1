package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailResultPage extends Utils{
    private By _result = By.className("result");

    String expectedMessage ="Only registered user can Email";


    public void VerifyUserShouldAbleToEmail(){

        Assert.assertEquals(getTextFromElement(_result),expectedMessage,"Only registered user can Email");
}}
