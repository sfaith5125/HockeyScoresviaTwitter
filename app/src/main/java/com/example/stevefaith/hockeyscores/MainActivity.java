package com.example.stevefaith.hockeyscores;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String prefNameStr = "com.example.stevefaith.hockeyscores";
        final String dsKey = "descriptionStrKey";

        Button configurationbtn = (Button) findViewById(R.id.Configurationbtn);
        configurationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startConfigurationIntent = new Intent(getApplicationContext(), Configuration.class);
                startActivity(startConfigurationIntent);
            }

            });


                Button retrieveComment = (Button) findViewById(R.id.retrieveCommentbtn);
                retrieveComment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SharedPreferences sp = getSharedPreferences(prefNameStr,MODE_PRIVATE );
                        String d1 = sp.getString("C1", null);
                        String d2 = sp.getString("C2", null);

                        TextView tv = (TextView) findViewById(R.id.readCommenttxt);
                        tv.setText(d1);
                        TextView tv2 = (TextView) findViewById(R.id.readCommenttxt2);
                        tv2.setText(d2);


                    }
                });

        };



    }

