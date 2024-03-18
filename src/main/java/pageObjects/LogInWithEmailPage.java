package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInWithEmailPage {
    AndroidDriver driver;

    @AndroidFindBy(xpath = "//TextInputLayout[@text='Username or Email Address']//android.widget.EditText")
    private WebElement userNameField;
    @AndroidFindBy(id = "com.livestrong.tracker:id/password_input")
    private WebElement passwordField;
    @AndroidFindBy(id = "com.livestrong.tracker:id/action_login")
    private WebElement loginButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Log In']")
    private WebElement pageTitle;
    @AndroidFindBy(id = "com.livestrong.tracker:id/forgot_password_btn")
    private WebElement forgotPasswordButton;
    @AndroidFindBy(id = "com.livestrong.tracker:id/need_account_btn")
    private WebElement signUpButton;
    @AndroidFindBy(id = "com.livestrong.tracker:id/policy_tos_tv")
    private WebElement policyText;
    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    public LogInWithEmailPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void fillUserName(String username) {
        userNameField.sendKeys(username);
    }

    public void fillPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void confirmLogIn() {
        loginButton.click();
    }

    public void verifyPageIsVisible() {

        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void clickBackButton() {
        backButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void verifyUsernameFieldIsVisible() {
        Assert.assertTrue(userNameField.isDisplayed());
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
}
