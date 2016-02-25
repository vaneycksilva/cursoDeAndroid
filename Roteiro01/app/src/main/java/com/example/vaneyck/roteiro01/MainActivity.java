package com.example.vaneyck.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mCadastrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCadastrado = (TextView)findViewById(R.id.cadastro1);
        Bundle bundle = getIntent().getExtras();
        //Log.i("teste", bundle != null ? "tem coisa" : "nao tem");
        String frase = bundle.getString("nome");
        mCadastrado.setText("Olá "+frase+", cadastro realizado com sucesso!!");

    }
}
