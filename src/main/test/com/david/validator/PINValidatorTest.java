package com.david.validator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PINValidatorTest {

    @Test
    void testIsPINValid() {

        String pin1 = "5486794236541";
        String pin2 = "2";
        String pin3 = "590615/6102";
        String pin4 = "151865/8574";
        String pin5 = "800510/3579";
        String pin6 = "147896/5486";
        String pin7 = "726222/1516";
        String pin8 = "321399/2584";
        String pin9 = "075226/2819";
        String pin3 = "910608/4682";
        String pin4 = "651814/8574";
        String pin5 = "765425/1215";
        String pin6 = "967814/5486";
        String pin7 = "020823/1111";
        String pin8 = "993213/2584";
        String pin9 = "976228/4867";
        String pin10 = "555555/5555";
        String pin11 = "111111/1111";

        assertFalse(PINValidator.isPINValid(pin1));
        assertFalse(PINValidator.isPINValid(pin2));
        assertTrue(PINValidator.isPINValid(pin3));
        assertFalse(PINValidator.isPINValid(pin4));
        assertTrue(PINValidator.isPINValid(pin5));
        assertFalse(PINValidator.isPINValid(pin6));
        assertTrue(PINValidator.isPINValid(pin7));
        assertFalse(PINValidator.isPINValid(pin8));
        assertTrue(PINValidator.isPINValid(pin9));
        assertFalse(PINValidator.isPINValid(pin10));
        assertTrue(PINValidator.isPINValid(pin11));


    }
}