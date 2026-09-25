package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public class StringResourceValueReader {
    private final android.content.res.Resources zzeu;
    private final java.lang.String zzev;

    public StringResourceValueReader(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.res.Resources resources = context.getResources();
        this.zzeu = resources;
        this.zzev = resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
    }

    @javax.annotation.Nullable
    public java.lang.String getString(java.lang.String str) {
        int identifier = this.zzeu.getIdentifier(str, "string", this.zzev);
        if (identifier == 0) {
            return null;
        }
        return this.zzeu.getString(identifier);
    }
}
