package org.example;
import org.openqa.selenium.By;

public class GiftCard extends Utills{
    By _$25VirtualGiftCard = By.linkText("$25 Virtual Gift Card");
    public void clickOn$25VirtualGiftCard(){
        //connect with Xpath
        clickOnElement(_$25VirtualGiftCard);
    }
}
