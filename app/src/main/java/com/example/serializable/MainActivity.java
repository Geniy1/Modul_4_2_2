package com.example.serializable;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.serializable.demo.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
    }
    void initviews(){
        Button b_m=findViewById(R.id.b_main);
        b_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user1=new User(43,"Odinayev Golibjon");
                openDetailActivity(user1);
            }
        });

    }


    void openDetailActivity(User user1) {
        Intent intent=new Intent(this,DetailActivity.class);
        intent.putExtra("user", user1);
        startActivity(intent);
    }
}