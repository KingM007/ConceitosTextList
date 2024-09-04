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

public class Tela2Activity extends AppCompatActivity {

    Button btnTela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btnTela1 = findViewById(R.id.btnTela1);
        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trocatela1 = new Intent(Tela2Activity.this, MainActivity.class);
                Tela2Activity.this.startActivity(trocatela1);
                
            }
        });
    }
}