package br.com.marcus.atividade16;

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

    private EditText nomeEdit, idadeEdit, alturaEdit;
    private Button enviarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEdit = findViewById(R.id.etnome);
        idadeEdit = findViewById(R.id.etidade);
        alturaEdit = findViewById(R.id.etaltura);
        enviarBtn = findViewById(R.id.btnentrar);

        enviarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CRIAR UM NOVO INTENT PARA INICIAR A ACTIVITY
                // "ListaActivity"

                Intent intencao = new Intent(MainActivity.this, DadosActivity.class);
                intencao.putExtra("nome", nomeEdit.getText().toString());
                intencao.putExtra("idade", idadeEdit.getText().toString());
                intencao.putExtra("altura", alturaEdit.getText().toString());

                // INICIALIZAR A "ListaActivity"
                startActivity(intencao);

                limparCampos();
            }

            private void limparCampos() {
                nomeEdit.setText("");
                idadeEdit.setText("");
                alturaEdit.setText("");
                nomeEdit.requestFocus();
            }
        });
    }
}