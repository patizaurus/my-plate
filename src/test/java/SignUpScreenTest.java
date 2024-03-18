import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpScreenTest extends BaseTest {

    @BeforeMethod
    public void navigateToPage(){
        welcomePage.clickSignUpButton();
    }

    @AfterMethod
    public void backToHomePage(){
        signUpPage.clickBackButton();
    }

    @Test
    public void signUpFormIsCorrectlyDisplayed() {
        signUpPage.verifyUsernameFieldIsVisible();
        signUpPage.verifyEmailFieldIsVisible();
        signUpPage.verifyPasswordFieldIsVisible();
        signUpPage.verifyPolicyTextIsVisible();
        signUpPage.verifyBackButtonIsVisible();
        signUpPage.verifyAlreadyHaveAccountButtonIsVisible();
        signUpPage.verifyNewsletterTextIsVisible();
        signUpPage.verifyNewsletterToggleIsVisible();
        signUpPage.verifyRegisterButtonIsVisible();
    }

    @Test
    public void signUpFormCanBeFilled() {
        signUpPage.fillUserName(RandomUtils.generateRandomUsername());
        signUpPage.fillEmail(RandomUtils.generateRandomEmail());
        signUpPage.fillPassword(RandomUtils.generateRandomPassword(10));
        signUpPage.confirmRegistration();
    }

    @Test
    public void alreadyHaveAccountButtonCanBeSelected() {
        signUpPage.clickOnAlreadyHaveAccount();
        logInWithEmailPage.verifyPageIsVisible();
    }
}