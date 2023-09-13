package com.sheoran.androidfragmentsjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CustomFragment extends Fragment {


    private TextView myTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(
                R.layout.fragment_custom, container, false);
        // Finds the TextView in the custom fragment
        myTextView = (TextView)view.findViewById(
                R.id.fragmentTextView);

        // Gets the data from the passed bundle
        Bundle bundle = getArguments();
        String message = bundle.getString("mText");

        // Sets the derived data (type String) in the
        // TextView
        myTextView.setText(message);

        return view;
    }
}