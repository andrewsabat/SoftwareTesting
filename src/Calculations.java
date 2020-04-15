import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Remember, you`re number will be rounded to 3 digits after dot!\n");
        System.out.print("Enter x = ");
        double x = scan.nextDouble();
        System.out.println("Your (x) is " + x);
        checkLimits(x);
        System.out.print("x^4*1.752+x^3*2.031-x^2*3.874+x*1.858 = ");
        System.out.println(BigDecimal.valueOf(firstFunc(x))
                .setScale(3, RoundingMode.HALF_UP));
        System.out.print("x^3*2.169-x^2*2.185+x*5.896 = ");
        System.out.println(BigDecimal.valueOf(secondFunc(x))
                .setScale(3, RoundingMode.HALF_UP));
        System.out.print("x^2*1.975+x*3.065 = ");
        System.out.println(BigDecimal.valueOf(thirdFunc(x))
                .setScale(3, RoundingMode.HALF_UP));
        System.out.print("x*4.15 = ");
        System.out.println(BigDecimal.valueOf(fourthFunc(x))
                .setScale(3, RoundingMode.HALF_UP));
    }

    static void checkLimits(double x) {
        if (x > 1.002 && x < 606.945) {
            throw new java.lang.Error("Variable out of boundary limits!");
        }
    }

    static double firstFunc(double x) {
        return Math.pow(x, 4) * 1.752 + Math.pow(x, 3) * 2.031 - Math.pow(x, 2) * 3.874 + x * 1.858;
    }

    static double secondFunc(double x) {
        return Math.pow(x, 3) * 2.169 - Math.pow(x, 2) * 2.185 + x * 5.896;
    }

    static double thirdFunc(double x) {
        return Math.pow(x, 2) * 1.975 + x * 3.065;
    }

    static double fourthFunc(double x) {
        return x * 4.15;
    }
}
