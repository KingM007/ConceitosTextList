package br.com.marcus.conceitosintent3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // DECLARAÇÃO DAS VARIAVEIS PARA OS
    // ELEMENTOS DA INTERFACE DO USUARIO --> XML

    private EditText nomeEdit, emailEdit, telefoneEdit;
    private Button enviarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DEFINIR O LAYOUT NA MINHA ACTIVITY
        setContentView(R.layout.activity_main);

        // ASSOCIAR AS VARIAVEIS AOS ELEMENTOS
        // INTERFACE COM BASE EM SEUS IDs (IDENTIFICADORES)
        nomeEdit = findViewById(R.id.edtNome);
        emailEdit = findViewById(R.id.edtEmail);
        telefoneEdit = findViewById(R.id.edtPhone);
        enviarBtn = findViewById(R.id.btnEnviar);


        enviarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CRIAR UM NOVO INTENT PARA INICIAR A ACTIVITY
                // "ListaActivity"

                Intent intencao = new Intent(MainActivity.this, ListaActivity.class);
                intencao.putExtra("nome", nomeEdit.getText().toString());
                intencao.putExtra("email", emailEdit.getText().toString());
                intencao.putExtra("telefone", telefoneEdit.getText().toString());

                // INICIALIZAR A "ListaActivity"
                startActivity(intencao);

                limparCampos();
            }

            private void limparCampos() {
                nomeEdit.setText("");
                emailEdit.setText("");
                telefoneEdit.setText("");
                nomeEdit.requestFocus();
            }
        });
    }
}