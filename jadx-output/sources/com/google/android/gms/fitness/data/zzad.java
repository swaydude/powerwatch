package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.zzad> CREATOR = new com.google.android.gms.fitness.data.zzaf();
    private final com.google.android.gms.fitness.data.Session zzii;
    private final com.google.android.gms.fitness.data.DataSet zzjd;

    public zzad(com.google.android.gms.fitness.data.Session session, com.google.android.gms.fitness.data.DataSet dataSet) {
        this.zzii = session;
        this.zzjd = dataSet;
    }

    public final com.google.android.gms.fitness.data.Session getSession() {
        return this.zzii;
    }

    public final com.google.android.gms.fitness.data.DataSet getDataSet() {
        return this.zzjd;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.zzad)) {
            return false;
        }
        com.google.android.gms.fitness.data.zzad zzadVar = (com.google.android.gms.fitness.data.zzad) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzii, zzadVar.zzii) && com.google.android.gms.common.internal.Objects.equal(this.zzjd, zzadVar.zzjd);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzii, this.zzjd);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, this.zzii).add("dataSet", this.zzjd).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzii, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzjd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
