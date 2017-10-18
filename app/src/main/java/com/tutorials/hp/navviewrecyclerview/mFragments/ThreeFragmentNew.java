package com.tutorials.hp.navviewrecyclerview.mFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

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
import java.util.Collections;

/**
 * Created by tasol on 12/10/17.
 */

public class ThreeFragmentNew extends Fragment {

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
    ArrayList<String> allData = new ArrayList<>();

    private RecyclerView rvItems;
    private GridLayoutManager gridLayoutManager;
    private RecyclerViewKSkillsAdapter recyclerViewKSkillsAdapter;
    private EditText inputSearch;

    public ThreeFragmentNew() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_three_new, container, false);
        inputSearch = (EditText) rootView.findViewById(R.id.inputSearch);
        rvItems = (RecyclerView) rootView.findViewById(R.id.rvItems);
        gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        rvItems.setLayoutManager(gridLayoutManager);

        Collections.addAll(allData, Calculator);

        recyclerViewKSkillsAdapter = new RecyclerViewKSkillsAdapter(allData);
        rvItems.setAdapter(recyclerViewKSkillsAdapter);

        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                s = s.toString().toLowerCase();
                ArrayList<String> searchedData = new ArrayList<String>();
                for (int i = 0; i < Calculator.length; i++) {
                    String name = Calculator[i];
                    if (name.toLowerCase().contains(s)) {
                        searchedData.add(Calculator[i]);
                    }
                }

                recyclerViewKSkillsAdapter = new RecyclerViewKSkillsAdapter(searchedData);
                rvItems.setAdapter(recyclerViewKSkillsAdapter);
                recyclerViewKSkillsAdapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return rootView;
    }


    private class RecyclerViewKSkillsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        ArrayList<String> allData = new ArrayList<>();

        public RecyclerViewKSkillsAdapter(ArrayList<String> allData) {
            this.allData = allData;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            RecyclerView.ViewHolder viewHolder;

            View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_row_item,
                    parent, false);
            viewHolder = new ListViewHolder(parentView);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
            final ListViewHolder holder = (ListViewHolder) viewHolder;
            try {
                holder.txtItem.setText(allData.get(position));
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (position == 0) {
//
                            Intent myIntent = new Intent(getContext(), OneActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 1) {
                            Intent myIntent = new Intent(getContext(), TwoActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 2) {
                            Intent myIntent = new Intent(getContext(), ThreeActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 3) {
                            Intent myIntent = new Intent(getContext(), FourActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 4) {
                            Intent myIntent = new Intent(getContext(), FiveActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 5) {
                            Intent myIntent = new Intent(getContext(), SixActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 6) {
                            Intent myIntent = new Intent(getContext(), SevenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 7) {
                            Intent myIntent = new Intent(getContext(), EightActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 8) {
                            Intent myIntent = new Intent(getContext(), NineActivity.class);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 9) {
                            Intent myIntent = new Intent(getContext(), TenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 10) {
                            Intent myIntent = new Intent(getContext(), ElevenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 11) {
                            Intent myIntent = new Intent(getContext(), TwelveActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 12) {
                            Intent myIntent = new Intent(getContext(), ThirteenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 13) {
//
                            Intent myIntent = new Intent(getContext(), FourteenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 14) {
                            Intent myIntent = new Intent(getContext(), FifteenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 15) {
                            Intent myIntent = new Intent(getContext(), SixteenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 16) {
                            Intent myIntent = new Intent(getContext(), SeventeenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 17) {
                            Intent myIntent = new Intent(getContext(), EighteenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 18) {
                            Intent myIntent = new Intent(getContext(), NineteenActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
//
                        if (position == 19) {
                            Intent myIntent = new Intent(getContext(), TwentyActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 20) {
                            Intent myIntent = new Intent(getContext(), TwentyOneActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 21) {
                            Intent myIntent = new Intent(getContext(), TwentyTwoActivity.class);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 22) {
                            Intent myIntent = new Intent(getContext(), TwentyThreeActivity.class);
                            myIntent.putExtra("name", allData.get(position));
                            startActivityForResult(myIntent, 0);
                        }
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        @Override
        public int getItemCount() {
            return allData.size();
        }

        public class ListViewHolder extends RecyclerView.ViewHolder {


            public TextView txtItem;

            public ListViewHolder(View itemView) {
                super(itemView);
                txtItem = (TextView) itemView.findViewById(R.id.txtItem);
            }
        }
    }
}
