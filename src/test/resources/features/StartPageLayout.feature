Feature: Start page layout and components functionality

  Background:
    Given Lot start page is opened
    When observing page components by default

  Scenario:
    Then header contains valid links
    And carousel component has navigation
    And booker block set to flight
    And current offers components displayed
    And footer block is displayed
    And copyright block is displayed

  Scenario:
    When click on Login
    Then login page displayed

  Scenario:
    When click on language
    Then country picker shown

  Scenario:
    When select ticket type false
    Then return date should be displayed false

  @DEV
  Scenario:
    When default passengers amount set
    Then cant be less than one adult
    And can be more than one adult using buttons

  Scenario:
    When click on From
    And click on To
    Then cities list shown

  Scenario:
    When click on date
    Then calendar shown

  Scenario:
    When click on cabin class
    Then list of classes shown