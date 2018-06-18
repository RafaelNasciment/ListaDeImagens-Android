package com.example.carleanesousa.listaimagens;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    Integer[] imagens ={R.drawable.ares,R.drawable.baloes,R.drawable.bandeira,
            R.drawable.boneca,R.drawable.desenho, R.drawable.boneca,R.drawable.desenho, R.drawable.boneca, R.drawable.boneca,
            R.drawable.boneca, R.drawable.boneca, R.drawable.boneca,R.drawable.insta, R.drawable.boneca,
            R.drawable.boneca,R.drawable.desenho, R.drawable.boneca,R.drawable.insta, R.drawable.boneca, R.drawable.insta,
            R.drawable.boneca,
            R.drawable.boneca,R.drawable.desenho, R.drawable.insta, R.drawable.mario,
            R.drawable.mick, R.drawable.nick, R.drawable.nutela, R.drawable.sapo };

    String[] Nomes={};
    String[] Descriçao={};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        lv = (ListView) findViewById(R.id.List_imagens);
        lv.setAdapter((ListAdapter)new CustomAdapter(this, imagens));



    }
    }

