package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public enum zzex {
    DOUBLE(0, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.DOUBLE),
    FLOAT(1, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.FLOAT),
    INT64(2, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.LONG),
    UINT64(3, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.LONG),
    INT32(4, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.INT),
    FIXED64(5, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.LONG),
    FIXED32(6, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.INT),
    BOOL(7, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.BOOLEAN),
    STRING(8, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.STRING),
    MESSAGE(9, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.MESSAGE),
    BYTES(10, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.BYTE_STRING),
    UINT32(11, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.INT),
    ENUM(12, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.ENUM),
    SFIXED32(13, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.INT),
    SFIXED64(14, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.LONG),
    SINT32(15, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.INT),
    SINT64(16, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.LONG),
    GROUP(17, com.google.android.gms.internal.measurement.zzez.SCALAR, com.google.android.gms.internal.measurement.zzfq.MESSAGE),
    DOUBLE_LIST(18, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.DOUBLE),
    FLOAT_LIST(19, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.FLOAT),
    INT64_LIST(20, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    UINT64_LIST(21, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    INT32_LIST(22, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    FIXED64_LIST(23, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    FIXED32_LIST(24, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    BOOL_LIST(25, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.BOOLEAN),
    STRING_LIST(26, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.STRING),
    MESSAGE_LIST(27, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.MESSAGE),
    BYTES_LIST(28, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.BYTE_STRING),
    UINT32_LIST(29, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    ENUM_LIST(30, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.ENUM),
    SFIXED32_LIST(31, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    SFIXED64_LIST(32, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    SINT32_LIST(33, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    SINT64_LIST(34, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    DOUBLE_LIST_PACKED(35, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.DOUBLE),
    FLOAT_LIST_PACKED(36, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.FLOAT),
    INT64_LIST_PACKED(37, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    UINT64_LIST_PACKED(38, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    INT32_LIST_PACKED(39, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    FIXED64_LIST_PACKED(40, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    FIXED32_LIST_PACKED(41, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    BOOL_LIST_PACKED(42, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.BOOLEAN),
    UINT32_LIST_PACKED(43, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    ENUM_LIST_PACKED(44, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.ENUM),
    SFIXED32_LIST_PACKED(45, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    SFIXED64_LIST_PACKED(46, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    SINT32_LIST_PACKED(47, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.INT),
    SINT64_LIST_PACKED(48, com.google.android.gms.internal.measurement.zzez.PACKED_VECTOR, com.google.android.gms.internal.measurement.zzfq.LONG),
    GROUP_LIST(49, com.google.android.gms.internal.measurement.zzez.VECTOR, com.google.android.gms.internal.measurement.zzfq.MESSAGE),
    MAP(50, com.google.android.gms.internal.measurement.zzez.MAP, com.google.android.gms.internal.measurement.zzfq.VOID);

    private static final com.google.android.gms.internal.measurement.zzex[] zzbe;
    private static final java.lang.reflect.Type[] zzbf = new java.lang.reflect.Type[0];
    private final com.google.android.gms.internal.measurement.zzfq zzaz;
    private final int zzba;
    private final com.google.android.gms.internal.measurement.zzez zzbb;
    private final java.lang.Class<?> zzbc;
    private final boolean zzbd;

    zzex(int i, com.google.android.gms.internal.measurement.zzez zzezVar, com.google.android.gms.internal.measurement.zzfq zzfqVar) {
        int i2;
        this.zzba = i;
        this.zzbb = zzezVar;
        this.zzaz = zzfqVar;
        int i3 = com.google.android.gms.internal.measurement.zzfa.zza[zzezVar.ordinal()];
        if (i3 == 1 || i3 == 2) {
            this.zzbc = zzfqVar.zza();
        } else {
            this.zzbc = null;
        }
        this.zzbd = (zzezVar != com.google.android.gms.internal.measurement.zzez.SCALAR || (i2 = com.google.android.gms.internal.measurement.zzfa.zzb[zzfqVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public final int zza() {
        return this.zzba;
    }

    static {
        com.google.android.gms.internal.measurement.zzex[] zzexVarArrValues = values();
        zzbe = new com.google.android.gms.internal.measurement.zzex[zzexVarArrValues.length];
        for (com.google.android.gms.internal.measurement.zzex zzexVar : zzexVarArrValues) {
            zzbe[zzexVar.zzba] = zzexVar;
        }
    }
}
