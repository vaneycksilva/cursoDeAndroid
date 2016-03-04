package com.example.vaneyck.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mbotao;
    private TextView mtexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbotao = (Button)findViewById(R.id.button);
        mtexto = (TextView)findViewById(R.id.editText);


        mbotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cor = mtexto.getText().toString();
                Bundle bundle = new Bundle();

                if(cor.equalsIgnoreCase("azul")||cor.equalsIgnoreCase("vermelho")||cor.equalsIgnoreCase("amarelo")){
                    bundle.putString("cor",cor);
                    Intent intent = new Intent("Traduzir");
                    intent.putExtras(bundle);
                    startActivity(intent);
                   // finish();
                }else{
                    View focus = null;
                    mtexto.setError("A cor não é primária");
                    focus = mtexto;
                    focus.requestFocus();
                }

            }


        });



    }


}
