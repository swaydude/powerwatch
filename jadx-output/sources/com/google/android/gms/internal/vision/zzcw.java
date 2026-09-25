package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcw<T> implements com.google.android.gms.internal.vision.zzcu<T>, java.io.Serializable {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient T value;
    private final com.google.android.gms.internal.vision.zzcu<T> zzli;
    private volatile transient boolean zzlj;

    zzcw(com.google.android.gms.internal.vision.zzcu<T> zzcuVar) {
        this.zzli = (com.google.android.gms.internal.vision.zzcu) com.google.android.gms.internal.vision.zzct.checkNotNull(zzcuVar);
    }

    @Override // com.google.android.gms.internal.vision.zzcu
    public final T get() {
        if (!this.zzlj) {
            synchronized (this) {
                if (!this.zzlj) {
                    T t = this.zzli.get();
                    this.value = t;
                    this.zzlj = true;
                    return t;
                }
            }
        }
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.Object string;
        if (this.zzlj) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.value);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.zzli;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(string);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
