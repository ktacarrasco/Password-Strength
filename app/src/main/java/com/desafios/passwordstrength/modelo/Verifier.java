package com.desafios.passwordstrength.modelo;

import android.widget.Toast;

import androidx.annotation.VisibleForTesting;

import com.desafios.passwordstrength.presenter.IPresenterView;

public class Verifier {

    public static final int weak = 1;
    public static final int medium = 2;
    public static final int strong = 3;
    public static final int veryStrong = 4;


    @VisibleForTesting
    public boolean EvaluateLength(String passw) {
        if (passw.length() < 5) {

            return false;
        }

        return true;
    }

    @VisibleForTesting
    public boolean EvaluateNumber(String passw) {
        for(int i=0; i< passw.length(); i++) {
            if(Character.isDigit(passw.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    @VisibleForTesting
    public boolean EvaluateLetter(String passw) {
        if (!passw.matches(".*[A-Z].*")) {
            return false;
        }

        return true;
    }


    public int evaluatePassword(String passw) {
        if (EvaluateLength(passw) && EvaluateLetter(passw) && EvaluateNumber(passw)) return veryStrong;
        if (EvaluateLength(passw) && EvaluateLetter(passw)) return  strong;
        if (EvaluateLength(passw)) return medium;
        return weak;
    }

}
