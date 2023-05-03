package org.example;

import org.openqa.selenium.By;

public class ElectronicPage extends Utils{
    public  void verifyUserBeAbleToAddElectronicsItems(){
        //click on electronics
        clickOnElement((By.linkText("Electronics")));
        //click on camera and photo
        clickOnElement(By.linkText("Camera & photo"));
        //add digital camera
        clickOnElement(By.linkText("Leica T Mirrorless Digital Camera"));
        clickOnElement(By.id("add-to-cart-button-16"));
        //click on shopping cart
        clickOnElement(By.linkText("Shopping cart"));


}}
