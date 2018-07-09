package com.example.monirul.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileDetailsActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);

        imageView = findViewById(R.id.ImageViewId);
        textView = findViewById(R.id.TextViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }

    }

    void showDetails(String country){
        if (country.equals("Bangladesh")){
          imageView.setImageResource(R.drawable.bangladesh_parliament);
          textView.setText(R.string.Bangladesh_deatils);
        }
        if (country.equals("India")){
            imageView.setImageResource(R.drawable.india_image);
            textView.setText(R.string.India_deatils);
        }
        if (country.equals("Pakistan")){
            imageView.setImageResource(R.drawable.pakistan_image);
            textView.setText(R.string.Pakistan_deatils);
        }



    }
}
