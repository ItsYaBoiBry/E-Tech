package com.etechnologycentre.com.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Food> {
    private Context mContext;
    private ArrayList<Food> foodList;

    public DetailsAdapter(Context context,int resource, ArrayList<Food> list) {
        super(context, resource , list);
        mContext = context;
        foodList = list;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Food getFood = foodList.get(position);
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.food_menu, null);
        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);
        TextView price = view.findViewById(R.id.price);
        ImageView image = view.findViewById(R.id.food_image);
        title.setText(getFood.getName());
        description.setText(getFood.getDescription());
        price.setText(getFood.getPrice());
        image.setImageResource(getFood.getUrl());
        ImageButton atc = view.findViewById(R.id.atc);
        atc.setOnClickListener(v-> Toast.makeText(mContext, "Item has been added", Toast.LENGTH_SHORT).show());

        return view;
    }
}
