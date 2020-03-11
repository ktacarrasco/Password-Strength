package com.desafios.passwordstrength;

import com.desafios.passwordstrength.modelo.Verifier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VerifierTest {


    Verifier verifier;
    @Before
    public void setup(){

        verifier = new Verifier();
    }

    @Test
    public void evaluateLength(){
        String passw="Kta1984";
        assertTrue(verifier.EvaluateLength(passw));
    }

    @Test
    public void evaluateMay(){
        String passw="Kta1984";
        assertTrue(verifier.EvaluateLetter(passw));
    }

    @Test
    public void evaluateNumber(){
        String passw="Kta1984";
        assertTrue(verifier.EvaluateNumber(passw));
    }

    @Test
    public void evaluatePass_weak() {
        String pass = "abc";
        int eval = verifier.evaluatePassword(pass);
        assertEquals(eval, Verifier.weak);
    }

    @Test
    public void evaluatePass_medium() {
        String pass = "abcde";
        int eval = verifier.evaluatePassword(pass);
        assertEquals(eval, Verifier.medium);
    }

    @Test
    public void evaluatePass_strong() {
        String pass = "Abcde";
        int eval = verifier.evaluatePassword(pass);
        assertEquals(eval, Verifier.strong);
    }

    @Test
    public void evaluatePass_very_strong() {
        String passw = "Abcde1";
        int eval = verifier.evaluatePassword(passw);
        assertEquals(eval, Verifier.veryStrong);
    }

}
