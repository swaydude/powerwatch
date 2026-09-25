package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type;

/* JADX INFO: compiled from: NotificationTypeController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeControllerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;", "()V", "localMemory", "", "", "", "notificationAppsMap", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", "Lio/reactivex/subjects/ReplaySubject;", "clearMemory", "", "enableApp", "appIdentifier", "enable", "appType", "flushMemory", "getSupportedApps", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;", "activityContext", "Landroid/content/Context;", "isAppEnabled", "listenForChange", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationTypeControllerImpl implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController {
    private final java.util.Map<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType, io.reactivex.subjects.ReplaySubject<java.lang.Boolean>> notificationAppsMap = kotlin.collections.MapsKt.mapOf(new kotlin.Pair(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE, io.reactivex.subjects.ReplaySubject.createWithSize(1)), new kotlin.Pair(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE, io.reactivex.subjects.ReplaySubject.createWithSize(1)));
    private final java.util.Map<java.lang.String, java.lang.Boolean> localMemory = new java.util.LinkedHashMap();

    public final void flushMemory() {
        for (java.util.Map.Entry<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType, io.reactivex.subjects.ReplaySubject<java.lang.Boolean>> entry : this.notificationAppsMap.entrySet()) {
            if (this.localMemory.containsKey(entry.getKey().getLabel())) {
                io.reactivex.subjects.ReplaySubject<java.lang.Boolean> value = entry.getValue();
                java.lang.Boolean bool = this.localMemory.get(entry.getKey().getLabel());
                value.onNext(java.lang.Boolean.valueOf(bool == null ? false : bool.booleanValue()));
            }
        }
        this.localMemory.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public void clearMemory() {
        this.localMemory.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public boolean isAppEnabled(java.lang.String appIdentifier) {
        java.lang.Object next;
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentifier, "appIdentifier");
        if (this.localMemory.containsKey(appIdentifier)) {
            java.lang.Boolean bool2 = this.localMemory.get(appIdentifier);
            if (bool2 == null) {
                return false;
            }
            return bool2.booleanValue();
        }
        java.util.Iterator<T> it = this.notificationAppsMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType) ((java.util.Map.Entry) next).getKey()).getLabel(), appIdentifier));
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        io.reactivex.subjects.ReplaySubject replaySubject = entry != null ? (io.reactivex.subjects.ReplaySubject) entry.getValue() : null;
        if (replaySubject == null || (bool = (java.lang.Boolean) replaySubject.getValue()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public boolean isAppEnabled(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType appType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appType, "appType");
        return isAppEnabled(appType.getLabel());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public void enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType appType, boolean enable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appType, "appType");
        this.localMemory.put(appType.getLabel(), java.lang.Boolean.valueOf(enable));
        io.reactivex.subjects.ReplaySubject<java.lang.Boolean> replaySubject = this.notificationAppsMap.get(appType);
        if (replaySubject == null) {
            return;
        }
        replaySubject.onNext(java.lang.Boolean.valueOf(enable));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public void enableApp(java.lang.String appIdentifier, boolean enable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentifier, "appIdentifier");
        this.localMemory.put(appIdentifier, java.lang.Boolean.valueOf(enable));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public io.reactivex.Observable<java.lang.Boolean> listenForChange(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType appType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appType, "appType");
        io.reactivex.Observable<java.lang.Boolean> observableJust = this.notificationAppsMap.get(appType);
        if (observableJust == null) {
            observableJust = io.reactivex.Observable.just(false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(false)");
        }
        return observableJust;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController
    public java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationApp> getSupportedApps(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        java.util.Set<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType> setKeySet = this.notificationAppsMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType notificationAppType : setKeySet) {
            java.lang.String string = activityContext.getString(notificationAppType.getTitleResourceId());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(it.titleResourceId)");
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationApp(notificationAppType, string, null, 4, null));
        }
        return arrayList;
    }
}
