package com.example.nalband.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements DetailsFragment.TopSectionListener {

    private  DetailsFragment detailsFragment;
    private MemeFragment memeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        memeFragment=(MemeFragment) getFragmentManager().findFragmentById(R.id.meme);
        memeFragment.setText(top,bottom);
    }
}
