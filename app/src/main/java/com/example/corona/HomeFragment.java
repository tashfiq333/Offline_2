package com.example.corona;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    ImageView image1,image2,image3,image4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                View v =inflater.inflate(R.layout.fragment_home,container,false);


        image1 =  v.findViewById(R.id.img_1);
        image2 =  v.findViewById(R.id.img_2);
        image3 =  v.findViewById(R.id.img_3);
        image4 =  v.findViewById(R.id.img_4);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);

            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image2.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.VISIBLE);

            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image4.setVisibility(View.VISIBLE);

            }
        });


        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image4.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.INVISIBLE);
                image3.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.VISIBLE);

            }
        });

        return v;



    }
}
