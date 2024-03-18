package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage {
    AndroidDriver driver;

    @AndroidFindBy(id = "com.livestrong.tracker:id/editTextUserName")
    private WebElement userNameField;
    @AndroidFindBy(id = "com.livestrong.tracker:id/editTextEmail")
    private WebElement emailField;
    @AndroidFindBy(id = "com.livestrong.tracker:id/editTextPassword")
    private WebElement passwordField;
    @AndroidFindBy(accessibility = "Register")
    private WebElement registerButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Register']")
    private WebElement pageTitle;
    @AndroidFindBy(id = "com.livestrong.tracker:id/switch_newsletter")
    private WebElement newsletterToggle;
    @AndroidFindBy(id = "com.livestrong.tracker:id/newsletter_tv")
    private WebElement newsletterText;
    @AndroidFindBy(id = "com.livestrong.tracker:id/already_have_account_btn")
    private WebElement alreadyHaveAccountButton;
    @AndroidFindBy(id = "com.livestrong.tracker:id/policy_tos_tv")
    private WebElement policyText;
    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    public SignUpPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void fillUserName(String username) {
        userNameField.sendKeys(username);
    }

    public void fillEmail(String email) {
        emailField.sendKeys(email);
    }

    public void fillPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void confirmRegistration() {
        registerButton.click();
    }

    public void verifyPageIsVisible() {
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void clickBackButton() {
        backButton.click();
    }

    public void verifyUsernameFieldIsVisible() {
        Assert.assertTrue(userNameField.isDisplayed());
    }

    public void verifyEmailFieldIsVisible() {
        Assert.assertTrue(emailField.isDisplayed());
    }

    public void verifyPasswordFieldIsVisible() {
        Assert.assertTrue(passwordField.isDisplayed());
    }

    public void verifyPolicyTextIsVisible() {
        Assert.assertTrue(policyText.isDisplayed());
    }

    public void verifyBackButtonIsVisible() {
        Assert.assertTrue(backButton.isDisplayed());
    }

    public void verifyAlreadyHaveAccountButtonIsVisible() {
        Assert.assertTrue(alreadyHaveAccountButton.isDisplayed());
    }

    public void verifyNewsletterTextIsVisible() {
        Assert.assertTrue(newsletterText.isDisplayed());
    }

    public void verifyNewsletterToggleIsVisible() {
        Assert.assertTrue(newsletterToggle.isDisplayed());
    }

    public void verifyRegisterButtonIsVisible() {
        Assert.assertTrue(registerButton.isDisplayed());
    }

    public void clickOnAlreadyHaveAccount() {
        alreadyHaveAccountButton.click();
    }
}