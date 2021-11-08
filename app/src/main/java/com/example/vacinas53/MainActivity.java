package com.example.vacinas53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
       private ArrayAdapter<String> adapter;
      private int adapterLayout= android.R.layout.simple_list_item_1;

       private Button botao;
      private EditText edNome;
       private ListView lvListagem;
      private  List <String> listaCriancas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         botao=findViewById(R.id.btAddCrianca);
          edNome=findViewById(R.id.edNomeCriacaListagem);
             lvListagem=findViewById(R.id.alListagem);
            listaCriancas=new ArrayList<String>();
             adapter=new ArrayAdapter<String>(this,adapterLayout,listaCriancas);
             lvListagem.setAdapter(adapter);
          botao.setOnClickListener(new View.OnClickListener() {


              @Override
              public void onClick(View view) {
               listaCriancas.add(edNome.getText().toString());
                edNome.setText("");
                 adapter.notifyDataSetChanged();
              }
          }) ;







    }




}