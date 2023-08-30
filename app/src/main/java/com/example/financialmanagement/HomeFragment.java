package com.example.financialmanagement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;


public class HomeFragment extends Fragment {
    ProgressBar progress;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        progress = view.findViewById(R.id.progressBar);
        progress.setMax(100);
        progress.setScaleY(2f);
        progress.setProgress(50);
        // Inflate the layout for this fragment
        return view;
    }
}