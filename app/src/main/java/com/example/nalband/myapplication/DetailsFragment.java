package com.example.nalband.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DetailsFragment extends Fragment {
    private EditText topText;
    private EditText bottomText;
    TopSectionListener activityCommander;

    public interface TopSectionListener {
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            if (context instanceof TopSectionListener) {
                activityCommander = (TopSectionListener) context;
            }
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        topText = (EditText) view.findViewById(R.id.topName);
        bottomText = (EditText) view.findViewById(R.id.bottomName);
        Button button = (Button) view.findViewById(R.id.changeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateThePage();
            }
        });
        return view;
    }

    private void updateThePage() {
        activityCommander.createMeme(topText.getText().toString(),bottomText.getText().toString());
    }

}
