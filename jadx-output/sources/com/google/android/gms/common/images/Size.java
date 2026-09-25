package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Size {
    private final int zanj;
    private final int zank;

    public Size(int i, int i2) {
        this.zanj = i;
        this.zank = i2;
    }

    public final int getWidth() {
        return this.zanj;
    }

    public final int getHeight() {
        return this.zank;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.images.Size) {
            com.google.android.gms.common.images.Size size = (com.google.android.gms.common.images.Size) obj;
            if (this.zanj == size.zanj && this.zank == size.zank) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        int i = this.zanj;
        int i2 = this.zank;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    private static java.lang.NumberFormatException zah(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new java.lang.NumberFormatException(sb.toString());
    }

    public static com.google.android.gms.common.images.Size parseSize(java.lang.String str) throws java.lang.NumberFormatException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw zah(str);
        }
        try {
            return new com.google.android.gms.common.images.Size(java.lang.Integer.parseInt(str.substring(0, iIndexOf)), java.lang.Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (java.lang.NumberFormatException unused) {
            throw zah(str);
        }
    }

    public final int hashCode() {
        int i = this.zank;
        int i2 = this.zanj;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
