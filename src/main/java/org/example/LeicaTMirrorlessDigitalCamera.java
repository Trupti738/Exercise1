package org.example;
import org.openqa.selenium.By;
public class LeicaTMirrorlessDigitalCamera extends Utills{
    By _addToCartButton16 = By.id("add-to-cart-button-16");
    // Click on Shopping cart
    By _shoppingCart = By.linkText("Shopping cart");
    public void addToCartButton16(){
        //connect with Xpath
        clickOnElement(_addToCartButton16);
    }
    public void shoppingCart() {
        //connect with Xpath
        clickOnElement(_shoppingCart);

    }}
