package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ActivityOne extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        title = findViewById(R.id.activityOneTitle);
        title.setText("This is ActivityOne");

        BottomNavigationView mBottomNavigationView = findViewById(R.id.bottomNavView_bar);

        Menu menu = mBottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.ic_arrow:
                        Intent intentMain= new Intent(ActivityOne.this, MainActivity.class);
                        startActivity(intentMain);
                        break;
                    case R.id.ic_android:
                        Intent intentOne= new Intent(ActivityOne.this, ActivityOne.class);
                        startActivity(intentOne);
                        break;
                    case R.id.ic_library:
                        Intent intentTwo= new Intent(ActivityOne.this, ActivityTwo.class);
                        startActivity(intentTwo);
                        break;
                    case R.id.ic_center:
                        Intent intentThree= new Intent(ActivityOne.this, ActivityThree.class);
                        startActivity(intentThree);
                        break;
                    case R.id.ic_backup:
                        Intent intentFour= new Intent(ActivityOne.this, ActivityFour.class);
                        startActivity(intentFour);
                        break;
                }
                return false;
            }
        });
    }
}
