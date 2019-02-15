package com.example.laboratre.citannalisa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.laboratre.citannalisa.models.Citazione;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    private ArrayList<Citazione> Citazioni = new ArrayList<Citazione>();

    public  MainActivity(){
        Citazioni.add(new Citazione("Il lupo perde il vizio, ma non il pelo","lupo.png"));
        Citazioni.add(new Citazione("Attack' u ciucc addò v'en","lupo.png"));
        Citazioni.add(new Citazione("Con il boccone non si mangia","lupo.png"));
        Citazioni.add(new Citazione("Non tutti siamo nati con le mutande","lupo.png"));
        Citazioni.add(new Citazione("Chi mangia da sè, fa per tre... ed è più felice!","lupo.png"));
        Citazioni.add(new Citazione("La verità va avanti, le bugie vanno dietro","lupo.png"));
        Citazioni.add(new Citazione("Prima si fa, più felici si è (Rif. albero di Natale)","lupo.png"));
        Citazioni.add(new Citazione("Attento a quello che dici, potrebbe ritornare verso di te (a piedi o in bici)","lupo.png"));
        Citazioni.add(new Citazione("Mettere il coltello nella piaga","lupo.png"));
        Citazioni.add(new Citazione("Alessandro e Freddy Mercury...due gocce d'acqua","lupo.png"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        t1 = (TextView) findViewById(R.id.textView);
        buttonClick();

    }

    private void buttonClick(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int)(Math.random() * Citazioni.size());
                t1.setText(Citazioni.get(random).GetFrase());
            }
        });
    }
}
