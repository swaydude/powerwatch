package com.baidu.mapsdkvi;

/* JADX INFO: loaded from: classes.dex */
public class VDeviceAPI {
    private static android.os.PowerManager.WakeLock a;
    private static android.content.BroadcastReceiver b;

    public static java.lang.String getAppVersion() {
        try {
            return com.baidu.mapsdkvi.b.a().getPackageManager().getPackageInfo(com.baidu.mapsdkvi.b.a().getApplicationInfo().packageName, 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static long getAvailableMemory() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.baidu.mapsdkvi.b.a().getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static java.lang.String getCachePath() {
        return android.os.Environment.getDataDirectory().getAbsolutePath();
    }

    public static int getCurrentNetworkType() {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) com.baidu.mapsdkvi.b.a().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 2;
        }
        return 3;
    }

    public static long getFreeSpace() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getRootDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static java.lang.String getModuleFileName() {
        return com.baidu.mapsdkvi.b.a().getFilesDir().getAbsolutePath();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024 A[RETURN] */
    public static com.baidu.mapsdkvi.c getNetworkInfo(int i) {
        int i2;
        android.net.NetworkInfo networkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.baidu.mapsdkvi.b.a().getSystemService("connectivity");
        if (i != 2) {
            if (i != 3) {
                networkInfo = null;
            } else {
                i2 = 0;
            }
            if (networkInfo != null) {
                return new com.baidu.mapsdkvi.c(networkInfo);
            }
            return null;
        }
        i2 = 1;
        networkInfo = connectivityManager.getNetworkInfo(i2);
        if (networkInfo != null) {
            return new com.baidu.mapsdkvi.c(networkInfo);
        }
        return null;
    }

    public static java.lang.String getOsVersion() {
        return "android";
    }

    public static int getScreenBrightness() {
        int i;
        android.content.ContentResolver contentResolver = com.baidu.mapsdkvi.b.a().getContentResolver();
        try {
            i = android.provider.Settings.System.getInt(contentResolver, "screen_brightness_mode");
        } catch (android.provider.Settings.SettingNotFoundException unused) {
            i = 0;
        }
        if (i == 1) {
            return -1;
        }
        try {
            return android.provider.Settings.System.getInt(contentResolver, "screen_brightness");
        } catch (android.provider.Settings.SettingNotFoundException unused2) {
            return -1;
        }
    }

    public static float getScreenDensity() {
        if (com.baidu.mapsdkvi.b.a() == null) {
            return 0.0f;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = (android.view.WindowManager) com.baidu.mapsdkvi.b.a().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.density;
    }

    public static int getScreenDensityDpi() {
        if (com.baidu.mapsdkvi.b.a() == null) {
            return 0;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = (android.view.WindowManager) com.baidu.mapsdkvi.b.a().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.densityDpi;
    }

    public static long getSdcardFreeSpace() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static java.lang.String getSdcardPath() {
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            return externalStorageDirectory.getAbsolutePath();
        }
        return null;
    }

    public static long getSdcardTotalSpace() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount())) / android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static float getSystemMetricsX() {
        if (com.baidu.mapsdkvi.b.a() == null) {
            return 0.0f;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = (android.view.WindowManager) com.baidu.mapsdkvi.b.a().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    public static float getSystemMetricsY() {
        if (com.baidu.mapsdkvi.b.a() == null) {
            return 0.0f;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = (android.view.WindowManager) com.baidu.mapsdkvi.b.a().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static long getTotalMemory() {
        long jIntValue = 0;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/meminfo"), 8192);
            java.lang.String line = bufferedReader.readLine();
            jIntValue = line != null ? java.lang.Integer.valueOf(line.split("\\s+")[1]).intValue() : 0L;
            bufferedReader.close();
        } catch (java.io.IOException unused) {
        }
        return jIntValue;
    }

    public static long getTotalSpace() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getRootDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount())) / android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static boolean isWifiConnected() {
        android.net.NetworkInfo networkInfo = ((android.net.ConnectivityManager) com.baidu.mapsdkvi.b.a().getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo == null) {
            return false;
        }
        return networkInfo.isConnected();
    }

    public static void makeCall(java.lang.String str) {
        com.baidu.mapsdkvi.b.a().startActivity(new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + str)));
    }

    public static native void onNetworkStateChanged();

    public static void openUrl(java.lang.String str) {
        com.baidu.mapsdkvi.b.a().startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
    }

    public static int sendMMS(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (!android.telephony.PhoneNumberUtils.isWellFormedSmsAddress(str)) {
            return 1;
        }
        try {
            java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(android.webkit.MimeTypeMap.getFileExtensionFromUrl(android.net.Uri.fromFile(new java.io.File(str4)).toString()));
            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
            intent.putExtra("address", str);
            intent.putExtra("subject", str2);
            intent.putExtra("sms_body", str3);
            intent.putExtra("android.intent.extra.STREAM", android.net.Uri.parse("file://" + str4));
            intent.setType(mimeTypeFromExtension);
            com.baidu.mapsdkvi.b.a().startActivity(intent);
            return 0;
        } catch (java.lang.Exception unused) {
            return 2;
        }
    }

    public static void sendSMS(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        com.baidu.mapsdkvi.b.a().startActivity(intent);
    }

    public static void setNetworkChangedCallback() {
        unsetNetworkChangedCallback();
        b = new com.baidu.mapsdkvi.a();
        com.baidu.mapsdkvi.b.a().registerReceiver(b, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static void setScreenAlwaysOn(boolean z) {
        if (z) {
            if (a == null) {
                a = ((android.os.PowerManager) com.baidu.mapsdkvi.b.a().getSystemService("power")).newWakeLock(10, "VDeviceAPI");
            }
            a.acquire();
        } else {
            android.os.PowerManager.WakeLock wakeLock = a;
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            a.release();
            a = null;
        }
    }

    public static void setupSoftware(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setDataAndType(android.net.Uri.fromFile(new java.io.File(str)), "application/vnd.android.package-archive");
        com.baidu.mapsdkvi.b.a().startActivity(intent);
    }

    public static void unsetNetworkChangedCallback() {
        if (b != null) {
            com.baidu.mapsdkvi.b.a().unregisterReceiver(b);
            b = null;
        }
    }
}
