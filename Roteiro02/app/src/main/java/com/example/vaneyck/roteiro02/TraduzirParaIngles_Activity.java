package com.example.vaneyck.roteiro02;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TraduzirParaIngles_Activity extends AppCompatActivity {


    private TextView mCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_para_ingles_);

        mCor = (TextView) findViewById(R.id.ingles);

        Bundle bundle = getIntent().getExtras();
        String cor = bundle.getString("cor");
        if (cor.equalsIgnoreCase("vermelho")) {
            mCor.setText("Vermelho em inglês é: Red");
        } else if (cor.equalsIgnoreCase("azul")) {
            mCor.setText("Azul em inglês é: Blue");
        } else
            mCor.setText("Amaralo em inglês é: Yellow");

        ((Button)findViewById(R.id.button2)).setOnClickListener(new onClick());
    }

    //botão voltar
    private class onClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            finish();
        }
    }
}


