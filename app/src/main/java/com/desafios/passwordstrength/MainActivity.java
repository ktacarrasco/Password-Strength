package com.desafios.passwordstrength;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.desafios.passwordstrength.modelo.Verifier;
import com.desafios.passwordstrength.presenter.IPresenterView;
import com.desafios.passwordstrength.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IPresenterView {

        private Presenter presenter;
        EditText passw;
        TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passw = (EditText) findViewById(R.id.editText);
        texto = (TextView)findViewById(R.id.textView);
        passw.addTextChangedListener(watch);

    }

    TextWatcher watch= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        texto.setBackgroundColor(color.);
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            presenter.evaluatepass(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    public void showEasy() {
        tex
    }

    @Override
    public void showMedium() {
        return false;
    }

    @Override
    public void showHard() {
        return false;
    }

    @Override
    public void showVeryHard() {
        return false;
    }

}
