package com.example.t;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pet> pets= new ArrayList<>();

        String dalmatian= "ينتمي إلى سلالة تعاني من الصمم أو ضعف السمع، ومعرضة إلى الإصابة بالحصى الكلوي. يجب التعامل معه بهدوء واتباع نظام غذائي مناسب.";
        String fischer= "عدائي. ينبغي ألا يختلط بطيور أخرى";

        pets.add(new Pet("محمد","99999999",
                "mohammed@yahoo.com","cat", "مدينة الكويت",true));
        pets.add(new Pet("ندى","66666666",
                "nada@yahoo.com","dog", "خيطان",false));
        pets.add(new Pet("سامي","55555555",
                "sami@gmail.com","bird", "سلوى",true, fischer));
        pets.add(new Pet("مراد","99996666",
                "morat@hotmail.com","dog", "السالمية",true, dalmatian));
        pets.add(new Pet("عائشة","66566374",
                "3a2sha@gmail.com","cat", "مبارك الكبير",false));


        RecyclerView recyclerView= findViewById(R.id.rv);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        PetAdapter petAdapter = new PetAdapter(MainActivity.this,pets);
        recyclerView.setAdapter(petAdapter);



    }
}