package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editTextTextPersonName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//             //   Toast.makeText(MainActivity.this, "Thank you for using the app", Toast.LENGTH_SHORT).show();
//                String s=editTextTextPersonName2.getText().toString();
//               double kg = Integer.parseInt(s);
//               double pound = kg * 2.205;
//               textView2.setText(" The value of pound is " + pound);
//            }
//        });

    }
    public void calculate(View view)
    {
        String s=editTextTextPersonName2.getText().toString();
               double kg = Integer.parseInt(s);
          double pound = kg * 2.205;
               textView2.setText(" The value of pound is " + pound);

    }


}