package org.example;

import org.openqa.selenium.By;

public class EmailPage extends Utils {
    public void VerifyUserShouldAbleToEmail(){
        //click on Apple MacBook
        clickOnElement(By.linkText("Apple MacBook Pro 13-inch"));
        //click email a friend
        clickOnElement((By.className("email-a-friend")));
        //type friend email
        typeText(By.className("friend-email"),"001+"+timestamp()+"@gmail.com");
        //type your email
        typeText(By.className("your-email"),"002+"+timestamp()+"@mail.com");

        typeText(By.id("PersonalMessage"),"here is your mac");
        clickOnElement(By.name("send-email"));

}}
