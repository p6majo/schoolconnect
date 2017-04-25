package com.p6majo.schoolconnect;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by p6majo on 25.04.17.
 */

public class FirstListViewFragment extends ListFragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public FirstListViewFragment(){

    }

    public static FirstListViewFragment newInstance(int sectionNumber){
        FirstListViewFragment fragment = new FirstListViewFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first_listview,container,false);


        String[] values = new String[] { "Eins", "Zwei", "Drei" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        return rootView;
    }
}
