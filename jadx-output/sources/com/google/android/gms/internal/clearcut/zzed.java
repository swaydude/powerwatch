package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzed {
    private final int flags;
    private final java.lang.Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final int[] zzms;
    private final com.google.android.gms.internal.clearcut.zzee zznh;
    private java.lang.Class<?> zzni;
    private final int zznj;
    private final int zznk;
    private final int zznl;
    private final int zznm;
    private final int zznn;
    private final int zzno;
    private int zznp;
    private int zznq;
    private int zznr = Integer.MAX_VALUE;
    private int zzns = Integer.MIN_VALUE;
    private int zznt = 0;
    private int zznu = 0;
    private int zznv = 0;
    private int zznw = 0;
    private int zznx = 0;
    private int zzny;
    private int zznz;
    private int zzoa;
    private int zzob;
    private int zzoc;
    private java.lang.reflect.Field zzod;
    private java.lang.Object zzoe;
    private java.lang.Object zzof;
    private java.lang.Object zzog;

    zzed(java.lang.Class<?> cls, java.lang.String str, java.lang.Object[] objArr) {
        this.zzni = cls;
        com.google.android.gms.internal.clearcut.zzee zzeeVar = new com.google.android.gms.internal.clearcut.zzee(str);
        this.zznh = zzeeVar;
        this.zzmj = objArr;
        this.flags = zzeeVar.next();
        int next = zzeeVar.next();
        this.zznj = next;
        if (next == 0) {
            this.zznk = 0;
            this.zznl = 0;
            this.zzmk = 0;
            this.zzml = 0;
            this.zznm = 0;
            this.zznn = 0;
            this.zzmm = 0;
            this.zzno = 0;
            this.zzms = null;
            return;
        }
        int next2 = zzeeVar.next();
        this.zznk = next2;
        int next3 = zzeeVar.next();
        this.zznl = next3;
        this.zzmk = zzeeVar.next();
        this.zzml = zzeeVar.next();
        this.zznn = zzeeVar.next();
        this.zzmm = zzeeVar.next();
        this.zznm = zzeeVar.next();
        this.zzno = zzeeVar.next();
        int next4 = zzeeVar.next();
        this.zzms = next4 != 0 ? new int[next4] : null;
        this.zznp = (next2 << 1) + next3;
    }

    private static java.lang.reflect.Field zza(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String string = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(name).length() + java.lang.String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    private final java.lang.Object zzcw() {
        java.lang.Object[] objArr = this.zzmj;
        int i = this.zznp;
        this.zznp = i + 1;
        return objArr[i];
    }

    private final boolean zzcz() {
        return (this.flags & 1) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    final boolean next() {
        int i;
        java.lang.Object type;
        if (!this.zznh.hasNext()) {
            return false;
        }
        this.zzny = this.zznh.next();
        int next = this.zznh.next();
        this.zznz = next;
        int i2 = next & 255;
        this.zzoa = i2;
        int i3 = this.zzny;
        if (i3 < this.zznr) {
            this.zznr = i3;
        }
        if (i3 > this.zzns) {
            this.zzns = i3;
        }
        if (i2 == com.google.android.gms.internal.clearcut.zzcb.MAP.id()) {
            this.zznt++;
        } else if (this.zzoa >= com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST.id() && this.zzoa <= com.google.android.gms.internal.clearcut.zzcb.GROUP_LIST.id()) {
            this.zznu++;
        }
        int i4 = this.zznx + 1;
        this.zznx = i4;
        if (com.google.android.gms.internal.clearcut.zzeh.zzc(this.zznr, this.zzny, i4)) {
            int i5 = this.zzny + 1;
            this.zznw = i5;
            i = i5 - this.zznr;
        } else {
            i = this.zznv + 1;
        }
        this.zznv = i;
        if ((this.zznz & 1024) != 0) {
            int[] iArr = this.zzms;
            int i6 = this.zznq;
            this.zznq = i6 + 1;
            iArr[i6] = this.zzny;
        }
        this.zzoe = null;
        this.zzof = null;
        this.zzog = null;
        if (zzda()) {
            this.zzob = this.zznh.next();
            if (this.zzoa == com.google.android.gms.internal.clearcut.zzcb.MESSAGE.id() + 51 || this.zzoa == com.google.android.gms.internal.clearcut.zzcb.GROUP.id() + 51) {
                type = zzcw();
                this.zzoe = type;
            } else if (this.zzoa == com.google.android.gms.internal.clearcut.zzcb.ENUM.id() + 51 && zzcz()) {
                this.zzof = zzcw();
            }
        } else {
            this.zzod = zza(this.zzni, (java.lang.String) zzcw());
            if (zzde()) {
                this.zzoc = this.zznh.next();
            }
            if (this.zzoa == com.google.android.gms.internal.clearcut.zzcb.MESSAGE.id() || this.zzoa == com.google.android.gms.internal.clearcut.zzcb.GROUP.id()) {
                type = this.zzod.getType();
                this.zzoe = type;
            } else if (this.zzoa == com.google.android.gms.internal.clearcut.zzcb.MESSAGE_LIST.id() || this.zzoa == com.google.android.gms.internal.clearcut.zzcb.GROUP_LIST.id()) {
                type = zzcw();
                this.zzoe = type;
            } else if (this.zzoa == com.google.android.gms.internal.clearcut.zzcb.ENUM.id() || this.zzoa == com.google.android.gms.internal.clearcut.zzcb.ENUM_LIST.id() || this.zzoa == com.google.android.gms.internal.clearcut.zzcb.ENUM_LIST_PACKED.id()) {
                if (zzcz()) {
                    this.zzof = zzcw();
                }
            } else if (this.zzoa == com.google.android.gms.internal.clearcut.zzcb.MAP.id()) {
                this.zzog = zzcw();
                if ((this.zznz & 2048) != 0) {
                    this.zzof = zzcw();
                }
            }
        }
        return true;
    }

    final int zzcx() {
        return this.zzny;
    }

    final int zzcy() {
        return this.zzoa;
    }

    final boolean zzda() {
        return this.zzoa > com.google.android.gms.internal.clearcut.zzcb.MAP.id();
    }

    final java.lang.reflect.Field zzdb() {
        int i = this.zzob << 1;
        java.lang.Object obj = this.zzmj[i];
        if (obj instanceof java.lang.reflect.Field) {
            return (java.lang.reflect.Field) obj;
        }
        java.lang.reflect.Field fieldZza = zza(this.zzni, (java.lang.String) obj);
        this.zzmj[i] = fieldZza;
        return fieldZza;
    }

    final java.lang.reflect.Field zzdc() {
        int i = (this.zzob << 1) + 1;
        java.lang.Object obj = this.zzmj[i];
        if (obj instanceof java.lang.reflect.Field) {
            return (java.lang.reflect.Field) obj;
        }
        java.lang.reflect.Field fieldZza = zza(this.zzni, (java.lang.String) obj);
        this.zzmj[i] = fieldZza;
        return fieldZza;
    }

    final java.lang.reflect.Field zzdd() {
        return this.zzod;
    }

    final boolean zzde() {
        return zzcz() && this.zzoa <= com.google.android.gms.internal.clearcut.zzcb.GROUP.id();
    }

    final java.lang.reflect.Field zzdf() {
        int i = (this.zznk << 1) + (this.zzoc / 32);
        java.lang.Object obj = this.zzmj[i];
        if (obj instanceof java.lang.reflect.Field) {
            return (java.lang.reflect.Field) obj;
        }
        java.lang.reflect.Field fieldZza = zza(this.zzni, (java.lang.String) obj);
        this.zzmj[i] = fieldZza;
        return fieldZza;
    }

    final int zzdg() {
        return this.zzoc % 32;
    }

    final boolean zzdh() {
        return (this.zznz & 256) != 0;
    }

    final boolean zzdi() {
        return (this.zznz & 512) != 0;
    }

    final java.lang.Object zzdj() {
        return this.zzoe;
    }

    final java.lang.Object zzdk() {
        return this.zzof;
    }

    final java.lang.Object zzdl() {
        return this.zzog;
    }
}
