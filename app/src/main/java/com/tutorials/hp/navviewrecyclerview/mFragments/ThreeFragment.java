package com.tutorials.hp.navviewrecyclerview.mFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.tutorials.hp.navviewrecyclerview.EightActivity;
import com.tutorials.hp.navviewrecyclerview.EighteenActivity;
import com.tutorials.hp.navviewrecyclerview.ElevenActivity;
import com.tutorials.hp.navviewrecyclerview.FifteenActivity;
import com.tutorials.hp.navviewrecyclerview.FiveActivity;
import com.tutorials.hp.navviewrecyclerview.FourActivity;
import com.tutorials.hp.navviewrecyclerview.FourteenActivity;
import com.tutorials.hp.navviewrecyclerview.NineActivity;
import com.tutorials.hp.navviewrecyclerview.NineteenActivity;
import com.tutorials.hp.navviewrecyclerview.OneActivity;
import com.tutorials.hp.navviewrecyclerview.R;
import com.tutorials.hp.navviewrecyclerview.SevenActivity;
import com.tutorials.hp.navviewrecyclerview.SeventeenActivity;
import com.tutorials.hp.navviewrecyclerview.SixActivity;
import com.tutorials.hp.navviewrecyclerview.SixteenActivity;
import com.tutorials.hp.navviewrecyclerview.TenActivity;
import com.tutorials.hp.navviewrecyclerview.ThirteenActivity;
import com.tutorials.hp.navviewrecyclerview.ThreeActivity;
import com.tutorials.hp.navviewrecyclerview.TwelveActivity;
import com.tutorials.hp.navviewrecyclerview.TwentyActivity;
import com.tutorials.hp.navviewrecyclerview.TwentyOneActivity;
import com.tutorials.hp.navviewrecyclerview.TwentyThreeActivity;
import com.tutorials.hp.navviewrecyclerview.TwentyTwoActivity;
import com.tutorials.hp.navviewrecyclerview.TwoActivity;

import java.util.ArrayList;
import java.util.HashMap;


public class ThreeFragment extends Fragment {

    // List view
    private ListView lv;
    private ViewPager viewPager;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    public ThreeFragment() {
        // Required empty public constructor
    }

    String[] Calculator = {"Scientific Calculator",
            "Mode Median Mean Calculator",
            "Standard Deviation Calculator",
            "Standard Error Calculator",
            "Count",
            "Analysis of Variance(ANOVA)",
            "Binomial Distribution",
            "Chi-Square Distributio",
            "Effect Size",
            "Power",
            "Confidence Intervals",
            "T-test",
            "Sample Size",
            "Z-test",
            "Fisher Exact Test",
            "Survival analysis",
            "Wilcoxon Signed-Ranks",
            "Mann-Whitney U Test",
            "Linear Regression Calculator",
            "Correlation Coefficient",
            "Coefficient of Variance Calculator",
            "Skewness"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        // Listview Data

        lv = (ListView) rootView.findViewById(R.id.list_view);


        inputSearch = (EditText) rootView.findViewById(R.id.inputSearch);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                ThreeFragment.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Calculator);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
//
                    Intent myIntent = new Intent(view.getContext(), OneActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TwoActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ThreeActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), FourActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), FiveActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), SixActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), SevenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), EightActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), NineActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), TenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), ElevenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), TwelveActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), ThirteenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 13) {
//
                    Intent myIntent = new Intent(view.getContext(), FourteenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), FifteenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), SixteenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), SeventeenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), EighteenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), NineteenActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
//
                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), TwentyActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), TwentyOneActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), TwentyTwoActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), TwentyThreeActivity.class);
                    myIntent.putExtra("name", Calculator[position]);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


    }
}
