package com.google.android.datatransport;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Encoding {
    private final java.lang.String name;

    public static com.google.android.datatransport.Encoding of(java.lang.String str) {
        return new com.google.android.datatransport.Encoding(str);
    }

    public java.lang.String getName() {
        return this.name;
    }

    private Encoding(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "name is null");
        this.name = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.datatransport.Encoding) {
            return this.name.equals(((com.google.android.datatransport.Encoding) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "Encoding{name=\"" + this.name + "\"}";
    }
}
