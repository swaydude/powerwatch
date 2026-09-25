package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfg extends com.google.android.gms.internal.measurement.zzdo<java.lang.Integer> implements com.google.android.gms.internal.measurement.zzfj, com.google.android.gms.internal.measurement.zzha, java.util.RandomAccess {
    private static final com.google.android.gms.internal.measurement.zzfg zza;
    private int[] zzb;
    private int zzc;

    public static com.google.android.gms.internal.measurement.zzfg zzd() {
        return zza;
    }

    zzfg() {
        this(new int[10], 0);
    }

    private zzfg(int[] iArr, int i) {
        this.zzb = iArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzc();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzfg)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) obj;
        if (this.zzc != zzfgVar.zzc) {
            return false;
        }
        int[] iArr = zzfgVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzfj zza(int i) {
        if (i < this.zzc) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.measurement.zzfg(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
    }

    public final int zzc(int i) {
        zze(i);
        return this.zzb[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final void zzd(int i) {
        zzc();
        int i2 = this.zzc;
        int[] iArr = this.zzb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        zzc();
        com.google.android.gms.internal.measurement.zzff.zza(collection);
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzfg)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) collection;
        int i = zzfgVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzb;
        if (i3 > iArr.length) {
            this.zzb = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzfgVar.zzb, 0, this.zzb, this.zzc, zzfgVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(java.lang.Integer.valueOf(this.zzb[i]))) {
                int[] iArr = this.zzb;
                java.lang.System.arraycopy(iArr, i + 1, iArr, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zze(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i));
        }
    }

    private final java.lang.String zzf(int i) {
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzc();
        zze(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        zze(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        int i3 = this.zzc;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i));
        }
        int[] iArr = this.zzb;
        if (i2 < iArr.length) {
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
            this.zzb = iArr2;
        }
        this.zzb[i] = iIntValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzd(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(zzc(i));
    }

    static {
        com.google.android.gms.internal.measurement.zzfg zzfgVar = new com.google.android.gms.internal.measurement.zzfg(new int[0], 0);
        zza = zzfgVar;
        zzfgVar.h_();
    }
}
