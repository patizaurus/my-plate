import org.testng.annotations.Test;


public class WelcomeScreenTest extends BaseTest {

    @Test
    public void welcomePageIsCorrectlyDisplayed() {
        welcomePage.verifyThatLogoVisible();
        welcomePage.verifyThatLogInWithFacebookButtonIsVisible();
        welcomePage.verifyThatLogInWithEmailButtonIsVisible();
        welcomePage.verifyThatSignUpButtonIsVisible();
    }

    @Test
    public void logInWithEmailButtonWorksCorrectly() {
        welcomePage.clickLogInWithEmailButton();
        logInWithEmailPage.verifyPageIsVisible();
        logInWithEmailPage.clickBackButton();
    }

    @Test
    public void signUpButtonWorksCorrectly() {
        welcomePage.clickSignUpButton();
        signUpPage.verifyPageIsVisible();
        signUpPage.clickBackButton();
    }

    @Test
    public void LogInWithFacebookButtonWorksCorrectly() {
        welcomePage.clickLogInWithFacebookButton();
        logInWithFacebookPage.verifyPageIsVisible();
        logInWithFacebookPage.clickCancelButton();
    }
}

