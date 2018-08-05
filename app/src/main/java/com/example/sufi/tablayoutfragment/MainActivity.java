package com.example.sufi.tablayoutfragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.sufi.tablayoutfragment.adapter.ViewPagerAdapter;
import com.example.sufi.tablayoutfragment.fragment.CallFragment;
import com.example.sufi.tablayoutfragment.fragment.ChatFragment;
import com.example.sufi.tablayoutfragment.fragment.FavoritesFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorToolbar));
        setSupportActionBar(toolbar);
        setDataToViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setDataToViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ChatFragment(), "Chat");
        adapter.addFragment(new CallFragment(), "Call");
        adapter.addFragment(new FavoritesFragment(), "Favorites");
        adapter.addFragment(new ChatFragment(), "Chat");
        adapter.addFragment(new CallFragment(), "Call");
        adapter.addFragment(new FavoritesFragment(), "Favorites");
        viewPager.setAdapter(adapter);
    }
}
