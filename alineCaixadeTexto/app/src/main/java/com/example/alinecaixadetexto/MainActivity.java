package com.example.alinecaixadetexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);

    }

    public void onClick (View view) {
        String txt = editText.getText().toString();
        Toast toast = Toast.makeText(this,"Você escreveu:" + txt,Toast.LENGTH_SHORT);
        toast.show();
    }
}
