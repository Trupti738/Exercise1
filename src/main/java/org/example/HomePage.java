package org.example;


import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;


public class HomePage extends Utils {


        By _registerButton = By.className("ico-register");
    By _VoteResult = By.id("pollanswers-2");
    By _VotePage = By.id("vote-poll-1");

        public void clickOnRegisterButton() {
            clickOnElement(_registerButton);
        }
            public void clickOnVoteResult(){
                clickOnElement(_VoteResult);

            }
            public void clickOnVotePage(){
                clickOnElement(_VotePage);
            }


        }

