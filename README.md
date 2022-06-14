## Project's Title:
	Cucumber: Regular Expressions

## Project Description:
		
	Theory:
	Cucumber with RegEx
	Escaping special characters from step definitions and methods

	Practical tasks:

	Extend compare words tests
	Description:  Extend the existing tests for comparing words with additional steps that remove some characters. Implement steps that:
	accepts only a single alphabet letter and removes the first occurrence from the first input word. Applies for letters a-z and A-Z. 
	accepts any digit and removes all occurrences from the first input word
	Example test flow:
	input word is Cucumberss11
	I remove s
	I remove 1
	second input word is cucumbers
	I verify that words are the same (test passes or fails depending on the case sensitivity)

	Extend compare sentences tests
	Description: Extend the existing tests for comparing sentences with additional steps that remove certain characters. Implement steps that:
	accept only one of the following as input ( ) [ ] { } : and removes the first occurrence from the first sentence.
	accept only one of the following as input . ? ! ; : “ , - '  as input parameter and removes all occurrences from the first sentence.
	Example test flow:
	first input sentence is I am testing with RegEx ((it’s working??!!!)
	I remove (
	I remove ?
	second input t sentence is i am testing with regex (it’s working!!!)
	I verify that sentences are the same (test passes or fails depending on the case sensitivity)

	Extend word and char count tests
	Description: currently our StringHelper is not returning us the correct word count. To count the words, StringHelper splits the text by spaces and returns the count. If we have multiple spaces or a dash surrounded by spaces, the data count is treating them as additional words. Example: I am testing   whitespaces - is the count correct? has to return 8 words, but returns more because of white spaces.
	Add a step that removes all whitespace chars before any of the , . - ? ! : symbols 
	Add a step that removes more than one consecutive whitespace chars with a single space.

	Acceptance criteria:
	As a trainee, 
	I understand and I have used Cucumber wtih RegEx
	I know how to escape special characters from step definitions and methods

## Table of Contents:
	regularexpressions
	README.md file
	.gitignore file
	

## How to Install and Run the Project:
	IDE need to execute the java project
	 
## How to Use the Project:
	Maven need

## Useful links:
	https://github.com/cucumber/cucumber-expressions

## Add a License
	no needed


