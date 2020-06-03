# Autor: adiaz@choucairtesting.com
  Feature: Add
    As windows user i want to add two numbers
    in calculator of Windows
  @Scenario1
  Scenario Outline: Add two numbers
    Given Alix opens the Windows calculator
    When she adds <number1> and <number2>
    Then she checks the total sum <total>

    Examples:
    | number1 | number2 | total |
    | 1       | 2       | 3     |
    | 37      | 23      | 60    |