package com.example.appholamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText cursoEditText;

    private EditText seccionEditText;

    private EditText horarioEditText;

    private ImageView firmaImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cursoEditText = findViewById(R.id.cursoEditText);
        seccionEditText = findViewById(R.id.seccionEditText);
        horarioEditText= findViewById(R.id.horarioEditText);
        // ... inicializar los otros EditText ...

        firmaImageView = findViewById(R.id.firmaImageView);

        Button mostrarButton = findViewById(R.id.mostrarButton);
        mostrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //obtener los datos de los otros EditText
                String curso = cursoEditText.getText().toString();
                String seccion = seccionEditText.getText().toString();
                String horario= horarioEditText.getText().toString();

                //concatenar
                String cadena = "El curso es:" + curso + "\nla sección es: " + seccion + "\ny el horario es de: "+ horario;

                // Mostrar los datos en un Toast
                Toast.makeText(MainActivity.this, cadena, Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Seccion: " + seccion, Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Horario: " + horario, Toast.LENGTH_SHORT).show();

            }
        });



    }
}