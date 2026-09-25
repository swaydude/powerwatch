package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sLock = new java.lang.Object();
    private static android.util.TypedValue sTempValue;

    protected ContextCompat() {
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static java.io.File getDataDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        java.lang.String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new java.io.File(str);
        }
        return null;
    }

    public static java.io.File[] getObbDirs(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? context.getObbDirs() : new java.io.File[]{context.getObbDir()};
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? context.getExternalFilesDirs(str) : new java.io.File[]{context.getExternalFilesDir(str)};
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? context.getExternalCacheDirs() : new java.io.File[]{context.getExternalCacheDir()};
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        int i2;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (sLock) {
            if (sTempValue == null) {
                sTempValue = new android.util.TypedValue();
            }
            context.getResources().getValue(i, sTempValue, true);
            i2 = sTempValue.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static int getColor(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("permission is null");
        }
        return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return createFilesDir(new java.io.File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static java.io.File getCodeCacheDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir();
        }
        return createFilesDir(new java.io.File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    private static synchronized java.io.File createFilesDir(java.io.File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        if (file.exists()) {
            return file;
        }
        android.util.Log.w(TAG, "Unable to create files subdir " + file.getPath());
        return null;
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    public static boolean isDeviceProtectedStorage(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        return new androidx.core.content.ContextCompat.MainHandlerExecutor(new android.os.Handler(context.getMainLooper()));
    }

    private static class MainHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        MainHandlerExecutor(android.os.Handler handler) {
            this.mHandler = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (this.mHandler.post(runnable)) {
                return;
            }
            throw new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
        }
    }

    public static void startForegroundService(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return (T) context.getSystemService(cls);
        }
        java.lang.String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getSystemServiceName(cls);
        }
        return androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES.get(cls);
    }

    private static final class LegacyServiceMapHolder {
        static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES;

        private LegacyServiceMapHolder() {
        }

        static {
            java.util.HashMap<java.lang.Class<?>, java.lang.String> map = new java.util.HashMap<>();
            SERVICES = map;
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                map.put(android.telephony.SubscriptionManager.class, "telephony_subscription_service");
                map.put(android.app.usage.UsageStatsManager.class, "usagestats");
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                map.put(android.appwidget.AppWidgetManager.class, "appwidget");
                map.put(android.os.BatteryManager.class, "batterymanager");
                map.put(android.hardware.camera2.CameraManager.class, "camera");
                map.put(android.app.job.JobScheduler.class, "jobscheduler");
                map.put(android.content.pm.LauncherApps.class, "launcherapps");
                map.put(android.media.projection.MediaProjectionManager.class, "media_projection");
                map.put(android.media.session.MediaSessionManager.class, "media_session");
                map.put(android.content.RestrictionsManager.class, "restrictions");
                map.put(android.telecom.TelecomManager.class, "telecom");
                map.put(android.media.tv.TvInputManager.class, "tv_input");
            }
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                map.put(android.app.AppOpsManager.class, "appops");
                map.put(android.view.accessibility.CaptioningManager.class, "captioning");
                map.put(android.hardware.ConsumerIrManager.class, "consumer_ir");
                map.put(android.print.PrintManager.class, "print");
            }
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                map.put(android.bluetooth.BluetoothManager.class, "bluetooth");
            }
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                map.put(android.hardware.display.DisplayManager.class, "display");
                map.put(android.os.UserManager.class, "user");
            }
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                map.put(android.hardware.input.InputManager.class, "input");
                map.put(android.media.MediaRouter.class, "media_router");
                map.put(android.net.nsd.NsdManager.class, "servicediscovery");
            }
            map.put(android.view.accessibility.AccessibilityManager.class, "accessibility");
            map.put(android.accounts.AccountManager.class, "account");
            map.put(android.app.ActivityManager.class, "activity");
            map.put(android.app.AlarmManager.class, androidx.core.app.NotificationCompat.CATEGORY_ALARM);
            map.put(android.media.AudioManager.class, "audio");
            map.put(android.content.ClipboardManager.class, "clipboard");
            map.put(android.net.ConnectivityManager.class, "connectivity");
            map.put(android.app.admin.DevicePolicyManager.class, "device_policy");
            map.put(android.app.DownloadManager.class, "download");
            map.put(android.os.DropBoxManager.class, "dropbox");
            map.put(android.view.inputmethod.InputMethodManager.class, "input_method");
            map.put(android.app.KeyguardManager.class, "keyguard");
            map.put(android.view.LayoutInflater.class, "layout_inflater");
            map.put(android.location.LocationManager.class, com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
            map.put(android.nfc.NfcManager.class, "nfc");
            map.put(android.app.NotificationManager.class, "notification");
            map.put(android.os.PowerManager.class, "power");
            map.put(android.app.SearchManager.class, com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH);
            map.put(android.hardware.SensorManager.class, "sensor");
            map.put(android.os.storage.StorageManager.class, "storage");
            map.put(android.telephony.TelephonyManager.class, "phone");
            map.put(android.view.textservice.TextServicesManager.class, "textservices");
            map.put(android.app.UiModeManager.class, "uimode");
            map.put(android.hardware.usb.UsbManager.class, "usb");
            map.put(android.os.Vibrator.class, "vibrator");
            map.put(android.app.WallpaperManager.class, "wallpaper");
            map.put(android.net.wifi.p2p.WifiP2pManager.class, "wifip2p");
            map.put(android.net.wifi.WifiManager.class, "wifi");
            map.put(android.view.WindowManager.class, "window");
        }
    }
}
