#Autor: adiaz@choucairtesting.com
@Stories
Feature: Manage Medical Appointment
  As a patient
  I want to request a medical appointment
  Through the Hospital Administration system
  @scenario1
  Scenario Outline: Register a doctor
    Given than Carlos needs to register a new doctor in option: Agregar Doctor
    When he registers it in the Hospital Administration application
      | FirstName    | LastName    |  Phone   | TypeDocument   | NumberDocument   |
      | <FirstName>  | <LastName>  |  <Phone> | <TypeDocument> | <NumberDocument> |
    Then He verifies that the message appears on the screen: Datos guardados correctamente

    Examples:
      | FirstName | LastName  | Phone       | TypeDocument          | NumberDocument  |
      | Alix      | Diaz      | 3184579854  | Cédula de ciudadanía  | 1094000003      |