package com.example.tabanna.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.tabanna.R;

public class announce extends Fragment {


    public announce() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_announce, container, false);

        String type;
        RadioButton bird= v.findViewById(R.id.rb1); RadioButton cat= v.findViewById(R.id.rb2);
        RadioButton dog= v.findViewById(R.id.rb3);
        if (bird.isChecked()) type="طائر";
        else if (cat.isChecked()) type="قطة";
        else type="كلب";

        EditText notes= v.findViewById(R.id.mojaz);
        String description= notes.getText().toString();

        EditText person= v.findViewById(R.id.person);
        String name= person.getText().toString();

        EditText pn= v.findViewById(R.id.pn);
        String phone_number= pn.getText().toString();

        EditText eml= v.findViewById(R.id.eml);
        String email= eml.getText().toString();

        EditText loc= v.findViewById(R.id.loc);
        String location= loc.getText().toString();

        Button proceed= v.findViewById(R.id.button);
        //min 54
        return v;
    }
}