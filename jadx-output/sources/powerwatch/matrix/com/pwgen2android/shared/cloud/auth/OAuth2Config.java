package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: AuthModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;", "", "authEndpoint", "", "grantType", "scope", "clientID", "clientSecret", "basicAuthorizationTokenType", "encodedBasicToken", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthEndpoint", "()Ljava/lang/String;", "getBasicAuthorizationTokenType", "getClientID", "getClientSecret", "getEmail", "getEncodedBasicToken", "getGrantType", "getPassword", "getScope", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class OAuth2Config {
    private final java.lang.String authEndpoint;
    private final java.lang.String basicAuthorizationTokenType;
    private final java.lang.String clientID;
    private final java.lang.String clientSecret;
    private final java.lang.String email;
    private final java.lang.String encodedBasicToken;
    private final java.lang.String grantType;
    private final java.lang.String password;
    private final java.lang.String scope;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAuthEndpoint() {
        return this.authEndpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getGrantType() {
        return this.grantType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getClientID() {
        return this.clientID;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getBasicAuthorizationTokenType() {
        return this.basicAuthorizationTokenType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getEncodedBasicToken() {
        return this.encodedBasicToken;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config copy(java.lang.String authEndpoint, java.lang.String grantType, java.lang.String scope, java.lang.String clientID, java.lang.String clientSecret, java.lang.String basicAuthorizationTokenType, java.lang.String encodedBasicToken, java.lang.String email, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authEndpoint, "authEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grantType, "grantType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientID, "clientID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicAuthorizationTokenType, "basicAuthorizationTokenType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedBasicToken, "encodedBasicToken");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config(authEndpoint, grantType, scope, clientID, clientSecret, basicAuthorizationTokenType, encodedBasicToken, email, password);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config oAuth2Config = (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authEndpoint, oAuth2Config.authEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.grantType, oAuth2Config.grantType) && kotlin.jvm.internal.Intrinsics.areEqual(this.scope, oAuth2Config.scope) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientID, oAuth2Config.clientID) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientSecret, oAuth2Config.clientSecret) && kotlin.jvm.internal.Intrinsics.areEqual(this.basicAuthorizationTokenType, oAuth2Config.basicAuthorizationTokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.encodedBasicToken, oAuth2Config.encodedBasicToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, oAuth2Config.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, oAuth2Config.password);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.authEndpoint.hashCode() * 31) + this.grantType.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.clientID.hashCode()) * 31) + this.clientSecret.hashCode()) * 31) + this.basicAuthorizationTokenType.hashCode()) * 31) + this.encodedBasicToken.hashCode()) * 31;
        java.lang.String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.password;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OAuth2Config(authEndpoint=" + this.authEndpoint + ", grantType=" + this.grantType + ", scope=" + this.scope + ", clientID=" + this.clientID + ", clientSecret=" + this.clientSecret + ", basicAuthorizationTokenType=" + this.basicAuthorizationTokenType + ", encodedBasicToken=" + this.encodedBasicToken + ", email=" + ((java.lang.Object) this.email) + ", password=" + ((java.lang.Object) this.password) + ')';
    }

    public OAuth2Config(java.lang.String authEndpoint, java.lang.String grantType, java.lang.String scope, java.lang.String clientID, java.lang.String clientSecret, java.lang.String basicAuthorizationTokenType, java.lang.String encodedBasicToken, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authEndpoint, "authEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grantType, "grantType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientID, "clientID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicAuthorizationTokenType, "basicAuthorizationTokenType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedBasicToken, "encodedBasicToken");
        this.authEndpoint = authEndpoint;
        this.grantType = grantType;
        this.scope = scope;
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.basicAuthorizationTokenType = basicAuthorizationTokenType;
        this.encodedBasicToken = encodedBasicToken;
        this.email = str;
        this.password = str2;
    }

    public /* synthetic */ OAuth2Config(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }

    public final java.lang.String getAuthEndpoint() {
        return this.authEndpoint;
    }

    public final java.lang.String getGrantType() {
        return this.grantType;
    }

    public final java.lang.String getScope() {
        return this.scope;
    }

    public final java.lang.String getClientID() {
        return this.clientID;
    }

    public final java.lang.String getClientSecret() {
        return this.clientSecret;
    }

    public final java.lang.String getBasicAuthorizationTokenType() {
        return this.basicAuthorizationTokenType;
    }

    public final java.lang.String getEncodedBasicToken() {
        return this.encodedBasicToken;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }
}
