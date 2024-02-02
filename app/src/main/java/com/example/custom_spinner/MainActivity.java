package com.example.custom_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.custom_spinner.adapters.Country;
import com.example.custom_spinner.adapters.CountryAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);


        Country names[]={
                new Country(1,"India","This is first Country",R.drawable.india),
                new Country(2,"Canada","This is second Country",R.drawable.canada),
                new Country(3,"USA","This is third Country",R.drawable.usa),
                new Country(4,"Australia","This is fourth Country",R.drawable.aus),
                new Country(5,"China","This is fifth Country",R.drawable.china),
        };

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,names);
//        spinner.setAdapter(arrayAdapter);



        CountryAdapter countryAdapter = new CountryAdapter(Arrays.asList(names),this);
        spinner.setAdapter(countryAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You Select : "+names[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}