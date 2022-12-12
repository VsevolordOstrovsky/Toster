package com.example.toster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        Generator generator = new Generator();
        textView.setText(generator.gen());







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                textView.setText(generator.gen());

            }
        });
    }


}