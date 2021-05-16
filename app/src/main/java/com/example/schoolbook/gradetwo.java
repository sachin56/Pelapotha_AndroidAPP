package com.example.schoolbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class gradetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradetwo);

        RelativeLayout gradetwomaths=(RelativeLayout)findViewById(R.id.gradetwomaths);
        gradetwomaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradetwomaths.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradetwobuddist=(RelativeLayout)findViewById(R.id.gradetwobuddist);
        gradetwobuddist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradtwobuddist.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradetwokatholika=(RelativeLayout)findViewById(R.id.gradetwokatholika);
        gradetwokatholika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradetwokatholika.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradetwoekristian=(RelativeLayout)findViewById(R.id.gradetwocristian);
        gradetwoekristian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradtwoecristian.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradetwoeislam=(RelativeLayout)findViewById(R.id.gradetwoislam);
        gradetwoeislam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradetwoislam.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradetwoesinhalaworkbook=(RelativeLayout)findViewById(R.id.gradetwosinhalaworkbook);
        gradetwoesinhalaworkbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradetwosinhalaworkbook.class);
                startActivity(intent);
            }
        });
        RelativeLayout gradetwosinhlaredinbook=(RelativeLayout)findViewById(R.id.gradetworeadinbook);
        gradetwosinhlaredinbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gradetwo.this,gradetwosinhalareadingbook.class);
                startActivity(intent);
            }
        });
    }
}