package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;
    
    @Before
    public void before(){
        fraction = new Fraction();
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
    public void testIsDecimal() {
        fraction = new Fraction(5,10);
        assertEquals(true, fraction.isDecimal());
        fraction = new Fraction(5,20);
        assertEquals(false, fraction.isDecimal());
    }

}
