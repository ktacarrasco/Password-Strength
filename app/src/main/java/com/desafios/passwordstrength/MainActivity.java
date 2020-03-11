package com.desafios.passwordstrength;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
        presenter = new Presenter(this);
        passw = (EditText) findViewById(R.id.editText);
        texto = (TextView)findViewById(R.id.textView);
        passw.addTextChangedListener(watch);

    }

    TextWatcher watch= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

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
        texto.setBackgroundColor(Color.RED);
        texto.setText(R.string.weak);
    }

    @Override
    public void showMedium() {
        texto.setBackgroundColor(getColor(R.color.orange));
        texto.setText(R.string.medium);
    }

    @Override
    public void showHard() {
        texto.setBackgroundColor(Color.YELLOW);
        texto.setText(R.string.Strong);
    }

    @Override
    public void showVeryHard() {
        texto.setBackgroundColor(Color.GREEN);
        texto.setText(R.string.Very_strong);
    }

}
