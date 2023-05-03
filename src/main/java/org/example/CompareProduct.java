package org.example;

import org.openqa.selenium.By;

public class CompareProduct extends Utils {
    public  void verifyUserBeAbleToCompareProduct(){

        clickOnElement(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
        //click compare button
        clickOnElement(By.xpath("//div[@class='compare-products']/button"));
        //select product
        clickOnElement(By.linkText("Gift Cards"));
        clickOnElement(By.linkText("$25 Virtual Gift Card"));
        clickOnElement(By.xpath("//div[@class='compare-products']/button"));
        //product comparison
        clickOnElement(By.linkText("product comparison"));
        String actualMessage = getTextFromElement(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
        System.out.println("My Message :" + actualMessage);
        String actualMessage1 = getTextFromElement(By.linkText("$25 Virtual Gift Card"));
        System.out.println("My Message :" + actualMessage1);

        clickOnElement(By.className("clear-list"));
        String actualMessage2 = getTextFromElement(By.className("no-data"));

}}
