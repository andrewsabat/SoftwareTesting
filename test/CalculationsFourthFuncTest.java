import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


class CalculationsFourthFuncTest {
    public Calculations calculations = new Calculations();

    @Test
    void fourthFuncFirstNum() {
        double expected = -512345677985.4;
        double actual = calculations.fourthFunc(-123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void fourthFuncSecondNum() {
        double expected = 4.15415;
        double actual = calculations.fourthFunc(1.001);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void fourthFuncThirdNum() {
        double expected = 4.1583;
        double actual = calculations.fourthFunc(1.002);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void fourthFuncFourthNum() {
        double expected = 2518.82175;
        double actual = calculations.fourthFunc(606.945);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void fourthFuncFifthNum() {
        double expected = 2518.8259;
        double actual = calculations.fourthFunc(606.946);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }

    @Test
    void fourthFuncSixthNum() {
        double expected = 512345677985.4;
        double actual = calculations.fourthFunc(123456789876D);
        expected = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(expected).setScale(3, RoundingMode.DOWN)));
        actual = Double.parseDouble(
                String.valueOf(BigDecimal.valueOf(actual).setScale(3, RoundingMode.DOWN)));
        assertEquals(expected, actual);
    }
}