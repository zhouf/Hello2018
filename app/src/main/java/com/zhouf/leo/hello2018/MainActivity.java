package com.zhouf.leo.hello2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView out;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView) findViewById(R.id.txtout);
        out.setText("Hello Tom");

        edit = (EditText) findViewById(R.id.inp);

        Button btn = (Button)findViewById(R.id.btn);
        //btn.setOnClickListener(this);
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit.getText().toString();
                out.setText("Hi " + str);
            }
        });*/

    }

    @Override
    public void onClick(View v) {
        Log.i("main","onClick msg....");

        TextView out = (TextView) findViewById(R.id.txtout);

        EditText edit = (EditText) findViewById(R.id.inp);
        String str = edit.getText().toString();

        out.setText("Hello2 " + str);
    }

    public void btn(View v) {

        String str = edit.getText().toString();

        out.setText("Hi~ " + str);
    }
}
