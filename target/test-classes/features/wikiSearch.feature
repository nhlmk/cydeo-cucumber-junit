Feature: Wikipedia search functionality and verifications

  @WSF-45234

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on the Wikipedia home page
    When User types "Steve Jobs" in the Wiki search box
    And User click wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on the Wikipedia home page
    When User types "Steve Jobs" in the Wiki search box
    And User click wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on the Wikipedia home page
    When User types "<searchValue>" in the Wiki search box
    And User click wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue        | expectedTitle      | expectedMainHeader |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo |
      | Bob Marley         | Bob Marley         | Bob Marley         |
      | Anthony Hopkins    | Anthony Hopkins    | Anthony Hopkins    |


