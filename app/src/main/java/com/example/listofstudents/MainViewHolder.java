package com.example.listofstudents;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    OnVHListener onVHListener;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.vhTextview);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onVHListener.onClick(getAdapterPosition());

            }
        });
    }
    public void onBind(Person person) {
        textView.setText(person.getName());
    }
}
