package stepDefinitions;

import helper.StringHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAndCharCountSteps {
    private String textParagraph;
    private int wordsCountFromText;
    private int charsCount;

    @Given("The following text is given:")
    public void theFollowingTextIsGiven(String text) {
        textParagraph = text;
    }

    @When("I get the word count")
    public void iGetTheWordCount() {
        wordsCountFromText = StringHelper.getWordsCountFromText(textParagraph);
    }

    @When("I get the char count")
    public void iGetTheCharCount() {
        charsCount = StringHelper.getCharsCount(textParagraph);
    }

    @Then("I verify the words count is equal to {int}")
    public void iVerifyTheWordsCountIsEqualTo(int wordsCount) {
        System.out.println(textParagraph);
        Assertions.assertEquals(wordsCount, wordsCountFromText,
                "The word count is not as expected");
    }

    @Then("I verify the char count is equals to {int}")
    public void iVerifyTheCharCountIsEqualsTo(int expectedCharsCount) {
        System.out.println(textParagraph);
        Assertions.assertEquals(expectedCharsCount, charsCount,
                "The char count is not as expected");
    }

    @And("^remove all whitespace chars before (.)$")
    public void removeAllWhitespaceCharsBeforeSymbols(String symbol) {
        String regex = "[,.\\-?!:]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(symbol);
        //   I am ,testing   whitespaces - is the count correct?
        if (matcher.find()) {
            textParagraph = textParagraph.replaceAll(String.format("\\s+\\%s", symbol), String.format("\\%s", symbol));
        }
    }

    @And("remove more than one consecutive whitespace chars with a single space")
    public void removeMoreThanOneConsecutiveWhitespaceCharsWithASingleSpace() {
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textParagraph);
        textParagraph = matcher.replaceAll(" ");
    }
}