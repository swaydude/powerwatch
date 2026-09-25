package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: HostInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "", "uuid", "", "appName", "platform", "appVersion", "model", "osVersion", "hostPermissions", "", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAppName", "()Ljava/lang/String;", "getAppVersion", "getHostPermissions", "()Ljava/util/List;", "getModel", "getOsVersion", "getPlatform", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Host {
    private final java.lang.String appName;
    private final java.lang.String appVersion;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> hostPermissions;
    private final java.lang.String model;
    private final java.lang.String osVersion;
    private final java.lang.String platform;
    private final java.lang.String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.host.Host copy$default(powerwatch.matrix.com.pwgen2android.shared.host.Host host, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = host.uuid;
        }
        if ((i & 2) != 0) {
            str2 = host.appName;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = host.platform;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = host.appVersion;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = host.model;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = host.osVersion;
        }
        java.lang.String str11 = str6;
        if ((i & 64) != 0) {
            list = host.hostPermissions;
        }
        return host.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> component7() {
        return this.hostPermissions;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.Host copy(java.lang.String uuid, java.lang.String appName, java.lang.String platform, java.lang.String appVersion, java.lang.String model, java.lang.String osVersion, java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> hostPermissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "uuid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        return new powerwatch.matrix.com.pwgen2android.shared.host.Host(uuid, appName, platform, appVersion, model, osVersion, hostPermissions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.host.Host)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.host.Host host = (powerwatch.matrix.com.pwgen2android.shared.host.Host) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uuid, host.uuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.appName, host.appName) && kotlin.jvm.internal.Intrinsics.areEqual(this.platform, host.platform) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, host.appVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, host.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, host.osVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.hostPermissions, host.hostPermissions);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.uuid.hashCode() * 31) + this.appName.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.model.hashCode()) * 31) + this.osVersion.hashCode()) * 31;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> list = this.hostPermissions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public java.lang.String toString() {
        return "Host(uuid=" + this.uuid + ", appName=" + this.appName + ", platform=" + this.platform + ", appVersion=" + this.appVersion + ", model=" + this.model + ", osVersion=" + this.osVersion + ", hostPermissions=" + this.hostPermissions + ')';
    }

    public Host(java.lang.String uuid, java.lang.String appName, java.lang.String platform, java.lang.String appVersion, java.lang.String model, java.lang.String osVersion, java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "uuid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.uuid = uuid;
        this.appName = appName;
        this.platform = platform;
        this.appVersion = appVersion;
        this.model = model;
        this.osVersion = osVersion;
        this.hostPermissions = list;
    }

    public final java.lang.String getUuid() {
        return this.uuid;
    }

    public final java.lang.String getAppName() {
        return this.appName;
    }

    public final java.lang.String getPlatform() {
        return this.platform;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Host(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str7;
        java.lang.String RELEASE;
        java.lang.String str8 = (i & 2) != 0 ? "PowerWatch2" : str2;
        java.lang.String str9 = (i & 4) != 0 ? "Android" : str3;
        java.lang.String str10 = (i & 8) != 0 ? powerwatch.matrix.com.pwgen2android.BuildConfig.VERSION_NAME : str4;
        if ((i & 16) != 0) {
            str7 = android.os.Build.MANUFACTURER + ' ' + ((java.lang.Object) android.os.Build.MODEL);
        } else {
            str7 = str5;
        }
        if ((i & 32) != 0) {
            RELEASE = android.os.Build.VERSION.RELEASE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        } else {
            RELEASE = str6;
        }
        this(str, str8, str9, str10, str7, RELEASE, (i & 64) != 0 ? null : list);
    }

    public final java.lang.String getModel() {
        return this.model;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> getHostPermissions() {
        return this.hostPermissions;
    }
}
