
package com.example.customsalessquad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private SlidePageAdapter slidePageAdapter;
    private PagerAdapter pagerAdapter;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.a1:
                startActivity(new Intent(MainActivity.this,ActivtiyForMenu.class));
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a2:
                Toast.makeText(this, "Change Password", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a3:
                Toast.makeText(this, "Ask Perimission", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a4:
                Toast.makeText(this, "Ask us a Question", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a5:
                Toast.makeText(this, "Help Center", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a6:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a7:
                Toast.makeText(this, "status Page", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a8:
                Toast.makeText(this, "change Log", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a9:
                Toast.makeText(this, "Terms & Conditions", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a10:
                Toast.makeText(this, "Privacy Policy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a11:
                Toast.makeText(this, "help videos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a12:
                Toast.makeText(this, "About us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a13:
                Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
                break;
            case R.id.a14:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ActionBar actionBar =(ActionBar) findViewById(R.id.actionbar);


        List<Fragment> list=new ArrayList<>();
         list.add(new Screen_one());
        list.add(new Screen_two());


        viewPager=findViewById(R.id.viewPager);
        pagerAdapter= new SlidePageAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);

    }
}