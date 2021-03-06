package com.david.validator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PINValidatorTest {

    @Test
    void testIsPINValid() {

        String pin1 = "5486794236541";
        String pin2 = "2";
        String pin3 = "910608/4682";
        String pin4 = "651814/8574";
        String pin5 = "765425/1215";
        String pin6 = "967814/5486";
        String pin7 = "020823/1111";
        String pin8 = "993213/2584";
        String pin9 = "976228/4867";
        String pin10 = "555555/5555";
        String pin11 = "111111/1111";
        String pin12 = "";
        String pin13 = "///////////";
        String pin14 = "jhtkdzkrt/k";
        String pin15 = "jhtkdz/kjhg";
        String pin16 = "poiuztrewqa";

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
        assertFalse(PINValidator.isPINValid(pin12));
        assertFalse(PINValidator.isPINValid(pin13));
        assertFalse(PINValidator.isPINValid(pin14));
        assertFalse(PINValidator.isPINValid(pin15));
        assertFalse(PINValidator.isPINValid(pin16));


    }
}