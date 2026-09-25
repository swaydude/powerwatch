package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends com.google.android.gms.maps.internal.zzbt {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback zzz;

    zzr(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.zzz = snapshotReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbs
    public final void onSnapshotReady(android.graphics.Bitmap bitmap) throws android.os.RemoteException {
        this.zzz.onSnapshotReady(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbs
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        this.zzz.onSnapshotReady((android.graphics.Bitmap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
