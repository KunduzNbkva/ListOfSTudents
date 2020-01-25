package com.example.listofstudents;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements OnVHListener {
    ArrayList<Person> people = new ArrayList<>();
    MainActivity activity;
    public void update(ArrayList<Person> people){
        this.people =people;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.viewholder_main,parent,false);
        MainViewHolder vh=new MainViewHolder(v);

        vh.onVHListener=this;
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(people.get(position));

    }

    @Override
    public int getItemCount() {
        return people.size();
    }
    @Override
    public void onClick(int position) {
        Intent intent =new Intent(activity, SecondActivity.class);
        intent.putExtra("key", people.get(position));
        activity.startActivity(intent);
    }
}
