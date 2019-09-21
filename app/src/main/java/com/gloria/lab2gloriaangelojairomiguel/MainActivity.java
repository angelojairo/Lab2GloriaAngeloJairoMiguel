package com.gloria.lab2gloriaangelojairomiguel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etC1,etC2,etC3,etC4,etC5,etC6,etC7,etC8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etC1 = findViewById(R.id.editText8);
        etC2 = findViewById(R.id.editText7);
        etC3 = findViewById(R.id.editText6);
        etC4 = findViewById(R.id.editText);
        etC5 = findViewById(R.id.editText5);
        etC6 = findViewById(R.id.editText4);
        etC7 = findViewById(R.id.editText3);
        etC8 = findViewById(R.id.editText2);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String c1 = etC1.getText().toString();
        String c2 = etC2.getText().toString();
        String c3 = etC3.getText().toString();
        String c4 = etC4.getText().toString();
        String c5 = etC5.getText().toString();
        String c6 = etC6.getText().toString();
        String c7 = etC7.getText().toString();
        String c8 = etC8.getText().toString();

        editor.putString("course 1",c1);
        editor.putString("course 2",c2);
        editor.putString("course 3",c3);
        editor.putString("course 4",c4);
        editor.putString("course 5",c5);
        editor.putString("course 6",c6);
        editor.putString("course 7",c7);
        editor.putString("course 8",c8);

        editor.commit();
        Toast.makeText(this,"Congratulations, your data is saved!!", Toast.LENGTH_LONG).show();
    }

    public void validation(View v){
        Intent i = new Intent(getApplicationContext(),Validate.class);
        startActivity(i);
    }
}
