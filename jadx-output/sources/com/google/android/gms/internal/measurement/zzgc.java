package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgc extends com.google.android.gms.internal.measurement.zzdo<java.lang.Long> implements com.google.android.gms.internal.measurement.zzfm, com.google.android.gms.internal.measurement.zzha, java.util.RandomAccess {
    private static final com.google.android.gms.internal.measurement.zzgc zza;
    private long[] zzb;
    private int zzc;

    public static com.google.android.gms.internal.measurement.zzgc zzd() {
        return zza;
    }

    zzgc() {
        this(new long[10], 0);
    }

    private zzgc(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzc();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzgc)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) obj;
        if (this.zzc != zzgcVar.zzc) {
            return false;
        }
        long[] jArr = zzgcVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZza = (iZza * 31) + com.google.android.gms.internal.measurement.zzff.zza(this.zzb[i]);
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzfm zza(int i) {
        if (i < this.zzc) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.measurement.zzgc(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzfm
    public final long zzb(int i) {
        zzd(i);
        return this.zzb[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzfm
    public final void zza(long j) {
        zzc();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        zzc();
        com.google.android.gms.internal.measurement.zzff.zza(collection);
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzgc)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) collection;
        int i = zzgcVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzb;
        if (i3 > jArr.length) {
            this.zzb = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzgcVar.zzb, 0, this.zzb, this.zzc, zzgcVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(java.lang.Long.valueOf(this.zzb[i]))) {
                long[] jArr = this.zzb;
                java.lang.System.arraycopy(jArr, i + 1, jArr, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zze(i));
        }
    }

    private final java.lang.String zze(int i) {
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
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzc();
        zzd(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        zzd(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zze(i));
        }
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = jLongValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zza(((java.lang.Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(zzb(i));
    }

    static {
        com.google.android.gms.internal.measurement.zzgc zzgcVar = new com.google.android.gms.internal.measurement.zzgc(new long[0], 0);
        zza = zzgcVar;
        zzgcVar.h_();
    }
}
