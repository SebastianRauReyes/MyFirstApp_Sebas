package com.rau.sebastian.myfirstapp_sebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textViewIP;
    private TextView textViewImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewIP = findViewById(R.id.editTextID);
        textViewImage = findViewById(R.id.textViewImage);

    }

    public void buscar(View view){
        textViewImage.setText(textViewIP.getText().toString());
    }



}
