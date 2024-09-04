package br.com.marcus.atividade16;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DadosActivity extends AppCompatActivity {

    TextView nome, idade, altura;
    Button voltarbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dados);

        nome = findViewById(R.id.tvnome);
        idade = findViewById(R.id.tvidade);
        altura = findViewById(R.id.tvaltura);
        voltarbtn = findViewById(R.id.btnVoltar);

        Intent intent = getIntent();

        // EXTRAIR OS DADOS PASSADOS COMO "EXTRAS" NO INTENT
        String nomelocal = intent.getStringExtra("nome");
        String idadelocal = intent.getStringExtra("idade");
        String alturalocal = intent.getStringExtra("altura");

        // DEFINIR O TEXTVIEW QUE VAI RECEBER OS DADOS DOS PACOTES
        nome.setText("Nome: " + nomelocal);
        idade.setText("idade: " + idadelocal);
        altura.setText("altura: " + alturalocal);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //FINALIZAR A ACTIVITY ATUAL E RETORNAR
                // Á ACTIVITY ANTERIOR
                finish();
            }
        });
    }
}