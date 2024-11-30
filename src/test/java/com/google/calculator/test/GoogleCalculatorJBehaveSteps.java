//package com.google.calculator.test;
//
//import org.jbehave.core.annotations.Given;
//import org.jbehave.core.annotations.When;
//import org.jbehave.core.annotations.Then;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import com.google.calculator.GoogleCalculatorAutomation;
//
//import static org.junit.Assert.*;
//
//public class GoogleCalculatorJBehaveSteps {
//
//    GoogleCalculatorAutomation calculator = new GoogleCalculatorAutomation();
//
//    @Given("the Google Calculator is open")
//    public void givenTheGoogleCalculatorIsOpen() {
//        calculator.setup();
//        calculator.openCalculator();
//    }
//
//    @When("I press {string}")
//    public void whenIPress(String number) {
//        WebElement button = calculator.driver.findElement(By.xpath("//div[@aria-label='" + number + "']"));
//        button.click();
//    }
//
//    @When("I press {string} operator")
//    public void whenIPressOperator(String operator) {
//        WebElement button = calculator.driver.findElement(By.xpath("//div[@aria-label='" + operator + "']"));
//        button.click();
//    }
//
//    @When("I press '='")
//    public void whenIPressEquals() {
//        WebElement button = calculator.driver.findElement(By.xpath("//div[@aria-label='=']"));
//        button.click();
//    }
//
//    @Then("the result should be {string}")
//    public void thenTheResultShouldBe(String expectedResult) {
//        WebElement result = calculator.driver.findElement(By.xpath("//div[@class='b1h1Y']"));
//        assertEquals(expectedResult, result.getText());
//        calculator.close();
//    }
//}
