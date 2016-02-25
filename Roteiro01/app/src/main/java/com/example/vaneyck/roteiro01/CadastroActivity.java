package com.example.vaneyck.roteiro01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mSobrenome;
    private EditText mSenha;
    private EditText mUsuario;
    private Button mBotao;
    private EditText mConfirmarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // setar os ids
        mNome = (EditText)findViewById(R.id.nome);
        mSobrenome = (EditText)findViewById(R.id.sobrenome);
        mSenha = (EditText)findViewById(R.id.senha);
        mUsuario = (EditText)findViewById(R.id.usuario);
        mBotao = (Button)findViewById(R.id.buttonOk);
        mConfirmarSenha = (EditText)findViewById(R.id.confirmarSenha);

        // clicar no botao
        mBotao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                cadastrarUsuario();
            }
        });
    }


    private void cadastrarUsuario() {

        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();
        String confirmarSenha = mConfirmarSenha.getText().toString();
        String nome = mNome.getText().toString();
        String sobrenome = mSobrenome.getText().toString();


        View focus = null;
        boolean status = false;
        if (TextUtils.isEmpty(usuario)) {
            mUsuario.setError("Ops, Usuário vazio!");
            focus = mUsuario;
            status = true;
        }

        if (TextUtils.isEmpty(nome)) {
            mNome.setError("Ops, Nome vazio!");
            focus = mNome;
            status = true;
        }

        if (TextUtils.isEmpty(sobrenome)) {
            mSobrenome.setError("Ops, Sobrenome vazio!");
            focus = mSobrenome;
            status = true;
        }

        if (TextUtils.isEmpty(senha)) {
            mSenha.setError("Ops, Senha vazia!");
            focus = mSenha;
            status = true;
        }

        if (TextUtils.isEmpty(confirmarSenha)) {
            mConfirmarSenha.setError("Confirme sua senha");
            focus = mConfirmarSenha;
            status = true;
        }
        if (status) {
            focus.requestFocus();
        } else {

            if (senha.equalsIgnoreCase(confirmarSenha)) {
                Intent intent = new Intent(this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", nome);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }else{
                mConfirmarSenha.setError("Senha não confere");
                focus = mConfirmarSenha;
                status = true;


            }
        }


    }

}
