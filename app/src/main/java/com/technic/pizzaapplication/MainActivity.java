package com.technic.pizzaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private int quantidade = 0;

    private EditText  edtPedido, edtQuanti;
  private
  Button  btnCalabresa, btnFrango, btnMarguerita, btnPortuguesa;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalabresa = findViewById(R.id.btnCalabresa);
        btnFrango = findViewById(R.id.btnFrango);
        btnMarguerita = findViewById(R.id.btnMarguerita);
        btnPortuguesa = findViewById(R.id.btnPortuguesa);
        edtPedido = findViewById(R.id.edtPedido);
        edtQuanti = findViewById(R.id.edtQuanti);


    }

        public void botaoCalabresa (View view) {
            quantidade = 1;
            quantidade  = Integer.parseInt(edtQuanti.getText().toString());
            edtPedido.setText(String.valueOf( quantidade + " Pizzas de Calabresa"));

        }

        public void botaoFrango (View v2) {
            quantidade = 1;
            quantidade  = Integer.parseInt(edtQuanti.getText().toString());
            edtPedido.setText(String.valueOf(quantidade + " Pizzas de Frango"));

        }

    public void botaoMarguerita (View v3) {
        quantidade = 1;
        quantidade  = Integer.parseInt(edtQuanti.getText().toString());
        edtPedido.setText(String.valueOf(quantidade + " Pizzas de Marguerita"));

    }

    public void botaoPortuguesa (View v4) {

        quantidade  = Integer.parseInt(edtQuanti.getText().toString());
        edtPedido.setText(String.valueOf(quantidade + " Pizzas de Portuguesa"));



    }
}