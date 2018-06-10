package com.app.matiasandco.beer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button letsGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    letsGo = findViewById(R.id.btn);

    letsGo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent next = new Intent(MainActivity.this,ScrollingActivity.class);
            startActivity(next);
        }
    });
    }
}
