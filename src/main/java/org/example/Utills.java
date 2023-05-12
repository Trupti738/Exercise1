package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;


import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
    public class Utills extends BasePage {
        public static void clickOnElement(By by) {
            driver.findElement(by).click();
        }

        public static void typeText(By by, String text) {
            driver.findElement(by).sendKeys(text);
        }

        public static String getTextFromElement(By by) {
            return driver.findElement(by).getText();
        }

        public static long timestamp() {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            return timestamp.getTime();
        }

        //
        public static void selectDropdownByValue(By by, String value) {
            Select select = new Select(driver.findElement(by));
            select.selectByValue(value);
        }

        public static void selectDropdownByText(By by, String text) {
            Select select = new Select(driver.findElement(by));
            select.selectByVisibleText(text);
        }

        public static void selectDropdownByIndex(By by, int index) {
            Select select = new Select(driver.findElement(by));
            select.selectByIndex(index);
        }

        public static void waitForClickable(By by, int timeInSec) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }

        public static void selectDropdownByIndex(By by) {
            Select select = new Select(driver.findElement(by));
        }

        public static void chooseOption(By by) {
            driver.findElement(by).getLocation();
        }

        public static void clickOnRadioButtonElement(By by) {
            driver.findElement(by).click();
        }

        public static String currentTimeStamp() {
            Date date = new Date();
            SimpleDateFormat sdf = new
                    SimpleDateFormat("ddMMyyhhmmss");
            return sdf.format(date);
        }

        public static void captureScreenShot(String fileName) {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File
                    SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File destFile = new
                    File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + "png");


        try{
            FileUtils.copyFile(SrcFile, destFile);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}


