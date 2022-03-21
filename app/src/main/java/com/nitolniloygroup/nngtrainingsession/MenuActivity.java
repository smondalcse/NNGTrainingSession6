package com.nitolniloygroup.nngtrainingsession;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.nitolniloygroup.nngtrainingsession.model.Employees;

public class MenuActivity extends AppCompatActivity {
    private static final String TAG = "MenuActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle bundle = getIntent().getExtras();
        Employees emps = (Employees) bundle.getSerializable("employees");
        Log.i(TAG, "onCreate: " + emps.getLoginTraining().get(0).getUserName());

    }
}