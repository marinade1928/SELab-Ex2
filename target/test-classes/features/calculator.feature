@tag
Feature: Calculator

  Scenario: sqr one number
    Given One input value, 9
    When I sqr the value
    Then I expect the sqr result 3.0

#  Scenario: rvs one number
#    Given One input value, 2
#    When I rvs the value
#    Then I expect the result 0.7

#  Scenario: add two numbers
#    Given Two input values, 1 and 2
#    When I add the two values
#    Then I expect the result 3
#
#  Scenario Outline: add two numbers
#    Given Two input values, <first> and <second>
#    When I add the two values
#    Then I expect the result <result>
#    Examples:
#    | first | second | result |
#    | 13    | 12     | 1      |
#    | 5     | 6      | -1     |
#    | 4     | 2      | 2      |