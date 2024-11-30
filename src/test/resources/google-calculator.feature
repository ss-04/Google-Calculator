Feature: Using Google Calculator to perform operations

  Scenario: Perform addition using Google Calculator
    Given the Google Calculator is open
    When I press 5
    And I press "+" operator
    And I press 3
    And I press "=" operator
    Then the result should be 8

  Scenario: Perform subtraction using Google Calculator
    Given the Google Calculator is open
    When I press 9
    And I press "−" operator
    And I press 4
    And I press "=" operator
    Then the result should be 5

  Scenario: Perform multiplication using Google Calculator
    Given the Google Calculator is open
    When I press 7
    And I press "×" operator
    And I press 6
    And I press "=" operator
    Then the result should be 42

  Scenario: Perform division using Google Calculator
    Given the Google Calculator is open
    When I press 8
    And I press "÷" operator
    And I press 4
    And I press "=" operator
    Then the result should be 2
