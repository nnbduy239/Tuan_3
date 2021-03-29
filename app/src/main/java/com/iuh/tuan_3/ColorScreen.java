package com.iuh.tuan_3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorScreen extends AppCompatActivity {
    Button btnXong, btnBac, btnDo, btnDen, btnXanh;
    ImageView imgColor, imgMain;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_screen);

        btnBac = (Button) findViewById(R.id.btnBac);
        btnBac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgColor = (ImageView) findViewById(R.id.imgHinh);
                imgColor.setImageResource(R.drawable.vs_bac);
                textView = (TextView) findViewById(R.id.tvMau);
                textView.setText("Màu : Bạc");
            }
        });

        btnDo = (Button) findViewById(R.id.btnDo);
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgColor = (ImageView) findViewById(R.id.imgHinh);
                imgColor.setImageResource(R.drawable.vs_red);
                textView = (TextView) findViewById(R.id.tvMau);
                textView.setText("Màu : Đỏ");
            }
        });

        btnDen = (Button) findViewById(R.id.btnDen);
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgColor = (ImageView) findViewById(R.id.imgHinh);
                imgColor.setImageResource(R.drawable.vsmart_black);
                textView = (TextView) findViewById(R.id.tvMau);
                textView.setText("Màu : Đen");
            }
        });

        btnDo = (Button) findViewById(R.id.btnXanh);
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgColor = (ImageView) findViewById(R.id.imgHinh);
                imgColor.setImageResource(R.drawable.vsmart_xanh);
                textView = (TextView) findViewById(R.id.tvMau);
                textView.setText("Màu : Xanh");
            }
        });
        btnXong = (Button) findViewById(R.id.btnXong);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                imgColor = (ImageView) findViewById(R.id.imgHinh);
                if (imgColor.getDrawable().getConstantState().equals(imgColor.getContext().getDrawable(R.drawable.vs_bac).getConstantState())) {
                    Intent act2 = new Intent(ColorScreen.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vs_bac);
                    startActivity(act2);
                }
                if (imgColor.getDrawable().getConstantState().equals(imgColor.getContext().getDrawable(R.drawable.vs_red).getConstantState())) {
                    Intent act2 = new Intent(ColorScreen.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vs_red);
                    startActivity(act2);
                }
                if (imgColor.getDrawable().getConstantState().equals(imgColor.getContext().getDrawable(R.drawable.vsmart_black).getConstantState())) {
                    Intent act2 = new Intent(ColorScreen.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vsmart_black);
                    startActivity(act2);
                }
                if (imgColor.getDrawable().getConstantState().equals(imgColor.getContext().getDrawable(R.drawable.vsmart_xanh).getConstantState())) {
                    Intent act2 = new Intent(ColorScreen.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vsmart_xanh);
                    startActivity(act2);
                }
            }
        });
    }
}
