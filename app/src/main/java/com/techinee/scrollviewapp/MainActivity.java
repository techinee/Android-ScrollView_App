package com.techinee.scrollviewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    private ScrollView scrollView;
    private final int [] resId = {
            R.drawable.pic1, R.drawable.pic2,R.drawable.pic3, R.drawable.pic4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearVertical);
        ImageView[] imagesView = new ImageView[4];
        for(int n = 0; n < imagesView.length; n++) {
            imagesView[n] = new ImageView(this);
            imagesView[n].setId(25100+n);
            imagesView[n].setPadding(0,0,0,0);
            imagesView[n].setImageResource(resId[n] );
//imagesView[n].setScaleType(ImageView.ScaleType.FIT_XY);
            imagesView[n].setScaleType(ImageView.ScaleType.FIT_CENTER);
            imagesView[n].setOnClickListener(this);
            linearLayout.addView( imagesView[n]);
        }
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
    }
}