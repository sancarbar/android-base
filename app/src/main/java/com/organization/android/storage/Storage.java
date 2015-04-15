package com.organization.android.storage;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author Santiago Carrillo
 */
public class Storage
{

    private static final String PREFS_NAME = "NATIVO_DIGITAL_PREFS";

    final SharedPreferences settings;

    public Storage( Context context )
    {
        this.settings = context.getSharedPreferences( PREFS_NAME, 0 );
    }

    public void saveSecure( String key, String value )
    {
        settings.edit().putString( key, value ).commit();
    }

    public String getValue( String key )
    {
        return settings.getString( key, null );
    }
}
