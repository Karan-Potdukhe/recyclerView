package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.MainActivity;

public class Mainactivitypamphlet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivitypamphlet);

        ImageView Image=(ImageView)findViewById(R.id.single);
        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mainactivitypamphlet.this, MainActivity.class);
                startActivity(intent);
            }

        });
        ImageView Image1=(ImageView)findViewById(R.id.multi);
        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainactivitypamphlet.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}


