package com.example.comousarcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chk1, chk2;
    RadioButton radio1, radio2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1 = findViewById(R.id.checkbox1);
        chk2 = findViewById(R.id.checkbox2);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);

    }

    public void onclick(View view) {

        if (view.getId() == R.id.btnValidar) {
            validar();
        }
    }

    private void validar() {
        String cad="Has seleccionado: \n";

        if (chk1.isChecked()==true){
            cad += "Opción 1 \n";
        }

        if (chk2.isChecked()){
            cad += "Opción 2 \n";
        }

        if (radio1.isChecked()){
            cad += "Opción 1";
        }

        if (radio2.isChecked()){
            cad += "Opción 2";
        }

        Toast.makeText(this, "" + cad, Toast.LENGTH_SHORT).show();
    }
}
