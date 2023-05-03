package org.example;

import org.openqa.selenium.By;

public class VoteNumberResultPage extends Utils {
    private By _VoteNumberResult = By.className("result");
    String expectedMessage="Only registered users can vote.";
    public void VerifyUserShouldAbleToVoteNumber() {



        String actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:" + actualMessage);
        // Expected message
}}
