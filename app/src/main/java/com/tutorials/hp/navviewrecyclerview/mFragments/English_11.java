package com.tutorials.hp.navviewrecyclerview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tutorials.hp.navviewrecyclerview.Datacontainer;
import com.tutorials.hp.navviewrecyclerview.DataloadEnglish_11;
import com.tutorials.hp.navviewrecyclerview.R;
import com.tutorials.hp.navviewrecyclerview.Recycleradapter.Recycleradapter;
import com.tutorials.hp.navviewrecyclerview.Recycleradapter.Recycleradapter.Clicklistener;

import java.util.ArrayList;

public class English_11 extends Fragment implements Clicklistener {

    RecyclerView recycle;
    View view;

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("English-11");
        this.view = inflater.inflate(R.layout.fragment_1, container, false);
        this.recycle = (RecyclerView) this.view.findViewById(R.id.recycle);
        return this.view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Recycleradapter recycleradapter = new Recycleradapter(getActivity(), getdata());
        recycleradapter.setClicklistener(this);
        this.recycle.setHasFixedSize(true);
        this.recycle.setAdapter(recycleradapter);
        this.recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public ArrayList<Datacontainer> getdata() {
        ArrayList<Datacontainer> data = new ArrayList();
        String[] title = new String[]{"Scientific Calculator", "Mode Median Mean Calculator"};
        for (String str : title) {
            Datacontainer container = new Datacontainer();
            container.title = str;
            container.image = R.drawable.content;
            data.add(container);
        }
        return data;
    }

    public void itemclick(View v, int position) {
        DataloadEnglish_11 fragment = new DataloadEnglish_11();
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Bundle bundle = new Bundle();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        bundle.putInt("key", position);
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.containerID, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
