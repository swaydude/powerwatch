package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class Storage {
    private static final java.util.concurrent.locks.Lock zaai = new java.util.concurrent.locks.ReentrantLock();
    private static com.google.android.gms.auth.api.signin.internal.Storage zaaj;
    private final java.util.concurrent.locks.Lock zaak = new java.util.concurrent.locks.ReentrantLock();
    private final android.content.SharedPreferences zaal;

    public static com.google.android.gms.auth.api.signin.internal.Storage getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zaai.lock();
        try {
            if (zaaj == null) {
                zaaj = new com.google.android.gms.auth.api.signin.internal.Storage(context.getApplicationContext());
            }
            return zaaj;
        } finally {
            zaai.unlock();
        }
    }

    private Storage(android.content.Context context) {
        this.zaal = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public void saveDefaultGoogleSignInAccount(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        zaa("defaultGoogleSignInAccount", googleSignInAccount.zab());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        java.lang.String strZab = googleSignInAccount.zab();
        zaa(zab("googleSignInAccount", strZab), googleSignInAccount.zac());
        zaa(zab("googleSignInOptions", strZab), googleSignInOptions.zae());
    }

    private final void zaa(java.lang.String str, java.lang.String str2) {
        this.zaak.lock();
        try {
            this.zaal.edit().putString(str, str2).apply();
        } finally {
            this.zaak.unlock();
        }
    }

    @javax.annotation.Nullable
    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        return zad(zaf("defaultGoogleSignInAccount"));
    }

    @javax.annotation.Nullable
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zad(java.lang.String str) {
        java.lang.String strZaf;
        if (!android.text.TextUtils.isEmpty(str) && (strZaf = zaf(zab("googleSignInAccount", str))) != null) {
            try {
                return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa(strZaf);
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    public com.google.android.gms.auth.api.signin.GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        return zae(zaf("defaultGoogleSignInAccount"));
    }

    @javax.annotation.Nullable
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zae(java.lang.String str) {
        java.lang.String strZaf;
        if (!android.text.TextUtils.isEmpty(str) && (strZaf = zaf(zab("googleSignInOptions", str))) != null) {
            try {
                return com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab(strZaf);
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    public java.lang.String getSavedRefreshToken() {
        return zaf("refreshToken");
    }

    @javax.annotation.Nullable
    private final java.lang.String zaf(java.lang.String str) {
        this.zaak.lock();
        try {
            return this.zaal.getString(str, null);
        } finally {
            this.zaak.unlock();
        }
    }

    public final void zaf() {
        java.lang.String strZaf = zaf("defaultGoogleSignInAccount");
        zag("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strZaf)) {
            return;
        }
        zag(zab("googleSignInAccount", strZaf));
        zag(zab("googleSignInOptions", strZaf));
    }

    private final void zag(java.lang.String str) {
        this.zaak.lock();
        try {
            this.zaal.edit().remove(str).apply();
        } finally {
            this.zaak.unlock();
        }
    }

    public void clear() {
        this.zaak.lock();
        try {
            this.zaal.edit().clear().apply();
        } finally {
            this.zaak.unlock();
        }
    }

    private static java.lang.String zab(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
