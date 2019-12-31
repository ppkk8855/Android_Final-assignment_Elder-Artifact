package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btn_video;
    public Button btn_photo;
    public Button btn_music;
    public Button btn_Line;
    public Button btn_fb;
    public Button btn_phone;
    public Button btn_search;
    public Button btn_map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn_video=findViewById(R.id.button9);
       btn_video.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
               startActivity(intent);
           }

       });

       btn_photo=findViewById(R.id.button10);
       btn_photo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos");
               startActivity(intent);
           }
       });

       btn_music=findViewById(R.id.button11);
       btn_music.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("com.spotify.music");
               startActivity(intent);
           }
       });

       btn_Line=findViewById(R.id.button12);
       btn_Line.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("jp.naver.line.android");
               startActivity(intent);
           }
       });

       btn_fb=findViewById(R.id.button13);
       btn_fb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
               startActivity(intent);
           }
       });

       btn_phone=findViewById(R.id.button14);
       btn_phone.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("gogolook.callgogolook2");
               startActivity(intent);
           }
       });

       btn_search=findViewById(R.id.button15);
       btn_search.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
               startActivity(intent);
           }
       });

       btn_map=findViewById(R.id.button16);
       btn_map.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
               startActivity(intent);
           }
       });



    }
}
