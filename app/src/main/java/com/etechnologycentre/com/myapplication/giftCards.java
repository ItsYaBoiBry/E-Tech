package com.etechnologycentre.com.myapplication;


import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class giftCards extends Fragment {


    public giftCards() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gift_cards, container, false);
        LinearLayout gift_cards = view.findViewById(R.id.gift_card_list);
        gift_cards.addView(initView(R.drawable.gift_card_1, "Bistecca Tuscan Steakhouse", "$85.40"));
        gift_cards.addView(initView(R.drawable.gift_card_2, "CURE restaurant", "$43.75"));
        gift_cards.addView(initView(R.drawable.gift_card_3, "The Market Grill", "$104.00"));
        gift_cards.addView(initView(R.drawable.gift_card_4, "Coriander Leaf Restaurant", "$100.00"));

        return view;
    }
    private View initView(int image, String name, String balance){
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        View view = inflater.inflate(R.layout.gift_card_item, null);
        TextView gift_card_balance = view.findViewById(R.id.gift_card_balance);
        TextView gift_card_title = view.findViewById(R.id.gift_card_title);
        ImageView gift_card_image = view.findViewById(R.id.gift_card_image);
        hideCard(gift_card_image, gift_card_balance);

        gift_card_image.setImageResource(image);
        gift_card_title.setText(name);
        gift_card_balance.setText("Balance: "+balance);

        gift_card_title.setOnClickListener(v->{
            if(gift_card_image.getVisibility() == View.GONE){
                showCard(gift_card_image, gift_card_balance);

            }else{
                hideCard(gift_card_image, gift_card_balance);
            }
        });
        return view;
    }
    private void showCard(ImageView iv, TextView tv){
        iv.setVisibility(View.VISIBLE);
        tv.setVisibility(View.VISIBLE);
    }
    private void hideCard(ImageView iv, TextView tv){
        iv.setVisibility(View.GONE);
        tv.setVisibility(View.GONE);
    }

}
