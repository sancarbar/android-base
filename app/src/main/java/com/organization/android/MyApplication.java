package com.organization.android;

import android.app.Application;
import com.organization.android.inject.ContextModule;
import com.organization.android.inject.MainModule;
import dagger.ObjectGraph;

/**
 * @author Santiago Carrillo
 */
public class MyApplication
    extends Application
{
    private ObjectGraph graph;

    @Override
    public void onCreate()
    {
        super.onCreate();
        graph = ObjectGraph.create( getMainModule(), new ContextModule( this ) );
    }

    protected Object getMainModule()
    {
        return new MainModule();
    }

    public void inject( Object objectToInject )
    {
        graph.inject( objectToInject );
    }

    protected void setObjectGraph( ObjectGraph graph )
    {
        this.graph = graph;
    }

}
