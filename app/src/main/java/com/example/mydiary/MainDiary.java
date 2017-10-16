package com.example.mydiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainDiary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diary);
    }
    public void onButton10(View v)
    {
        Intent i = new Intent(this, TodayDiary.class);
        this.startActivity(i);
    }

    public void onButton9(View v)
    {
        Intent i = new Intent(this, TodayPlan.class);
        this.startActivity(i);
    }

    public void onButton8(View v)
    {
        Intent i = new Intent(this, MyInfo.class);
        this.startActivity(i);
    }
}
