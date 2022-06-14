package helper;

public class StringHelper {

    public static boolean areWordsEqual(String firstWord, String secondWord, boolean isCaseSensitive) {
        if (firstWord.contains(" ") || secondWord.contains(" ")) throw new RuntimeException
                ("Parameters contain whitespaces.");
        return isCaseSensitive == true ? (firstWord.equals(secondWord)) : firstWord.equalsIgnoreCase(secondWord);
    }

    public static boolean areSentencesEqual(String firstSentence, String secondSentence, boolean isCaseSensitive) {
        return isCaseSensitive == true ? (firstSentence.equals(secondSentence)) :
                firstSentence.equalsIgnoreCase(secondSentence);
    }

    public static int getWordsCountFromText(String text) {
        return text.split(" ").length;
    }

    public static int getCharsCount(String text) {
        return text.length();
    }

}



