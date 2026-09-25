package com.google.android.gms.internal.vision;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzabu' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzka {
    public static final com.google.android.gms.internal.vision.zzka zzabm;
    public static final com.google.android.gms.internal.vision.zzka zzabn;
    public static final com.google.android.gms.internal.vision.zzka zzabo;
    public static final com.google.android.gms.internal.vision.zzka zzabp;
    public static final com.google.android.gms.internal.vision.zzka zzabq;
    public static final com.google.android.gms.internal.vision.zzka zzabr;
    public static final com.google.android.gms.internal.vision.zzka zzabs;
    public static final com.google.android.gms.internal.vision.zzka zzabt;
    public static final com.google.android.gms.internal.vision.zzka zzabu;
    public static final com.google.android.gms.internal.vision.zzka zzabv;
    public static final com.google.android.gms.internal.vision.zzka zzabw;
    public static final com.google.android.gms.internal.vision.zzka zzabx;
    public static final com.google.android.gms.internal.vision.zzka zzaby;
    public static final com.google.android.gms.internal.vision.zzka zzabz;
    public static final com.google.android.gms.internal.vision.zzka zzaca;
    public static final com.google.android.gms.internal.vision.zzka zzacb;
    public static final com.google.android.gms.internal.vision.zzka zzacc;
    public static final com.google.android.gms.internal.vision.zzka zzacd;
    private static final /* synthetic */ com.google.android.gms.internal.vision.zzka[] zzacg;
    private final com.google.android.gms.internal.vision.zzkd zzace;
    private final int zzacf;

    public static com.google.android.gms.internal.vision.zzka[] values() {
        return (com.google.android.gms.internal.vision.zzka[]) zzacg.clone();
    }

    private zzka(java.lang.String str, int i, com.google.android.gms.internal.vision.zzkd zzkdVar, int i2) {
        super(str, i);
        this.zzace = zzkdVar;
        this.zzacf = i2;
    }

    public final com.google.android.gms.internal.vision.zzkd zzip() {
        return this.zzace;
    }

    public final int zziq() {
        return this.zzacf;
    }

    /* synthetic */ zzka(java.lang.String str, int i, com.google.android.gms.internal.vision.zzkd zzkdVar, int i2, com.google.android.gms.internal.vision.zzjx zzjxVar) {
        this(str, i, zzkdVar, i2);
    }

    static {
        com.google.android.gms.internal.vision.zzka zzkaVar = new com.google.android.gms.internal.vision.zzka("DOUBLE", 0, com.google.android.gms.internal.vision.zzkd.DOUBLE, 1);
        zzabm = zzkaVar;
        com.google.android.gms.internal.vision.zzka zzkaVar2 = new com.google.android.gms.internal.vision.zzka("FLOAT", 1, com.google.android.gms.internal.vision.zzkd.FLOAT, 5);
        zzabn = zzkaVar2;
        final int i = 2;
        com.google.android.gms.internal.vision.zzka zzkaVar3 = new com.google.android.gms.internal.vision.zzka("INT64", 2, com.google.android.gms.internal.vision.zzkd.LONG, 0);
        zzabo = zzkaVar3;
        final int i2 = 3;
        com.google.android.gms.internal.vision.zzka zzkaVar4 = new com.google.android.gms.internal.vision.zzka("UINT64", 3, com.google.android.gms.internal.vision.zzkd.LONG, 0);
        zzabp = zzkaVar4;
        com.google.android.gms.internal.vision.zzka zzkaVar5 = new com.google.android.gms.internal.vision.zzka("INT32", 4, com.google.android.gms.internal.vision.zzkd.INT, 0);
        zzabq = zzkaVar5;
        com.google.android.gms.internal.vision.zzka zzkaVar6 = new com.google.android.gms.internal.vision.zzka("FIXED64", 5, com.google.android.gms.internal.vision.zzkd.LONG, 1);
        zzabr = zzkaVar6;
        com.google.android.gms.internal.vision.zzka zzkaVar7 = new com.google.android.gms.internal.vision.zzka("FIXED32", 6, com.google.android.gms.internal.vision.zzkd.INT, 5);
        zzabs = zzkaVar7;
        com.google.android.gms.internal.vision.zzka zzkaVar8 = new com.google.android.gms.internal.vision.zzka("BOOL", 7, com.google.android.gms.internal.vision.zzkd.BOOLEAN, 0);
        zzabt = zzkaVar8;
        final com.google.android.gms.internal.vision.zzkd zzkdVar = com.google.android.gms.internal.vision.zzkd.STRING;
        final java.lang.String str = "STRING";
        final int i3 = 8;
        com.google.android.gms.internal.vision.zzka zzkaVar9 = new com.google.android.gms.internal.vision.zzka(str, i3, zzkdVar, i) { // from class: com.google.android.gms.internal.vision.zzjz
            {
                int i4 = 8;
                int i5 = 2;
                com.google.android.gms.internal.vision.zzjx zzjxVar = null;
            }
        };
        zzabu = zzkaVar9;
        final com.google.android.gms.internal.vision.zzkd zzkdVar2 = com.google.android.gms.internal.vision.zzkd.MESSAGE;
        final java.lang.String str2 = "GROUP";
        final int i4 = 9;
        com.google.android.gms.internal.vision.zzka zzkaVar10 = new com.google.android.gms.internal.vision.zzka(str2, i4, zzkdVar2, i2) { // from class: com.google.android.gms.internal.vision.zzkc
            {
                int i5 = 9;
                int i6 = 3;
                com.google.android.gms.internal.vision.zzjx zzjxVar = null;
            }
        };
        zzabv = zzkaVar10;
        final com.google.android.gms.internal.vision.zzkd zzkdVar3 = com.google.android.gms.internal.vision.zzkd.MESSAGE;
        final java.lang.String str3 = "MESSAGE";
        final int i5 = 10;
        com.google.android.gms.internal.vision.zzka zzkaVar11 = new com.google.android.gms.internal.vision.zzka(str3, i5, zzkdVar3, i) { // from class: com.google.android.gms.internal.vision.zzkb
            {
                int i6 = 10;
                int i7 = 2;
                com.google.android.gms.internal.vision.zzjx zzjxVar = null;
            }
        };
        zzabw = zzkaVar11;
        final com.google.android.gms.internal.vision.zzkd zzkdVar4 = com.google.android.gms.internal.vision.zzkd.BYTE_STRING;
        final java.lang.String str4 = "BYTES";
        final int i6 = 11;
        com.google.android.gms.internal.vision.zzka zzkaVar12 = new com.google.android.gms.internal.vision.zzka(str4, i6, zzkdVar4, i) { // from class: com.google.android.gms.internal.vision.zzke
            {
                int i7 = 11;
                int i8 = 2;
                com.google.android.gms.internal.vision.zzjx zzjxVar = null;
            }
        };
        zzabx = zzkaVar12;
        com.google.android.gms.internal.vision.zzka zzkaVar13 = new com.google.android.gms.internal.vision.zzka("UINT32", 12, com.google.android.gms.internal.vision.zzkd.INT, 0);
        zzaby = zzkaVar13;
        com.google.android.gms.internal.vision.zzka zzkaVar14 = new com.google.android.gms.internal.vision.zzka("ENUM", 13, com.google.android.gms.internal.vision.zzkd.ENUM, 0);
        zzabz = zzkaVar14;
        com.google.android.gms.internal.vision.zzka zzkaVar15 = new com.google.android.gms.internal.vision.zzka("SFIXED32", 14, com.google.android.gms.internal.vision.zzkd.INT, 5);
        zzaca = zzkaVar15;
        com.google.android.gms.internal.vision.zzka zzkaVar16 = new com.google.android.gms.internal.vision.zzka("SFIXED64", 15, com.google.android.gms.internal.vision.zzkd.LONG, 1);
        zzacb = zzkaVar16;
        com.google.android.gms.internal.vision.zzka zzkaVar17 = new com.google.android.gms.internal.vision.zzka("SINT32", 16, com.google.android.gms.internal.vision.zzkd.INT, 0);
        zzacc = zzkaVar17;
        com.google.android.gms.internal.vision.zzka zzkaVar18 = new com.google.android.gms.internal.vision.zzka("SINT64", 17, com.google.android.gms.internal.vision.zzkd.LONG, 0);
        zzacd = zzkaVar18;
        zzacg = new com.google.android.gms.internal.vision.zzka[]{zzkaVar, zzkaVar2, zzkaVar3, zzkaVar4, zzkaVar5, zzkaVar6, zzkaVar7, zzkaVar8, zzkaVar9, zzkaVar10, zzkaVar11, zzkaVar12, zzkaVar13, zzkaVar14, zzkaVar15, zzkaVar16, zzkaVar17, zzkaVar18};
    }
}
