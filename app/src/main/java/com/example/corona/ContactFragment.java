package com.example.corona;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class ContactFragment extends Fragment {

TextView num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12;
ImageButton call1,call2,call3,call4,call5,call6,call7,call8,call9,call10,call11,call12;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

                View v = inflater.inflate(R.layout.fragment_contact,container,false);


       num1 = v.findViewById(R.id.number1);
       call1 = v.findViewById(R.id.call1);

        num2 = v.findViewById(R.id.number2);
        call2 = v.findViewById(R.id.call2);

        num3 = v.findViewById(R.id.number3);
        call3 = v.findViewById(R.id.call3);

        num4 = v.findViewById(R.id.number4);
        call4 = v.findViewById(R.id.call4);

        num5 = v.findViewById(R.id.number5);
        call5 = v.findViewById(R.id.call5);

        num6 = v.findViewById(R.id.number6);
        call6 = v.findViewById(R.id.call6);

        num7 = v.findViewById(R.id.number7);
        call7 = v.findViewById(R.id.call7);

        num8 = v.findViewById(R.id.number8);
        call8 = v.findViewById(R.id.call8);

        num9 = v.findViewById(R.id.number9);
        call9 = v.findViewById(R.id.call9);

        num10 = v.findViewById(R.id.number10);
        call10 = v.findViewById(R.id.call10);

        num11 = v.findViewById(R.id.number11);
        call11 = v.findViewById(R.id.call11);

        num12 = v.findViewById(R.id.number12);
        call12 = v.findViewById(R.id.call12);


       call1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String number = "tel:"+num1.getText().toString();

               Uri phonenumber = Uri.parse(number);

               Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
               startActivity(intent);

           }
       });


        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num2.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num3.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num4.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num5.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num6.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num7.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num8.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num9.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num10.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num11.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });



        call12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "tel:"+num12.getText().toString();

                Uri phonenumber = Uri.parse(number);

                Intent intent = new Intent(Intent.ACTION_DIAL,phonenumber);
                startActivity(intent);

            }
        });









        return v;

    }
}
