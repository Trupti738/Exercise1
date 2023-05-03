package org.example;

import org.openqa.selenium.By;

public class VotePage extends Utils{
    public  void VerifyUserShouldAbleToVote(){
        //click on good button
        clickOnElement(By.id("pollanswers-2"));
        //Click on vote button
        clickOnElement(By.id("vote-poll-1"));
    }}

