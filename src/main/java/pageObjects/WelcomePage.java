package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WelcomePage {
    AndroidDriver driver;

    @AndroidFindBy(id = "com.livestrong.tracker:id/logo")
    private WebElement logo;
    @AndroidFindBy(id = "com.livestrong.tracker:id/facebook_login_button")
    private WebElement logInWithFacebookButton;
    @AndroidFindBy(id = "com.livestrong.tracker:id/log_in_btn")
    private WebElement logInWithEmailButton;
    @AndroidFindBy(id = "com.livestrong.tracker:id/sign_up_btn")
    private WebElement signUpButton;

    public WelcomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickLogInWithFacebookButton() {
        logInWithFacebookButton.click();
    }

    public void clickLogInWithEmailButton() {
        logInWithEmailButton.click();
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void verifyThatLogInWithFacebookButtonIsVisible() {
        Assert.assertTrue(logInWithFacebookButton.isDisplayed());
    }

    public void verifyThatLogInWithEmailButtonIsVisible() {
        Assert.assertTrue(logInWithEmailButton.isDisplayed());
    }

    public void verifyThatSignUpButtonIsVisible() {
        Assert.assertTrue(signUpButton.isDisplayed());
    }

    public void verifyThatLogoVisible() {
        Assert.assertTrue(logo.isDisplayed());
    }
}