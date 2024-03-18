package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class LogInWithFacebookPage {
    private static final String COOKIES_TITLE = "Allow the use of cookies by Facebook on this browser?";
    AndroidDriver driver;

    @AndroidFindBy(accessibility = COOKIES_TITLE)
    private WebElement cookiesTitle;
    @AndroidFindBy(xpath = "//android.widget.ImageView")
    private WebElement cancelButton;

    public LogInWithFacebookPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void verifyPageIsVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> cookiesTitle.isDisplayed());
        Assert.assertTrue(cookiesTitle.isDisplayed());
    }

    public void verifyCookiesTitleIsCorrectlyDisplayed() {
        Assert.assertEquals(cookiesTitle.getAttribute("content-desc"), COOKIES_TITLE);
    }

    public void clickCancelButton() {
        cancelButton.click();
    }
}
