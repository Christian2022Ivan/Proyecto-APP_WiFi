package com.example.sumadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Paso 1: Declaro los objetos locales que despúes voy a enlazar con mi vista
    EditText etNum1, etNum2;
    TextView mens;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Paso 2: Enlazo los objetos locales con los de la vista mediante el archivo R
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        mens = (TextView) findViewById(R.id.textView);


    }
    public void calcularsuma(View v) {

        // Si los campos estan vacios

        if (etNum1.getText().toString().isEmpty()||etNum2.getText().toString().isEmpty())

        {
          mens.setText("Uno de los campos esta vació, por favor llenar ambos campos");
        }
        // de lo contrario, si los campos estan llenados proceder con la operación
        else
        {
        double res = Double.parseDouble(etNum1.getText().toString()) + Double.parseDouble(etNum2.getText().toString());
        Toast.makeText(getApplicationContext(), "El resultado es: "+ res, Toast.LENGTH_LONG).show();
        }

    }
}