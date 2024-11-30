package com.google.calculator.utils;

import java.util.HashMap;
import java.util.Map;

public class XPathUtils {

    // Method to return the XPath for number buttons [0-9]
    public static String getNumberButtonXPath(int number) {
        return "//div[@role='button'][contains(text(),'" + number + "')]";
    }

    // Method to return the exact XPath for number buttons
    public static String getExactNumberButtonXPath(int number) {
        return "//div[@role='button'][text() = '" + number + "']";
    }

    // Method to return the XPath for operator buttons (+, −, ×, ÷, =, AC, CE)
    public static String getOperatorButtonXPath(String operator) {
        Map<String, String> operatorXPaths = new HashMap<>();
        operatorXPaths.put("+", "//div[@aria-label='plus'][contains(text(), '+')]");
        operatorXPaths.put("−", "//div[@aria-label='minus'][contains(text(), '−')]");
        operatorXPaths.put("×", "//div[@aria-label='multiply'][contains(text(), '×')]");
        operatorXPaths.put("÷", "//div[@aria-label='divide'][contains(text(), '÷')]");
        operatorXPaths.put("=", "//div[@aria-label='equals'][contains(text(), '=')]");
        operatorXPaths.put(".", "//div[@aria-label='point'][contains(text(), '.')]");  // Point for decimal
        operatorXPaths.put("AC", "//div[@aria-label='all clear']");
        operatorXPaths.put("CE", "//div[@aria-label='clear entry']");
        
        return operatorXPaths.get(operator);
    }

    // CSS Selector for the result display
    public static String getResultDisplaySelector() {
        return "#cwos";
    }
}
