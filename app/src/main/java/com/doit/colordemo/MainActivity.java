package com.doit.colordemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
    implements SeekBar.OnSeekBarChangeListener {

    private TextView txtColor;
    private TextView txtRed,txtGreen,txtBlue;
    private SeekBar skRed,skGreen,skBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.init();
    }

    private void init(){
        this.txtColor =(TextView)this.findViewById(R.id.txtColor);

        this.txtRed =(TextView)this.findViewById(R.id.txtRed);
        this.txtGreen =(TextView)this.findViewById(R.id.txtGreen);
        this.txtBlue =(TextView)this.findViewById(R.id.txtBlue);

        this.skRed = (SeekBar)this.findViewById(R.id.skRed);
        this.skGreen = (SeekBar)this.findViewById(R.id.skGreen);
        this.skBlue = (SeekBar)this.findViewById(R.id.skBlue);

        this.skRed.setOnSeekBarChangeListener(this);
        this.skGreen.setOnSeekBarChangeListener(this);
        this.skBlue.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        int red = this.skRed.getProgress();
        int green = this.skGreen.getProgress();
        int blue = this.skBlue.getProgress();

        this.txtRed.setText(String.valueOf(red));
        this.txtGreen.setText(String.valueOf(green));
        this.txtBlue.setText(String.valueOf(blue));

        int color = Color.argb(255,red,green,blue);

        this.txtColor.setBackgroundColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
