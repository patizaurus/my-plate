import org.testng.annotations.*;

public class LogInWithEmailScreenTest extends BaseTest {

    @BeforeMethod
    public void navigateToPage(){
        welcomePage.clickLogInWithEmailButton();
    }

    @AfterMethod
    public void backToHomePage(){
        logInWithEmailPage.clickBackButton();
    }

    @Test
    public void logInWithEmailPageIsCorrectlyDisplayed() {
        logInWithEmailPage.verifyUsernameFieldIsVisible();
        logInWithEmailPage.verifyPasswordFieldIsVisible();
        logInWithEmailPage.verifyPolicyTextIsVisible();
        logInWithEmailPage.verifyBackButtonIsVisible();
    }

    @Test
    public void logInWithEmailFormCanBeFilled() {
        logInWithEmailPage.fillUserName(RandomUtils.generateRandomUsername());
        logInWithEmailPage.fillPassword(RandomUtils.generateRandomPassword(10));
        logInWithEmailPage.clickLoginButton();
    }
}
