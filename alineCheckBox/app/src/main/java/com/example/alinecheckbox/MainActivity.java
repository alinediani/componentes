package com.example.alinecheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox_1;
    private CheckBox checkBox_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox_1 = (CheckBox) findViewById(R.id.checkBox_1);
        checkBox_2 = (CheckBox) findViewById(R.id.checkBox_2);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBox_1:
                if (checked) {
                    Toast toast = Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT);
                    toast.show();

                } else {
                    Toast toast = Toast.makeText(this, "Você selecionou a segunda opção", Toast.LENGTH_SHORT);
                    toast.show();
                }
        }
    }
}
