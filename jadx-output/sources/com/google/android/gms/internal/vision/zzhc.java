package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzhc extends java.io.IOException {
    private com.google.android.gms.internal.vision.zzic zzxh;

    public zzhc(java.lang.String str) {
        super(str);
        this.zzxh = null;
    }

    public final com.google.android.gms.internal.vision.zzhc zzg(com.google.android.gms.internal.vision.zzic zzicVar) {
        this.zzxh = zzicVar;
        return this;
    }

    static com.google.android.gms.internal.vision.zzhc zzgm() {
        return new com.google.android.gms.internal.vision.zzhc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static com.google.android.gms.internal.vision.zzhc zzgn() {
        return new com.google.android.gms.internal.vision.zzhc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.vision.zzhc zzgo() {
        return new com.google.android.gms.internal.vision.zzhc("CodedInputStream encountered a malformed varint.");
    }

    static com.google.android.gms.internal.vision.zzhc zzgp() {
        return new com.google.android.gms.internal.vision.zzhc("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.vision.zzhc zzgq() {
        return new com.google.android.gms.internal.vision.zzhc("Protocol message end-group tag did not match expected tag.");
    }

    static com.google.android.gms.internal.vision.zzhb zzgr() {
        return new com.google.android.gms.internal.vision.zzhb("Protocol message tag had invalid wire type.");
    }

    static com.google.android.gms.internal.vision.zzhc zzgs() {
        return new com.google.android.gms.internal.vision.zzhc("Failed to parse the message.");
    }

    static com.google.android.gms.internal.vision.zzhc zzgt() {
        return new com.google.android.gms.internal.vision.zzhc("Protocol message had invalid UTF-8.");
    }
}
