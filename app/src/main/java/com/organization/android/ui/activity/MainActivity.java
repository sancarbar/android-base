package com.organization.android.ui.activity;

import android.os.Bundle;
import com.organization.android.R;

/**
 * @author Santiago Carrillo
 */
public class MainActivity
    extends BaseActivity
{

    @Override
    protected int getContentLayout()
    {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        System.out.print( "" );
    }
}
