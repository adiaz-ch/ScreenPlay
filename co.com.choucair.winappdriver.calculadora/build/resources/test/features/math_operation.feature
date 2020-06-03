# Autor: adiaz@choucairtesting.com
  Feature: Math Operation
    As a Windows user I want to be able to do mathematical operations
    such as addition, subtraction, multiplication and division
    between two numbers in the Windows calculator

    Background: Open the Windows calculator
      Given Alix opens the Windows calculator

    @Scenario1
    Scenario: Math operation
      When she operates
      | number1 | operator  | number2 |
      | 10      | /         | 2       |
      Then she checks the total sum
      | total |
      | 5    |

    @Scenario2
    Scenario Outline: Math operation 2
      When she performs the <operator> between <number1> and <number2>
      Then she checks the total sum <total>

      Examples:
        | number1 | operator  | number2 | total |
        | 10      | +         | 2       | 12    |
        | 10      | -         | 2       | 8     |
        | 10      | *         | 2       | 20    |
        | 10      | /         | 2       | 5     |