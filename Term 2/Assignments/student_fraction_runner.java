import java.io.IOException;

public class student_fraction_runner {

    public static void main(String str[]) throws IOException
    {
        if (main_1(str))
            main_2(str);
    }

    public static boolean main_1(String str[]) throws IOException
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

        return Fraction.ASSIGNMENT_4;
    }

    public static void main_2(String str[]) throws IOException
    {

        Fraction fraction1 = new Fraction(8, 10);
        System.out.println("Fraction 1: " + fraction1);

        Fraction fraction2 = new Fraction(12, 8);
        System.out.println("Fraction 2: " + fraction2);

        Fraction fraction3 = new Fraction(4, 5);
        System.out.println("Fraction 3: " + fraction3);
        System.out.println();

        System.out.println("Compare fraction 1 to fraction 2: " + fraction1.compareTo(fraction2));
        System.out.println("Compare fraction 2 to fraction 1: " + fraction2.compareTo(fraction1));
        System.out.println();

        System.out.println("Compare fraction 1 to fraction 3: " + fraction1.compareTo(fraction3));
        System.out.println("Compare fraction 3 to fraction 1: " + fraction3.compareTo(fraction1));
        System.out.println();

        System.out.println("Compare fraction 2 to fraction 3: " + fraction2.compareTo(fraction3));
        System.out.println("Compare fraction 3 to fraction 2: " + fraction3.compareTo(fraction2));
    }
}
