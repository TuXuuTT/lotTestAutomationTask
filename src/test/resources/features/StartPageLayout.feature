Feature: Start page layout and components functionality

  Background:
    Given Lot start page is opened

  Scenario:
    When observing page components by default
    Then header contains valid links
#    And carousel component has navigation
#    And booker block set to flight
#    And current offers components contain valid links
#    And useful info block is displayed
#    And footer contains valid links
#    And copyright block is displayed