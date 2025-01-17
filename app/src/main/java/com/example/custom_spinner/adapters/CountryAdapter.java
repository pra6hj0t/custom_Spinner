package com.example.custom_spinner.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.custom_spinner.R;

import java.util.List;

public class CountryAdapter extends BaseAdapter {

    List<Country> list;
    Context context;

    public CountryAdapter(List<Country> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if (convertView==null){
           convertView = LayoutInflater.from(context).inflate(R.layout.country_item,parent,false);

           TextView name = convertView.findViewById(R.id.name);
           TextView about = convertView.findViewById(R.id.about);
           ImageView image = convertView.findViewById(R.id.imageView);

           Country country = list.get(position);
           name.setText(country.getName());
           about.setText(country.getAbout());
           image.setImageResource(country.getImage());

       }
        return convertView;
    }
}
