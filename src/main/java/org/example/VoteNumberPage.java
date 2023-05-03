package org.example;

import org.openqa.selenium.By;

public class VoteNumberPage extends Utils{
    public  void verifyUserShouldBeAbleToVoteNumber  ()     {
        clickOnElement(By.className("ico-register"));
        //type first name
        typeText(By.id("FirstName"), "ram");
        //type last name
        typeText(By.id("LastName"), "patel");
        //type email address
        typeText(By.name("Email"), "ram123@gmail.com");
        //type password
        typeText(By.id("Password"), "ram1234");
        //type confirm password
        typeText(By.id("ConfirmPassword"), "ram1234");
        typeText(By.id("Email"), "ram123@gmail.com");
        // Enter Password
        typeText(By.id("Password"), "ram1234");
        clickOnElement(By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]"));
        //click on good
        // clickOnElement(By.id("pollanswers-2"));
        // Do Vote
        clickOnElement(By.id("vote-poll-1"));
    }}

