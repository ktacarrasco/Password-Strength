package com.desafios.passwordstrength.presenter;

import com.desafios.passwordstrength.modelo.Verifier;

public class Presenter {

    IPresenterView iPresenterView;
    Verifier verifier;

    public Presenter(IPresenterView iPresenterView) {
        this.iPresenterView = iPresenterView;
        this.verifier = new Verifier();
    }

    public void  evaluatepass(String passw){


    }

}
