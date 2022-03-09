package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView image;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        image = findViewById(R.id.imageResultado);
        voltar = findViewById(R.id.buttonVoltar);

        Bundle bundle = getIntent().getExtras();
        int numero = bundle.getInt("valor");

        if (numero==1){
            image.setImageResource(R.drawable.moeda_cara);
        } else {
            image.setImageResource(R.drawable.moeda_coroa);
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), numero, Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}