package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {
    LoadProp loadprop = new LoadProp();
    //type email
    String Email = loadprop.getProperty("emailpart1") + recentDate() + "@gmail.com";
    public String email = "saiyaad" + recentDate() + "@gmail.com";
    public String password = "abcdefgh";
    public String friendemail = "friend@gmail.com";
    public String message = "hey, have a look at this product";

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    public static String recentDate() {
        DateFormat dateformat = new SimpleDateFormat("yyyyMMddhhmmss");
        Date date = new Date();
        return dateformat.format(date);
    }

    public static void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void takeScreenshot(String text) {
        TakesScreenshot scrshot = ((TakesScreenshot) driver);
        File SrcFile = scrshot.getScreenshotAs(OutputType.FILE);
        File Dest = new File("src\\Screenshot\\" + text + recentDate() + ".png");
        try {
            FileUtils.copyFile(SrcFile, Dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void waitForElementToBeClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementToBeselected(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }

    public static void waitForElementToPresentText(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }

    public static void waitForAttributeToShowValue(By by, int time, String attr, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.attributeToBe(by, attr, value));
    }

    public static void waitForNumberofWindows(int time, int n) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));
    }

    public static void waitForElementToBeChecked(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void waitForElementToBeCheckedText(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by, "Element not present"));
    }

    public static void waitForElementToBeSelectionState(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementSelectionStateToBe(by, true));
    }

    public static void waitForElementToBeVisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public static void waitForAlert( int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
