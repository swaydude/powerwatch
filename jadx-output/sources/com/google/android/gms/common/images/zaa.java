package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaa {
    public final android.net.Uri uri;

    public zaa(android.net.Uri uri) {
        this.uri = uri;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.uri);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.images.zaa)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.common.images.zaa) obj).uri, this.uri);
    }
}
