package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    //creating objects of the classes we require to use in our testcase
    HomePage homepage=new HomePage();
    RegisterPage registerpage=new RegisterPage();
    RegisterResultPage registeresultpage=new RegisterResultPage();
    LoginPage loginpage=new LoginPage();
    ElectronicPage electronicpage=new ElectronicPage();
    CameraPage camerapage=new CameraPage();
    LeicaTPage leicatpage=new LeicaTPage();
    ProductEmailPage productemailpage=new ProductEmailPage();
    BuildYourOwnCompPage buildyourown=new BuildYourOwnCompPage();
    DesktopPage desktopPage=new DesktopPage();
    ComputerPage computerPage=new ComputerPage();
    FacebookPage facebookpage=new FacebookPage();
    HomeVerificationPage homeverificationpage=new HomeVerificationPage();
    NewReleasePage newreleasepage=new NewReleasePage();
    NikePage nikepage=new NikePage();
@Test                                     // to verify user is registered successfully
 public void verifyUserIsAbleToRegisteredSuccessfully(){
    //driver.navigate().refresh();///forward and back
    //open browser through before method
    // click on register on home page
     homepage.clickOnRegister();
    //enter personal details on register page and click register submit button
    registerpage.enterPersonalDetails();
    //verify the expected message=actual displayed message
    registeresultpage.verifyUserisRegisteredSuccessfully();
    // click on continue submit button
}

@Test                //to verify if user can refer a product to a friend
    public void verifyUserCanReferProduct(){
    //open browser through before method
    // click on register on home page
    homepage.clickOnRegister();
    //enter personal details on register page and click register submit button
    registerpage.enterPersonalDetails();
    //verify the expected message=actual displayed message
    registeresultpage.verifyUserisRegisteredSuccessfully();
    // click on continue submit button
    registeresultpage.clickOnContinue();
    //click on login button on home page
//    homepage.clickOnLogin();
//    //enter login details
//    loginpage.enterLoginDetails();
//    //click on login submit button
//    loginpage.clickOnLoginSubmit();
//    //click on electronic on home page
    homepage.clickOnElectronic();
// click on camera and photo
    electronicpage.clickOnCameraAndPhoto();
    //click on leica T product
    camerapage.clickOnLeica();
    //click on email a friend button
    leicatpage.clickOnEmailAFriend();
    //enter freinds email
    productemailpage.enterDetails();
    //click send email button
    productemailpage.clickOnSend();
    //verify email is sent to a friend   exp=act message
    productemailpage.verifyEmailIsSentToFriend();

}
 @Test                 //to verify if each rpoduct in the camera and photo pgae has a add to cart button
    public void verifyEachProductHasAddToCartbutton(){
     //open browser through before method
     // click on register on home page
     homepage.clickOnRegister();
     //enter personal details on register page and click register submit button
     registerpage.enterPersonalDetails();
     //verify the expected message=actual displayed message
     registeresultpage.verifyUserisRegisteredSuccessfully();
     // click on continue submit button
     registeresultpage.clickOnContinue();
     //click on login button on home page
//     homepage.clickOnLogin();
//     //enter login details
//     loginpage.enterLoginDetails();
//     //click on login submit button
//     loginpage.clickOnLoginSubmit();
//     //click on electronic on home page
     homepage.clickOnElectronic();
// click on camera and photo
     electronicpage.clickOnCameraAndPhoto();
     //check add to cart button //print add to cart button present if present for all product else print not present.
     camerapage.checkAddToCartButton();
 }

@Test             //to verify if user can build his own computer choosing second option for each choice.
    public void verifyUSerCanBuildOwnComputer(){
    //open browser through before method
    // click on register on home page
    homepage.clickOnRegister();
    //enter personal details on register page and click register submit button
    registerpage.enterPersonalDetails();
    //verify the expected message=actual displayed message
    registeresultpage.verifyUserisRegisteredSuccessfully();
    // click on continue submit button
    registeresultpage.clickOnContinue();
   //click on build your own computer
    homepage.clickOnBuildYourOwnComputer();
    //choose option second options from all choices given below
    buildyourown.selectSecondSecondOptions();
    //click on the add to cart button
    buildyourown.clickOnaddToCart();
    //click on the shopping cart link
    buildyourown.clickOnShoppingCart();
    //check if product added to cart
    buildyourown.checkItemAddedtoCart();
}
@Test
    public void verifyProductNameOnAllProducts()
    {
        //click on computer on home page
        homepage.clickOnComputer();
        //click on desktop
        computerPage.clickOnDesktop();
        //verify product has product name
        desktopPage.verfiyeachProducthastitle();
    }
    @Test
    public void verifyEachProductOnCameraPageHasAddtocartButton(){
        //click on electronic
        homepage.clickOnElectronic();
        //click on camera&photo
        electronicpage.clickOnCameraAndPhoto();
        //verify products have add to cart button
        camerapage.checkAddToCartButton();
    }
@Test
    public void userAbleToClickOnSearchButtonAndAcceptAlertMessage(){
//click on search button
    homepage.clickOnSearch();
//alert wait
    alertWait();
    //verify alert message and accept alert
homepage.acceptAlert();
}

@Test
    public void userAbleToClickOnVoteButtonAndAcceptAlertMessage(){
    //click on vote button on home page
    homepage.clickOnVoteButton();
    //wait alert
    alertWait();
    //verify alert message and accept alert
    homepage.voteAlert();

    }
@Test
    public  void verifyUserAbleToSwitchToFaceBookPageAndBack(){
    //click on fb button
    homepage.clickOnFacebook();
    //click on close and verify nopcommerce and switch back to home page
    facebookpage.toOpenFacebookVerifyAndComeBackOnMainSite();
    //verify 'welcome to our store'
    homeverificationpage.verifyHomePageTitle();
}
    @Test
    public void userMustAbleToCommentLast(){
    //click on detail button
    homepage.clickOnDetail();
    //enter title of comment,comment text,click on comment submit button
        newreleasepage.writeComments();
        newreleasepage.verifycomment();
    }
    @Test
    public void toVerifyProductPriceSymbolAfterChangeCurrencyIntoUsd()
    {
        //Select Usd From Currency Dropdown
        homepage.selectUsdCurrency();
        //Verify Product Price Change As Per Currency
        homepage.toVerifyProductPriceContainsDollerSign();
    }
    @Test
    public void toVerifyProductPriceSymbolAfterChangeCurrencyIntoEuro()
    {
        //Select Usd From Currency Dropdown
        homepage.selectEuroCurrency();
        //Verify Product Price Change As Per Currency
        homepage.toVerifyProductPriceContainsEuroSign();
    }

    @Test
    public void toVerifyNikeProductSearchIsContainNikeInAllProductNameAndUrl()
    {
        //Type Search Nike in Search Bar
        homepage.searchNikeProduct();
        //Click On Search Button
        homepage.clickOnSearch();
        //Verify Product Contains Nike in Name
        nikepage.toVerifyProductNameContainsNike();
        //Verify Page Url Contain Nike
        nikepage.toVerifyProductUrlContainNike();

    }
}
