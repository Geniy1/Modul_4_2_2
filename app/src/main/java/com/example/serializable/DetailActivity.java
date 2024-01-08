package com.example.serializable;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.serializable.demo.User;

public class DetailActivity extends AppCompatActivity {
    static final String TAG=DetailActivity.class.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();

    }
    void initViews(){
        TextView tv_detail=findViewById(R.id.tv_detail);
        User user=(User)getIntent().getSerializableExtra("user");
        tv_detail.setText(user.toString());
    }


}