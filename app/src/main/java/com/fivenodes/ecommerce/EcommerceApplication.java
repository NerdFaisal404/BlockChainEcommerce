package com.fivenodes.ecommerce;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

/**
 * Created by W3E16 on 11/20/2017.
 */

public class EcommerceApplication extends MultiDexApplication {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();

    }
}
