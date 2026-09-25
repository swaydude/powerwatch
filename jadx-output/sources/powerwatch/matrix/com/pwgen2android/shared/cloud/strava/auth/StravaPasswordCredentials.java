package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: AuthModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\"\u001a\u00020 J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "", "uid", "", "accessToken", "", "tokenType", "refreshToken", "expiresIn", "", "expiresAt", "code", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getCode", "getExpiresAt", "()J", "getExpiresIn", "getRefreshToken", "getTokenType", "getUid", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hasExpired", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StravaPasswordCredentials {

    @com.google.gson.annotations.SerializedName("access_token")
    private final java.lang.String accessToken;

    @com.google.gson.annotations.SerializedName("code")
    private final java.lang.String code;

    @com.google.gson.annotations.SerializedName(io.fabric.sdk.android.services.settings.SettingsJsonConstants.EXPIRES_AT_KEY)
    private final long expiresAt;

    @com.google.gson.annotations.SerializedName("expires_in")
    private final long expiresIn;

    @com.google.gson.annotations.SerializedName("refresh_token")
    private final java.lang.String refreshToken;

    @com.google.gson.annotations.SerializedName("token_type")
    private final java.lang.String tokenType;
    private final int uid;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getTokenType() {
        return this.tokenType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials copy(int uid, java.lang.String accessToken, java.lang.String tokenType, java.lang.String refreshToken, long expiresIn, long expiresAt, java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials(uid, accessToken, tokenType, refreshToken, expiresIn, expiresAt, code);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials stravaPasswordCredentials = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) other;
        return this.uid == stravaPasswordCredentials.uid && kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, stravaPasswordCredentials.accessToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenType, stravaPasswordCredentials.tokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.refreshToken, stravaPasswordCredentials.refreshToken) && this.expiresIn == stravaPasswordCredentials.expiresIn && this.expiresAt == stravaPasswordCredentials.expiresAt && kotlin.jvm.internal.Intrinsics.areEqual(this.code, stravaPasswordCredentials.code);
    }

    public int hashCode() {
        return (((((((((((this.uid * 31) + this.accessToken.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.expiresIn)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.expiresAt)) * 31) + this.code.hashCode();
    }

    public java.lang.String toString() {
        return "StravaPasswordCredentials(uid=" + this.uid + ", accessToken=" + this.accessToken + ", tokenType=" + this.tokenType + ", refreshToken=" + this.refreshToken + ", expiresIn=" + this.expiresIn + ", expiresAt=" + this.expiresAt + ", code=" + this.code + ')';
    }

    public StravaPasswordCredentials(int i, java.lang.String accessToken, java.lang.String tokenType, java.lang.String refreshToken, long j, long j2, java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        this.uid = i;
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
        this.expiresIn = j;
        this.expiresAt = j2;
        this.code = code;
    }

    public /* synthetic */ StravaPasswordCredentials(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, java.lang.String str4, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, j, j2, str4);
    }

    public final int getUid() {
        return this.uid;
    }

    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public final java.lang.String getTokenType() {
        return this.tokenType;
    }

    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final boolean hasExpired() {
        return this.expiresAt - (java.lang.System.currentTimeMillis() / ((long) 1000)) < 3600;
    }
}
