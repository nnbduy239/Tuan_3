package com.iuh.tuan_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  Button btnChangeColor;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView strikeText = findViewById(R.id.tvStrike);
        strikeText.setPaintFlags(strikeText.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);

        img =(ImageView)findViewById(R.id.imageView);
        img.setImageResource(getIntent().getIntExtra("ImgRe",R.drawable.vs_bac));
        btnChangeColor = (Button) findViewById(R.id.btnChangeColor);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenColorScreen();
            }
        });
    }
   public void OpenColorScreen(){
       Intent intent = new Intent(this,ColorScreen.class);
       startActivity(intent);
   }
}