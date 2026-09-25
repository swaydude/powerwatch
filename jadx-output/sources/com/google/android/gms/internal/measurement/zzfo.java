package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzfo extends java.io.IOException {
    private com.google.android.gms.internal.measurement.zzgo zza;

    public zzfo(java.lang.String str) {
        super(str);
        this.zza = null;
    }

    static com.google.android.gms.internal.measurement.zzfo zza() {
        return new com.google.android.gms.internal.measurement.zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static com.google.android.gms.internal.measurement.zzfo zzb() {
        return new com.google.android.gms.internal.measurement.zzfo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.measurement.zzfo zzc() {
        return new com.google.android.gms.internal.measurement.zzfo("CodedInputStream encountered a malformed varint.");
    }

    static com.google.android.gms.internal.measurement.zzfo zzd() {
        return new com.google.android.gms.internal.measurement.zzfo("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.measurement.zzfo zze() {
        return new com.google.android.gms.internal.measurement.zzfo("Protocol message end-group tag did not match expected tag.");
    }

    static com.google.android.gms.internal.measurement.zzfn zzf() {
        return new com.google.android.gms.internal.measurement.zzfn("Protocol message tag had invalid wire type.");
    }

    static com.google.android.gms.internal.measurement.zzfo zzg() {
        return new com.google.android.gms.internal.measurement.zzfo("Failed to parse the message.");
    }

    static com.google.android.gms.internal.measurement.zzfo zzh() {
        return new com.google.android.gms.internal.measurement.zzfo("Protocol message had invalid UTF-8.");
    }
}
