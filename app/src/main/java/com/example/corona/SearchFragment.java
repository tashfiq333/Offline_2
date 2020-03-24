package com.example.corona;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;

public class SearchFragment extends Fragment {

TextView txt1,txt2,txt3,text4;
String num[] = new String[3];
ProgressDialog progressDialog;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

               View v = inflater.inflate(R.layout.fragment_search,container,false);
        progressDialog = new ProgressDialog(getContext());

        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Fetching data from internet");


        txt1 = v.findViewById(R.id.txt);
        txt2 = v.findViewById(R.id.txt_deaths);
        txt3 = v.findViewById(R.id.txt_recovary);
        text4 = v.findViewById(R.id.txt_resource);

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri web = Uri.parse(text4.getText().toString());

                Intent intent=new Intent(Intent.ACTION_VIEW,web);

                startActivity(intent);

            }
        });
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
              new doit().execute();


        return v;
    }




    public class doit extends AsyncTask<Void,Void,Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            int i = 0;

            final String url ="https://www.worldometers.info/coronavirus/";

            try {

                final Document document = Jsoup.connect(url).get();
                Elements temp = document.getElementsByClass("maincounter-number");

                for(Element element:temp)
                {
                    num[i]= element.text();

                    i++;

                }


            }
            catch (Exception e)
            {
                progressDialog.dismiss();

                Toast.makeText(getContext(),"There was an ERROR",Toast.LENGTH_SHORT).show();

            }


            return null;

        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            txt1.setText(num[0]);
            txt2.setText(num[1]);
            txt3.setText(num[2]);

            progressDialog.dismiss();
        }
    }





}
