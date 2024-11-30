# Google Calculator Automation

This project demonstrates an automated test suite for performing basic arithmetic operations on the Google Calculator. The tests are built using Selenium WebDriver and Cucumber for behavior-driven development (BDD), and it is organized using the Page Object Model.

Table of Contents
Project Setup
Dependencies
Project Structure
Running Tests
Feature File
Test Execution
Project Setup
Prerequisites
Before you can run the tests, ensure you have the following tools installed:

Java 11 or higher: Ensure that you have Java installed and configured correctly on your system.
Maven: This project uses Maven as the build tool.
Chrome WebDriver: The tests are designed to run using the Chrome WebDriver. Ensure that the appropriate version of chromedriver is available in the src/test/resources directory.
Dependencies
The following dependencies are required for this project:

Selenium WebDriver: To automate web interactions with the Google Calculator.
Cucumber: To define behavior-driven test scenarios.
JUnit: For running the test cases.
Dependencies are managed using Maven, and are specified in the pom.xml file.

Project Structure
Here's an overview of the project structure:

bash
Copy code
.
├── bin
│   └── com
│       └── google
│           └── calculator
│               ├── GoogleCalculator.class
│               └── test
├── pom.xml                   # Maven build file, manages dependencies
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── google
│   │               └── calculator
│   │                   ├── GoogleCalculatorAutomation.java
│   │                   ├── page
│   │                   │   └── GoogleCalculatorPage.java
│   │                   └── utils
│   │                       └── XPathUtils.java
│   └── test
│       ├── java
│       │   └── com
│       │       └── google
│       │           └── calculator
│       │               └── test
│       │                   ├── BaseTest.java
│       │                   ├── GoogleCalculatorCucumberTest.java
│       │                   └── GoogleCalculatorSteps.java
│       └── resources
│           ├── chromedriver    # Chrome WebDriver
│           ├── google-calculator.feature  # Cucumber feature file
└── target
    ├── cucumber-reports        # Cucumber test reports
    ├── surefire-reports         # JUnit test reports
    
# Running Tests
To run the tests, follow these steps:

Step 1: Set up your environment
Install Java (11 or higher).
Install Maven (check with mvn -v in terminal).
Ensure that chromedriver is placed in the src/test/resources directory. You can download the correct version for your browser from ChromeDriver download page.

Step 2: Build the project
Use Maven to build the project. Open a terminal in the project root and run:

bash
Copy code
mvn clean install

Step 3: Run the tests
To run the tests with Cucumber, use the following command:

bash
Copy code
mvn test