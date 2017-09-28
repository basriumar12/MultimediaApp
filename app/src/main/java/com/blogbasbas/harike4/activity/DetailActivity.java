package com.blogbasbas.harike4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogbasbas.harike4.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.imgWIsata)
    ImageView imgWIsata;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.detail)
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        Intent getData = getIntent();
        title.setText(getData.getStringExtra("ng"));
        detail.setText(getData.getStringExtra("db"));
        imgWIsata.setImageResource(getData.getIntExtra("gb",0));
    }
}
