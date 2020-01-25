package com.example.listofstudents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private Person person1 = new Person("Kanyshai" ,25,157,56.,"teacher");
    private Person person2 = new Person("Zhibek" ,16,170,52,"student");
    private Person person3 = new Person("Azamat" ,12,120,40.,"pupil");
    private Person person4 = new Person("Aibek" ,34,190,67,"driver");
    private Person person5 = new Person("Erlan" ,56,176,98,"cashier");
    private RecyclerView recyclerView ;
    private MainAdapter adapter;
    private ArrayList<Person> personArrayList = new ArrayList<>();
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        editText=findViewById(R.id.addStudent);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new MainAdapter();
        recyclerView.setAdapter(adapter);

        adapter.activity=this;
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        adapter.update(personArrayList);

    }


}
