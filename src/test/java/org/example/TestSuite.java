package org.example;

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
@Test                                     // to verify user is registered successfully
 public void verifyUserIsAbleToRegisteredSuccessfully(){
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
    homepage.clickOnLogin();
    //enter login details
    loginpage.enterLoginDetails();
    //click on login submit button
    loginpage.clickOnLoginSubmit();
    //click on electronic on home page
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
     homepage.clickOnLogin();
     //enter login details
     loginpage.enterLoginDetails();
     //click on login submit button
     loginpage.clickOnLoginSubmit();
     //click on electronic on home page
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
    //click on login button on home page
    homepage.clickOnLogin();
    //enter login details
    loginpage.enterLoginDetails();
    //click on login submit button
    loginpage.clickOnLoginSubmit();
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

}
