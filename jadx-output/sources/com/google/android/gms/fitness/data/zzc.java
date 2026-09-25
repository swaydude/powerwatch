package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final java.lang.String packageName;
    public static final com.google.android.gms.fitness.data.zzc zzil = new com.google.android.gms.fitness.data.zzc("com.google.android.gms");
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.zzc> CREATOR = new com.google.android.gms.fitness.data.zzb();

    public static com.google.android.gms.fitness.data.zzc zza(java.lang.String str) {
        return "com.google.android.gms".equals(str) ? zzil : new com.google.android.gms.fitness.data.zzc(str);
    }

    public zzc(java.lang.String str) {
        this.packageName = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.fitness.data.zzc) {
            return this.packageName.equals(((com.google.android.gms.fitness.data.zzc) obj).packageName);
        }
        return false;
    }

    public final int hashCode() {
        return this.packageName.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("Application{%s}", this.packageName);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
