package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionPagerAdapter mSectionPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mSectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        setUpViewPager(mViewPager);


        TabLayout mTabLayout = findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_assignment_return);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_autorenew);
        mTabLayout.getTabAt(2).setIcon(R.drawable.ic_attachment);

        BottomNavigationView mBottomNavigationView = findViewById(R.id.bottomNavView_bar);
        Menu menu = mBottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.ic_arrow:
                        Intent intentMain= new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intentMain);
                        break;
                    case R.id.ic_android:
                        Intent intentOne= new Intent(MainActivity.this, ActivityOne.class);
                        startActivity(intentOne);
                        break;
                    case R.id.ic_library:
                        Intent intentTwo= new Intent(MainActivity.this, ActivityTwo.class);
                        startActivity(intentTwo);
                        break;
                    case R.id.ic_center:
                        Intent intentThree= new Intent(MainActivity.this, ActivityThree.class);
                        startActivity(intentThree);
                        break;
                    case R.id.ic_backup:
                        Intent intentFour= new Intent(MainActivity.this, ActivityFour.class);
                        startActivity(intentFour);
                        break;
                }
                return false;
            }
        });

    }


    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragment1());
        adapter.addFragment(new fragment2());
        adapter.addFragment(new fragment3());
        viewPager.setAdapter(adapter);

    }
}
