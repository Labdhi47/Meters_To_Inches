package com.example.meters_to_inches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        display = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double meter = Double.parseDouble(editText.getText().toString());

                double meters_to_inches = meter * 39.3701;

                display.setText(String.valueOf(meters_to_inches+"\tinch"));
            }
        });
    }
}