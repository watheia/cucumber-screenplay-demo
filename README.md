# cucumber-screenplay-demo framework

This is a simple example on how one can get Cucumber and Screenplay working together.

## Screenplay implementation

These tests use tasks, actions, abilities, questions and page elements defined in src/main/java/screenplay.

The screenplay package structure is shown below:
````
+ model
    Domain model classes
+ abilities
    Actor/User can do abilities
+ tasks
    Business-level tasks
+ actions
    UI interactions
+ user_interfaces
    Page Objects and Page Elements
+ questions
    Objects used to query the application
````


## Running the Project Using Gradle

This requires webdriver setup. By default the tests run on Chrome, you need to set the latest chromedriver instance on your system path.

Open a command window and run:

    ./gradle.bat test (For Windows Machines)
    ./gradlew test  (For Linux based and Mac)

If you want to run the tests using firefox, make sure latest geckodriver is available on your system path. 

Open a command window and run:

     ./gradlew test -Dwebdriver.driver=firefox
    
If you want to run the tests using internet explorer, make sure latest internetexplorerdriver is available on your system path. 

Open a command window and run:

    ./gradlew test -Dwebdriver.driver=iexplorer

If you want to run the tests using Android , make sure Appium installed and run on http://localhost:4723 and provide the exact expected chromedriver as part of it. 

Open a command window and run

    ./gradlew test -Dwebdriver.base.url="http://serenitybddpractice.com" -Dappium.hub="http://localhost:4723/
    wd/hub" -Dwebdriver.driver=appium -Dappium.platform=ANDROID -Dappium.platformName=Android -Dappium.automation
    Name=uiautomator2 -Dappium.browserName=chrome -Dappium.deviceName="emulator_5554" -Dappium.nativeWebScreensho
    t=true -Dappium.androidScreenshotPath='target/screenshots';     

These commands run Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberSerenityBDDSimpleRunner`
class tells JUnit to kick off Cucumber.

## Licensing

This distribution, as a whole, is licensed under the terms of the Apache License, Version 2.0
