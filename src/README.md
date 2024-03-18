#### Practice for mobile testing

Choose one of the test apps from storage.
Create test plan for chosen app (10-15 main tests scenario)
Create test framework based on:
- Appium
- Java
- TestNG / Junit
- Allure

All test code have to be in your Github repo
Create documentation for framework (README file with instructions for prerequisites and setup, description of project structure, how to run tests
Demo for mentor.

#### Assessment criteria:

1. Student create test plan with happy path scenarios for all main features of app.

2. Student execute all tests locally (usage of trial version of device farm would be great advantage)  and describe results

3. Student describe architecture of test framework and can explain implementations.

4. Mentor review test framework codebase and provide feedback

 mvn test -Pfull


//        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
//        driver.rotate(landscape);

//        driver.setClipboardText("Copied text");
//        driver.findElement(By.id("com.livestrong.tracker:id/editTextPassword")).sendKeys(driver.getClipboardText());

//        driver.pressKey(new KeyEvent(AndroidKey.HOME));

//        driver.hideKeyboard();

//        String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("")), "text", "name"));
//        Thread.sleep(5000);


//        facebook?
//        Set<String> contexts = driver.getContextHandles();
//        driver.context("WEBVIEW");