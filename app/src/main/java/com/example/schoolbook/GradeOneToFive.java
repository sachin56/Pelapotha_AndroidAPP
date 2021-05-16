package com.example.schoolbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class GradeOneToFive extends AppCompatActivity {
    LinearLayout gradeone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_one_to_five);

        gradeone=findViewById(R.id.gradeone);

        gradeone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GradeOneToFive.this,gradeone.class);
                startActivity(intent);
            }
        });

        LinearLayout gradetwo=(LinearLayout)findViewById(R.id.gradetwo);
        gradetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GradeOneToFive.this,gradetwo.class);
                startActivity(intent);
            }
        });
        LinearLayout gradethree=(LinearLayout)findViewById(R.id.grathree);
        gradethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GradeOneToFive.this,gradethree.class);
                startActivity(intent);
            }
        });
        LinearLayout gradefour=(LinearLayout)findViewById(R.id.gradefour);
        gradefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GradeOneToFive.this,gradefour.class);
                startActivity(intent);
            }
        });
        LinearLayout gradefive=(LinearLayout)findViewById(R.id.gradefive);
        gradefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GradeOneToFive.this,gradefive.class);
                startActivity(intent);
            }
        });
    }
}