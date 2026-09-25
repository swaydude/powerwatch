package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public enum zzes implements com.google.android.gms.internal.vision.zzgw {
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12);

    private static final com.google.android.gms.internal.vision.zzgv<com.google.android.gms.internal.vision.zzes> zzgy = new com.google.android.gms.internal.vision.zzgv<com.google.android.gms.internal.vision.zzes>() { // from class: com.google.android.gms.internal.vision.zzer
        @Override // com.google.android.gms.internal.vision.zzgv
        public final /* synthetic */ com.google.android.gms.internal.vision.zzgw zzg(int i) {
            return com.google.android.gms.internal.vision.zzes.zzac(i);
        }
    };
    private final int value;

    @Override // com.google.android.gms.internal.vision.zzgw
    public final int zzag() {
        return this.value;
    }

    public static com.google.android.gms.internal.vision.zzes zzac(int i) {
        switch (i) {
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            default:
                return null;
        }
    }

    public static com.google.android.gms.internal.vision.zzgy zzah() {
        return com.google.android.gms.internal.vision.zzeu.zzhb;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "<" + getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + kotlin.text.Typography.greater;
    }

    zzes(int i) {
        this.value = i;
    }
}
