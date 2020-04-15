import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


class CalculationsThirdFuncTest {
    public Calculations calculations = new Calculations();

    @Test
    void thirdFuncFirstNum() {
        double expected = 3.0102118458433068E+22;
        double actual = calculations.thirdFunc(-123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void thirdFuncSecondNum() {
        double expected = 5.04701697499999;
        double actual = calculations.thirdFunc(1.001);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void thirdFuncThirdNum() {
        double expected = 5.0540379;
        double actual = calculations.thirdFunc(1.002);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void thirdFuncFourthNum() {
        double expected = 729415.196649375;
        double actual = calculations.thirdFunc(606.945);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void thirdFuncFifthNum() {
        double expected = 729417.5971491;
        double actual = calculations.thirdFunc(606.946);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void thirdFuncSixthNum() {
        double expected = 3.0102118459189854E+22;
        double actual = calculations.thirdFunc(123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }
}