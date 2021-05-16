package com.example.schoolbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class gradeonekatholika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradeonekatholika);

        PDFView pdfView=findViewById(R.id.pdfview);

        pdfView.fromAsset("catholicg1S.pdf").load();
    }
}