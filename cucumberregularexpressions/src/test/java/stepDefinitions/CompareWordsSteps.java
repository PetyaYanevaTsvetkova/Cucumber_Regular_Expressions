package stepDefinitions;

import helper.StringHelper;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CompareWordsSteps {
    private boolean isCaseSensitive;
    private String firstWord;
    private String secondWord;


    @ParameterType("true|false")
    public boolean aBoolean(String booleanInput) {
        return Boolean.parseBoolean(booleanInput);
    }

    @Given("stringHelper case sensitive is set on: {aBoolean}")
    public void caseSensitiveIsSetOn(boolean aBoolean) {
        isCaseSensitive = aBoolean;
    }

    @Given("First word input is {word}")
    public void firstWordInputIsCucumber(String word) {
        firstWord = word;
    }

    @When("Second word input {word}")
    public void secondWordInputCucumber(String word) {
        secondWord = word;
    }

    @Then("Verification if the words are equal")
    public void verificationOfTheWordsAreEqual() {
        if (isCaseSensitive) {
            Assertions.assertFalse(StringHelper.areWordsEqual(firstWord, secondWord, isCaseSensitive),
                    "Test fail: The words are equal when case sensitive is set on true");
        } else {
            System.out.println("Words are equal");
            System.out.println("The first word is " + firstWord);
            System.out.println("The second word is " + secondWord);
            Assertions.assertTrue(StringHelper.areWordsEqual(firstWord, secondWord, isCaseSensitive),
                    "Test fail: The words are not equal when the case sensitive is set on false");
        }
    }

    @And("^I remove the first occurrence of a single alphabet letter ([A-Za-z]?)$")
    public void iRemoveTheFirstOccurrenceOfASingleAlphabetLetterS(String letter) {
        firstWord = firstWord.replaceFirst(letter, "");
    }

    @And("^I remove all occurrences of digit (\\d)$")
    public void iRemoveAllOccurrencesOfDigit(int digit) {
        firstWord = firstWord.replaceAll(String.valueOf(digit), "");
    }
}
