package com.MilenradkovMeCom.MilenradkovMeComSProxi7Wx;

import android.app.Application;

import com.estimote.coresdk.common.config.EstimoteSDK;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "milenradkov-me-com-s-proxi-7wx", "88bc874c06700f408c8c531da34a73d7");

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
}
