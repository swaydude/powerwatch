package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzi' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzim {
    public static final com.google.android.gms.internal.measurement.zzim zza;
    public static final com.google.android.gms.internal.measurement.zzim zzb;
    public static final com.google.android.gms.internal.measurement.zzim zzc;
    public static final com.google.android.gms.internal.measurement.zzim zzd;
    public static final com.google.android.gms.internal.measurement.zzim zze;
    public static final com.google.android.gms.internal.measurement.zzim zzf;
    public static final com.google.android.gms.internal.measurement.zzim zzg;
    public static final com.google.android.gms.internal.measurement.zzim zzh;
    public static final com.google.android.gms.internal.measurement.zzim zzi;
    public static final com.google.android.gms.internal.measurement.zzim zzj;
    public static final com.google.android.gms.internal.measurement.zzim zzk;
    public static final com.google.android.gms.internal.measurement.zzim zzl;
    public static final com.google.android.gms.internal.measurement.zzim zzm;
    public static final com.google.android.gms.internal.measurement.zzim zzn;
    public static final com.google.android.gms.internal.measurement.zzim zzo;
    public static final com.google.android.gms.internal.measurement.zzim zzp;
    public static final com.google.android.gms.internal.measurement.zzim zzq;
    public static final com.google.android.gms.internal.measurement.zzim zzr;
    private static final /* synthetic */ com.google.android.gms.internal.measurement.zzim[] zzu;
    private final com.google.android.gms.internal.measurement.zzip zzs;
    private final int zzt;

    public static com.google.android.gms.internal.measurement.zzim[] values() {
        return (com.google.android.gms.internal.measurement.zzim[]) zzu.clone();
    }

    private zzim(java.lang.String str, int i, com.google.android.gms.internal.measurement.zzip zzipVar, int i2) {
        super(str, i);
        this.zzs = zzipVar;
        this.zzt = i2;
    }

    public final com.google.android.gms.internal.measurement.zzip zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    /* synthetic */ zzim(java.lang.String str, int i, com.google.android.gms.internal.measurement.zzip zzipVar, int i2, com.google.android.gms.internal.measurement.zzij zzijVar) {
        this(str, i, zzipVar, i2);
    }

    static {
        com.google.android.gms.internal.measurement.zzim zzimVar = new com.google.android.gms.internal.measurement.zzim("DOUBLE", 0, com.google.android.gms.internal.measurement.zzip.DOUBLE, 1);
        zza = zzimVar;
        com.google.android.gms.internal.measurement.zzim zzimVar2 = new com.google.android.gms.internal.measurement.zzim("FLOAT", 1, com.google.android.gms.internal.measurement.zzip.FLOAT, 5);
        zzb = zzimVar2;
        final int i = 2;
        com.google.android.gms.internal.measurement.zzim zzimVar3 = new com.google.android.gms.internal.measurement.zzim("INT64", 2, com.google.android.gms.internal.measurement.zzip.LONG, 0);
        zzc = zzimVar3;
        final int i2 = 3;
        com.google.android.gms.internal.measurement.zzim zzimVar4 = new com.google.android.gms.internal.measurement.zzim("UINT64", 3, com.google.android.gms.internal.measurement.zzip.LONG, 0);
        zzd = zzimVar4;
        com.google.android.gms.internal.measurement.zzim zzimVar5 = new com.google.android.gms.internal.measurement.zzim("INT32", 4, com.google.android.gms.internal.measurement.zzip.INT, 0);
        zze = zzimVar5;
        com.google.android.gms.internal.measurement.zzim zzimVar6 = new com.google.android.gms.internal.measurement.zzim("FIXED64", 5, com.google.android.gms.internal.measurement.zzip.LONG, 1);
        zzf = zzimVar6;
        com.google.android.gms.internal.measurement.zzim zzimVar7 = new com.google.android.gms.internal.measurement.zzim("FIXED32", 6, com.google.android.gms.internal.measurement.zzip.INT, 5);
        zzg = zzimVar7;
        com.google.android.gms.internal.measurement.zzim zzimVar8 = new com.google.android.gms.internal.measurement.zzim("BOOL", 7, com.google.android.gms.internal.measurement.zzip.BOOLEAN, 0);
        zzh = zzimVar8;
        final com.google.android.gms.internal.measurement.zzip zzipVar = com.google.android.gms.internal.measurement.zzip.STRING;
        final java.lang.String str = "STRING";
        final int i3 = 8;
        com.google.android.gms.internal.measurement.zzim zzimVar9 = new com.google.android.gms.internal.measurement.zzim(str, i3, zzipVar, i) { // from class: com.google.android.gms.internal.measurement.zzil
            {
                int i4 = 8;
                int i5 = 2;
                com.google.android.gms.internal.measurement.zzij zzijVar = null;
            }
        };
        zzi = zzimVar9;
        final com.google.android.gms.internal.measurement.zzip zzipVar2 = com.google.android.gms.internal.measurement.zzip.MESSAGE;
        final java.lang.String str2 = "GROUP";
        final int i4 = 9;
        com.google.android.gms.internal.measurement.zzim zzimVar10 = new com.google.android.gms.internal.measurement.zzim(str2, i4, zzipVar2, i2) { // from class: com.google.android.gms.internal.measurement.zzio
            {
                int i5 = 9;
                int i6 = 3;
                com.google.android.gms.internal.measurement.zzij zzijVar = null;
            }
        };
        zzj = zzimVar10;
        final com.google.android.gms.internal.measurement.zzip zzipVar3 = com.google.android.gms.internal.measurement.zzip.MESSAGE;
        final java.lang.String str3 = "MESSAGE";
        final int i5 = 10;
        com.google.android.gms.internal.measurement.zzim zzimVar11 = new com.google.android.gms.internal.measurement.zzim(str3, i5, zzipVar3, i) { // from class: com.google.android.gms.internal.measurement.zzin
            {
                int i6 = 10;
                int i7 = 2;
                com.google.android.gms.internal.measurement.zzij zzijVar = null;
            }
        };
        zzk = zzimVar11;
        final com.google.android.gms.internal.measurement.zzip zzipVar4 = com.google.android.gms.internal.measurement.zzip.BYTE_STRING;
        final java.lang.String str4 = "BYTES";
        final int i6 = 11;
        com.google.android.gms.internal.measurement.zzim zzimVar12 = new com.google.android.gms.internal.measurement.zzim(str4, i6, zzipVar4, i) { // from class: com.google.android.gms.internal.measurement.zziq
            {
                int i7 = 11;
                int i8 = 2;
                com.google.android.gms.internal.measurement.zzij zzijVar = null;
            }
        };
        zzl = zzimVar12;
        com.google.android.gms.internal.measurement.zzim zzimVar13 = new com.google.android.gms.internal.measurement.zzim("UINT32", 12, com.google.android.gms.internal.measurement.zzip.INT, 0);
        zzm = zzimVar13;
        com.google.android.gms.internal.measurement.zzim zzimVar14 = new com.google.android.gms.internal.measurement.zzim("ENUM", 13, com.google.android.gms.internal.measurement.zzip.ENUM, 0);
        zzn = zzimVar14;
        com.google.android.gms.internal.measurement.zzim zzimVar15 = new com.google.android.gms.internal.measurement.zzim("SFIXED32", 14, com.google.android.gms.internal.measurement.zzip.INT, 5);
        zzo = zzimVar15;
        com.google.android.gms.internal.measurement.zzim zzimVar16 = new com.google.android.gms.internal.measurement.zzim("SFIXED64", 15, com.google.android.gms.internal.measurement.zzip.LONG, 1);
        zzp = zzimVar16;
        com.google.android.gms.internal.measurement.zzim zzimVar17 = new com.google.android.gms.internal.measurement.zzim("SINT32", 16, com.google.android.gms.internal.measurement.zzip.INT, 0);
        zzq = zzimVar17;
        com.google.android.gms.internal.measurement.zzim zzimVar18 = new com.google.android.gms.internal.measurement.zzim("SINT64", 17, com.google.android.gms.internal.measurement.zzip.LONG, 0);
        zzr = zzimVar18;
        zzu = new com.google.android.gms.internal.measurement.zzim[]{zzimVar, zzimVar2, zzimVar3, zzimVar4, zzimVar5, zzimVar6, zzimVar7, zzimVar8, zzimVar9, zzimVar10, zzimVar11, zzimVar12, zzimVar13, zzimVar14, zzimVar15, zzimVar16, zzimVar17, zzimVar18};
    }
}
