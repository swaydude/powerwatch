package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class b extends com.google.android.play.core.splitcompat.q {
    private final java.io.File a;
    private final java.lang.String b;

    b(java.io.File file, java.lang.String str) {
        java.util.Objects.requireNonNull(file, "Null splitFile");
        this.a = file;
        java.util.Objects.requireNonNull(str, "Null splitId");
        this.b = str;
    }

    @Override // com.google.android.play.core.splitcompat.q
    final java.io.File a() {
        return this.a;
    }

    @Override // com.google.android.play.core.splitcompat.q
    final java.lang.String b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.splitcompat.q) {
            com.google.android.play.core.splitcompat.q qVar = (com.google.android.play.core.splitcompat.q) obj;
            if (this.a.equals(qVar.a()) && this.b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String str = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 35 + java.lang.String.valueOf(str).length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(strValueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
