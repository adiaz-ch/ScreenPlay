#Autor: adiaz@choucairtesting.com
@Stories
Feature: Manage Medical Appointment
  As a patient
  I want to request a medical appointment
  Through the Hospital Administration system
  @scenario1
  Scenario Outline: Register a patient
    Given than Carlos needs to register a new patient in option: Agregar Paciente
    When he performs the registration of the patient in the Hospital Administration application
      | FirstName    | LastName    |  Phone   | TypeDocument   | NumberDocument   | Prepagada   |
      | <FirstName>  | <LastName>  |  <Phone> | <TypeDocument> | <NumberDocument> | <Prepagada> |
    Then He verifies that the message appears on the screen: Datos guardados correctamente

    Examples:
      | FirstName | LastName  | Phone       | TypeDocument          | NumberDocument  | Prepagada |
      | Alix      | Diaz      | 3184579854  | Cédula de ciudadanía  | 1094000002      | Si        |