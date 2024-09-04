package br.com.marcus.conceitosintent2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button abrirMapa = findViewById(R.id.btn_abrir_mapa);
        Button abrirWeb = findViewById(R.id.btn_abrir_web);

        abrirMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //coordenada casa
                Uri uriIntencao = Uri.parse("geo:-16.05055, -57.67229");

                // CRIAR UMA INTENT IMPLICITA PARA ABRIR O APLICATIVO DE MAPA
                Intent minhaIntencao = new Intent(Intent.ACTION_VIEW,uriIntencao);

                // DEFINIR O NOME DO PACOTE PARA GARANTIR
                // QUE O GOOGLE MAPS (APP) SERÁ USADO
                minhaIntencao.setPackage("com.google.android.apps.maps");
                startActivity(minhaIntencao);
            }
        });
        abrirWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlSite = "http://Unemat.br/";
                Intent minhaItent = new Intent(Intent.ACTION_VIEW);
                minhaItent.setData(Uri.parse(urlSite));
                startActivity(minhaItent);
            }
        });
    }
}