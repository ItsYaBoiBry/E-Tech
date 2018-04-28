package com.etechnologycentre.com.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class home extends Fragment {
    LinearLayout pizza, chinese, malay;


    public home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        pizza = view.findViewById(R.id.pizza);
        chinese = view.findViewById(R.id.asian);
        malay = view.findViewById(R.id.malay);

        pizza.setOnClickListener(v -> getActivity().startActivity(new Intent(getContext(),detailsActivity.class)
                .putExtra("type", "pizza")
                .putExtra("image", R.drawable.pizza)
                .putExtra("name", "The Pizza Place")
                .putExtra("description", "Everyone's Comfort Food")));

        chinese.setOnClickListener(v -> getActivity().startActivity(new Intent(getContext(),detailsActivity.class)
                .putExtra("type", "chinese")
                .putExtra("image",R.drawable.asian)
                .putExtra("name", "Asian Fusion")
                .putExtra("description","Get a taste of Asian Cuisines")));

        malay.setOnClickListener(v -> getActivity().startActivity(new Intent(getContext(),detailsActivity.class)
                .putExtra("type", "malay")
                .putExtra("image",R.drawable.malay)
                .putExtra("name", "RK Eating House")
                .putExtra("description","Tradition at it's best")));

        return view;
    }

}
