@stories
Feature: create new user
  as a user, I want to fill out the registration form as new user
  @scenario1
  Scenario: fill out registration form
    Given that Camila enters Join Today of the Utest page
    When she complete all form fields
    Then she shows the end section The last step

    @scenario2
    Scenario Outline: fill out registration  forms
      Given that Santiago enters Join Today of the Utest page

      When he complete all form fields
      | strName  | strLastName | strEmail | strMonth  |strDay  |strYear  |strLanguages  |strCity  |strCodePostal |strMovileDevice | strModelMovile |strSystemMovile  |strPassword  |strConfirmPassword|
      |<strName> |<strLastName>|<strEmail>| <strMonth>|<strDay>|<strYear>|<strLanguages>|<strCity>|<strCodePostal>|<strMovileDevice>|<strModelMovile>|<strSystemMovile>|<strPassword>|<strConfirmPassword>|
      Then he shows the end section The last step
      |strSection|
      |<strSection>|
      Examples:
        | strName    |  strLastName |       strEmail     |strMonth | strDay|strYear|strLanguages|strCity|strCodePostal|strMovileDevice|strModelMovile|strSystemMovile|strPassword  |strConfirmPassword  |strSection   |
        |Santiago|Puerta|puertasantiagos@gmail.com|October  | 21    |1995   |Spanish     |Bello  | 1350        |Alcatel        |One Touch Idol|Android 6      |Camila951021.*|Camila951021.*     |The last step|
