package com.example.c4q.loopactivity;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private EditText eText1;
    private EditText eText2;
    private Button button;
    private CheckBox firstBox;
    private SharedPreferences login;
    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eText1 = (EditText) findViewById(R.id.eLogin);
        eText2 = (EditText) findViewById(R.id.eLogin2);
        button = (Button) findViewById(R.id.submitButton);
        firstBox = (CheckBox) findViewById(R.id.myfirstcheckbox);
        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = login.edit();
                if (firstBox.isChecked()) {
                    editor.putString("firstbox", eText1.getText().toString());
                    editor.putString("second box", eText2.getText().toString());
                    editor.putBoolean("box is checked", firstBox.isChecked());
                    editor.commit();
                    editor.apply();


                } else {
                    editor.putBoolean("checkbox is checked", firstBox.isChecked());
                    editor.commit();
                    editor.apply();
                }
                String checkInput1 = "first input" + eText1.getText().toString();
                String checkInput2 = "second input" + eText2.getText().toString();
                if(eText1.getText().toString().equalsIgnoreCase(login.getString(checkInput1,null))&& eText2.getText().toString().equals(login.getString(checkInput2,null))){
                    Toast.makeText(getApplicationContext(),"wohooo it matches",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(loginActivity.this, listActivity.class);
                    intent.putExtra("address",eText1.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
