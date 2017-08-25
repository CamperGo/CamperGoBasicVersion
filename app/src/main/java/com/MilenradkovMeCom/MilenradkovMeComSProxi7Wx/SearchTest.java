package com.MilenradkovMeCom.MilenradkovMeComSProxi7Wx;

import com.MilenradkovMeCom.MilenradkovMeComSProxi7Wx.estimote.ProximityContentManager;

/**
 * Created by milenradkov on 8/25/17.
 */

public class SearchTest implements Runnable  {
    private ProximityContentManager proximityContentManager;

    public void setProximityContentManager(ProximityContentManager manager) {
        this.proximityContentManager = manager;
    }

    @Override
    public void run() {
        this.proximityContentManager.startContentUpdates();

    }
}
