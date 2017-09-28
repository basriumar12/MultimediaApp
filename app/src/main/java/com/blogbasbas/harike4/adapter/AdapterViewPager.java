package com.blogbasbas.harike4.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blogbasbas.harike4.R;

/**
 * Created by Server on 24/09/2017.
 */

public class AdapterViewPager extends PagerAdapter {
    Context context;
    String[]nama_buah;
    int[]gambar_buah;
    public AdapterViewPager (Context con, String[] namabuah, int[] gambarbuah) {
        //samakan semua
        context=con;
        nama_buah=namabuah;
        gambar_buah=gambarbuah;
    }


    @Override
    public int getCount() {
        return gambar_buah.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.tampilancustompager,null);
        //deklarasi variabel
        ImageView imgbuah =(ImageView)view.findViewById(R.id.imgPager);
        TextView textbuah = (TextView)view.findViewById(R.id.textBuahPager);
        textbuah.setText(nama_buah[position]);
        imgbuah.setImageResource(gambar_buah[position]);
        //memanggil gambar
        ((ViewPager)container).addView(view);
        return view;
    }
    //method remove gambar agar tidak destroy
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager)container).removeView((LinearLayout)object);
    }
}
