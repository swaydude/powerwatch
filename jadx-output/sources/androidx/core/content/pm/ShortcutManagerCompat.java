package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {
    static final java.lang.String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    static final java.lang.String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    private ShortcutManagerCompat() {
    }

    public static boolean isRequestPinShortcutSupported(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(context, INSTALL_SHORTCUT_PERMISSION) != 0) {
            return false;
        }
        java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new android.content.Intent(ACTION_INSTALL_SHORTCUT), 0).iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().activityInfo.permission;
            if (android.text.TextUtils.isEmpty(str) || INSTALL_SHORTCUT_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean requestPinShortcut(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat, final android.content.IntentSender intentSender) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }
        android.content.Intent intentAddToIntent = shortcutInfoCompat.addToIntent(new android.content.Intent(ACTION_INSTALL_SHORTCUT));
        if (intentSender == null) {
            context.sendBroadcast(intentAddToIntent);
            return true;
        }
        context.sendOrderedBroadcast(intentAddToIntent, null, new android.content.BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (android.content.IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static android.content.Intent createShortcutResultIntent(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        android.content.Intent intentCreateShortcutResultIntent = android.os.Build.VERSION.SDK_INT >= 26 ? ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new android.content.Intent();
        }
        return shortcutInfoCompat.addToIntent(intentCreateShortcutResultIntent);
    }

    public static boolean addDynamicShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(list);
        return true;
    }

    public static int getMaxShortcutCountPerActivity(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.List<android.content.pm.ShortcutInfo> dynamicShortcuts = ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getDynamicShortcuts();
            java.util.ArrayList arrayList = new java.util.ArrayList(dynamicShortcuts.size());
            java.util.Iterator<android.content.pm.ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new androidx.core.content.pm.ShortcutInfoCompat.Builder(context, it.next()).build());
            }
            return arrayList;
        }
        try {
            return getShortcutInfoSaverInstance(context).getShortcuts();
        } catch (java.lang.Exception unused) {
            return new java.util.ArrayList();
        }
    }

    public static boolean updateShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(list);
        return true;
    }

    public void removeDynamicShortcuts(android.content.Context context, java.util.List<java.lang.String> list) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
    }

    public static void removeAllDynamicShortcuts(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver getShortcutInfoSaverInstance(android.content.Context context) {
        if (sShortcutInfoCompatSaver == null) {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                try {
                    sShortcutInfoCompatSaver = (androidx.core.content.pm.ShortcutInfoCompatSaver) java.lang.Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, androidx.core.content.pm.ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context);
                } catch (java.lang.Exception unused) {
                }
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new androidx.core.content.pm.ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }
}
