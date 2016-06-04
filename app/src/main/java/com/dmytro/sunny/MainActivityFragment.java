package com.dmytro.sunny;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<String> fakeData = new ArrayList<>();
        for(int i = 0; i <= 15; i++) {
            fakeData.add("SomeWeather - " + (i + 10));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.list_item_forecast, R.id.list_item_forecast_textview,fakeData);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
