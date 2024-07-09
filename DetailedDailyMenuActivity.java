package com.example.coffee_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.coffee_application.R;
import com.example.coffee_application.adapters.DetailedDailyAdapter;
import com.example.coffee_application.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_menu);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("donates")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.donates,"Donates","description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.donate1,"Donates","description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.donate2,"Donates","description","4.4","40","10 to 9"));
            dailyAdapter.notifyDataSetChanged();

        }
        if(type != null && type.equalsIgnoreCase("coffee")){

            imageView.setImageResource(R.drawable.coffee1);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coldcoffee1,"Coffee","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coldcoffe2,"Coffee","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coldcoffee3,"Coffee","description","4.4","40","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }

    }
}