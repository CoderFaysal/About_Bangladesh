package com.coderfaysal.aboutbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Datails extends AppCompatActivity {


    public static String TITLE = "";
    public static String DESC = "";

    TextView show_name, show_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datails);

        show_name = findViewById(R.id.show_name);
        show_desc = findViewById(R.id.show_desc);

        show_name.setText(TITLE);
        show_desc.setText(DESC);



    }
}