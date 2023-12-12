
@tag
Feature: verify parameter demo


  @tag2
  Scenario Outline: verify parameters
    Given user is on loginpage
    When User enters valid <username> and <password>
    Then login is successful using parameters

    Examples: 
      | username  | password |   
      | student |Password123 |
      |student2|password|
