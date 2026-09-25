package com.google.android.gms.common.stats;

/* JADX INFO: loaded from: classes.dex */
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> CREATOR = new com.google.android.gms.common.stats.zza();
    private long durationMillis;
    private final int versionCode;
    private final long zzfo;
    private int zzfp;
    private final java.lang.String zzfq;
    private final java.lang.String zzfr;
    private final java.lang.String zzfs;
    private final int zzft;
    private final java.util.List<java.lang.String> zzfu;
    private final java.lang.String zzfv;
    private final long zzfw;
    private int zzfx;
    private final java.lang.String zzfy;
    private final float zzfz;
    private final long zzga;
    private final boolean zzgb;

    WakeLockEvent(int i, long j, int i2, java.lang.String str, int i3, java.util.List<java.lang.String> list, java.lang.String str2, long j2, int i4, java.lang.String str3, java.lang.String str4, float f, long j3, java.lang.String str5, boolean z) {
        this.versionCode = i;
        this.zzfo = j;
        this.zzfp = i2;
        this.zzfq = str;
        this.zzfr = str3;
        this.zzfs = str5;
        this.zzft = i3;
        this.durationMillis = -1L;
        this.zzfu = list;
        this.zzfv = str2;
        this.zzfw = j2;
        this.zzfx = i4;
        this.zzfy = str4;
        this.zzfz = f;
        this.zzga = j3;
        this.zzgb = z;
    }

    public WakeLockEvent(long j, int i, java.lang.String str, int i2, java.util.List<java.lang.String> list, java.lang.String str2, long j2, int i3, java.lang.String str3, java.lang.String str4, float f, long j3, java.lang.String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long getTimeMillis() {
        return this.zzfo;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int getEventType() {
        return this.zzfp;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzu() {
        return this.durationMillis;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, getTimeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzfq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzft);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzfu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzfw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzfr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, getEventType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzfv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzfy, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 14, this.zzfx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 15, this.zzfz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 16, this.zzga);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 17, this.zzfs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzgb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final java.lang.String zzv() {
        java.lang.String str = this.zzfq;
        int i = this.zzft;
        java.util.List<java.lang.String> list = this.zzfu;
        java.lang.String strJoin = list == null ? "" : android.text.TextUtils.join(",", list);
        int i2 = this.zzfx;
        java.lang.String str2 = this.zzfr;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.zzfy;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.zzfz;
        java.lang.String str4 = this.zzfs;
        java.lang.String str5 = str4 != null ? str4 : "";
        boolean z = this.zzgb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51 + java.lang.String.valueOf(strJoin).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(str5).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
