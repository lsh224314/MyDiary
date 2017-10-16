package com.example.mydiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TodayPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_plan);
    }

    public void Button(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_LONG);
        toast.show();
    }
}
