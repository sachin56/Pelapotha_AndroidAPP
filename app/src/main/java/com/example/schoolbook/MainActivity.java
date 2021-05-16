package com.example.schoolbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation=findViewById(R.id.bottom_navigation);


        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_notifications_active_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_dashboard));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_baseline_info));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment=null;

                switch (item.getId())
                {
                    case 1:
                        fragment=new NotificationFragment();
                        break;
                    case 2:
                        fragment=new HomeFragment();
                        break;
                    case 3:
                        fragment=new InfoFragment();
                        break;
                    case 4:
                        fragment=new AboutFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });

        bottomNavigation.setCount(1,"10");
        bottomNavigation.show(2,true);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext()
                ,"you clicked"+item.getId()
                ,Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext()
                        ,"you Reselect"+item.getId()
                        ,Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }


}