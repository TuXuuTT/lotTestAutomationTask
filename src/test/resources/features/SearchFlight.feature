Feature: Search for flight from start page
  Every user, even unregistered should be able to search for flight after providing required details

  Background:
    Given Lot start page is opened

  Scenario: Search with default proposed values to verify Search button is working
    When fill destination form with city name Kiev
    And click search
    Then search results page displayed

  Scenario Outline: Search with specific arrival and departure cities and dates to verify search engine is working
    When fill departure form with city name <departureCity>
    And fill destination form with city name <arrivalCity>
    And select random valid departure date
    And select random valid return date
    And click search
    Then search results page displayed
    And search results displayed for specified <departureCity> and <arrivalCity> also if round trip is <it is Round Trip>
    Examples:
      | departureCity | arrivalCity | it is Round Trip |
      | Warsaw        | Munich      | true             |