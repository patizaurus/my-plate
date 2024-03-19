### Practice for mobile testing

#### Task description:
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
2. Student execute all tests locally and describe results
3. Student describe architecture of test framework and can explain implementations.
4. Mentor review test framework codebase and provide feedback

#### How to run the project:

###### Initial requirements

Make sure that appium, maven, node are installed and proper environment variables are added to path.
Install Android Studio to have access to emulators. Download emulator ex. Pixel 8 API 24 
(be careful, application could not work with newer API versions). 

###### Steps to run the project
1. Start installed emulator. 
2. Open terminal and start appium server by typing `appium`
3. Go to config.properties inside this project and update data. Default values are prepopulated, but you can change them.
IP address and port refers to appium server. You can find this data in terminal where appium server is running.
4. Run command `mvn clean install` in terminal inside project.
5. Clean allure results folder by running in project terminal command `allure report --clean`
5. To run tests run command `mvn test` in project terminal.
7. To check generated report run command `allure serve allure-results`