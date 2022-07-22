package com.example.shoebill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements LoginScreen.ILoginListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Request Window Feature //
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().add(R.id.fragment, LoginScreen.newInstance(), "fragment").addToBackStack(null).commit();
    }


    @Override
    public void successfulLogin() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, LandingPageFragment.newInstance("",""), "fragment").addToBackStack(null).commit();
    }
}