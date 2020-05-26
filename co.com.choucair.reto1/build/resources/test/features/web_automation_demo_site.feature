#Autor: adiaz@choucairtesting.com
@Stories
Feature: Web Automation Demo Site
  As a user, i want to register on the Automation Demo Site Web page
  @scenario1
  Scenario Outline: Registration on the Web Automation Demo Site
    Given than Alix wants to access the Web Automation Demo site
    When she performs the registration on the page
    | FirstName    | LastName    |
    | <FirstName>  | <LastName>  |
    Then she verifies that the screen loads with text Double Click on Edit Icon to EDIT the Table Row

    Examples:
      | FirstName | LastName  |
      | Alix      | Diaz      |