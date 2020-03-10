package com.desafios.passwordstrength;

import com.desafios.passwordstrength.modelo.Verifier;

import org.junit.Before;
import org.junit.Test;

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



}
