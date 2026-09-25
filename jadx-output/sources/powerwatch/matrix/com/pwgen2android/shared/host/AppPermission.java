package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: AppPermissions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "permissionState", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPermissionState", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AppPermission {
    private final java.lang.String name;
    private final java.lang.String permissionState;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.host.AppPermission copy$default(powerwatch.matrix.com.pwgen2android.shared.host.AppPermission appPermission, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = appPermission.name;
        }
        if ((i & 2) != 0) {
            str2 = appPermission.permissionState;
        }
        return appPermission.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPermissionState() {
        return this.permissionState;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.AppPermission copy(java.lang.String name, java.lang.String permissionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(name, permissionState);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.host.AppPermission)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.host.AppPermission appPermission = (powerwatch.matrix.com.pwgen2android.shared.host.AppPermission) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, appPermission.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.permissionState, appPermission.permissionState);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.permissionState.hashCode();
    }

    public java.lang.String toString() {
        return "AppPermission(name=" + this.name + ", permissionState=" + this.permissionState + ')';
    }

    public AppPermission(java.lang.String name, java.lang.String permissionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        this.name = name;
        this.permissionState = permissionState;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getPermissionState() {
        return this.permissionState;
    }
}
