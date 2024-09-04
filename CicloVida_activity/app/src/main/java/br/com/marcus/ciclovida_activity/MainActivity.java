package br.com.marcus.ciclovida_activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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

        Log.d("oncreate", "FASE - CRIADA(CREATE)");
        Toast.makeText(getApplicationContext(),"FASE - CRIADA(CREATE)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart (){
        super.onStart();
        Log.d("onStart","FASE - INICIADA(START)");
        Toast.makeText(getApplicationContext(),"FASE - INICIADA(START)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"FASE - RESTARTAR(RESTART)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"FASE - EM FOCO(RESUME)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"FASE - PAUSADO(PAUSE)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"FASE - PARADO(STOP)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"FASE - ACTIVITY DESTRUIDA(DESTROY)", Toast.LENGTH_LONG).show();
    }
}