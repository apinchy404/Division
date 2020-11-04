package com.example.divisionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imgDiv;
        TextView txtName, txtLyrics;


        imgDiv = findViewById(R.id.img_div);
        txtName = findViewById(R.id.txt_divname);
        txtLyrics = findViewById(R.id.txt_des);

        String getDivision = getIntent().getExtras().getString("Division");

        if (getDivision.equals("Barisal")) {
            imgDiv.setImageResource(R.drawable.barishal);
            txtName.setText("Barisal Division");
            txtLyrics.setText(R.string.Div1);
        } else if (getDivision.equals("Chittagong")) {
            imgDiv.setImageResource(R.drawable.ctg);
            txtName.setText("Chittagong Division");
            txtLyrics.setText(R.string.Div2);
        } else if (getDivision.equals("Dhaka")) {
            imgDiv.setImageResource(R.drawable.dhk);
            txtName.setText("Dhaka Division");
            txtLyrics.setText(R.string.Div3);

         } else if (getDivision.equals("Khulna")) {
            imgDiv.setImageResource(R.drawable.khul);
             txtName.setText("Dhaka Division");
             txtLyrics.setText(R.string.Div4);

       } else if (getDivision.equals("Mymensingh")) {
           imgDiv.setImageResource(R.drawable.mymen);
           txtName.setText("Mymensingh Division");
            txtLyrics.setText(R.string.Div5);

        } else if (getDivision.equals("Rajshahi")) {
        imgDiv.setImageResource(R.drawable.raj);
        txtName.setText("Rajshahi Division");
        txtLyrics.setText(R.string.Div6);

        } else if (getDivision.equals("Rangpur")) {
        imgDiv.setImageResource(R.drawable.rang);
        txtName.setText("Rangpur Division");
        txtLyrics.setText(R.string.Div7);

        } else if (getDivision.equals("Sylhet")) {
        imgDiv.setImageResource(R.drawable.sylhet);
        txtName.setText("Sylhet Division");
        txtLyrics.setText(R.string.Div8);
        }
    }
}