package com.izere.mydroidcaffev1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.izere.mydroidcaffev1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PastriesRecipeFragment extends Fragment {

    public PastriesRecipeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pastries_recipe, container, false);
    }
}
