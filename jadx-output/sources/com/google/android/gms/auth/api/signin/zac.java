package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zac implements java.util.Comparator<com.google.android.gms.common.api.Scope> {
    zac() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope scope2) {
        return scope.getScopeUri().compareTo(scope2.getScopeUri());
    }
}
