package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;
    private Fraction fraction2;
    private Fraction fraction3;
    private Fraction fraction4;

    
    @Before
    public void before(){
        fraction = new Fraction(2,6);
        fraction3 = new Fraction(1,3);
        fraction4 = new Fraction(2,2);
    }

    @Test
    public void testFractionIntInt() {
        fraction = new Fraction(3,5);
        assertEquals(3, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        fraction = new Fraction(4,8);
        assertEquals(0.5, fraction.decimal(),0.5);
    }
    
    @Test
    public void testIsEquivalent() {
        fraction2 = new Fraction(1,3);
        assertEquals(true,fraction.isEquivalent(fraction2));
        fraction3 = new Fraction(5,7);
        assertEquals(false,fraction.isEquivalent(fraction3));
    }
    
    @Test
    public void testIsDecimal() {
        fraction = new Fraction(5,10);
        assertEquals(true, fraction.isDecimal());
        fraction = new Fraction(5,20);
        assertEquals(false, fraction.isDecimal());
        fraction = new Fraction(5,-100);
        assertEquals(true, fraction.isDecimal());
    }
    
    @Test
    public void testIsUnitaria(){
        assertEquals(true, fraction4.isUnitaria());
        assertEquals(false, fraction.isUnitaria());

        
    }

}
