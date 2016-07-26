Feature: Search for flight from start page
  Every user, even unregistered should be able to search for flight after providing required details

  Background:
    Given Lot start page is opened

  Scenario: Search with default proposed values
    Given I am on start page
    When I fill in search form
    And click search button
    Then search results displayed

  Scenario: Search with default proposed values 2
    When I fill in search form
    And click search button