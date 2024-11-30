package com.google.calculator.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.calculator.page.GoogleCalculatorPage;
import static org.junit.Assert.*;

public class GoogleCalculatorSteps {

    private WebDriver driver;
    private GoogleCalculatorPage calculatorPage;

    // Initialize WebDriver in the constructor
    public GoogleCalculatorSteps() {
        driver = new ChromeDriver();  // Initialize the Chrome WebDriver
        calculatorPage = new GoogleCalculatorPage();
    }

    @Given("the Google Calculator is open")
    public void givenTheGoogleCalculatorIsOpen() {
        calculatorPage.openCalculator(driver);  // Pass driver to open the calculator page
    }

    @When("I press {int}")
    public void whenIPress(int number) {
        calculatorPage.getNumberButton(driver, number).click();  // Pass driver to find the number button
    }

    @When("I press {string} operator")
    public void whenIPressOperator(String operator) {
        calculatorPage.getOperatorButton(driver, operator).click();  // Pass driver to find the operator button
    }

    @When("I press '='")
    public void whenIPressEquals() {
        calculatorPage.getOperatorButton(driver, "=").click();  // Pass driver to click "=" button
    }

    @Then("the result should be {int}")
    public void thenTheResultShouldBe(int expectedResult) {
        String actualResultString = calculatorPage.getResult(driver).getText(); 
        int actualResult = Integer.parseInt(actualResultString);
        assertEquals(expectedResult, actualResult);
        driver.quit();  // Close the browser after the test
    }
}
