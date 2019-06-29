package com.example.robotdelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signin extends AppCompatActivity {

    private TextView creation;
    private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

       creation=(TextView) findViewById(R.id.creation);
       creation.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent4=new Intent(Signin.this, Signup.class);
               startActivity(intent4);
           }
       });

       signin=(Button) findViewById(R.id.signin);
       signin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent7=new Intent(Signin.this,Request.class);
               startActivity(intent7);
           }
       });

    }


}
