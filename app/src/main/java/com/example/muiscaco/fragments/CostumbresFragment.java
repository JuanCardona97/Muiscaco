package com.example.muiscaco.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.muiscaco.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CostumbresFragment extends Fragment {


    public CostumbresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_costumbres, container, false);
    }

}
