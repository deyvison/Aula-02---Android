package com.example.deyvison.aula2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LogadoActivity extends AppCompatActivity {
    private TextView mTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);

        Bundle b = getIntent().getExtras();
        String texto = b.getString("nome");

        mTexto = (TextView) findViewById(R.id.texto);
        mTexto.setText("Olá "+texto+" - Seja bem vindo!");
        //savedInstanceState.getString("nome");
    }
}
