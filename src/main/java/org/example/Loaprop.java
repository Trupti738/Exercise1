package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static org.example.BasePage.driver;
import static org.example.Utills.currentTimeStamp;

public class Loaprop extends Utills{
    public static void captureScreenShot(String fileName) {
        TakesScreenshot scrShot
                = ((TakesScreenshot) driver);

        File
                SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new
                File("scr\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + "png");

        try {
            FileUtils.copyFile(SrcFile, destFile);
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}
