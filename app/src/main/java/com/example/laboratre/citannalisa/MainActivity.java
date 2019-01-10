package com.example.laboratre.citannalisa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    private String[] Citazioni = new String[10];

    public  MainActivity(){
        Citazioni[0] = "Il lupo perde il vizio, ma non il pelo";
        Citazioni[1] = "Attack' u ciucc addò v'en";
        Citazioni[2] = "Con il boccone non si mangia";
        Citazioni[3] = "Non tutti siamo nati con le mutande";
        Citazioni[4] = "Chi mangia da sè, fa per tre... ed è più felice!";
        Citazioni[5] = "Prima si fa, più felici si è (Rif. albero di Natale)";
        Citazioni[6] = "La verità va avanti, le bugie vanno dietro";
        Citazioni[7] = "Attento a quello che dici, potrebbe ritornare verso di te (a piedi o in bici)";
        Citazioni[8] = "Mettere il coltello nella piaga";
        Citazioni[9] = "Alessandro e Freddy Mercury...due gocce d'acqua";
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
                int random = (int)(Math.random() * Citazioni.length);
                t1.setText(Citazioni[random]);
            }
        });
    }
}
