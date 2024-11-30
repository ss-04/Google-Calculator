Scenario: Perform addition using Google Calculator
Given the Google Calculator is open
When I press 5
And I press "+" operator
And I press 3
And I press "=" operator
Then the result should be 8
