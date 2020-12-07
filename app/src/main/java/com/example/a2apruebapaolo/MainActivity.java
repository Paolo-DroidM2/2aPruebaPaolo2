package com.example.a2apruebapaolo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Carrito;
    Button Compra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carrito =(Button) findViewById(R.id.btnCarrito);
        Compra  =(Button) findViewById(R.id.btnComprar);

        Intent myTntent = new Intent(this,CarroDeCompra.class );


        Carrito.setOnClickListener( this);
        Compra.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {





        switch (v.getId()){
            case R.id.btnCarrito:
                Toast.makeText(this,"Agregado con exito",Toast.LENGTH_LONG).show();

        }

    }
}