package powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities;

/* JADX INFO: compiled from: UserActivityConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;", "", "crudServiceConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "dayEndpoint", "", "activityDatesEndpoint", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;Ljava/lang/String;Ljava/lang/String;)V", "getActivityDatesEndpoint", "()Ljava/lang/String;", "getCrudServiceConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "getDayEndpoint", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UserActivityConfig {
    private final java.lang.String activityDatesEndpoint;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig;
    private final java.lang.String dayEndpoint;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig userActivityConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig cRUDServiceConfig, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cRUDServiceConfig = userActivityConfig.crudServiceConfig;
        }
        if ((i & 2) != 0) {
            str = userActivityConfig.dayEndpoint;
        }
        if ((i & 4) != 0) {
            str2 = userActivityConfig.activityDatesEndpoint;
        }
        return userActivityConfig.copy(cRUDServiceConfig, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig getCrudServiceConfig() {
        return this.crudServiceConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getDayEndpoint() {
        return this.dayEndpoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getActivityDatesEndpoint() {
        return this.activityDatesEndpoint;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig copy(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig, java.lang.String dayEndpoint, java.lang.String activityDatesEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudServiceConfig, "crudServiceConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayEndpoint, "dayEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDatesEndpoint, "activityDatesEndpoint");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig(crudServiceConfig, dayEndpoint, activityDatesEndpoint);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig userActivityConfig = (powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.crudServiceConfig, userActivityConfig.crudServiceConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.dayEndpoint, userActivityConfig.dayEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDatesEndpoint, userActivityConfig.activityDatesEndpoint);
    }

    public int hashCode() {
        return (((this.crudServiceConfig.hashCode() * 31) + this.dayEndpoint.hashCode()) * 31) + this.activityDatesEndpoint.hashCode();
    }

    public java.lang.String toString() {
        return "UserActivityConfig(crudServiceConfig=" + this.crudServiceConfig + ", dayEndpoint=" + this.dayEndpoint + ", activityDatesEndpoint=" + this.activityDatesEndpoint + ')';
    }

    public UserActivityConfig(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig, java.lang.String dayEndpoint, java.lang.String activityDatesEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudServiceConfig, "crudServiceConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayEndpoint, "dayEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDatesEndpoint, "activityDatesEndpoint");
        this.crudServiceConfig = crudServiceConfig;
        this.dayEndpoint = dayEndpoint;
        this.activityDatesEndpoint = activityDatesEndpoint;
    }

    public final java.lang.String getActivityDatesEndpoint() {
        return this.activityDatesEndpoint;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig getCrudServiceConfig() {
        return this.crudServiceConfig;
    }

    public final java.lang.String getDayEndpoint() {
        return this.dayEndpoint;
    }
}
