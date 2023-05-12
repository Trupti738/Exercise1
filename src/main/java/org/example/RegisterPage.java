package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage extends Utills {
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _email = By.name("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton = By.id("register-button");
    By _dateOfBirth =By.name("DateOfBirthDay");
    public void enterRegistrationDetailsWithTimestamp(){
        // Fill all mandatory details
        typeText(_firstName, "Manhar");
        typeText(_lastName, "Arya");
        selectDropdownByValue(_dateOfBirth, "26");
        selectDropdownByIndex(_monthOFBirth, 6);
        selectDropdownByText(_yearOfBirth,"1982" );
        typeText(_email, "truptipatel11+"+timestamp()+"@gmail.com");
        typeText(_password, "1212aabb");
        typeText(_confirmPassword, "1212aabb");
        // Click register submit button
        clickOnElement(_registerButton);
    }
    public void enterRegistrationDetails(){
        // Fill all mandatory details
        typeText(_firstName, "Trupti");
        typeText(_lastName, "patel");
        typeText(_email, "trupti[atel25@gmail.com");
        typeText(_password, "1212abab");
        typeText(_confirmPassword, "1111aaaa");
        // Click register submit button
        clickOnElement(_registerButton);
    }
    public static void main(String[] args) {
        Select select = new Select(driver.findElement(By.name("country")));
    }}





