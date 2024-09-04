package br.com.marcus.conceitosintent3;

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

public class ListaActivity extends AppCompatActivity {
    //DECLARAÇÃO DAS VARIAVEIS
    TextView nome, email, telefone;
    Button voltarBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        nome = findViewById(R.id.tvNome);
        email = findViewById(R.id.tvEmail);
        telefone = findViewById(R.id.tvPhone);
        voltarBtn = findViewById(R.id.btnVoltar);

        //RECEBE O INTENT ENVIADO PELA MAINACTIVITY
        Intent intent = getIntent();

        // EXTRAIR OS DADOS PASSADOS COMO "EXTRAS" NO INTENT
        String nomelocal = intent.getStringExtra("nome");
        String emaillocal = intent.getStringExtra("email");
        String telefonelocal = intent.getStringExtra("telefone");

        // DEFINIR O TEXTVIEW QUE VAI RECEBER OS DADOS DOS PACOTES
        nome.setText("Nome: " + nomelocal);
        email.setText("Email: " + emaillocal);
        telefone.setText("Telefone: " + telefonelocal);

        voltarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //FINALIZAR A ACTIVITY ATUAL E RETORNAR
                // Á ACTIVITY ANTERIOR
                finish();
            }
        });

    }
}