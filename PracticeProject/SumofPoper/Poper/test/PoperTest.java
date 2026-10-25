import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PoperTest {
    @Test
    void SumOfPoper() {
        int[] num = new int[] {1, 2, 6};
        int[] num1 = new int[] {10, 25};

        assertEquals(9, Poper.SumOfPoper(num));
        assertEquals(10, Poper.SumOfPoper(num1));
    }
}
