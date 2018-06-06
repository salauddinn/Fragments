package com.example.nalband.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MemeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meme, container, false);
        return view;
    }

    public void setText(String top, String bottom) {
        TextView topText = (TextView) getView().findViewById(R.id.textView);
        TextView bottomText = (TextView) getView().findViewById(R.id.textView2);
        Log.d("meme",bottomText.getText().toString()+"------------"+topText.getText().toString());
        topText.setText(top);
        bottomText.setText(bottom);
    }
}
