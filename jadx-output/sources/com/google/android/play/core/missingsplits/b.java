package com.google.android.play.core.missingsplits;

/* JADX INFO: loaded from: classes2.dex */
final class b implements com.google.android.play.core.missingsplits.MissingSplitsManager {
    private static final com.google.android.play.core.splitcompat.a a = new com.google.android.play.core.splitcompat.a("MissingSplitsManagerImpl");
    private final android.content.Context b;
    private final java.lang.Runtime c;
    private final com.google.android.play.core.missingsplits.a d;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> e;

    b(android.content.Context context, java.lang.Runtime runtime, com.google.android.play.core.missingsplits.a aVar, java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> atomicReference) {
        this.b = context;
        this.c = runtime;
        this.d = aVar;
        this.e = atomicReference;
    }

    private final boolean a() {
        try {
            android.content.pm.ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
            return (applicationInfo == null || applicationInfo.metaData == null || !java.lang.Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"))) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            a.c("App '%s' is not found in the PackageManager", this.b.getPackageName());
            return false;
        }
    }

    private final boolean a(android.content.ComponentName componentName) {
        java.lang.String className = componentName.getClassName();
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(className);
            while (cls != null) {
                if (cls.equals(android.app.Activity.class)) {
                    return true;
                }
                java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
                cls = superclass != cls ? superclass : null;
            }
            return false;
        } catch (java.lang.ClassNotFoundException unused) {
            a.c("ClassNotFoundException when scanning class hierarchy of '%s'", className);
            try {
                return this.b.getPackageManager().getActivityInfo(componentName, 0) != null;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            }
        }
    }

    private final java.util.Set<java.lang.String> b() {
        try {
            android.content.pm.PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0);
            java.util.HashSet hashSet = new java.util.HashSet();
            if (packageInfo != null && packageInfo.splitNames != null) {
                java.util.Collections.addAll(hashSet, packageInfo.splitNames);
            }
            return hashSet;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            a.c("App '%s' is not found in PackageManager", this.b.getPackageName());
            return java.util.Collections.emptySet();
        }
    }

    private final java.util.List<android.app.ActivityManager.AppTask> c() {
        java.util.List<android.app.ActivityManager.AppTask> appTasks = ((android.app.ActivityManager) this.b.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : java.util.Collections.emptyList();
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean disableAppIfMissingRequiredSplits() {
        boolean z;
        boolean z2;
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (!isMissingRequiredSplits()) {
            if (this.d.a()) {
                this.d.c();
                this.c.exit(0);
            }
            return false;
        }
        java.util.Iterator<android.app.ActivityManager.AppTask> it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            android.app.ActivityManager.AppTask next = it.next();
            if (next.getTaskInfo() != null && next.getTaskInfo().baseIntent != null && next.getTaskInfo().baseIntent.getComponent() != null) {
                if (com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class.getName().equals(next.getTaskInfo().baseIntent.getComponent().getClassName())) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            java.util.Iterator<android.app.ActivityManager.AppTask> it2 = c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                android.app.ActivityManager.RecentTaskInfo taskInfo = it2.next().getTaskInfo();
                if ((taskInfo == null || taskInfo.baseIntent == null || taskInfo.baseIntent.getComponent() == null || !a(taskInfo.baseIntent.getComponent())) ? false : true) {
                    z2 = true;
                    break;
                }
            }
            this.d.b();
            java.util.Iterator<android.app.ActivityManager.AppTask> it3 = c().iterator();
            while (it3.hasNext()) {
                it3.next().finishAndRemoveTask();
            }
            if (z2) {
                this.b.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(this.b, (java.lang.Class<?>) com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class), 1, 1);
                this.b.startActivity(new android.content.Intent(this.b, (java.lang.Class<?>) com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class).addFlags(884998144));
            }
            this.c.exit(0);
        }
        return true;
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean isMissingRequiredSplits() {
        boolean zBooleanValue;
        synchronized (this.e) {
            if (this.e.get() == null) {
                java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> atomicReference = this.e;
                boolean z = false;
                if (android.os.Build.VERSION.SDK_INT >= 21 && a()) {
                    java.util.Set<java.lang.String> setEmptySet = android.os.Build.VERSION.SDK_INT < 21 ? java.util.Collections.emptySet() : b();
                    if (setEmptySet.isEmpty() || (setEmptySet.size() == 1 && setEmptySet.contains(""))) {
                        z = true;
                    }
                }
                atomicReference.set(java.lang.Boolean.valueOf(z));
            }
            zBooleanValue = this.e.get().booleanValue();
        }
        return zBooleanValue;
    }
}
