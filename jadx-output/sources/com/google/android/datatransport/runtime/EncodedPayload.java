package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final com.google.android.datatransport.Encoding encoding;

    public EncodedPayload(com.google.android.datatransport.Encoding encoding, byte[] bArr) {
        java.util.Objects.requireNonNull(encoding, "encoding is null");
        java.util.Objects.requireNonNull(bArr, "bytes is null");
        this.encoding = encoding;
        this.bytes = bArr;
    }

    public com.google.android.datatransport.Encoding getEncoding() {
        return this.encoding;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.EncodedPayload)) {
            return false;
        }
        com.google.android.datatransport.runtime.EncodedPayload encodedPayload = (com.google.android.datatransport.runtime.EncodedPayload) obj;
        if (this.encoding.equals(encodedPayload.encoding)) {
            return java.util.Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public int hashCode() {
        return ((this.encoding.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.bytes);
    }

    public java.lang.String toString() {
        return "EncodedPayload{encoding=" + this.encoding + ", bytes=[...]}";
    }
}
