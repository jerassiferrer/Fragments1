package com.mobileappscompany.trainning.fragments1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 3/7/2016.
 */
public class Myfragment extends Fragment{

    public Myfragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.my_fragment,container, false );

        return v;

    }
}
