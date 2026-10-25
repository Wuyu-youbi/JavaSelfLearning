import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class SandwichTest {

    @Test
    void sandwichFillingsTest() {
        String text1 = "breadtunabread";
        assertEquals("tuna", Sandwich.sandwichFillings(text1));

        String text2 = "chipsbreadtunasalad";
        assertEquals("none", Sandwich.sandwichFillings(text2));
    }

}
