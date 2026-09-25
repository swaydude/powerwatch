package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.signin.SignInOptions DEFAULT;
    private final boolean zasm = false;
    private final boolean zasn = false;
    private final java.lang.String zaso = null;
    private final boolean zasp = false;
    private final boolean zass = false;
    private final java.lang.String zasq = null;
    private final java.lang.String zasr = null;
    private final java.lang.Long zast = null;
    private final java.lang.Long zasu = null;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class zaa {
    }

    private SignInOptions(boolean z, boolean z2, java.lang.String str, boolean z3, java.lang.String str2, java.lang.String str3, boolean z4, java.lang.Long l, java.lang.Long l2) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.signin.SignInOptions)) {
            return false;
        }
        com.google.android.gms.signin.SignInOptions signInOptions = (com.google.android.gms.signin.SignInOptions) obj;
        return this.zasm == signInOptions.zasm && this.zasn == signInOptions.zasn && com.google.android.gms.common.internal.Objects.equal(this.zaso, signInOptions.zaso) && this.zasp == signInOptions.zasp && this.zass == signInOptions.zass && com.google.android.gms.common.internal.Objects.equal(this.zasq, signInOptions.zasq) && com.google.android.gms.common.internal.Objects.equal(this.zasr, signInOptions.zasr) && com.google.android.gms.common.internal.Objects.equal(this.zast, signInOptions.zast) && com.google.android.gms.common.internal.Objects.equal(this.zasu, signInOptions.zasu);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zasm), java.lang.Boolean.valueOf(this.zasn), this.zaso, java.lang.Boolean.valueOf(this.zasp), java.lang.Boolean.valueOf(this.zass), this.zasq, this.zasr, this.zast, this.zasu);
    }

    public final boolean isOfflineAccessRequested() {
        return this.zasm;
    }

    public final boolean isIdTokenRequested() {
        return this.zasn;
    }

    public final java.lang.String getServerClientId() {
        return this.zaso;
    }

    public final boolean isForceCodeForRefreshToken() {
        return this.zasp;
    }

    public final java.lang.String getHostedDomain() {
        return this.zasq;
    }

    public final java.lang.String getLogSessionId() {
        return this.zasr;
    }

    public final boolean waitForAccessTokenRefresh() {
        return this.zass;
    }

    public final java.lang.Long getAuthApiSignInModuleVersion() {
        return this.zast;
    }

    public final java.lang.Long getRealClientLibraryVersion() {
        return this.zasu;
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", this.zasm);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", this.zasn);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", this.zaso);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", this.zasp);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", this.zasq);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", this.zasr);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", this.zass);
        java.lang.Long l = this.zast;
        if (l != null) {
            bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
        }
        java.lang.Long l2 = this.zasu;
        if (l2 != null) {
            bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
        }
        return bundle;
    }

    static {
        new com.google.android.gms.signin.SignInOptions.zaa();
        DEFAULT = new com.google.android.gms.signin.SignInOptions(false, false, null, false, null, null, false, null, null);
    }
}
