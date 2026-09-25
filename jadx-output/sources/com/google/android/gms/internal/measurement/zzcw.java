package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcw<T> extends com.google.android.gms.internal.measurement.zzcy<T> {
    static final com.google.android.gms.internal.measurement.zzcw<java.lang.Object> zza = new com.google.android.gms.internal.measurement.zzcw<>();

    private zzcw() {
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final boolean zza() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final T zzb() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
