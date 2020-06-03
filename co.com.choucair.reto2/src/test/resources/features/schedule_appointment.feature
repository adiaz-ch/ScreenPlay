# Autor: adiaz@choucairtesting.com
@Stories
Feature: Manage Medical Appointment
  As a patient
  I want to request a medical appointment
  Through the Hospital Administration system
  @scenario1
  Scenario Outline: Schedule a medical appointment
    Given than Carlos needs to schedule a medical appointment in option: Agendar Cita
    When he schedules an appointment
      | AppointmentDate   | PatientDocument   |  DoctorDocument   | Observations   |
      | <AppointmentDate> | <PatientDocument> |  <DoctorDocument> | <Observations> |
    Then He verifies that the message appears on the screen: Datos guardados correctamente

    Examples:
      | AppointmentDate | PatientDocument | DoctorDocument  | Observations  |
      | 06/10/2020      | 1094000000      | 1094000001      | Observations  |
