package com.example.schoolbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class gradeonecristian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradeonecristian);

        PDFView pdfView=findViewById(R.id.pdfview);

        pdfView.fromAsset("mathsg-1s.pdf").load();
    }
}