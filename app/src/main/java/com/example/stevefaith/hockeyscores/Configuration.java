package com.example.stevefaith.hockeyscores;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.PublicKey;

public class Configuration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);


        final EditText commentStrET;

        final String nameStr = "nameKey";
        Integer i;
        final String descriptionStr = "descriptionStrKey";
        final String prefNameStr = "com.example.stevefaith.hockeyscores";

        //EditText description = (EditText) findViewById(R.id.EditCommentTxt);
        //final String commentStr = (String) description.getText().toString();

        Button editCommentBtn = (Button) findViewById(R.id.commitCommentbtn);
        editCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText description = (EditText) findViewById(R.id.editCommentTxt);
                EditText description2 = (EditText) findViewById(R.id.editCommentTxt2);

                String commentStr = (String) description.getText().toString();
                String commentStr2 = (String) description2.getText().toString();

                SharedPreferences sp = getSharedPreferences(prefNameStr, MODE_PRIVATE);



                SharedPreferences.Editor spEdit = sp.edit();

                final SharedPreferences.Editor clear = spEdit.clear();
                clear.apply();

                spEdit.putString("C1", commentStr);
                spEdit.putString("C2", commentStr2);
                spEdit.apply();


            }
        });

    }
}
