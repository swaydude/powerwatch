package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public enum zzeo implements com.google.android.gms.internal.vision.zzgw {
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    YT_CODE(15),
    TEZ_CODE(16);

    private static final com.google.android.gms.internal.vision.zzgv<com.google.android.gms.internal.vision.zzeo> zzgy = new com.google.android.gms.internal.vision.zzgv<com.google.android.gms.internal.vision.zzeo>() { // from class: com.google.android.gms.internal.vision.zzeq
        @Override // com.google.android.gms.internal.vision.zzgv
        public final /* synthetic */ com.google.android.gms.internal.vision.zzgw zzg(int i) {
            return com.google.android.gms.internal.vision.zzeo.zzab(i);
        }
    };
    private final int value;

    @Override // com.google.android.gms.internal.vision.zzgw
    public final int zzag() {
        return this.value;
    }

    public static com.google.android.gms.internal.vision.zzeo zzab(int i) {
        switch (i) {
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case 9:
                return QR_CODE;
            case 10:
                return UPC_A;
            case 11:
                return UPC_E;
            case 12:
                return PDF417;
            case 13:
                return AZTEC;
            case 14:
                return DATABAR;
            case 15:
                return YT_CODE;
            case 16:
                return TEZ_CODE;
            default:
                return null;
        }
    }

    public static com.google.android.gms.internal.vision.zzgy zzah() {
        return com.google.android.gms.internal.vision.zzep.zzhb;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "<" + getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + kotlin.text.Typography.greater;
    }

    zzeo(int i) {
        this.value = i;
    }
}
