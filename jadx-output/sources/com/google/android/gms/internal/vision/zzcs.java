package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcs<T> extends com.google.android.gms.internal.vision.zzcn<T> {
    private final T zzlh;

    zzcs(T t) {
        this.zzlh = t;
    }

    @Override // com.google.android.gms.internal.vision.zzcn
    public final boolean isPresent() {
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzcn
    public final T get() {
        return this.zzlh;
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.vision.zzcs) {
            return this.zzlh.equals(((com.google.android.gms.internal.vision.zzcs) obj).zzlh);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzlh.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzlh);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
