package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
    public static void handleAlert() {

        // Alert Message handling

//        driver.findElement(by).click();
        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();
        String actualalert = "Please enter some search keyword";
        if (alertMessage.equalsIgnoreCase(actualalert)) {

            // Displaying alert message
            System.out.println(alertMessage);
//make seperate method for wait and wait get text.
            // Accepting alert
            alert.accept();
        }
    }
    public static void alertWait()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
        public static void alertHandle(){
            Alert alert1 = driver.switchTo().alert(); // switch to alert
            String alert1Message= driver.switchTo().alert().getText(); // capture alert message
            Assert.assertEquals(alert1Message,"Please enter some search keyword","alert message does not match");
            alert1.accept();
        }
    public static void voteAlertHandle(){
        Alert alert1 = driver.switchTo().alert(); // switch to alert

        String alert1Message= driver.switchTo().alert().getText(); // capture alert message
        Assert.assertEquals(alert1Message,"Please select an answer","alert message does not match");
        alert1.accept();
    }

    public static void elementToBeClickableForCookies()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']"))).click();
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
    public static String getCssValue(By  by, String text){
        return driver.findElement(by).getCssValue("text");
    }
    public static String getAttribute(By  by, String text){
        return driver.findElement(by).getAttribute("text");
    }
}
