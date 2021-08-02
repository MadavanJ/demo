#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@1stfeature
Feature: Entering credentials


@1stfeature
  Scenario: Entering name and password
    Given User is on the login page
    When user clicks on the credentials textfield
    And User enters "885728" as employeeid and "QEA" as stream
    And click on submit
    Then Credentials are entered successfuly

  Scenario Outline: Entering  multiple credentials
    Given User iis on the login page
    When uuser clicks on the credentials textfield
    And User enters <name>  <age>  <emailid> <phone> <pincode>

    Examples: 
      | name    | age | emailid        | phone | pincode |
      | Madavan |  20 | mad@gamil.com  |  1223 |   62888 |
      | Arvind  |  21 | arv@gmail.com  |   456 |   62748 |
      | Janaki  |  21 | jan@gmail.com  |   789 |   64588 |
      | Shivam  |  21 | shiv@gmail.com |  6592 |   45888 |
