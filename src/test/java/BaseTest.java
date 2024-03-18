import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pageObjects.LogInWithEmailPage;
import pageObjects.LogInWithFacebookPage;
import pageObjects.SignUpPage;
import pageObjects.WelcomePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

public class BaseTest {
    public AndroidDriver driver;

    public WelcomePage welcomePage;
    public SignUpPage signUpPage;
    public LogInWithEmailPage logInWithEmailPage;
    public LogInWithFacebookPage logInWithFacebookPage;

    @BeforeClass
    public void configureAppium() throws URISyntaxException, IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        properties.load(fis);
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(properties.getProperty("deviceName"));
        options.setApp(System.getProperty("user.dir") + "/src/main/resources/MyPlate Calorie Tracker.apk");
        String uri = String.format("http://%s:%s", properties.getProperty("ip"), properties.getProperty("port"));
        driver = new AndroidDriver(new URI(uri).toURL(), options);
        initializePages();
    }

    private void initializePages() {
        welcomePage = new WelcomePage(driver);
        signUpPage = new SignUpPage(driver);
        logInWithEmailPage = new LogInWithEmailPage(driver);
        logInWithFacebookPage = new LogInWithFacebookPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}