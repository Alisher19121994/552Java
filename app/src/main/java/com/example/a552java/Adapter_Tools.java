package com.example.a552java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Tools extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Tools> list;

    public Adapter_Tools(Context context, ArrayList<Tools> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tools_view, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Tools tools = list.get(position);
        if (holder instanceof Second_Adapter.MyView) {
            ((MyView) holder).imageView.setImageResource(tools.image);
            ((MyView) holder).textView.setText(tools.title);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MyView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.shape_image_id);
            textView = itemView.findViewById(R.id.tools_text_id);

        }
    }
}
