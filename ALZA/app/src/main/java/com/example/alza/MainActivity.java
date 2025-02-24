package com.example.alza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

     private CardView ActivityNote;
     private CardView ActivityAssistant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityNote= (CardView) findViewById(R.id.page1);
        ActivityAssistant=(CardView) findViewById(R.id.page3);

        // START Note:
        ActivityNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ServiceNote.class);
                startActivity(intent);
            }
        });

        // START ASSISTANT:
        ActivityAssistant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,ServiceAssistant.class);
                startActivity(intent);
            }
        });
    }
}