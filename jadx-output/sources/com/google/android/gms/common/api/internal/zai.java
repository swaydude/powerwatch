package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class zai extends com.google.android.gms.common.api.internal.zak {
    private final android.util.SparseArray<com.google.android.gms.common.api.internal.zai.zaa> zacw;

    public static com.google.android.gms.common.api.internal.zai zaa(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(lifecycleActivity);
        com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) fragment.getCallbackOrNull("AutoManageHelper", com.google.android.gms.common.api.internal.zai.class);
        return zaiVar != null ? zaiVar : new com.google.android.gms.common.api.internal.zai(fragment);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private class zaa implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
        public final int zadd;
        public final com.google.android.gms.common.api.GoogleApiClient zade;
        public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zadf;

        public zaa(int i, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.zadd = i;
            this.zade = googleApiClient;
            this.zadf = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
            java.lang.String strValueOf = java.lang.String.valueOf(connectionResult);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(strValueOf);
            android.util.Log.d("AutoManageHelper", sb.toString());
            com.google.android.gms.common.api.internal.zai.this.zab(connectionResult, this.zadd);
        }
    }

    private zai(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zacw = new android.util.SparseArray<>();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public final void zaa(int i, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.zacw.indexOfKey(i) < 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        com.google.android.gms.common.internal.Preconditions.checkState(z, sb.toString());
        com.google.android.gms.common.api.internal.zam zamVar = this.zadi.get();
        boolean z2 = this.zadh;
        java.lang.String strValueOf = java.lang.String.valueOf(zamVar);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(strValueOf);
        android.util.Log.d("AutoManageHelper", sb2.toString());
        this.zacw.put(i, new com.google.android.gms.common.api.internal.zai.zaa(i, googleApiClient, onConnectionFailedListener));
        if (this.zadh && zamVar == null) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(googleApiClient);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(strValueOf2);
            android.util.Log.d("AutoManageHelper", sb3.toString());
            googleApiClient.connect();
        }
    }

    public final void zaa(int i) {
        com.google.android.gms.common.api.internal.zai.zaa zaaVar = this.zacw.get(i);
        this.zacw.remove(i);
        if (zaaVar != null) {
            zaaVar.zade.unregisterConnectionFailedListener(zaaVar);
            zaaVar.zade.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zak, com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        boolean z = this.zadh;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zacw);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(strValueOf);
        android.util.Log.d("AutoManageHelper", sb.toString());
        if (this.zadi.get() == null) {
            for (int i = 0; i < this.zacw.size(); i++) {
                com.google.android.gms.common.api.internal.zai.zaa zaaVarZab = zab(i);
                if (zaaVarZab != null) {
                    zaaVarZab.zade.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zak, com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.zacw.size(); i++) {
            com.google.android.gms.common.api.internal.zai.zaa zaaVarZab = zab(i);
            if (zaaVarZab != null) {
                zaaVarZab.zade.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        for (int i = 0; i < this.zacw.size(); i++) {
            com.google.android.gms.common.api.internal.zai.zaa zaaVarZab = zab(i);
            if (zaaVarZab != null) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient #").print(zaaVarZab.zadd);
                printWriter.println(":");
                zaaVarZab.zade.dump(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zak
    protected final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new java.lang.Exception());
            return;
        }
        com.google.android.gms.common.api.internal.zai.zaa zaaVar = this.zacw.get(i);
        if (zaaVar != null) {
            zaa(i);
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaaVar.zadf;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zak
    protected final void zam() {
        for (int i = 0; i < this.zacw.size(); i++) {
            com.google.android.gms.common.api.internal.zai.zaa zaaVarZab = zab(i);
            if (zaaVarZab != null) {
                zaaVarZab.zade.connect();
            }
        }
    }

    private final com.google.android.gms.common.api.internal.zai.zaa zab(int i) {
        if (this.zacw.size() <= i) {
            return null;
        }
        android.util.SparseArray<com.google.android.gms.common.api.internal.zai.zaa> sparseArray = this.zacw;
        return sparseArray.get(sparseArray.keyAt(i));
    }
}
