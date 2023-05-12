package org.example;
import org.openqa.selenium.By;


public class Electronics extends Utills{
    By _cameraAndPhoto = By.linkText("Camera & photo");
    public void CameraAndPhoto(){
        //connect with Xpath
        clickOnElement(_cameraAndPhoto);
    }
}
