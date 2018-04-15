package com.zhouf.leo.hello2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void btn1(View v) {
        if(v.getId()==R.id.btn1){
            show(1);
        }else if(v.getId()==R.id.btn1b){
            showb(1);
        }
    }

    public void btn2(View v) {
        if(v.getId()==R.id.btn2){
            show(2);
        }else{
            showb(2);
        }
    }

    public void btn3(View v) {
        if(v.getId()==R.id.btn3){
            show(3);
        }else{
            showb(3);
        }
    }

    public void btnReset(View v) {
        TextView out = (TextView)findViewById(R.id.score);
        out.setText("0");

        ((TextView)findViewById(R.id.score2)).setText("0");
    }

    private void show(int i){
        TextView out = (TextView)findViewById(R.id.score);
        String oldScore = (String) out.getText();
        String newScore = String.valueOf(Integer.parseInt(oldScore) + i);
        out.setText(newScore);
    }
    private void showb(int i){
        TextView out = (TextView)findViewById(R.id.score2);
        String oldScore = (String) out.getText();
        String newScore = String.valueOf(Integer.parseInt(oldScore) + i);
        out.setText(newScore);
    }
}
