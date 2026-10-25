import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextCompareTest {
    @Test
    void countWordsTest() {
        String text1 = new String("there was never a good war, or a bad peace.");
        assertEquals(1, TextCompare.CountWords(text1, "war"));

        String text2 = new String("war what is it good for");
        assertEquals(1, TextCompare.CountWords(text2, "war"));

    }

    @Test
    void WarAndPeaceTest() {
        String text1 = new String("there was never a good war, or a bad peace.");
        assertEquals(true, TextCompare.WarAndPeace(text1));

        String text2 = new String("war what is it good for");
        assertEquals(false, TextCompare.WarAndPeace(text2));

    }

}
