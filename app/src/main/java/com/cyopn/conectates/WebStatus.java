package com.cyopn.conectates;

import android.content.Context;
import android.net.ConnectivityManager;

public class WebStatus {
    public static boolean checkStatus(Context ctx) {
        ConnectivityManager cn_ma = (ConnectivityManager) ctx.getSystemService((Context.CONNECTIVITY_SERVICE));

        return (cn_ma.getActiveNetworkInfo() != null
                && cn_ma.getActiveNetworkInfo().isAvailable()
                && cn_ma.getActiveNetworkInfo().isConnected());
    }
}
