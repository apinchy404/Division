package com.example.divisionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Div extends AppCompatActivity {


    Button btnBarisal,btnCtg,btnDhk,btnKhulna,btnMymen,btnRaj,btnRangpur,btnSylhet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);

        Button btnBarisal=findViewById(R.id.btn_barisal);
        Button btnCtg=findViewById(R.id.btn_chittagong);
        Button btnDhk=findViewById(R.id.btn_dhaka);
        Button btnKhulna=findViewById(R.id.btn_khulna);
        Button btnMymen=findViewById(R.id.btn_mymen);
        Button btnRaj=findViewById(R.id.btn_rajshahi);
        Button btnRangpur=findViewById(R.id.btn_rangpur);
        Button btnSylhet=findViewById(R.id.btn_sylhet);

        btnBarisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Barisal");
                startActivity(i);
            }
        });
        btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Chittagong");
                startActivity(i);
            }
        });
        btnDhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Dhaka");
                startActivity(i);
            }
        });
        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Khulna");
                startActivity(i);
            }
        });
        btnMymen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Mymensingh");
                startActivity(i);
            }
        });
        btnRaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Rajshahi");
                startActivity(i);
            }
        });
        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Rangpur");
                startActivity(i);
            }
        });
        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Div.this,Details.class);
                i.putExtra("Division","Sylhet");
                startActivity(i);
            }
        });
    }
}