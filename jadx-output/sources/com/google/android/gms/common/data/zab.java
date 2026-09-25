package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zab extends com.google.android.gms.common.data.DataHolder.Builder {
    zab(java.lang.String[] strArr, java.lang.String str) {
        super(strArr, null, null);
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap<java.lang.String, java.lang.Object> map) {
        throw new java.lang.UnsupportedOperationException("Cannot add data to empty builder");
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Cannot add data to empty builder");
    }
}
