package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: OtherAppsResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0006\u0010\u0015\u001a\u00020\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u0012R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "thirdPartyAppStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;)V", "appList", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "localMemory", "", "", "", "appNameLookup", "packageName", "clearLocalMemory", "", "enableApp", "enable", "flushMemory", "getAppInfo", "", "activityContext", "isAppEnabled", "isAppSupported", "notification", "Landroid/service/notification/StatusBarNotification;", "resolveAppNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "notificationEventType", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OtherAppsResolver implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo> appList;
    private final android.content.Context context;
    private final java.util.Map<java.lang.String, java.lang.Boolean> localMemory;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage thirdPartyAppStorage;

    public OtherAppsResolver(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage thirdPartyAppStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thirdPartyAppStorage, "thirdPartyAppStorage");
        this.context = context;
        this.thirdPartyAppStorage = thirdPartyAppStorage;
        this.localMemory = new java.util.LinkedHashMap();
        this.appList = new java.util.ArrayList();
        update();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper
    public void enableCallsApp(boolean z, boolean z2) {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper.DefaultImpls.enableCallsApp(this, z, z2);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolver
    public boolean shouldResolve(android.service.notification.StatusBarNotification statusBarNotification) {
        return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper.DefaultImpls.shouldResolve(this, statusBarNotification);
    }

    public final void clearLocalMemory() {
        this.localMemory.clear();
    }

    public final void flushMemory() {
        for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : this.localMemory.entrySet()) {
            this.thirdPartyAppStorage.setThirdPartAppEnabled(entry.getKey(), entry.getValue().booleanValue(), this.context);
        }
        this.localMemory.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController
    public void enableApp(java.lang.String packageName, boolean enable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.localMemory.put(packageName, java.lang.Boolean.valueOf(enable));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController
    public java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo> getAppInfo(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        return kotlin.collections.CollectionsKt.toList(this.appList);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolver
    public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAppNotification(android.service.notification.StatusBarNotification notification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType notificationEventType) {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState sMSState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationEventType, "notificationEventType");
        if (kotlin.jvm.internal.Intrinsics.areEqual(notificationEventType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.POSTED.INSTANCE)) {
            sMSState = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(notificationEventType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.DISMISSED.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            sMSState = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED;
        }
        return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(notification, sMSState, this.context);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController
    public boolean isAppEnabled(java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!this.localMemory.containsKey(packageName)) {
            return this.thirdPartyAppStorage.isAppNotificationEnabled(this.context, packageName, false);
        }
        java.lang.Boolean bool = this.localMemory.get(packageName);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x002e A[ORIG_RETURN, RETURN] */
    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper
    public boolean isAppSupported(android.service.notification.StatusBarNotification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
        for (java.lang.Object obj : this.appList) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo) obj).getPackageName(), notification.getPackageName())) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final void update() {
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        java.util.List<android.content.pm.ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(installedApplications, "packageManager.getInstalledApplications(0)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = installedApplications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            android.content.pm.ApplicationInfo applicationInfo = (android.content.pm.ApplicationInfo) next;
            if ((applicationInfo.flags & 1) == 0 && !kotlin.jvm.internal.Intrinsics.areEqual(applicationInfo.packageName, "powerwatch.matrix.com.pwgen2android")) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList<android.content.pm.ApplicationInfo> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (android.content.pm.ApplicationInfo applicationInfo2 : arrayList2) {
            java.lang.String string = applicationInfo2.loadLabel(packageManager).toString();
            java.lang.String str = applicationInfo2.packageName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "it.packageName");
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string, str, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherApp.INSTANCE));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList3) {
            if (!kotlin.text.StringsKt.isBlank(((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo) obj).getAppName())) {
                arrayList4.add(obj);
            }
        }
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList4, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver$update$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.String appName = ((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo) t).getAppName();
                java.util.Objects.requireNonNull(appName, "null cannot be cast to non-null type java.lang.String");
                java.lang.String lowerCase = appName.toLowerCase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                java.lang.String appName2 = ((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo) t2).getAppName();
                java.util.Objects.requireNonNull(appName2, "null cannot be cast to non-null type java.lang.String");
                java.lang.String lowerCase2 = appName2.toLowerCase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                return kotlin.comparisons.ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        });
        this.appList.clear();
        this.appList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) listSortedWith);
    }

    public final java.lang.String appNameLookup(android.content.Context context, java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(packageName, 0)");
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("AppsHelper", kotlin.jvm.internal.Intrinsics.stringPlus("Could not resolve name ", packageName), e);
            return null;
        }
    }
}
