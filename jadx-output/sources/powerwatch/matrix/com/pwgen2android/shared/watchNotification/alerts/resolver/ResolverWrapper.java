package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: WhiteListResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;", "", "postedResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;", "dismissedResolver", "appInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;)V", "getAppInfo", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "getDismissedResolver", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;", "getPostedResolver", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ResolverWrapper {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived dismissedResolver;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived postedResolver;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper copy$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper resolverWrapper, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onNotificationReceived = resolverWrapper.postedResolver;
        }
        if ((i & 2) != 0) {
            onNotificationReceived2 = resolverWrapper.dismissedResolver;
        }
        if ((i & 4) != 0) {
            appInfo = resolverWrapper.appInfo;
        }
        return resolverWrapper.copy(onNotificationReceived, onNotificationReceived2, appInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived getPostedResolver() {
        return this.postedResolver;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived getDismissedResolver() {
        return this.dismissedResolver;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper copy(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived postedResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived dismissedResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postedResolver, "postedResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissedResolver, "dismissedResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(postedResolver, dismissedResolver, appInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper resolverWrapper = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.postedResolver, resolverWrapper.postedResolver) && kotlin.jvm.internal.Intrinsics.areEqual(this.dismissedResolver, resolverWrapper.dismissedResolver) && kotlin.jvm.internal.Intrinsics.areEqual(this.appInfo, resolverWrapper.appInfo);
    }

    public int hashCode() {
        return (((this.postedResolver.hashCode() * 31) + this.dismissedResolver.hashCode()) * 31) + this.appInfo.hashCode();
    }

    public java.lang.String toString() {
        return "ResolverWrapper(postedResolver=" + this.postedResolver + ", dismissedResolver=" + this.dismissedResolver + ", appInfo=" + this.appInfo + ')';
    }

    public ResolverWrapper(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived postedResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived dismissedResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postedResolver, "postedResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissedResolver, "dismissedResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        this.postedResolver = postedResolver;
        this.dismissedResolver = dismissedResolver;
        this.appInfo = appInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived getPostedResolver() {
        return this.postedResolver;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived getDismissedResolver() {
        return this.dismissedResolver;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo getAppInfo() {
        return this.appInfo;
    }
}
