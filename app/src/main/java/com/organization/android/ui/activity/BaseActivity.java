package com.organization.android.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import com.organization.android.MyApplication;
import com.organization.android.storage.Storage;

import javax.inject.Inject;

/**
 * @author Santiago Carrillo
 */
public abstract class BaseActivity
    extends Activity
{

    @Inject
    Storage storage;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );

        ( (MyApplication) getApplication() ).inject( this );
        setContentView( getContentLayout() );

    }

    protected abstract
    @LayoutRes
    int getContentLayout();


}
