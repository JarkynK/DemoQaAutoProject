Feature: Wikipedia feature

  Scenario: Verify Wikipedia search Page
    Given User goes to Wikipedia page
    When User types on search box Barak Obama
    Then User sees Barak Obama on title