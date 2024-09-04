package br.com.marcus.conceitosandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.NumberPicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    Button enter;
    TextView tview;
    private NumberPicker numberPicker1;
    private NumberPicker numberPicker2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.editNome);
        enter = findViewById(R.id.btEnter);
        tview = findViewById(R.id.tvNome);
        numberPicker1 = findViewById(R.id.Num1);
        numberPicker2 = findViewById(R.id.Num2);

        numberPicker1.setMinValue(0);
        numberPicker1.setMaxValue(100);

        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(100);

        enter.setOnClickListener(v -> {
            // Obtendo os valores dos NumberPickers
            int num1 = numberPicker1.getValue();
            int num2 = numberPicker2.getValue();

            // Realizando a soma
            int resultado = num1 + num2;

            // Exibindo o resultado no TextView
            tview.setText("Resultado: " + resultado);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}