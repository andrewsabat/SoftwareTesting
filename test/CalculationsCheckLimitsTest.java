import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationsCheckLimitsTest {
    public Calculations calculations = new Calculations();

    @Test
    void checkFirstLimits() {
        assertThrows(Error.class , () -> calculations.checkLimits(1.003));
    }

    @Test
    void checkSecondLimits() {
        assertThrows(Error.class , () -> calculations.checkLimits(1.004));
    }

    @Test
    void checkThirdLimits() {
        assertThrows(Error.class , () -> calculations.checkLimits(606.943));
    }

    @Test
    void checkFourthLimits() {
        assertThrows(Error.class , () -> calculations.checkLimits(606.944));
    }
}