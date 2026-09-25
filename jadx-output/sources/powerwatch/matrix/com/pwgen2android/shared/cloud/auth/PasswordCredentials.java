package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: AuthModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jg\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00100\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00102\u001a\u00020\u001bJ\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00065"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "", "uid", "", "accessToken", "", "tokenType", "refreshToken", "expiresIn", "", "scope", "tokenValidUntil", "email", "password", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getExpiresIn", "()J", "getPassword", "setPassword", "getRefreshToken", "getScope", "shouldTryLogin", "", "getShouldTryLogin", "()Z", "setShouldTryLogin", "(Z)V", "getTokenType", "getTokenValidUntil", "setTokenValidUntil", "(J)V", "getUid", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hasExpired", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PasswordCredentials {

    @com.google.gson.annotations.SerializedName("access_token")
    private final java.lang.String accessToken;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private java.lang.String email;

    @com.google.gson.annotations.SerializedName("expires_in")
    private final long expiresIn;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private java.lang.String password;

    @com.google.gson.annotations.SerializedName("refresh_token")
    private final java.lang.String refreshToken;

    @com.google.gson.annotations.SerializedName("scope")
    private final java.lang.String scope;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private boolean shouldTryLogin;

    @com.google.gson.annotations.SerializedName("token_type")
    private final java.lang.String tokenType;
    private long tokenValidUntil;
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
    public final java.lang.String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTokenValidUntil() {
        return this.tokenValidUntil;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials copy(int uid, java.lang.String accessToken, java.lang.String tokenType, java.lang.String refreshToken, long expiresIn, java.lang.String scope, long tokenValidUntil, java.lang.String email, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials(uid, accessToken, tokenType, refreshToken, expiresIn, scope, tokenValidUntil, email, password);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials = (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) other;
        return this.uid == passwordCredentials.uid && kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, passwordCredentials.accessToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenType, passwordCredentials.tokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.refreshToken, passwordCredentials.refreshToken) && this.expiresIn == passwordCredentials.expiresIn && kotlin.jvm.internal.Intrinsics.areEqual(this.scope, passwordCredentials.scope) && this.tokenValidUntil == passwordCredentials.tokenValidUntil && kotlin.jvm.internal.Intrinsics.areEqual(this.email, passwordCredentials.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, passwordCredentials.password);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.uid * 31) + this.accessToken.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.expiresIn)) * 31) + this.scope.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.tokenValidUntil)) * 31;
        java.lang.String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.password;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PasswordCredentials(uid=" + this.uid + ", accessToken=" + this.accessToken + ", tokenType=" + this.tokenType + ", refreshToken=" + this.refreshToken + ", expiresIn=" + this.expiresIn + ", scope=" + this.scope + ", tokenValidUntil=" + this.tokenValidUntil + ", email=" + ((java.lang.Object) this.email) + ", password=" + ((java.lang.Object) this.password) + ')';
    }

    public PasswordCredentials(int i, java.lang.String accessToken, java.lang.String tokenType, java.lang.String refreshToken, long j, java.lang.String scope, long j2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.uid = i;
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
        this.expiresIn = j;
        this.scope = scope;
        this.tokenValidUntil = j2;
        this.email = str;
        this.password = str2;
    }

    public /* synthetic */ PasswordCredentials(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, long j2, java.lang.String str5, java.lang.String str6, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, j, str4, j2, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6);
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

    public final java.lang.String getScope() {
        return this.scope;
    }

    public final long getTokenValidUntil() {
        return this.tokenValidUntil;
    }

    public final void setTokenValidUntil(long j) {
        this.tokenValidUntil = j;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final void setEmail(java.lang.String str) {
        this.email = str;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final void setPassword(java.lang.String str) {
        this.password = str;
    }

    public final boolean getShouldTryLogin() {
        return this.shouldTryLogin;
    }

    public final void setShouldTryLogin(boolean z) {
        this.shouldTryLogin = z;
    }

    public final boolean hasExpired() {
        return (this.tokenValidUntil - java.lang.System.currentTimeMillis()) / ((long) 1000) < 60;
    }
}
