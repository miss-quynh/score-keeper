package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {

    BlurImageView backgroundImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundImage = (BlurImageView) findViewById(R.id.backgroundImage);
        backgroundImage.setBlur(2);
    }
}
