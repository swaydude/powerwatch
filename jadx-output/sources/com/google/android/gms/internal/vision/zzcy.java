package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcy<T> implements com.google.android.gms.internal.vision.zzcu<T>, java.io.Serializable {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final T zzlk;

    zzcy(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        this.zzlk = t;
    }

    @Override // com.google.android.gms.internal.vision.zzcu
    public final T get() {
        return this.zzlk;
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.vision.zzcy) {
            return com.google.android.gms.internal.vision.zzco.equal(this.zzlk, ((com.google.android.gms.internal.vision.zzcy) obj).zzlk);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zzlk});
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzlk);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
