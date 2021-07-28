Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |
      | Cucumber   |


    # To fix pipes' order
      #MAC: command + option + L
      #Windows : control + alt + L

  @wip
  Scenario:  Library login example using data table
    Given user is on the login page
    Then user should see title is something
