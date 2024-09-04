package br.com.marcus.conceitosintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnTela2;   //button é uma classe, e o btn é um objeto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btnTela2 = findViewById(R.id.btnTela2);

       btnTela2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // QUERO UMA INTENÇÃO? IR PARA TELA 2
               // VAMOS CRIAR A INTENÇÃO --> INTENT
               // intent --> Origem e o destino

               Intent trocaTela = new Intent(MainActivity.this, Tela2Activity.class);
               MainActivity.this.startActivity(trocaTela);

           }
       });
    }
}