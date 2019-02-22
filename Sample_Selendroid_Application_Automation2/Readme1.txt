
Below are the points I want to mention as important points:
1. I have gone through the app and figured out 4 basic Scenarios which I tried to execute  - As Sanity Test

Test Case: RegisterUser
a) Invoke the app
b) Click on the User option.
c) verify the user details screen Header.
d) Entered user details.
e) Clicked on Register User.
f) Navigated to Confirm User register Screen
g) Clicked on the Confirmed user Register Button.

Test Case: Progress bar 
a) Navigate back to the DashBorad Screen.
b) Clicked on Progress Bar button.
c) Verify the Waiting Dialog.
d) Navigate Back to Dash Board.

Test Case: Pop-Up Window
a) Tap on the Pop-Up window button.
b) Dismiss pop-up appeared.
c) Clicked on Dismiss button.[Tried with Alert, but finally was able to do with Pixel]
d)Back to Dash Board.

Test Case: Finsih Activity
a) Verify EndActivity button.
b) Click on the button.

--------
Project flow:
I have used Page Object Model for this framework.
For all the page Objects I am creating new classes and defining those Page Objects.I am initializing those objects through Page Factory.
For the Functions like Button click, Text I have created generic Methods which I am using all over the project , 
Component is the Package I am using for that.
I have created a generic Assert class to do all kinds of assertions.
Log4J I have Used to Get the Logs.
Extent Report Manager I have used to generate the Reports.
All Dependencies are mentioned in the POM.xml.
----------------------------------------------------

For iOS also I have set the capabilities But for iOS no APK was available. If APk is available only thing we need to do is set the desired 
capabilities in the Appium Inspector and find out the Page object locations, and mention those in the page Object classes where I have commented the 
ios elements.

--------------
For Android I have Used UIAutomator.
---------------------------------

To Run the project from Terminal below are the steps:
cd your project location then enter.
Now write > mvn test

