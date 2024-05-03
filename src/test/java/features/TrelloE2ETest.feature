Feature: Trello Board E2E Test Suite

  @smoke
  Scenario: Trello board create update and delete test
    When create board
    Then verify board is exist
    When create list without board
    Then verify list is exist
    When create card
    And update random card
    And delete all card
    When delete board
    Then verify board is deleted