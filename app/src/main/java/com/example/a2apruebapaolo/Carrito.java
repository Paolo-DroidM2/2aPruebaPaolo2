package com.example.a2apruebapaolo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carrito extends AppCompatActivity implements View.OnClickListener {

    Button Pago;
    Button Atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
          Pago =(Button)findViewById(R.id.btnPagar);
          Atras=(Button)findViewById(R.id.btnAtras);

        Atras.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent myintent = new Intent(this,MainActivity.class);
        startActivity(myintent);

    }
}