import java.io.IOException;

public class student_fraction_runner {

    public static void main(String str[]) throws IOException
    {
        Fraction fraction1 = new Fraction(7, 4);
        System.out.println("Fraction 1: " + fraction1);
        System.out.println("As a mixed number: " + fraction1.mixedNumber());
        System.out.println();

        Fraction fraction2 = new Fraction();
        System.out.println("Fraction 2: " + fraction2);
        System.out.println("As a mixed number: " + fraction2.mixedNumber());
        System.out.println();

        Fraction fraction3 = new Fraction(2, 7);
        System.out.println("Fraction 3: " + fraction3);
        System.out.println("As a mixed number: " + fraction3.mixedNumber());
        fraction3.add(2, 5);
        System.out.println("Add 2/5: " + fraction3);
        System.out.println();

        Fraction fraction4 = new Fraction(24, 6);
        System.out.println("Fraction 4: " + fraction4);
        System.out.println("As a mixed number: " + fraction4.mixedNumber());
        fraction4.add(1, -2);
        System.out.println("Attempt to add 1/-2: " + fraction4);
        System.out.println();

        Fraction fraction5 = new Fraction(5, 2);
        System.out.println("Fraction 5: " + fraction5);
        System.out.println("As a mixed number: " + fraction5.mixedNumber());
        fraction5.add(2, 3);
        System.out.println("Add 2/3: " + fraction5);
        System.out.println("As a mixed number: " + fraction5.mixedNumber());
        System.out.println();

    }
}
