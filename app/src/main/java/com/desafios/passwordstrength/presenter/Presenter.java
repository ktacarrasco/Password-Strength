package com.desafios.passwordstrength.presenter;

import com.desafios.passwordstrength.modelo.Verifier;

public class Presenter {

    IPresenterView iPresenterView;
    Verifier verifier;

    public Presenter(IPresenterView iPresenterView) {
        this.iPresenterView = iPresenterView;
        this.verifier = new Verifier();
    }

    public void evaluatepass(String passw) {

        int res = verifier.evaluatePassword(passw);
        switch (res) {
            case Verifier.weak:
                this.iPresenterView.showEasy();
                break;
            case Verifier.medium:
                this.iPresenterView.showMedium();
                break;
            case Verifier.strong:
                this.iPresenterView.showHard();
                break;
            case Verifier.veryStrong:
                this.iPresenterView.showVeryHard();
                break;

        }

    }
}
