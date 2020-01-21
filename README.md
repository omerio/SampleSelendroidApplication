# SampleSelendroidApplication

## Getting Started

Going through the app, four basic scenarios came out to be important to be executed as sanity tests.

### Test Cases

- RegisterUser  
  a) Invoke the app.  
  b) Click on the User option.  
  c) verify the user details screen Header.  
  d) Entered user details.  
  e) Clicked on Register User.  
  f) Navigated to Confirm User register Screen.  
  g) Clicked on the Confirmed user Register Button.

- Progress bar  
  a) Navigate back to the DashBorad Screen.  
  b) Clicked on Progress Bar button.  
  c) Verify the Waiting Dialog.  
  d) Navigate Back to Dash Board.

- Pop-Up Window  
  a) Tap on the Pop-Up window button.  
  b) Dismiss pop-up appeared.  
  c) Clicked on Dismiss button.[Tried with Alert, but finally was able to do with Pixel]  
  d)Back to Dash Board.

- Finsih Activity  
  a) Verify EndActivity button.  
  b) Click on the button.

---

## Project Flow

1- For this framework, `Page Object Model` is used.  
2- For every page object, new classes are created and Page Objects are defined.  
3- Objects are initialized through `Page Factory`.  
4- This project uses `Generic Methods` found in the `Component` folder.  
5- For assertions, this project uses `Generic Assert Classes`.  
6- For logging, `Log4J` is used.  
7- `Extent Report Manager` is used to generate reports.  
8- All Dependencies used can be found in the POM.xml.

---

## Setup

Before running the tests, you need to modify two files:

1- Open `Test.properties` Found in `src/test/java/properties` and modify the `Android` or `iOS` config based on your emulator or device you want to use.  
2- Open `Common_Utilities.java` Found in `src/test/java/utilities` and modify the `Androidcapabilities`, set the `app` capability to your current project directory: `/Users/<username>/<some_directory>/SampleSelendroidApplication/Sample_Selendroid_Application_Automation2/src/test/java/selendroid-test-app-0.17.0.apk`

### Android

- Clone the repo, run:

```bash
git clone https://github.com/omerio/SampleSelendroidApplication.git
```

- Open the project, navigate to `Sample_Selendroid_Application_Automation2` and run:

```bash
mvn test
```

### iOS

Since no `.ipa` file is available for the test app, we can't run the tests on iOS.
Once a similar test app is available, you need to set the desired capabilities respectively and inspect the elements using the `Appium Inspector` and update them in the object classes.
