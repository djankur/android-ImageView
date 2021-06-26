package com.example.photo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class im extends AppCompatActivity {
    TextView txt;
//    ImageView img;
//    Drawable d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im);
        txt = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String uname = ((Intent) intent).getStringExtra("User");
        txt.setText("Hello" +" " +uname);
//
//        img = findViewById(R.id.img1);
//        d=getResources().getDrawable(R.drawable.f);
//        img.setImageDrawable(d);
    }
}