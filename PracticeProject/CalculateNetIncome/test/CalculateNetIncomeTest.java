import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CalculateNetIncomeTest {
    @Test
    void calcNetIncomeTest() {
        String text = "salary 15000yuan bonus2000 rent -1000Y";
        assertEquals(16000, CalculateNetIncome.calcNetIncome(text));

    }
    @Test
    void calculateNetIncome () {
        String text = "25000 gross income, -200 water, electricity: -300";
        assertEquals(24500, CalculateNetIncome.calcNetIncome(text));
    }
}

