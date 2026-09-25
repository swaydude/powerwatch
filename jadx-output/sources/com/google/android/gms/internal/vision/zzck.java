package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzck<T> extends com.google.android.gms.internal.vision.zzcn<T> {
    static final com.google.android.gms.internal.vision.zzck<java.lang.Object> zzlf = new com.google.android.gms.internal.vision.zzck<>();

    private zzck() {
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.android.gms.internal.vision.zzcn
    public final boolean isPresent() {
        return false;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.vision.zzcn
    public final T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
