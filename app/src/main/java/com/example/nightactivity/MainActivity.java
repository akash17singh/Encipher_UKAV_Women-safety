package com.example.nightactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.appbar.AppBarLayout;

public class MainActivity extends AppCompatActivity {

    private AppBarLayout mAppbarConfiguration;

    private Button start1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start1 = findViewById(R.id.start1);
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent categoryIntent = new Intent(MainActivity.this, StudyActivity.class);
                startActivity(categoryIntent);
                finish();
            }

        });


    }
}

