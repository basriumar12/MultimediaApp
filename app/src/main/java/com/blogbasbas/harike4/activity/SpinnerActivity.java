package com.blogbasbas.harike4.activity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.blogbasbas.harike4.R;
import com.blogbasbas.harike4.helper.MyFunction;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends MyFunction {
    Context context;
    //deklarasi variabel
    String namabuah []= {"alpukat","duruian","jambuair","manggis","strawbery"};
    //array untuk mendklarasi file gambar
    int gambarbuah[]= {R.drawable.alpukat,R.drawable.durian,R.drawable.jambuair,
            R.drawable.manggis,R.drawable.strawberry};
    int suarabuah[]= {R.raw.alpukat,R.raw.durian,R.raw.jambuair,
            R.raw.manggis,R.raw.strawberry};

    @BindView(R.id.spinnerbuah)
    Spinner spinnerbuah;
    @BindView(R.id.imgBuah)
    ImageView imgBuah;
    @BindView(R.id.txtBuah)
    TextView txtBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(SpinnerActivity.this,android.R.layout.simple_spinner_item,namabuah);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbuah.setAdapter(adapter);
        //set method ketika buah dipilih akan ditampilkan gambar sesuai nama
        spinnerbuah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posisi, long l) {
                //ambil array nama buah
                txtBuah.setText(namabuah[posisi]);
                //ambil gambar
                imgBuah.setImageResource(gambarbuah[posisi]);
                pesan("Anda Memilih"+namabuah[posisi]);
                MediaPlayer mediaPlayer = new MediaPlayer();
                Uri lokasi = Uri.parse("android.resource://"+getPackageName()+"/"
                        +suarabuah[posisi]);
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try{
                    mediaPlayer.setDataSource(con,lokasi);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    }
