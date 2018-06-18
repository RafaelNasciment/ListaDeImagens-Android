package com.example.carleanesousa.listaimagens;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter{

    Integer[] imagem;
    Context context;

    private static LayoutInflater inflater=null;

    public CustomAdapter(MainActivity mainActivity,Integer[] imagens) {
        this.context=mainActivity;
        this.imagem = imagens;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagem.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class Holder{
        ImageView im;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.custom_layout, null);
        holder.im=(ImageView)rowView.findViewById(R.id.imageView);
        holder.im.setImageResource(imagem[i]);

        return rowView;
    }
}