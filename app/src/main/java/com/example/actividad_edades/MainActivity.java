package com.example.actividad_edades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ////Diseño de los objetos de java equivalentes a los objetos de xml
    EditText jetedad1, jetedad2, jetedad3;
    TextView jtvpromedio;
    Button jbtcalcular, jbtlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        //Asociando objetos Java con los objetos xml
        jetedad1 = findViewById(R.id.etedad1);
        jetedad2 = findViewById(R.id.etedad2);
        jetedad3 = findViewById(R.id.etedad3);
        jtvpromedio = findViewById(R.id.tvpromedio);
        jbtcalcular = findViewById(R.id.btcalcular);
        jbtlimpiar = findViewById(R.id.btlimpiar);
    }

    public void calcular(View view) {
        String edad1, edad2, edad3;
        edad1 = jetedad1.getText().toString();
        edad2 = jetedad2.getText().toString();
        edad3 = jetedad3.getText().toString();

        if (edad1.isEmpty() || edad2.isEmpty() || edad3.isEmpty()) {
            Toast.makeText(this, "Las tres edades son requeridas", Toast.LENGTH_SHORT).show();
            jetedad1.requestFocus();

        } else {
            float ed1, ed2, ed3, promedio;
            ed1 = Float.parseFloat(edad1);
            ed2 = Float.parseFloat(edad2);
            ed3 = Float.parseFloat(edad3);
            promedio = (ed1 + ed2 + ed3) / 3;

            jtvpromedio.setText(String.valueOf(promedio));
        }
    }

    public void limpiar(View view) {
        jetedad1.setText("");
        jetedad2.setText("");
        jetedad3.setText("");
        jtvpromedio.setText("");
        jetedad1.requestFocus();
    }
}