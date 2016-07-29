Feature: Search for flight from start page
  Every user, even unregistered should be able to search for flight after providing required information

  Background:
    Given Lot start page is opened

  Scenario Outline: Search with specific arrival and departure cities and dates to verify search engine is working
    When fill departure form with city name <departureCity>
    And fill destination form with city name <arrivalCity>
    And select random valid departure date
    And select random valid return date
    And select ticket type <is Round Trip>
    And click search
    Then search results page displayed
    And search results displayed for specified <departureCity> and <arrivalCity> if round trip <is Round Trip>
    And search results displayed for specified dates if round trip <is Round Trip>
    Examples:
      | departureCity | arrivalCity | is Round Trip |
      | Warsaw        | Munich      | true          |
      | Paris         | Barcelona   | false         |