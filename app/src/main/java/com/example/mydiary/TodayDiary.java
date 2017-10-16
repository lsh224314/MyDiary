package com.example.mydiary;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TodayDiary extends AppCompatActivity {

    private static int PICK_IMAGE_REQUEST = 1;
    ImageView imgView;
    static final String TAG = "TodayDiary";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_diary);
    }
    public void onButton6(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_LONG);
        toast.show();
    }

    public void Button7(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "리스트가 비어있습니다.", Toast.LENGTH_LONG);
        toast.show();
    }

}
