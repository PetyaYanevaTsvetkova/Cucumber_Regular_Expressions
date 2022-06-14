# tests created by: Petyq Yaneva-Tsvetkova

  @CompareWords
Feature:test the areWordsEqual() method

  Background:
    * stringHelper case sensitive is set on: false

    Scenario: Test if two words are equals
      Given First word input is Cucumber
      When Second word input cucumber
      Then Verification if the words are equal

  Scenario: Test if two words are equals after removing symbols
    Given First word input is Cucumberss11
    And I remove the first occurrence of a single alphabet letter s
    And I remove all occurrences of digit 1
    When Second word input cucumbers
    Then Verification if the words are equal
