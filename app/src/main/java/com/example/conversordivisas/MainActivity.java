package com.example.conversordivisas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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

    }

    public void convertir(View view) {
        EditText editText = findViewById(R.id.editTextNumber);
        TextView resultadoDolarTextView = findViewById(R.id.textView3);
        TextView resultadoEuroTextView = findViewById(R.id.textView4);

        String pesosString = editText.getText().toString();

        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos / 3875;
        double euros = pesos / 4300;

        String resultadoDolar = String.format("USD: %.2f", dolares);
        String resultadoEuro = String.format("EUR: %.2f", euros);

        resultadoDolarTextView.setText(resultadoDolar);
        resultadoEuroTextView.setText(resultadoEuro);



    }
}