package org.example;

import org.openqa.selenium.By;


public class RegisterPage extends Utils {

        private By _FirstName = By.id("FirstName");
        private By _LastName = By.id("LastName");
        private By _Email = By.name("Email");
        private By _Password = By.name("Password");
        private By _ConfirmPassword = By.id("ConfirmPassword");
        private By _RegisterButton = By.id("register-button");
        public void enterRegistrationDetails(){
            typeText(_FirstName,"raj");
            //type last name
            typeText(_LastName,"patel");
            //type  email address
            typeText(_Email,"rp28+"+ timestamp()+"+@gmail.com");
            //type password
            typeText(_Password,"test1234");
            //type confirm password
            typeText(_ConfirmPassword,"test1234");
            //click on register submit button
            clickOnElement(_RegisterButton);
        }
    }



