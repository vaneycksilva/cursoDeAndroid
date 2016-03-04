package com.example.vaneyck.roteiro02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class TraduzirParaFrances_Activity extends AppCompatActivity {

    private TextView mCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_para_frances_);

        mCor = (TextView)findViewById(R.id.frances);

        Bundle bundle = getIntent().getExtras();
        String cor = bundle.getString("cor");
        if (cor.equalsIgnoreCase("vermelho")){
            mCor.setText("Vermelho em francês é: Rouge");
        }else if (cor.equalsIgnoreCase("azul")){
            mCor.setText("Azul em francês é: Bleu");
        }else
            mCor.setText("Amaralo em francês é: Jaune");

        ((Button)findViewById(R.id.button3)).setOnClickListener(new onClick());

    }

    // botão voltar
    private class onClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            finish();
        }
    }



}
