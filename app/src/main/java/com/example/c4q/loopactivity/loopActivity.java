package com.example.c4q.loopactivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
    }

    private class tasks extends AsyncTask<Integer, Integer, Integer> {
        private TextView txt01;
        private int value;
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            txt01= (TextView) findViewById(R.id.view01);
            doInBackground(values);
            txt01.setText("loops completed" + doInBackground(values));
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            txt01.setText("loops completed" + doInBackground(value));
            Intent intent = new Intent(loopActivity.this,loginActivity.class);
            startActivity(intent);
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            Integer value= 2;
            for (int i = value; i < 100000; i++) {
                publishProgress(value);

            }
            return value;
        }
    }
}
