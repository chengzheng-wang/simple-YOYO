package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.name);
        // TODO set up Buttons
        Button yo = (Button)findViewById(R.id.btn_1);
        Button mo = (Button)findViewById(R.id.btn_2);
        Button yoyo = (Button)findViewById(R.id.btn_3);
        Button or = (Button)findViewById(R.id.btn_4);
        yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"YO" + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"MO" + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        yoyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"YO YO" + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"OR" + editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        // find the Buttons you declared in the layout file by their ids
        // set up the click event listeners of the buttons
        // in each of the click event functions, display a toast that shows the text of the EditText
    }
}
