#Autor: adiaz@choucairtesting.com
@Stories
Feature: completar
  completar
  @scenario1
  Scenario Outline: completar
    Given completar
    When completar
      | FirstName    | LastName    |  Address   | Email   | Phone   | Gender    | Hobbies   | Languages   | Skills    | Conuntry1   | Country2    | Date_Of_Birth_Year    | Date_Of_Birth_Month   | Date_Of_Birth_Day   | Password1   | Password2   |
      | <FirstName>  | <LastName>  |  <Address> | <Email> | <Phone> | <Gender>  | <Hobbies> | <Languages> | <Skills>  | <Conuntry1> | <Country2>  | <Date_Of_Birth_Year>  | <Date_Of_Birth_Month> | <Date_Of_Birth_Day> | <Password1> | <Password2> |
    Then completar

    Examples:
      | FirstName | LastName  | Address       | Email     | Phone       | Gender  | Hobbies                 | Languages         | Skills  | Conuntry1 | Country2  | Date_Of_Birth_Year  | Date_Of_Birth_Month | Date_Of_Birth_Day | Password1 | Password2 |
      | Alix      | Diaz      | cll 1 # 2 -3  | b@a.com   | 3184579855  | Male    | Cricket, Movies, Hockey | Spanish, English  | APIs    | Colombia  | Australia | 1992                | January             | 4                 | Pass123   | Pass123   |
      | Alix      | Diaz      | cll 1 # 2 -3  | c@a.com   | 3184579856  | FeMale  | Cricket, Hockey         | Spanish           | APIs    | Colombia  | Australia | 1993                | January             | 5                 | Pass123   | Pass123   |