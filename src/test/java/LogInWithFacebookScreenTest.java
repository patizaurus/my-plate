import org.testng.annotations.Test;

public class LogInWithFacebookScreenTest extends BaseTest {

    @Test
    public void logInWithFacebookPageIsCorrectlyDisplayed() {
        welcomePage.clickLogInWithFacebookButton();
        logInWithFacebookPage.verifyPageIsVisible();
        logInWithFacebookPage.verifyCookiesTitleIsCorrectlyDisplayed();
    }
}
