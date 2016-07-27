Feature: Search for flight from start page
  Every user, even unregistered should be able to search for flight after providing required details

  Background:
    Given Lot start page is opened

  Scenario: Search with default proposed values to verify Search button is working
    When fill destination form
    And click search
    Then search results displayed

  Scenario Outline: Search with specific arrival and departure cities and dates to verify search engine is working
    When fill departure form with city name <departureCity>
    And fill destination form with city name <arrivalCity>
    And select random departure date
    And select random return date
    And click search
    Then search results displayed
    And search results displayed for specified values
    Examples:
      | departureCity | arrivalCity |
      | Warsaw        | Munich      |