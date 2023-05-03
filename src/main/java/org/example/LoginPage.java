package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    private By _acontainsclassiconlogin = By.xpath("//a[contains(@class,'ico-login')]");
    private By _inputcontainclassemail = By.xpath( "//input[contains(@class,'email')]");
    private By _inputcontainclasspassword = By.xpath("//input[contains(@class,'password')]");
    private By _buttonstartswithclassbuttonloginbutton = By.xpath("//button[Start-with(@class,'button-1 login-button')]");
    public void enterTheLoginDetails(){

        clickOnElement(_acontainsclassiconlogin);

        typeText((_inputcontainclassemail),"ram123@gmail.com");

        typeText((_inputcontainclasspassword),"ram1234");

        clickOnElement(_buttonstartswithclassbuttonloginbutton);

    }
}
