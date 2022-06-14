# tests created by: Petyq Yaneva-Tsvetkova

  @WordsAndCharsCount
Feature: Word and char count of a text

  Scenario: Verify the word count
    Given The following text is given:
    """
  I am   ,testing   whitespaces - is the count correct?
  """
    And remove all whitespace chars before ,
    And remove more than one consecutive whitespace chars with a single space
    When I get the word count
    Then I verify the words count is equal to 8

  Scenario: Verify the chars count
    Given The following text is given:
  """
  I am ,testing   whitespaces
  """
    And remove all whitespace chars before ,
    And remove more than one consecutive whitespace chars with a single space
    When I get the char count
    Then I verify the char count is equals to 24