package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg implements com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions {
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zzhv;

    public zzg(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        if ("<<default account>>".equals(googleSignInAccount.getEmail())) {
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                this.zzhv = null;
                return;
            }
        }
        this.zzhv = googleSignInAccount;
    }

    @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzhv;
    }

    public final int hashCode() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = this.zzhv;
        if (googleSignInAccount != null) {
            return googleSignInAccount.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.fitness.zzg) && com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.fitness.zzg) obj).zzhv, this.zzhv);
        }
        return true;
    }
}
