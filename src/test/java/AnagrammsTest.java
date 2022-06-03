import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagrammsTest {
    private static final String ONLY_NULL_REVERSED = "String is null";
    private static final String ONLY_EMPTYSTRING = "";
    private static final String ONLY_EMPTYSTRING_REVERSED = "";
    private static final String ONLY_SINGLESPACE = " ";
    private static final String ONLY_SINGLESPACE_REVERSED = "";
    private static final String ONLY_SEVERALSPACES = "  ";
    private static final String ONLY_SEVERALSPACES_REVERSED = "";
    private static final String ONLY_SINGLECHARACTER = "b";
    private static final String ONLY_SINGLECHARACTER_REVERSED = "b";
    private static final String ONLY_MULTIPLESAMELETTER = "aaa";
    private static final String ONLY_MULTIPLESAMELETTER_REVERSED = "aaa";
    private static final String ONLY_MULTIPLESAMECHARACTERLOWERUPPER = "fF";
    private static final String ONLY_MULTIPLESAMECHARACTERLOWERUPPER_REVERSED = "Ff";
    private static final String ONLY_DIFFERENTLETTERS = "Hello";
    private static final String ONLY_DIFFERENTLETTERS_REVERSED = "olleH";
    private static final String ONLY_SYMBOLS = "!&?";
    private static final String ONLY_SYMBOLS_REVERSED = "!&?";
    private static final String ONLY_SEVERALWORDS = "Hello World";
    private static final String ONLY_SEVERALWORDS_REVERSED = "olleH dlroW";
    private Anagramms anagram;

    @BeforeEach
    public void init() {
        anagram = new Anagramms();
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNullIsPassed() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> anagram.reverseText(null));
        assertEquals(ONLY_NULL_REVERSED, exception.getMessage());
    }

    @Test
    void shouldOutputWhenEmptyStringIsPassed() {
        String actual = anagram.reverseText(ONLY_EMPTYSTRING);
        assertEquals(ONLY_EMPTYSTRING_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenSingleSpaceIsPassed() {
        String actual =anagram.reverseText(ONLY_SINGLESPACE);
        assertEquals(ONLY_SINGLESPACE_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenSeveralSpacesIsPassed() {
        String actual = anagram.reverseText(ONLY_SEVERALSPACES);
        assertEquals(ONLY_SEVERALSPACES_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenSingleCharacterIsPassed() {
        String actual = anagram.reverseText(ONLY_SINGLECHARACTER);
        assertEquals(ONLY_SINGLECHARACTER_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenMultipleSameLetterIsPassed() {
        String actual = anagram.reverseText(ONLY_MULTIPLESAMELETTER);
        assertEquals(ONLY_MULTIPLESAMELETTER_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenMultipleSameCharacterLowerUpperIsPassed() {
        String actual = anagram.reverseText(ONLY_MULTIPLESAMECHARACTERLOWERUPPER);
        assertEquals(ONLY_MULTIPLESAMECHARACTERLOWERUPPER_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenDifferentLettersIsPassed() {
        String actual = anagram.reverseText(ONLY_DIFFERENTLETTERS);
        assertEquals(ONLY_DIFFERENTLETTERS_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenOnlySymbolsIsPassed() {
        String actual = anagram.reverseText(ONLY_SYMBOLS);
        assertEquals(ONLY_SYMBOLS_REVERSED, actual);
    }

    @Test
    void shouldOutputWhenSeveralWordsIsPassed() {
        String actual = anagram.reverseText(ONLY_SEVERALWORDS);
        assertEquals(ONLY_SEVERALWORDS_REVERSED, actual);
    }
}
