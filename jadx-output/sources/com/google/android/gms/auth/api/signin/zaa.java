package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zaa implements java.util.Comparator {
    static final java.util.Comparator zae = new com.google.android.gms.auth.api.signin.zaa();

    private zaa() {
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.common.api.Scope) obj).getScopeUri().compareTo(((com.google.android.gms.common.api.Scope) obj2).getScopeUri());
    }
}
