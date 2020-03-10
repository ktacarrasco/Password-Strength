package com.desafios.passwordstrength.modelo;

import android.widget.Toast;

import androidx.annotation.VisibleForTesting;

import com.desafios.passwordstrength.presenter.IPresenterView;

public class Verifier {

    public int weak;
    public int medium;
    public int strong;
    public int veryStrong;


    @VisibleForTesting
    public boolean EvaluateLength(String passw) {
        if (passw.length() < 5) {

            return false;
        }
        weak = 1;
        return true;
    }

    @VisibleForTesting
    public boolean EvaluateNumber(String passw) {
        for(int i=0; i< passw.length(); i++) {
            if(Character.isDigit(passw.charAt(i))) {
                return true;
            }
        }
        medium = 1;
        return false;
    }

    @VisibleForTesting
    public boolean EvaluateLetter(String passw) {
        if (!passw.matches(".*[A-Z].*")) {
            return false;
        }
        strong = 1;
        return true;
    }

    @VisibleForTesting
    public boolean EvaluateAll() {
        if (weak == 1 && medium == 1 && strong == 1 && veryStrong == 1) {
            return true;
        }
        return false;
    }


}
