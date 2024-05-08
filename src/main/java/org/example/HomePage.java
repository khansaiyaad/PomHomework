package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends Utils{
    private By _registerButton= By.className("ico-register");
    private By _loginButton=By.className("ico-login");
    private By _electronic=By.linkText("Electronics");
    private By _builyourowncomputer=By.xpath("//a[text()='Build your own computer']");
    private By _computer=By.xpath("//a[text()='Computers ']");
    private By _searchbutton=By.xpath("//button[@class='button-1 search-box-button']");
    private By _voteButton=By.id("vote-poll-1");
    private By _facebookButton=By.linkText("Facebook");
    private By _homePageTitle = By.xpath("//div[@class='topic-block-title']/h2");
    private By _twitterbutton=By.xpath("//ul/li[@class='twitter']");
    private By _details=By.xpath("//div[@class='news-items']/div[2]/div[3]//a[@class='read-more']");

    public void clickOnRegister(){
        clickOnElement(_registerButton);
    }
    public void clickOnLogin(){
        clickOnElement(_loginButton);
    }
    public void clickOnElectronic(){
        clickOnElement(_electronic);
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(_builyourowncomputer);
    }
    public void clickOnComputer(){
        clickOnElement(_computer);
    }
public void acceptAlert(){
       waitForAlert(5);
       alertHandle();
}
public void clickOnFacebook(){
        clickOnElement(_facebookButton);
}
    public void clickOnTwitter(){
        clickOnElement(_twitterbutton);
    }
public void clickOnSearch(){
        clickOnElement(_searchbutton);
}

public void clickOnVoteButton() {
        clickOnElement(_voteButton);
}
public void voteAlert(){
        waitForAlert(5);
        voteAlertHandle();
}

public void clickOnDetail(){
        clickOnElement(_details);
}
    //Create method For Select Euro Currency
    public void selectEuroCurrency()
    {
        Select select = new Select(driver.findElement(By.id("customerCurrency")));
        select.selectByIndex(1);
        alertWait();
    }
    public void toVerifyProductPriceContainsEuroSign()
    {
        String expectedProductName = getText(By.xpath("//div[@class='prices']"));
        Assert.assertTrue(expectedProductName.startsWith("€"),"Product Price Does Not Contain €");
        System.out.println("products contain euro sign.");
    }
    //Create method For Select Usd Currency
    public void selectUsdCurrency()
    {

        WebElement Usd = driver.findElement(By.id("customerCurrency"));
        Select select = new Select(Usd);
        select.selectByIndex(0);

    }
    public void toVerifyProductPriceContainsDollerSign()
    {
        String expectedProductName = getText(By.xpath("//div[@class='prices']"));
        Assert.assertTrue(expectedProductName.startsWith("$"),"Product Price Does Not Contain $");
        System.out.println("products contain '$' sign");
    }
    public void searchNikeProduct()
    {
        typeText(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"),"Nike");
    }
}