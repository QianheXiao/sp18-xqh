import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator offByOne = new OffByOne();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    } /* Uncomment this class once you've created your Palindrome class. */

    @Test
    public void testIsPalindrome(){
        assertTrue(palindrome.isPalindrome("ababa"));
        assertFalse(palindrome.isPalindrome("abcde"));
        assertTrue(palindrome.isPalindrome("aedb", offByOne));
        assertTrue(palindrome.isPalindrome("axghyb", offByOne));
        assertFalse(palindrome.isPalindrome("abrscz", offByOne));
    }
}
