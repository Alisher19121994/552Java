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

public class Main_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Products> list;

    public Main_Adapter(Context context, ArrayList<Products> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal_homew, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Products products = list.get(position);
        if (holder instanceof MyView) {
            ((MyView) holder).imageView.setImageResource(products.productImage);
            ((MyView) holder).title.setText(products.title);
            ((MyView) holder).price.setText(products.price);
            ((MyView) holder).discount.setText(products.discount);

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView price;
        TextView discount;

        public MyView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.watch_id);
            title = itemView.findViewById(R.id.Watch_text_id);
            price = itemView.findViewById(R.id.watch_price_id);
            discount = itemView.findViewById(R.id.watch_discount_id);

        }
    }
}
