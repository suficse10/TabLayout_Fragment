package com.example.sufi.tablayoutfragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sufi.tablayoutfragment.R;

/**
 * Created by SuFi on 29-Oct-17.
 */

public class FavoritesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        return inflater.inflate(R.layout.favorites_fragment_layout, null);
    }
}
