# tests created by: Petyq Yaneva-Tsvetkova

@CompareSentences
Feature:  test the areSentencesEqual() method from StringHelper class

  Background:
    Given case sensitive is set on: false

  Scenario: compare two sentences
    Given First sentence is I set the sentence to Cucumber is amazing!
    When Second sentence is I set the sentence to cucumber is amazing!
    Then Verify if sentences are equal

    Scenario: compare two sentences with RegEx
      Given First sentence is  I am testing with RegEx ((it’s working??!!!)
      And I remove the first occurrence of bracket character (
      And I remove all occurrences of the symbol ?
      When Second sentence is  i am testing with regex (it’s working!!!)
      Then Verify if sentences are equal