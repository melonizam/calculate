package com.tutorials.hp.navviewrecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.tutorials.hp.navviewrecyclerview.mFragments.English_11;
import com.tutorials.hp.navviewrecyclerview.mFragments.ThreeFragment;
import com.tutorials.hp.navviewrecyclerview.mFragments.ThreeFragmentNew;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private final English_11 mEnglish11 = new English_11();
    // private final English_12 mEnglish12 = new English_12();
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.containerID, mEnglish11).commit();
//        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //REFERENCE DRAWER,TOGGLE ITS INDICATOR
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //REFERNCE NAV VIEW AND ATTACH ITS ITEM SELECTION LISTENER
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //CLOSE DRAWER WHEN BACK BTN IS CLICKED,IF OPEN
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFrag(new OneFragment(), "Musician");
//        adapter.addFrag(new TwoFragment(), "");
        adapter.addFrag(new ThreeFragmentNew(), "");
//        adapter.addFrag(new FourFragment(), "Raag");
//        adapter.addFrag(new FiveFragment(), "Taal");
//        adapter.addFrag(new SixFragment(), "Strumming");
//        adapter.addFrag(new SevenFragment(), "Theme");
//        adapter.addFrag(new EightFragment(), "Gener");
//        adapter.addFrag(new NineFragment(), "Movies");
//        adapter.addFrag(new TenFragment(), "Actor");
//        adapter.addFrag(new ElevenFragment(), "Actress");
//        adapter.addFrag(new TwelveFragment(), "Others");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    //RAISED WHEN NAV VIEW ITEM IS SELECTED
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        //OPEN APPROPRIATE FRAGMENT WHEN NAV ITEM IS SELECTED
        if (id == R.id.interplanetary) {
            //PERFORM TRANSACTION TO REPLACE CONTAINER WITH FRAGMENT
//            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, mEnglish11).commit();
            RelativeLayout rl =(RelativeLayout)findViewById(R.id.containerID);
            rl.setVisibility(View.GONE);
            viewPager.setVisibility(View.VISIBLE);
            setupViewPager(viewPager);


        } else if (id == R.id.interstellar) {
            viewPager.setVisibility(View.GONE);
            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, mEnglish11).commit();
        }

//        } else if (id == R.id.intergalactic) {
//            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, InterGalactic.newInstance()).commit();
//
//        } else if (id == R.id.interuniverse) {
//            MainActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.containerID, InterUniverse.newInstance()).commit();
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {

//        }

        //REFERENCE AND CLOSE DRAWER LAYOUT
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

