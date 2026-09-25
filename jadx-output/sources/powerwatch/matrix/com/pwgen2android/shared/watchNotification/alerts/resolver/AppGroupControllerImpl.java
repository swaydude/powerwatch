package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: ResolverContainer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppGroupControllerImpl;", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;", "otherAppsResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;", "whiteListResolver", "notificationTypeController", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;)V", "otherAppsListGroupList", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;", "enableAllApps", "", "enable", "", "enableApp", "appInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "getAppGroups", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", "", "activityContext", "Landroid/content/Context;", "isAppEnabled", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppGroupControllerImpl implements powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController;
    private java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState> otherAppsListGroupList;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController otherAppsResolver;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController whiteListResolver;

    public AppGroupControllerImpl(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController otherAppsResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController whiteListResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherAppsResolver, "otherAppsResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whiteListResolver, "whiteListResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationTypeController, "notificationTypeController");
        this.otherAppsResolver = otherAppsResolver;
        this.whiteListResolver = whiteListResolver;
        this.notificationTypeController = notificationTypeController;
        this.otherAppsListGroupList = new java.util.ArrayList();
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController
    public java.util.Map<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> getAppGroups(android.content.Context activityContext) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.notification_types);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.notification_types)");
        powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.NonCollapsibleHeader nonCollapsibleHeader = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.NonCollapsibleHeader(string, 0);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationApp> supportedApps = this.notificationTypeController.getSupportedApps(activityContext);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedApps, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationApp notificationApp : supportedApps) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(notificationApp.getTitle(), notificationApp.getAppIdentifier(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.NotificationType.INSTANCE);
            arrayList.add(new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState(appInfo.getAppName(), appInfo, nonCollapsibleHeader.getHeaderIndex()));
        }
        linkedHashMap.put(nonCollapsibleHeader, arrayList);
        java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.supported_apps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.supported_apps)");
        powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState headerState = new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState(string2, false, 1);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo> appInfo2 = this.whiteListResolver.getAppInfo(activityContext);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(appInfo2, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo3 : appInfo2) {
            arrayList2.add(new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState(appInfo3.getAppName(), appInfo3, headerState.getHeaderIndex()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        linkedHashMap.put(headerState, arrayList3);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo> appInfo4 = this.otherAppsResolver.getAppInfo(activityContext);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(appInfo4, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo5 : appInfo4) {
            arrayList4.add(new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState(appInfo5.getAppName(), appInfo5, 2));
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList4) {
            powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState itemState = (powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState) obj;
            java.util.ArrayList arrayList6 = arrayList3;
            if (!(arrayList6 instanceof java.util.Collection) || !arrayList6.isEmpty()) {
                java.util.Iterator it = arrayList6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState) it.next()).getAppInfo().getPackageName(), itemState.getAppInfo().getPackageName())) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                arrayList5.add(obj);
            }
        }
        this.otherAppsListGroupList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList5);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string3 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.other_apps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "activityContext.getString(R.string.other_apps)");
        java.lang.String str = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.otherAppsListGroupList.size())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        linkedHashMap.put(new powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState(str, false, 2), this.otherAppsListGroupList);
        return linkedHashMap;
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController
    public boolean isAppEnabled(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType appInfoType = appInfo.getAppInfoType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.NotificationType.INSTANCE)) {
            return this.notificationTypeController.isAppEnabled(appInfo.getPackageName());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.Whitelist.INSTANCE)) {
            return this.whiteListResolver.isAppEnabled(appInfo.getPackageName());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherApp.INSTANCE) ? true : kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherAppMasterSwitch.INSTANCE)) {
            return this.otherAppsResolver.isAppEnabled(appInfo.getPackageName());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppGroupController
    public void enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, boolean enable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType appInfoType = appInfo.getAppInfoType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.NotificationType.INSTANCE)) {
            this.notificationTypeController.enableApp(appInfo.getPackageName(), enable);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.Whitelist.INSTANCE)) {
            this.whiteListResolver.enableApp(appInfo.getPackageName(), enable);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherApp.INSTANCE)) {
            this.otherAppsResolver.enableApp(appInfo.getPackageName(), enable);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(appInfoType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherAppMasterSwitch.INSTANCE)) {
            this.otherAppsResolver.enableApp(appInfo.getPackageName(), enable);
            enableAllApps(enable);
        }
    }

    private final void enableAllApps(boolean enable) {
        java.util.Iterator<T> it = this.otherAppsListGroupList.iterator();
        while (it.hasNext()) {
            this.otherAppsResolver.enableApp(((powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState) it.next()).getAppInfo().getPackageName(), enable);
        }
    }
}
