package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



    public class TestSuit1 extends BaseTest {

        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        RegisterResultPage registerResultPage = new RegisterResultPage();
        LoginPage loginPage = new LoginPage();

        VotePage votePage = new VotePage();
        VoteResultPage voteResultPage = new VoteResultPage();

        EmailPage emailPage = new EmailPage();

        EmailResultPage emailPageResult = new EmailResultPage();

        CompareProduct compareProduct = new CompareProduct();
        CompareResultPage compareResultPage = new CompareResultPage();

        ElectronicPage electronicPage = new ElectronicPage();

        ElectronicResultPage electronicResultPage = new ElectronicResultPage();

        ReferAfriend referAFriend = new ReferAfriend();
        VoteNumberPage voteNumberPage = new VoteNumberPage();

        VoteNumberResultPage voteNumberResult = new VoteNumberResultPage();

        @Test
        public void verifyUserShouldBeAbleToRegisterSuccessfully() {

            //click on register button
            homePage.clickOnRegisterButton();
            //fill in registration details
            registerPage.enterRegistrationDetails();
            //verify user registered successfully
            registerResultPage.verifyUserRegisterSuccessfully();

        }
        @Test
        public void verifyUserShouldBeAbleToVote() {

            votePage.VerifyUserShouldAbleToVote() ;{
            }

        }
        @Test
        public void verifyUserShouldBeAbleToEmail() {

            emailPage.clickOnElement(By.linkText("Apple MacBook Pro 13-inch"));

            emailPageResult.clickOnElement(By.className("email-a-friend"));

        }
        @Test
        public void verifyUserBeAbleToAddElectronicsItems() {


            // ElectronicItemResult
            ElectronicPage.clickOnElement(By.linkText("Shopping cart"));

    }@Test
        public void verifyUserShouldBeAbleToVoteNumber() {


            //clickOnElement(By.id("pollanswers-2"));
            //clickOnElement(By.id("vote-poll-1"));



        }
        @Test
        public void verifyUserShouldRefferTotheFriend() {

            //click on regsiter button
            homePage.clickOnRegisterButton();
//        fill in registration details
            registerPage.enterRegistrationDetails();

            ReferAfriend.clickOnElement(By.className("ico-login"));

            ReferAfriend.clickOnElement(By.id("Email"));

        }
        @Test
        public void verifyUserBeAbleToCompareProduct() {

            compareProduct.verifyUserBeAbleToCompareProduct();
    }}



