package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new com.google.android.gms.common.api.zza();
    private final java.lang.String zzaq;
    private final int zzg;

    Scope(int i, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "scopeUri must not be null or empty");
        this.zzg = i;
        this.zzaq = str;
    }

    public Scope(java.lang.String str) {
        this(1, str);
    }

    public final java.lang.String getScopeUri() {
        return this.zzaq;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.api.Scope) {
            return this.zzaq.equals(((com.google.android.gms.common.api.Scope) obj).zzaq);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzaq.hashCode();
    }

    public final java.lang.String toString() {
        return this.zzaq;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getScopeUri(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
