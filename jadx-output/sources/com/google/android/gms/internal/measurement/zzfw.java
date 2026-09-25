package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfw extends com.google.android.gms.internal.measurement.zzdo<java.lang.String> implements com.google.android.gms.internal.measurement.zzfv, java.util.RandomAccess {
    private static final com.google.android.gms.internal.measurement.zzfw zza;
    private static final com.google.android.gms.internal.measurement.zzfv zzb;
    private final java.util.List<java.lang.Object> zzc;

    public zzfw() {
        this(10);
    }

    public zzfw(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    private zzfw(java.util.ArrayList<java.lang.Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        zzc();
        if (collection instanceof com.google.android.gms.internal.measurement.zzfv) {
            collection = ((com.google.android.gms.internal.measurement.zzfv) collection).zzb();
        }
        boolean zAddAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzc();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final void zza(com.google.android.gms.internal.measurement.zzdu zzduVar) {
        zzc();
        this.zzc.add(zzduVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final java.lang.Object zzb(int i) {
        return this.zzc.get(i);
    }

    private static java.lang.String zza(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
            return ((com.google.android.gms.internal.measurement.zzdu) obj).zzb();
        }
        return com.google.android.gms.internal.measurement.zzff.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final java.util.List<?> zzb() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final com.google.android.gms.internal.measurement.zzfv g_() {
        return zza() ? new com.google.android.gms.internal.measurement.zzia(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zzc();
        return zza(this.zzc.set(i, (java.lang.String) obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        java.lang.Object objRemove = this.zzc.remove(i);
        this.modCount++;
        return zza(objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, com.google.android.gms.internal.measurement.zzfl
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzc();
        this.zzc.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzfl zza(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzc);
        return new com.google.android.gms.internal.measurement.zzfw((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Object obj = this.zzc.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
            com.google.android.gms.internal.measurement.zzdu zzduVar = (com.google.android.gms.internal.measurement.zzdu) obj;
            java.lang.String strZzb = zzduVar.zzb();
            if (zzduVar.zzc()) {
                this.zzc.set(i, strZzb);
            }
            return strZzb;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strZzb2 = com.google.android.gms.internal.measurement.zzff.zzb(bArr);
        if (com.google.android.gms.internal.measurement.zzff.zza(bArr)) {
            this.zzc.set(i, strZzb2);
        }
        return strZzb2;
    }

    static {
        com.google.android.gms.internal.measurement.zzfw zzfwVar = new com.google.android.gms.internal.measurement.zzfw();
        zza = zzfwVar;
        zzfwVar.h_();
        zzb = zzfwVar;
    }
}
