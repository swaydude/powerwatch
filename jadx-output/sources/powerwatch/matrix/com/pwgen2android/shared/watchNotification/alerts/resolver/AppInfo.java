package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: OtherAppsResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "", "appName", "", "packageName", "appInfoType", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;)V", "getAppInfoType", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "getAppName", "()Ljava/lang/String;", "getPackageName", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AppInfo {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType appInfoType;
    private final java.lang.String appName;
    private final java.lang.String packageName;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo copy$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType appInfoType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.appName;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.packageName;
        }
        if ((i & 4) != 0) {
            appInfoType = appInfo.appInfoType;
        }
        return appInfo.copy(str, str2, appInfoType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType getAppInfoType() {
        return this.appInfoType;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo copy(java.lang.String appName, java.lang.String packageName, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType appInfoType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfoType, "appInfoType");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(appName, packageName, appInfoType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appName, appInfo.appName) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, appInfo.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.appInfoType, appInfo.appInfoType);
    }

    public int hashCode() {
        return (((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.appInfoType.hashCode();
    }

    public java.lang.String toString() {
        return "AppInfo(appName=" + this.appName + ", packageName=" + this.packageName + ", appInfoType=" + this.appInfoType + ')';
    }

    public AppInfo(java.lang.String appName, java.lang.String packageName, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType appInfoType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfoType, "appInfoType");
        this.appName = appName;
        this.packageName = packageName;
        this.appInfoType = appInfoType;
    }

    public /* synthetic */ AppInfo(java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.Whitelist whitelist, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.Whitelist.INSTANCE : whitelist);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType getAppInfoType() {
        return this.appInfoType;
    }

    public final java.lang.String getAppName() {
        return this.appName;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }
}
