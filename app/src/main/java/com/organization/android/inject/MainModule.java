package com.organization.android.inject;

/**
 * @author Santiago Carrillo
 */

import android.content.Context;
import com.organization.android.storage.Storage;
import com.organization.android.ui.activity.BaseActivity;
import com.organization.android.ui.activity.MainActivity;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module( injects = { BaseActivity.class, MainActivity.class }, includes = ContextModule.class )
public class MainModule
{

    @Provides
    @Singleton
    public Storage getStorage( Context context )
    {
        return new Storage( context );
    }

}
