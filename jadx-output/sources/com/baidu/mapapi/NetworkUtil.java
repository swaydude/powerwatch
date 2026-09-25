package com.baidu.mapapi;

/* JADX INFO: loaded from: classes.dex */
public class NetworkUtil {
    public static android.net.NetworkInfo getActiveNetworkInfo(android.content.Context context) {
        try {
            return ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    public static java.lang.String getCurrentNetMode(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        int i = 1;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() != 1) {
                switch (((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 1:
                    case 2:
                        i = 6;
                        break;
                    case 3:
                    case 9:
                    case 10:
                    case 15:
                        i = 9;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 12:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                    case 11:
                        i = 2;
                        break;
                    case 13:
                        i = 4;
                        break;
                    case 14:
                        i = 10;
                        break;
                    default:
                        i = 0;
                        break;
                }
            }
        } else {
            i = 0;
        }
        return java.lang.Integer.toString(i);
    }

    public static boolean initConnectState() {
        return true;
    }

    public static boolean isNetworkAvailable(android.content.Context context) {
        try {
            if (isWifiConnected(context)) {
                return true;
            }
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean isWifiConnected(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && 1 == activeNetworkInfo.getType() && activeNetworkInfo.isConnected();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    public static boolean isWifiConnected(android.net.NetworkInfo networkInfo) {
        boolean z;
        if (networkInfo != null) {
            try {
                z = 1 == networkInfo.getType() && networkInfo.isConnected();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return z;
    }

    public static void updateNetworkProxy(android.content.Context context) {
        com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable.getInstance().updateNetworkProxy(context);
    }
}
