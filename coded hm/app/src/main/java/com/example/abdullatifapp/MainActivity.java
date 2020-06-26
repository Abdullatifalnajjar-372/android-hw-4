package com.example.abdullatifapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x = findViewById(R.id.Quizzes);
        final EditText y = findViewById(R.id.Homework);
        final EditText s = findViewById(R.id.Mid);
        final EditText r = findViewById(R.id.Finale);
        Button h = findViewById(R.id.button2);
        Button p = findViewById(R.id.Reset);
        final TextView per = findViewById(R.id.Result);

                h.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double quizzes = Double.parseDouble( x.getText().toString());
                        double homework = Double.parseDouble( y.getText().toString());
                        double mid = Double.parseDouble(s.getText().toString());
                        double finale = Double.parseDouble(r.getText().toString());

                        double rs = quizzes  + homework + mid + finale ;
                        if (rs>=90){ per.setText("A"); }
                        else if (rs>=80){per.setText("B"); }
                        else if (rs>=70){per.setText("C"); }
                        else if (rs>=60){per.setText("D"); }
                        else if (rs>=50){per.setText("F"); }
                    }
                });
                p.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        x.setText(null);
                        x.dispatchDisplayHint(View.VISIBLE);
                        y.setText(null);
                        y.dispatchDisplayHint(View.VISIBLE);
                        r.setText(null);
                        r.dispatchDisplayHint(View.VISIBLE);
                        s.setText(null);
                        s.dispatchDisplayHint(View.VISIBLE);
                        per.setText(null);
                        per.setText("Reset");
                    }
                });
    }
}
