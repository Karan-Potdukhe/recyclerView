package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Detailactivity extends AppCompatActivity {

    TextView pamphletdescription;
    ImageView pamphletimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivity);
         Spinner spinnera = (Spinner) findViewById(R.id.spinnera);
        Spinner spinnerb = (Spinner) findViewById(R.id.spinnerb);

        pamphletdescription=(TextView)findViewById(R.id.tvDescription);
        pamphletimage = (ImageView)findViewById(R.id.banner);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle!=null)
        {
            pamphletdescription.setText(mBundle.getString("Description"));
            pamphletimage.setImageResource(mBundle.getInt("Image"));
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Quantity, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnera.setAdapter(adapter);


       ArrayAdapter<CharSequence> adaptera = ArrayAdapter.createFromResource(this, R.array.sides, android.R.layout.simple_spinner_item);
        adaptera.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerb.setAdapter(adaptera);


    }
}
