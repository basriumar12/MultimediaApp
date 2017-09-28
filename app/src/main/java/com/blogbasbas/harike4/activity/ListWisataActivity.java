package com.blogbasbas.harike4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.blogbasbas.harike4.R;
import com.blogbasbas.harike4.adapter.AdapterList;
import com.blogbasbas.harike4.helper.MyFunction;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListWisataActivity extends MyFunction {

    String[] name = {"Pantai Olele", "Pantai Botutonuo", "Pantai Boliyohutuo", "Pulau Cinta",
            "Benteng Otanaha", "Air Terjun Taludaa", "Pulau Bugisa", "Pulau Saronde "};
    int thumb[] = {R.drawable.olele, R.drawable.botutonuo, R.drawable.boliyohutuo, R.drawable.pulau_cinta,
            R.drawable.otanaha, R.drawable.airterjun_taludaa, R.drawable.bugisa, R.drawable.pulau_saronde};
    String[] desk = {"Pantai Olele lokasinya sangat mudah di akses. Para penelusur dapat menempuhnya dengan melalui jalur darat maupun jalur laut. Jika melalui jalur darat, maka para penelusur dapat menjangkaunya dengan menggunakan kendaraan baik roda dua atau roda empat dan para penelusur akan melewati jalanan yang berliku di pinggiran bukit.\n" +
            "\n" +
            "Saat perjalanan menuju ke Desa Olele sendiri, para penelusur akan menyusuri jalanan yang berkelok – kelok serta melin" +
            "tasi perumahan penduduk. Selama perjalanan, para penelusur akan disuguhi oleh dua pemandangan yang cukup kontras yaitu d" +
            "i satu sisi para penelusur akan disuguhi pemandangan tebing-tebing curam berpohon. Namun di sisi lainnya, para penelusur akan disuguhi " +
            "oleh pemandangan hambaran laut biru hijau tanpa batas membentang yang pastinya akan membuat para penelusur terkesima dibuatnya.",

            "Pantai Botutonuo bisa ditempuh hanya sekitar 30 menit aja dari kota. Kalau ke Gorontalo dan males berjauh-jauhan untuk " +
                    "menikmati pantai yang bisa untuk berenang serta menikmati sunset, pilihannya ya kesini.",

            "Pantai Bolihutuo atau yang lebih dikenal dengan nama Pantai Boalemo Indah merupakan salah satu obyek wisata alternatif untuk menghabiskan akhir pekan. Pantai ini berada di Kelurahan Bolihutuo, Kecamatan Botumoito, Kabupaten Boalemo, Propinsi Sulawesi Utara. Dari Kota Gorontalo berjarak sekitar 130 km.\n" +
                    "\n" +
                    "Keindahan Pantai Bolihutuo menyerupai hamparai mutiara di pesisir Teluk Tomini. " +
                    "" +
                    "Hamparan pasir putihnya dipadu dengan gulungan ombak yang berkejaran terlihat memutih menghiasi lautnya " +
                    "yang biru akan memanjakan mata anda untuk menikmati keindahan pantai ini. " +
                    "Di kawasan pinggir pantai terdapat pohon-pohon pinus yang menjulang tinggi dan rindang, semakin menambah sejuknya suasana",

            "Pulau Cinta adalah sebuah Pulau sebelumnya tidak berpenghuni yang ditemukan oleh masyarakat Kabupaten Baeloma dan dilaporkan ke pihak Dinas Pariwisata Provinsi Gorontalo. Untuk wisata bahari, kawasan pulau cinta" +
                    "ini sangat indah dan mempesona, dengan lautnya yang bersih dan bening serta karang laut masih terjaga dengan baik.\n" +
                    "\n" +
                    "Sebenarnya penamaan Pulo Cinta sendiri merupakan sebuah eco resort mengagumkan yang" +
                    " berdiri di tengah-tengah pulau pasir tersebut\n" +
                    "\n" +
                    "Pulau pasir tersebut terlihat begitu unik dan mengagumkan, karena memiliki bentuk" +
                    "seprti simbol cinta. Keindahnnya semakin lengkap karena pasir ini berdiri di atas coral memukau yang bernama Salvador Dali. Coral Salvador Dali ini merupakan satu-satunya di seluruh dunia",

            "Benteng Otanaha didirikan sebagai benteng pertahanan, benteng ini dibangun oleh Raja Ilato pada tahun 1522 Masehi. Dengan " +
                    "prakarsa pemimpin-pemimpin kapal Portugis yang berhenti di pelabuhan Gorontalo. Benteng yang " +
                    "terbuat dari pasir, batu kapur dan telur Burung Maleo ini sangat kuat meskipun semennya terbuat dari telur.",
            "Air terjun taludaa merupakan air terjun yang terletak 65 km dari pusat kota gorontalo. " +
                    "Dengan ketinggian air terjun yang mencapai 42m serta bentangan 15m menjadikan suatu fenomena alam yang diminati " +
                    "pengunjung untuk melihat air terjun ini. Bukan hanya tingginya tetapi habitat flora dan fauna yang ada di sekitar air terjun. " +
                    "Air terjun ini memiliki air yang segar dan cukup bersih. " +
                    "Untuk mencari lokasi air terjun taludaa sangatlah mudah karena berada dalam wilayah agrowisata.",

            "Pulau bugisa, terletak di kabupaten Gorontalo Utara. Bersebelahan dengan pulau saronde yang sudah tersohor ke seluruh Indonesia.\n" +
                    "Pulau ini tak berpenghuni, cocok sekali buat kamu yang ingin menikmati pasir putih yang halus.\n" +
                    "Dengan view pulau saronde,mohinggito dan pulau lampu, serta gradiasi laut biru yang memukau, menambah eksotisnya pulau ini.\n" +
                    "Selain itu kamu bisa menikmati sunrise dan sunset dari pulau ini.",

            "Pulau Saronde merupakan sebuah pulau kecil yang terletak 65 kilometer dari pusat Kota Gorontalo tepatnya di " +
                    "Kecamatan Kwandang, Kabupaten Gorontalu Utara. Pulau yang hanya memiliki luas mencapai 1 Kilometer " +
                    "ini dikelilingi oleh keindahan yang sangat mengagumkan yakni pasir putih, batu karang dan hamparan air laut " +
                    "biru indah yang tenang."};
    @BindView(R.id.listWisata)
    ListView listWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_wisata);
        ButterKnife.bind(this);

        AdapterList adapterList = new AdapterList(con,name, thumb);
        listWisata.setAdapter(adapterList);
        listWisata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {


                Intent intentkirim = new Intent(con,DetailActivity.class);
                intentkirim.putExtra("ng", name[posisi]);
                intentkirim.putExtra("gb", thumb[posisi]);
                intentkirim.putExtra("db", desk[posisi]);
                startActivity(intentkirim);
            }
        });


    }
}
