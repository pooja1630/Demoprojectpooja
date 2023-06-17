@Regression

  Feature:harding  website As a user I want to navigate to  website

    Scenario Outline: Job Application
      Given I click on the Accept cookies option
    When  I click on careers button
    And I click Lanside  Option from the dropdown
      And  I click on SeeVacancy
      And I click on ProcurementCoordinator
      And I click on Apply
      And I send text to first name field "<firstname>"
      And I send text to last name field "<lastname>"
      And I send text to email  field "<email>"
      And I send text to telephone num field "<phone>"
      And I send text to city name field "<city>"
      Then I sucessfully submit the application
    Examples:
      |firstname |lastname|email                   |phone     |city   |
      |rajvia     |Bhatt   |girshma3@gmail.com     |0246987466|chennai|