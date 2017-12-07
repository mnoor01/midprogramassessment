package com.example.c4q.loopactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class listActivity extends AppCompatActivity {
    private TextView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=(TextView) findViewById(R.id.listView);

        Intent intent= getIntent();
        String info= intent.getStringExtra("address");
        listView.setText("your username is" + info);
     }
}
