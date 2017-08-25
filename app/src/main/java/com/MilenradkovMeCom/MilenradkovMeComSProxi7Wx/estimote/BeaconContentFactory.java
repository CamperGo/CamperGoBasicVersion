package com.MilenradkovMeCom.MilenradkovMeComSProxi7Wx.estimote;

public interface BeaconContentFactory {

    void getContent(BeaconID beaconID, Callback callback);

    interface Callback {
        void onContentReady(Object content);
    }
}
