package com.test.material_design_test.app;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    // test 123456
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        getActionBar().hide();
    }
}
