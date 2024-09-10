package br.com.marcus.designeranimacao;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    // CRIAR A INSTÂNCIA HANDLER --> PERMITE A EXECUÇÃO COM DELAY
    Handler handler = new Handler();

    // CARIAR A INSTÂNCIA RUNNABLE -->  PERMITE A EXECUÇÃO APOS O DELAY
    Runnable runnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // DEFINIR O RUNNALE COM A TAREFA QUE SERÁ EXECUTADA
        // APÓS O TIME (DELAY)

        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intencao = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intencao);
                finish();
            }
        };
        // DEFINIR O TEMPO DE EXECUÇÃO

        handler.postDelayed(runnable, 3000);
    }
}