import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class StringPracticeTest {

    @Test
    void removeLeftmostSubstring() {
        assertEquals("d", StringPractice.removeLeftmostSubstring("abcd", "abc"));
        assertEquals("d", StringPractice.removeLeftmostSubstring("ababccd", "abc"));

    }

}
