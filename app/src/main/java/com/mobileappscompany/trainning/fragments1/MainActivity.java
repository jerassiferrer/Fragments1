package com.mobileappscompany.trainning.fragments1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Myfragment mf= new Myfragment();

        getFragmentManager().beginTransaction().add(R.id.myContainer,mf).commit();


    }
}
