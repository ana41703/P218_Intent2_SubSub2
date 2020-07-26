package com.example.p218_intent2_subsub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {
    TextView tvResult;
    String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        tvResult = findViewById(R.id.textViewResS2);
        Intent in = getIntent();
        Bundle data = in.getExtras();
        if(data != null){
            str1=data.getString("name");
            str2=data.getString("seibetu");
            tvResult.setText(str1+"さんは"+str2+"ですね");
        }
    }

    public void before(View v){
        //SubActivity1に戻る
        finish();
    }
}