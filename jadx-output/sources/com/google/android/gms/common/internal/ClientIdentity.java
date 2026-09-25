package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ClientIdentity> CREATOR = new com.google.android.gms.common.internal.zab();
    private final java.lang.String packageName;
    private final int uid;

    public ClientIdentity(int i, java.lang.String str) {
        this.uid = i;
        this.packageName = str;
    }

    public int hashCode() {
        return this.uid;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.ClientIdentity)) {
            com.google.android.gms.common.internal.ClientIdentity clientIdentity = (com.google.android.gms.common.internal.ClientIdentity) obj;
            if (clientIdentity.uid == this.uid && com.google.android.gms.common.internal.Objects.equal(clientIdentity.packageName, this.packageName)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        int i = this.uid;
        java.lang.String str = this.packageName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.uid);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
