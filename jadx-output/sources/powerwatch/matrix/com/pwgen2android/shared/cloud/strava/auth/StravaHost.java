package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: AuthModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;", "", "clientID", "", "clientSecret", "code", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getClientID", "getClientSecret", "getCode", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StravaHost {
    private final java.lang.String accessToken;
    private final java.lang.String clientID;
    private final java.lang.String clientSecret;
    private final java.lang.String code;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stravaHost.clientID;
        }
        if ((i & 2) != 0) {
            str2 = stravaHost.clientSecret;
        }
        if ((i & 4) != 0) {
            str3 = stravaHost.code;
        }
        if ((i & 8) != 0) {
            str4 = stravaHost.accessToken;
        }
        return stravaHost.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getClientID() {
        return this.clientID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost copy(java.lang.String clientID, java.lang.String clientSecret, java.lang.String code, java.lang.String accessToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientID, "clientID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost(clientID, clientSecret, code, accessToken);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientID, stravaHost.clientID) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientSecret, stravaHost.clientSecret) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, stravaHost.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, stravaHost.accessToken);
    }

    public int hashCode() {
        return (((((this.clientID.hashCode() * 31) + this.clientSecret.hashCode()) * 31) + this.code.hashCode()) * 31) + this.accessToken.hashCode();
    }

    public java.lang.String toString() {
        return "StravaHost(clientID=" + this.clientID + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", accessToken=" + this.accessToken + ')';
    }

    public StravaHost(java.lang.String clientID, java.lang.String clientSecret, java.lang.String code, java.lang.String accessToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientID, "clientID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.code = code;
        this.accessToken = accessToken;
    }

    public /* synthetic */ StravaHost(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    public final java.lang.String getClientID() {
        return this.clientID;
    }

    public final java.lang.String getClientSecret() {
        return this.clientSecret;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }
}
