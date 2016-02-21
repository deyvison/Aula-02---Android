package com.example.deyvison.aula2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsuario;
    private EditText mSenha;
    private Button mLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsuario = (EditText) findViewById(R.id.login);
        mSenha = (EditText) findViewById(R.id.senha);
        mLogar = (Button) findViewById(R.id.entrar);

        mLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });
    }

    private void logar(){
        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();

        if(usuario.equals("admin") && senha.equals("admin")){
            Intent i = new Intent(this,LogadoActivity.class);
            Bundle b = new Bundle();
            b.putString("nome",usuario);
            i.putExtras(b);
            startActivity(i);
            finish();
        }else{
            View focus = null;
            if(TextUtils.isEmpty(usuario)){
                mUsuario.setError("Campo Vazio!");
                focus = mUsuario;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(senha)){
                mSenha.setError("Campo Vazio!");
                focus = mSenha;
                focus.requestFocus();
            }else{
                mUsuario.setError("Usuário ou senha inválidos!");
                focus = mUsuario;
                focus.requestFocus();
            }
        }
    }
}
