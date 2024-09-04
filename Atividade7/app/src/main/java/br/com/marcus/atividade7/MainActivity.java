
package br.com.marcus.atividade7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    Button enviar;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.Etnome);
        enviar = findViewById(R.id.btnEnviar);
        name = findViewById(R.id.tvname);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String nom = String.valueOf(nome.getText());
            name.setText("Bem-Vindo "+nom);
                Toast.makeText(getApplicationContext(),"Bem-vindo", Toast.LENGTH_LONG).show();
            }
        });
    }
}