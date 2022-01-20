
package com.frases.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionScene;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static void desativarBotoes(Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6,Button btn7,Button btn8,Button btn9){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    static void verificarGanhador(int m1, int m2, int m7, int m4, int m5, int m6, int m3, int m8, int m9,TextView t,String jogadorXO,Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6,Button btn7,Button btn8,Button btn9){
        if(m1 == m2 && m1 == m3 && m1 != 0){
            System.out.println("Vitoria primeira linha...............................");
            btn1.setBackgroundResource(R.color.black);
            btn2.setBackgroundResource(R.color.black);
            btn3.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
       }
        else if(m4 == m5 && m4 == m6 && m4 != 0){
            System.out.println("Vitoria segunda linha................................");
            btn4.setBackgroundResource(R.color.black);
            btn5.setBackgroundResource(R.color.black);
            btn6.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
        else if(m7 == m8 && m7 == m9 && m7 != 0){
            System.out.println("Vitoria terceira linha...............................");
            btn7.setBackgroundResource(R.color.black);
            btn8.setBackgroundResource(R.color.black);
            btn9.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
        else if(m1 == m4 && m1 == m7 && m1 != 0){
            System.out.println("Vitoria primeira coluna..............................");
            btn1.setBackgroundResource(R.color.black);
            btn4.setBackgroundResource(R.color.black);
            btn7.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
        else if(m2 == m5 && m2 == m8 && m2 != 0){
            System.out.println("Vitoria segunda coluna...............................");
            btn2.setBackgroundResource(R.color.black);
            btn5.setBackgroundResource(R.color.black);
            btn8.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
        else if(m3 == m6 && m3 == m9 && m3 != 0){
            System.out.println("Vitoria terceira coluna..............................");
            btn3.setBackgroundResource(R.color.black);
            btn6.setBackgroundResource(R.color.black);
            btn9.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
        else if(m1 == m5 && m1 == m9 && m1 != 0){
            System.out.println("Vitoria diagonal principal...........................");
            btn1.setBackgroundResource(R.color.black);
            btn5.setBackgroundResource(R.color.black);
            btn9.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
        else if(m3 == m5 && m3 == m7 && m3 != 0){
            System.out.println("Vitoria diagonal invertida............................");
            btn3.setBackgroundResource(R.color.black);
            btn5.setBackgroundResource(R.color.black);
            btn7.setBackgroundResource(R.color.black);
            t.setText("O jogador "+jogadorXO+" é o Ganhador");
            desativarBotoes(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        }
    }
    public TextView texto;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public int qtd = 0;
    public int xo = 1;
    public int matriz[][] = {{0,0,0},
                             {0,0,0},
                             {0,0,0}};
    public String symbol = "O";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();//Esconder action bar (barra superior)

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        texto = findViewById(R.id.txt);

        System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
        System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
        System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);

        //FILA 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[0][0] == 0)    {
                        texto.setText("Vez do jogador "+symbol);
                        if (xo == 1){//verifica symbol
                            symbol = "X";
                        }
                        else{
                            symbol = "O";
                        }
                        qtd = qtd +1;
                        btn1.setText(symbol);
                        matriz[0][0] = xo;
                        System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                        System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                        System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                        if (xo == 1){//inverte o xo
                            xo = 2;
                        }
                        else{
                                xo = 1;
                        }
                        System.out.println("XO = "+xo);
                        System.out.println(qtd);

                        if(qtd > 4){
                            System.out.println("Aciona a verificação de vitoria");
                            verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                        }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[0][1] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn2.setText(symbol);
                    matriz[0][1] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[0][2] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn3.setText(symbol);
                    matriz[0][2] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        //FILA 2
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[1][0] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn4.setText(symbol);
                    matriz[1][0] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[1][1] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn5.setText(symbol);
                    matriz[1][1] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[1][2] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn6.setText(symbol);
                    matriz[1][2] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        //FILA 3
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[2][0] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn7.setText(symbol);
                    matriz[2][0] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[2][1] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn8.setText(symbol);
                    matriz[2][1] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matriz[2][2] == 0)    {
                    texto.setText("Vez do jogador "+symbol);
                    if (xo == 1){//verifica symbol
                        symbol = "X";
                    }
                    else{
                        symbol = "O";
                    }
                    qtd = qtd +1;
                    btn9.setText(symbol);
                    matriz[2][2] = xo;
                    System.out.println("Mostra Matriz 0 :  "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]);
                    System.out.println("Mostra Matriz 1 :  "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]);
                    System.out.println("Mostra Matriz 2 :  "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]);
                    if (xo == 1){//inverte o xo
                        xo = 2;
                    }
                    else{
                        xo = 1;
                    }
                    System.out.println("XO = "+xo);
                    System.out.println(qtd);
                    if(qtd > 4){
                        System.out.println("Aciona a verificação de vitoria");
                        verificarGanhador(matriz[0][0],matriz[0][1], matriz[2][0], matriz[1][0], matriz[1][1], matriz[1][2], matriz[0][2], matriz[2][1],matriz[2][2],texto,symbol,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
                    }
                }
            }
        });

    }
}

