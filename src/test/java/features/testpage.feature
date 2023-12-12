@tag
Feature: Verify expandtesting feature

  @tag2
  Scenario Outline: Verify expandtesting validation
    Given user is on expandtesting page
    When user enters <username> and <password>
    Then user clicks on login button

    Examples: 
      | username| password| 
      |practice |SuperSecretPassword! |
      |abc|sss|
      
