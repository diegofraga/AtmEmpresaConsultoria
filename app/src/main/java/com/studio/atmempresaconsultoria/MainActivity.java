package com.studio.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {


    private ImageView botao_empresa;
    private ImageView botao_servico;
    private ImageView botao_cliente;
    private ImageView botao_Contato;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Botao imagem Empresa/Servico
        botao_empresa = findViewById(R.id.empresa_id);
        botao_servico = findViewById(R.id.servico_id);
        botao_cliente = findViewById(R.id.clientes_id);
        botao_Contato = findViewById(R.id.contato_id);


        //click botao empresa
        botao_empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MainActivity.this,EmpresaActivity.class));


            }
        });

        //click botao Servico
        botao_servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ServicoActivity.class));

            }
        });

        //click botao Cliente
        botao_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ClienteActivity.class));

            }
        });

        botao_Contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ContatoActivity.class));


            }
        });


    }
}
