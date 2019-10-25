
/* Term 2 Assignment 1 - Fraction */
/* A class which is used to represent fractions*/
public class Fraction implements java.lang.Comparable<Object> {
    public int numerator;
    public int denominator;
    
    /**
     * you should disable this if on assignment 1.
     */
    public static final boolean ASSIGNMENT_4 = true;

    /**
     * default constructor which creates a fraction 1/1
     */
    public Fraction()
    {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     *  If n is positive, set numerator to n. Otherwise, set numerator to 1. 
     *  If d is positive, set denominator to d. Otherwise, set denominator to 1.
     * 
     * @param n numerator
     * @param d denominator
     */
    public Fraction(int n, int d)
    {
        this.numerator = n > 0 ? n : 1;
        this.denominator = d > 0 ? d : 1;
        
        if(ASSIGNMENT_4)
            simplify();
    }

    /**
     * Returns the fraction as a string in the format “numerator/denominator”. For example 1/2 or 5/3.
     *
     * @return String in the format numerator/denominator
     */
    @Override 
    public String toString()
    {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    /**
     * Returns any improper (top-heavy) fraction as a mixed number, 
     * for example, 2 3/5. If the numerator of the fraction part is 0, return only the integer part of the mixed number.
     * If the fraction is proper, return only the fraction part.
     * 
     * @return fraction as mixed number
     */
    public String mixedNumber()
    {
        int fraction = (int)(this.numerator/this.denominator), numerator = this.numerator%this.denominator;
        return String.format("%s %s", fraction == 0 ? "" : " " + String.valueOf(fraction), numerator == 0 ? "" : String.valueOf(numerator)+"/"+String.valueOf(this.denominator));
    }

    /**
     * If n and d are both positive, add the fraction n/d to this fraction. 
     * Otherwise, leave the fractions unchanged. In general the sum of the fractions a/b and c/d is {@code (a*d + c*b)/(b*d)}
     * 
     * @param n numerator
     * @param d denominator
     */
    public void add(int n, int d)
    {
        if(n < 1 || d < 1)
            return;
        
        this.numerator = this.numerator * d + n * this.denominator;
        this.denominator *= d; 
    }
    
    /*
     * Assignment 4 parts
     */
    
    /**
     * return the greatest common divisor of a and b. 
     * To find the gcd of two numbers there are several possible algorithms. 
     * One of these was showcased in term 1 lesson 19 - More Loops.
     * 
     * @param a
     * @param b
     * @return greatest common divisor
     */
    static int gcd(int a, int b) 
    {
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    /**
     * void simplify(): reduce the fraction to its simplest possible form: 
     * e.g. the fraction 12/18 should be reduced to 2/3. 
     * The static method gcd provides a useful helper for this method.
     */
    void simplify() 
    {
        numerator = numerator / gcd(numerator, denominator);
        denominator = denominator / gcd(numerator, denominator);
    }

    /**
     * Return -1 if this fraction is smaller than the fraction other, 
     * return 0 if this fraction is equal to the fraction other, 
     * and return 1 if this fraction is greater than the fraction other. 
     * Hint: To compare the two fractions, it will help to first convert them to fractions with a common (equal) denominator.
     *
     * @return 0|1
     */
    @Override
    public int compareTo(Object other)
    {
        Fraction target = (Fraction)other;
        return 0;
    }
}