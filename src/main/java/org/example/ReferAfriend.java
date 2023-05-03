package org.example;

import org.openqa.selenium.By;

public class ReferAfriend extends Utils {
    public void verifyUserShouldReferAFriend() {
        clickOnElement(By.className("ico-register"));
        //type first name
        typeText(By.id("FirstName"), "ram");
        //type last name
        typeText(By.id("LastName"), "patel");
        //type email address
        typeText(By.name("Email"), "ram1234@gmail.com");
        //type password
        typeText(By.id("Password"), "ram1234");
        //type confirm password
        typeText(By.id("ConfirmPassword"), "ram1234");
        clickOnElement(By.id("register-button"));
        //click on login button
        clickOnElement(By.className("ico-login"));
        //Type  email address
        typeText(By.id("Email"), "ram1234@gmail.com");



    }}
