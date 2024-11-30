package com.google.calculator.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/google-calculator.feature",  // Path to your feature file
    glue = "com.google.calculator.test",  // Path to your step definitions
    plugin = {"pretty", "html:target/cucumber-reports"}  // Cucumber reporting
)
public class GoogleCalculatorCucumberTest extends BaseTest {
}
