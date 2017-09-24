package es.upm.miw.forge.ecp2;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }
    
    public boolean isEquivalent(Fraction fraction2) {
        return (this.numerator * fraction2.denominator) == (this.denominator * fraction2.numerator);
    }
    
    public boolean isDecimal() {
        Integer x = 1;
        while (x < Math.abs(this.denominator) && x <= Integer.MAX_VALUE / 10) {
            x *= 10;
        }
        return x == Math.abs(this.denominator);
    }

    public boolean isUnitaria(){
        return this.numerator == this.denominator;
        
    }
}
