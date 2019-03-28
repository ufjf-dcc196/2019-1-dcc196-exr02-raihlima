package com.example.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double resultado=0;
    EditText valor1;
    EditText valor2;
    Button mult;
    Button div;
    Button som;
    Button sub;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText) findViewById(R.id.valor_1);
        valor2 = (EditText) findViewById(R.id.valor_2);
        mult = (Button) findViewById(R.id.botao_multiplicacao);
        div = (Button) findViewById(R.id.botao_divicao);
        som = (Button) findViewById(R.id.botao_soma);
        sub = (Button) findViewById(R.id.botao_subtracao);
        res = (TextView) findViewById(R.id.resultado);

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (double) (Double.parseDouble(String.valueOf(valor1.getText()))*Double.parseDouble(String.valueOf(valor2.getText())));
                res.setText( Double.toString(resultado));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (double) (Double.parseDouble(String.valueOf(valor1.getText()))/Double.parseDouble(String.valueOf(valor2.getText())));
                res.setText( Double.toString(resultado));
            }
        });

        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (double) (Double.parseDouble(String.valueOf(valor1.getText()))+Double.parseDouble(String.valueOf(valor2.getText())));
                res.setText( Double.toString(resultado));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (double) (Double.parseDouble(String.valueOf(valor1.getText()))-Double.parseDouble(String.valueOf(valor2.getText())));
                res.setText( Double.toString(resultado));
            }
        });
    }
}
