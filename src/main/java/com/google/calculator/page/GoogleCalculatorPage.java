package com.google.calculator.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.google.calculator.utils.XPathUtils;

public class GoogleCalculatorPage {

    // Method to open the Google Calculator page
    public void openCalculator(WebDriver driver) {
        driver.get("https://www.google.com/search?q=google+calculator");
    }

    // Method to get the number button (e.g., 1, 2, etc.)
    public WebElement getNumberButton(WebDriver driver, int number) {
        return driver.findElement(By.xpath(XPathUtils.getNumberButtonXPath(number)));
    }

    // Method to get the operator button (e.g., +, −, ×, ÷)
    public WebElement getOperatorButton(WebDriver driver, String operator) {
        return driver.findElement(By.xpath(XPathUtils.getOperatorButtonXPath(operator)));
    }

    // Method to get the result display element
    public WebElement getResult(WebDriver driver) {
        return driver.findElement(By.cssSelector(XPathUtils.getResultDisplaySelector()));
    }

    // Method to perform a calculation (e.g., 5 + 3)
    public String performCalculation(WebDriver driver, String num1, String operator, String num2) {
        getNumberButton(driver, Integer.parseInt(num1)).click();
        getOperatorButton(driver, operator).click();
        getNumberButton(driver, Integer.parseInt(num2)).click();
        getOperatorButton(driver, operator).click(); // Click the "=" operator
        return getResult(driver).getText();
    }
}
