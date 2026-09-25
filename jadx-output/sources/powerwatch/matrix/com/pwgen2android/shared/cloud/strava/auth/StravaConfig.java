package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: AuthModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;", "", "authEndpoint", "", "revokeEndpoint", "apiEndpoint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiEndpoint", "()Ljava/lang/String;", "getAuthEndpoint", "getRevokeEndpoint", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StravaConfig {
    private final java.lang.String apiEndpoint;
    private final java.lang.String authEndpoint;
    private final java.lang.String revokeEndpoint;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig stravaConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stravaConfig.authEndpoint;
        }
        if ((i & 2) != 0) {
            str2 = stravaConfig.revokeEndpoint;
        }
        if ((i & 4) != 0) {
            str3 = stravaConfig.apiEndpoint;
        }
        return stravaConfig.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAuthEndpoint() {
        return this.authEndpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getRevokeEndpoint() {
        return this.revokeEndpoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig copy(java.lang.String authEndpoint, java.lang.String revokeEndpoint, java.lang.String apiEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authEndpoint, "authEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revokeEndpoint, "revokeEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig(authEndpoint, revokeEndpoint, apiEndpoint);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig stravaConfig = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authEndpoint, stravaConfig.authEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.revokeEndpoint, stravaConfig.revokeEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.apiEndpoint, stravaConfig.apiEndpoint);
    }

    public int hashCode() {
        return (((this.authEndpoint.hashCode() * 31) + this.revokeEndpoint.hashCode()) * 31) + this.apiEndpoint.hashCode();
    }

    public java.lang.String toString() {
        return "StravaConfig(authEndpoint=" + this.authEndpoint + ", revokeEndpoint=" + this.revokeEndpoint + ", apiEndpoint=" + this.apiEndpoint + ')';
    }

    public StravaConfig(java.lang.String authEndpoint, java.lang.String revokeEndpoint, java.lang.String apiEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authEndpoint, "authEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revokeEndpoint, "revokeEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        this.authEndpoint = authEndpoint;
        this.revokeEndpoint = revokeEndpoint;
        this.apiEndpoint = apiEndpoint;
    }

    public final java.lang.String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final java.lang.String getAuthEndpoint() {
        return this.authEndpoint;
    }

    public final java.lang.String getRevokeEndpoint() {
        return this.revokeEndpoint;
    }
}
