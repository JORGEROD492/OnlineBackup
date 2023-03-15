package com.onlinebackup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    EditText Nombre, Apellido, Correo;
    Button Registro;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        getSupportActionBar().hide();

        Nombre = (EditText) findViewById(R.id.Nombre);
        Apellido = (EditText) findViewById(R.id.Apellido);
        Correo = (EditText) findViewById(R.id.Correo);
        Registro = (Button) findViewById(R.id.Registro);

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nombre1 = Nombre.getText().toString();
                String Apellido1 = Apellido.getText().toString();
                String Correo1 = Correo.getText().toString();


            Intent i = new Intent(RegistroActivity.this, ConfirmacionActivity.class);

            i.putExtra("Nombre1", Nombre1);
            i.putExtra("Apellido1", Apellido1);
            i.putExtra("Correo1", Correo1);

            startActivity(i);

            }
        });

    }
}