package com.example.lagerimage_test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;

import com.shizhefei.view.largeimage.LargeImageView;

import java.io.IOException;

public class HActivity extends Activity {
    private LargeImageView imageView;
//    private HorizontalScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);

        imageView = (LargeImageView) findViewById(R.id.imageView);
//        scrollView = (HorizontalScrollView) findViewById(R.id.sv);
        try {
            imageView.setImage(getAssets().open("aaa.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
