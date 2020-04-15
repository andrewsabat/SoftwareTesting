import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


class CalculationsFirstFuncTest {
    public Calculations calculations = new Calculations();

    @Test
    void firstFuncFirstNum() {
        double expected = 4.06999637890355E+44;
        double actual = calculations.firstFunc(-123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void firstFuncSecondNum() {
        double expected = 1.77422374004075;
        double actual = calculations.firstFunc(1.001);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void firstFuncThirdNum() {
        double expected = 1.78147299634003;
        double actual = calculations.firstFunc(1.002);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void firstFuncFourthNum() {
        double expected = 238208663498.233;
        double actual = calculations.firstFunc(606.945);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void firstFuncFifthNum() {
        double expected = 238210232644.944;
        double actual = calculations.firstFunc(606.946);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void firstFuncSixthNum() {
        double expected = 4.069996378979983E+44;
        double actual = calculations.firstFunc(123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }
}