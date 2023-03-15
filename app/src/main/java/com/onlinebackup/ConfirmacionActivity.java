package com.onlinebackup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmacionActivity extends AppCompatActivity {

    TextView Nombre2, Apellido2, Correo2;
    Button Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        getSupportActionBar().hide();

        Nombre2 = (TextView) findViewById(R.id.Nombre2);
        Apellido2 = (TextView) findViewById(R.id.Apellido2);
        Correo2 = (TextView) findViewById(R.id.Correo2);
        Salir = (Button) findViewById(R.id.Salir);



        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(ConfirmacionActivity.this, MainActivity.class);
                startActivity(Intent);
            }
        });
        mostrarDatos();

    }
    private void mostrarDatos(){


        Bundle datos = this.getIntent().getExtras();
        String Nombre = datos.getString("Nombre1");
        String Apellido = datos.getString("Apellido1");
        String Correo = datos.getString("Correo1");


        Nombre2.setText(Nombre);
        Apellido2.setText(Apellido);
        Correo2.setText(Correo);

    }}
