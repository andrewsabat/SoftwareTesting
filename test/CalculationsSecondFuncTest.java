import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


class CalculationsSecondFuncTest {
    public Calculations calculations = new Calculations();

    @Test
    void secondFuncFirstNum() {
        double expected = -4.081356137322991E+33;
        double actual = calculations.secondFunc(-123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void secondFuncSecondNum() {
        double expected = 5.88803732416899;
        double actual = calculations.secondFunc(1.001);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void secondFuncThirdNum() {
        double expected = 5.896083305352;
        double actual = calculations.secondFunc(1.002);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void secondFuncFourthNum() {
        double expected = 484160502.712825;
        double actual = calculations.secondFunc(606.945);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void secondFuncFifthNum() {
        double expected = 484162897.133509;
        double actual = calculations.secondFunc(606.946);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void secondFuncSixthNum() {
        double expected = 4.0813561372563857E+33;
        double actual = calculations.secondFunc(123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }
}