package com.example.schoolbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class gradeone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradeone);

        RelativeLayout gradeonemaths=(RelativeLayout)findViewById(R.id.gradeonemaths);
        gradeonemaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeonemaths.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradeonebuddist=(RelativeLayout)findViewById(R.id.gradeonebuddist);
        gradeonebuddist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeonebuddist.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradeonekatholika=(RelativeLayout)findViewById(R.id.gradeonekatholika);
        gradeonekatholika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeonekatholika.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradeonekristian=(RelativeLayout)findViewById(R.id.gradeonekatholika);
        gradeonekristian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeonecristian.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradeoneislam=(RelativeLayout)findViewById(R.id.gradeoneislam);
        gradeoneislam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeoneislam.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradeonesinhalaworkbook=(RelativeLayout)findViewById(R.id.gradeonesinhalaworkbook);
        gradeonesinhalaworkbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeonesinhalaworkbook.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradeonesinhlaredinbook=(RelativeLayout)findViewById(R.id.sinhalareadingbook);
        gradeonesinhlaredinbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradeone.this,gradeonesinhalareadingbook.class);
                startActivity(intent);
            }
        });
    }
}