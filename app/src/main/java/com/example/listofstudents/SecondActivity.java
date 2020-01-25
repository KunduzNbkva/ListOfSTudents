package com.example.listofstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        textView2=findViewById(R.id.textView2);

        Intent i=getIntent();
        Person person=(Person) i.getSerializableExtra("key");
        textView2.setText(person.toString());

    }
}
