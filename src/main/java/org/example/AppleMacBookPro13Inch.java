package org.example;
import org.openqa.selenium.By;

public class AppleMacBookPro13Inch extends Utills{
    //Click on email a friend button
    By _emailAFriend = By.className("email-a-friend");
    public void emailAFriend() {
        // click on emain a friend button
        clickOnElement(_emailAFriend);

}}
