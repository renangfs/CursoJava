package com.example.objetojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Carro carro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    carro = new Carro( "Preto","4", "FORD");

        System.out.println(carro.getCor()+" - "+carro.getRodas()+" - "+carro.getMarca());


        carro.veiculoAndar();
        carro.veiculoFreiar();

    }
}