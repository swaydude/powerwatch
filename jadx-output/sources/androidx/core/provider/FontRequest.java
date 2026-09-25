package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public final class FontRequest {
    private final java.util.List<java.util.List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final java.lang.String mIdentifier;
    private final java.lang.String mProviderAuthority;
    private final java.lang.String mProviderPackage;
    private final java.lang.String mQuery;

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.util.List<byte[]>> list) {
        java.lang.String str4 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.mProviderAuthority = str4;
        java.lang.String str5 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str2);
        this.mProviderPackage = str5;
        java.lang.String str6 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str3);
        this.mQuery = str6;
        this.mCertificates = (java.util.List) androidx.core.util.Preconditions.checkNotNull(list);
        this.mCertificatesArray = 0;
        this.mIdentifier = str4 + "-" + str5 + "-" + str6;
    }

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.mProviderAuthority = str4;
        java.lang.String str5 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str2);
        this.mProviderPackage = str5;
        java.lang.String str6 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str3);
        this.mQuery = str6;
        this.mCertificates = null;
        androidx.core.util.Preconditions.checkArgument(i != 0);
        this.mCertificatesArray = i;
        this.mIdentifier = str4 + "-" + str5 + "-" + str6;
    }

    public java.lang.String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public java.lang.String getProviderPackage() {
        return this.mProviderPackage;
    }

    public java.lang.String getQuery() {
        return this.mQuery;
    }

    public java.util.List<java.util.List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    public java.lang.String getIdentifier() {
        return this.mIdentifier;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        for (int i = 0; i < this.mCertificates.size(); i++) {
            sb.append(" [");
            java.util.List<byte[]> list = this.mCertificates.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb.toString();
    }
}
