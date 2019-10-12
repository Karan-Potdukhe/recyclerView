package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mrecyclerView;
    List<PamphletData> myPamphletList;
    PamphletData mPamphletData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mrecyclerView.setLayoutManager(gridLayoutManager);

        myPamphletList = new ArrayList<>();

        mPamphletData = new PamphletData( R.drawable.banner);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.b);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.c);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.d);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.e);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.f);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.i);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.j);
        myPamphletList.add(mPamphletData);
        mPamphletData = new PamphletData( R.drawable.k);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.m);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.n);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.o);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.p);
        myPamphletList.add(mPamphletData);

        mPamphletData = new PamphletData( R.drawable.q);
        myPamphletList.add(mPamphletData);





        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myPamphletList);
        mrecyclerView.setAdapter(myAdapter);
    }
}

