package com.example.p218_intent2_subsub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SubActivity1 extends AppCompatActivity {
    TextView tvName;
    RadioButton rbSeibetsu;
    RadioGroup rg;
    String str;

    //onCreateで取得して、nextメソッドで代入するため、インスタンス変数として宣言
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        tvName = findViewById(R.id.textViewNameS1);
        rbSeibetsu = findViewById(R.id.radioMaleS1);
        rg = findViewById(R.id.s1radioGroup1);

        //メインアクティビティからのインテントを取得
        in = getIntent();

        Bundle data = in.getExtras();
        if(data!=null){
            str = data.getString("name");
            tvName.setText(str+"さんの性別を選択してください");
        }
    }

    public void next(View v){
        Intent in1;
        in1 = new Intent(this,SubActivity2.class);

        //SubActivity2に送るインテントに、MainActivityからのインテントのデータを追加する
        in1.putExtras(in);
        //さらにデータを追加する
        in1.putExtra("seibetu",(rbSeibetsu.isChecked()==true ? "男性" : "女性"));
        startActivity(in1);
    }

    public void before(View v){
        //MainActivityに戻る
        finish();
    }
}