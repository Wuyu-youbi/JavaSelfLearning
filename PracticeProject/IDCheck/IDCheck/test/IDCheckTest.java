import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class IDCheckTest {

    @Test
    void CharToDigitalTestFor10 () {
        char number = 'X';
        assertEquals(10, IDCheck.CharToDigital(number));

    }

    @Test
    void CharToDigitalTestForError () {
        char character = 'A';
        assertEquals(-1, IDCheck.CharToDigital(character));
    }

    @Test
    void isValidIDTestForFalse () {
        String ID1 = "THMBB7092WD114221";
        assertFalse(IDCheck.isValidID(ID1));
    }

    @Test
    void isValidIDTestForTrue () {
        String ID = "A001-606X-17X";
        assertTrue(IDCheck.isValidID(ID));
    }

    @Test
    void isValidIDTestForShortID () {
        String ID = "A01";
        assertFalse(IDCheck.isValidID(ID));
    }

}
