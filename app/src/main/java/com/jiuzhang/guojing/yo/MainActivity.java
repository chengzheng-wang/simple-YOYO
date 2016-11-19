package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.text_anim);
        final EditText editText = (EditText)findViewById(R.id.name);

        final Button yo = (Button)findViewById(R.id.btn_1);
        final Button mo = (Button)findViewById(R.id.btn_2);
        final Button yoyo = (Button)findViewById(R.id.btn_3);
        final Button or = (Button)findViewById(R.id.btn_4);
        yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yo.startAnimation(animation);
                Toast.makeText(MainActivity.this,yo.getText() +" "+ editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo.startAnimation(animation);
                Toast.makeText(MainActivity.this,mo.getText() + " " + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        yoyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yoyo.startAnimation(animation);
                Toast.makeText(MainActivity.this,yoyo.getText() + " " + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                or.startAnimation(animation);
                Toast.makeText(MainActivity.this,or.getText() + " " + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
