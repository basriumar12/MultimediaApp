package com.blogbasbas.harike4.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.blogbasbas.harike4.R;
import com.blogbasbas.harike4.adapter.AdapterViewPager;
import com.blogbasbas.harike4.helper.MyFunction;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPagerActivity extends MyFunction {
    String namabuah[] = {"alpukat", "duruian", "jambuair", "manggis", "strawbery"};
    int gambarbuah[] = {R.drawable.alpukat, R.drawable.durian, R.drawable.jambuair,
            R.drawable.manggis, R.drawable.strawberry};
    @BindView(R.id.pagerbuah)
    ViewPager pagerbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ButterKnife.bind(this);
        AdapterViewPager adapter = new AdapterViewPager(con, namabuah, gambarbuah);
        pagerbuah.setAdapter(adapter);
    }
}
