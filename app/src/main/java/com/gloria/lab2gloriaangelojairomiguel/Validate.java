package com.gloria.lab2gloriaangelojairomiguel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Validate extends AppCompatActivity {

    EditText etC1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);
        etC1 = findViewById(R.id.editText9);
        setTitle("Validate");
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData",MODE_PRIVATE);
        String c1SP = sp.getString("course 1", null);
        String c2SP = sp.getString("course 2", null);
        String c3SP = sp.getString("course 3", null);
        String c4SP = sp.getString("course 4", null);
        String c5SP = sp.getString("course 5", null);
        String c6SP = sp.getString("course 6", null);
        String c7SP = sp.getString("course 7", null);
        String c8SP = sp.getString("course 8", null);

        String c1 = etC1.getText().toString();

        if(c1.equals(c1SP) || c1.equals(c2SP) || c1.equals(c3SP) || c1.equals(c4SP) || c1.equals(c5SP) || c1.equals(c6SP) || c1.equals(c7SP) || c1.equals(c8SP)){
            Toast.makeText(this,"Course Exists", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Invalid Course", Toast.LENGTH_LONG).show();
        }
    }

    public void main(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
