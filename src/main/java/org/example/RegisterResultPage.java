package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;


public class RegisterResultPage extends Utils {

        static String enterRegistrationDetails= "Your registration completed";


        public void verifyUserRegisterSuccessfully(){
            String actualMessage=getTextFromElement(By.className("result"));
            System.out.println("My message: "+actualMessage);
            Assert.assertEquals(actualMessage,enterRegistrationDetails,"Your registration completed");


        }}



