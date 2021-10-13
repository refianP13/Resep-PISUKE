package com.example.resepgorpis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double[] jumlah_bahan = {1 , 100 , 1 , 1 , 1.5 , 2 , 10 };
    String[] nama_bahan = {" sisir - Pisang mateng", " gr - Terigu protein sedang" , " sdm - Gula pasir",
                            " sdm - Mentega", " sdm - garam", " sdm - Tepung roti", " ml - minyak goreng"};

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DecimalFormat decimalFormat = new DecimalFormat("#.###");

            button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText = (EditText)findViewById(R.id.jumlah_porsi);
                String porsi = editText.getText().toString();
                //int value = Integer.parseInt(porsi);
                double value = Double.parseDouble(porsi);
                double[] kali = new double[9];

                for(int i = 0; i < 7; i++){
                    kali[i] = value * jumlah_bahan[i];
                }



                textView = (TextView)findViewById(R.id.jumlah_bahan_1);
                if(kali[0] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[0])));
                } else{
                    textView.setText(String.format("%.0f", (kali[0])));
                }

                textView = (TextView)findViewById(R.id.jumlah_bahan_2);
                if(kali[1] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[1])));
                } else{
                    textView.setText(String.format("%.0f", (kali[1])));
                }

                textView = (TextView)findViewById(R.id.jumlah_bahan_3);
                if(kali[2] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[2])));
                }else{
                    textView.setText(String.format("%.0f", (kali[2])));
                }

                textView = (TextView)findViewById(R.id.jumlah_bahan_4);
                if(kali[3] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[3])));
                }else{
                    textView.setText(String.format("%.0f", (kali[3])));
                }

                textView = (TextView)findViewById(R.id.jumlah_bahan_5);
                if(kali[4] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[4])));
                }else{
                    textView.setText(String.format("%.0f", (kali[4])));
                }

                textView = (TextView)findViewById(R.id.jumlah_bahan_6);
                if(kali[5] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[5])));
                }else{
                    textView.setText(String.format("%.0f", (kali[5])));
                }

                textView = (TextView)findViewById(R.id.jumlah_bahan_7);
                if(kali[6] % 1 != 0){
                    textView.setText(String.format("%.3f", (kali[6])));
                }else{
                    textView.setText(String.format("%.0f", (kali[6])));
                }

            }
        });

        textView = (TextView)findViewById(R.id.jumlah_bahan_1);
        textView.setText(Double.toString(jumlah_bahan[0]));

        textView = (TextView)findViewById(R.id.jumlah_bahan_2);
        textView.setText(Double.toString(jumlah_bahan[1]));

        textView = (TextView)findViewById(R.id.jumlah_bahan_3);
        textView.setText(Double.toString(jumlah_bahan[2]));

        textView = (TextView)findViewById(R.id.jumlah_bahan_4);
        textView.setText(Double.toString(jumlah_bahan[3]));

        textView = (TextView)findViewById(R.id.jumlah_bahan_5);
        textView.setText(Double.toString(jumlah_bahan[4]));

        textView = (TextView)findViewById(R.id.jumlah_bahan_6);
        textView.setText(Double.toString(jumlah_bahan[5]));

        textView = (TextView)findViewById(R.id.jumlah_bahan_7);
        textView.setText(Double.toString(jumlah_bahan[6]));


        textView = (TextView)findViewById(R.id.nama_bahan_1);
        textView.setText(nama_bahan[0]);

        textView = (TextView)findViewById(R.id.nama_bahan_2);
        textView.setText(nama_bahan[1]);

        textView = (TextView)findViewById(R.id.nama_bahan_3);
        textView.setText(nama_bahan[2]);

        textView = (TextView)findViewById(R.id.nama_bahan_4);
        textView.setText(nama_bahan[3]);

        textView = (TextView)findViewById(R.id.nama_bahan_5);
        textView.setText(nama_bahan[4]);

        textView = (TextView)findViewById(R.id.nama_bahan_6);
        textView.setText(nama_bahan[5]);

        textView = (TextView)findViewById(R.id.nama_bahan_7);
        textView.setText(nama_bahan[6]);


        ScrollView scroll_View;
        scroll_View = (ScrollView)findViewById(R.id.scroll_View);

        scroll_View.getViewTreeObserver()
                .addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                    @Override
                    public void onScrollChanged() {
                        if (scroll_View.getChildAt(0).getBottom()
                                <= (scroll_View.getHeight() + scroll_View.getScrollY())) {

                            Toast.makeText(getApplicationContext(), "Sudah Selesai :)", Toast.LENGTH_SHORT).show();

                            //scroll view is at bottom
                        }
                    }});

    }
}