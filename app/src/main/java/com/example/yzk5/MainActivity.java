package com.example.yzk5;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.et_targetWeb);
    }
    public void toWebBrowers(View view){
        Intent intent=new Intent();
        String stringUri="";
        if (!editText.getText().toString().isEmpty()){
            stringUri=editText.getText().toString();
        }
        Uri contentUri=Uri.parse(stringUri);
        intent.setData(contentUri);
        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
    }
}
