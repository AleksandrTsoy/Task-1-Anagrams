public class Anagramms {
    private static final String SPACE = " ";

    public String reverseText(String input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("String is null");
        }
        String[] inputWords = input.split(SPACE);
        String[] outputWords = new String[inputWords.length];
        for (int i = 0; i < inputWords.length; i++) {
            outputWords[i] = reverseWord(inputWords[i]);
        }
        return String.join(SPACE, outputWords);
    }

    public String reverseWord(String inputWord) {
        char[] words = inputWord.toCharArray();
        for (int j = 0, k = words.length - 1; j < k;) {
            if (!Character.isAlphabetic(words[j])) {
                j++;
            } else if (!Character.isAlphabetic(words[k])) {
                k--;
            } else {
                swapElements(words, j, k);
                j++;
                k--;
            }
        }
        return String.valueOf(words);
    }

    public void swapElements(char words[], int firstIndex, int lastIndex) {
        char insert = words[firstIndex];
        words[firstIndex] = words[lastIndex];
        words[lastIndex] = insert;
    }
}
