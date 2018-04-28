package com.etechnologycentre.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class detailsActivity extends AppCompatActivity {
    ListView lv;
    Toolbar toolbar;
    ArrayAdapter<Food> aa;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailslayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(v -> finish());

        lv = findViewById(R.id.lv);
        title = findViewById(R.id.title);
        ImageView imageView = findViewById(R.id.image);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        String food_title = intent.getStringExtra("name");
        title.setText(food_title);
        int food_image = intent.getIntExtra("image", R.drawable.background);
        imageView.setImageResource(food_image);
        ArrayList<Food> menu = getFoodMenu(type);
        aa = new DetailsAdapter(this, 0, menu);

        lv.setAdapter(aa);

    }
    private ArrayList<Food> getFoodMenu(String type){
        ArrayList<Food> food = new ArrayList<Food>();
        if(type.equals("pizza")){
            food.add(new Food("Hawaiian Pizza",
                    "Pizza Sauce, Ham, Pineapple & Mozzarella",
                    "$15.00",
                    R.drawable.pizza_hawaiian));
            food.add(new Food("Cheese Supreme Pizza",
                    "Pizza Sauce, Loaded With Cheese.",
                    "$12.00",
                    R.drawable.pizza_cheese_supreme));
            food.add(new Food("Pepperoni & Cheese Pizza",
                    "Pizza Sauce loaded with Pepperoni and Mozzarella.",
                    "$17.00",
                    R.drawable.pizza_pepperoni_cheese));
        }
        if(type.equals("chinese")){
            food.add(new Food("Chicken Stir Fry",
                    "Simple Traditional chinese stir fry with diced chicken meat",
                    "$5.00",
                    R.drawable.chinese_chicken_stir_fry));
            food.add(new Food("Beef Stir Fry",
                    "Simple Traditional chinese stir fry with sliced beef",
                    "$52.00",
                    R.drawable.chinese_beef_stir_fry));
            food.add(new Food("Fried Rice",
                    "A simple but delicious delicacy for all to enjoy",
                    "$4.00",
                    R.drawable.chinese_fried_rice));
        }if(type.equals("malay")){
            food.add(new Food("Nasi Lemak",
                    "Everyone's favourite food",
                    "$15.00",
                    R.drawable.malay_nasi_lemak));
            food.add(new Food("Satay",
                    "The best supper food, ccompanied with a piping hot peanut sauce.",
                    "$12.00",
                    R.drawable.malay_satay));
            food.add(new Food("Laksa",
                    "A heritage dish which has been around for a long time, with good reason.",
                    "$17.00",
                    R.drawable.malay_laksa));
        }

        return food;
    }
    private String shopDetails(String type){

        return null;
    }
}
