package com.example.actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityThree extends AppCompatActivity {
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        title = findViewById(R.id.activityThreeTitle);
        title.setText("This is ActivityThree");

        BottomNavigationView mBottomNavigationView = findViewById(R.id.bottomNavView_bar);

        Menu menu = mBottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.ic_arrow:
                        Intent intentMain= new Intent(ActivityThree.this, MainActivity.class);
                        startActivity(intentMain);
                        break;
                    case R.id.ic_android:
                        Intent intentOne= new Intent(ActivityThree.this, ActivityOne.class);
                        startActivity(intentOne);
                        break;
                    case R.id.ic_library:
                        Intent intentTwo= new Intent(ActivityThree.this, ActivityTwo.class);
                        startActivity(intentTwo);
                        break;
                    case R.id.ic_center:
                        Intent intentThree= new Intent(ActivityThree.this, ActivityThree.class);
                        startActivity(intentThree);
                        break;
                    case R.id.ic_backup:
                        Intent intentFour= new Intent(ActivityThree.this, ActivityFour.class);
                        startActivity(intentFour);
                        break;
                }
                return false;
            }
        });
    }
}
