package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvList;
    private List<Music> musicList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvList= findViewById(R.id.lvList);
        musicList = new ArrayList<>();
        for (int i =0;i<10;i++){
            Music music = new Music();
            music.setName("Em gais mua"+ i);
            music.setTime("4:00");
            musicList.add(music);
        }
        MusicAdater musicAdater = new MusicAdater(MainActivity.this,musicList);
        lvList.setAdapter(musicAdater);
    }
}
