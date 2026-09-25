package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhk extends com.google.android.gms.internal.vision.zzex<java.lang.String> implements com.google.android.gms.internal.vision.zzhj, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzhk zzyb;
    private static final com.google.android.gms.internal.vision.zzhj zzyc;
    private final java.util.List<java.lang.Object> zzyd;

    public zzhk() {
        this(10);
    }

    public zzhk(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    private zzhk(java.util.ArrayList<java.lang.Object> arrayList) {
        this.zzyd = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzyd.size();
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        zzdq();
        if (collection instanceof com.google.android.gms.internal.vision.zzhj) {
            collection = ((com.google.android.gms.internal.vision.zzhj) collection).zzgx();
        }
        boolean zAddAll = this.zzyd.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzdq();
        this.zzyd.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final void zzc(com.google.android.gms.internal.vision.zzfh zzfhVar) {
        zzdq();
        this.zzyd.add(zzfhVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final java.lang.Object getRaw(int i) {
        return this.zzyd.get(i);
    }

    private static java.lang.String zzj(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
            return ((com.google.android.gms.internal.vision.zzfh) obj).zzer();
        }
        return com.google.android.gms.internal.vision.zzgt.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final java.util.List<?> zzgx() {
        return java.util.Collections.unmodifiableList(this.zzyd);
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final com.google.android.gms.internal.vision.zzhj zzgy() {
        return zzdo() ? new com.google.android.gms.internal.vision.zzjo(this) : this;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zzdq();
        return zzj(this.zzyd.set(i, (java.lang.String) obj));
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzdq();
        java.lang.Object objRemove = this.zzyd.remove(i);
        this.modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.vision.zzex, com.google.android.gms.internal.vision.zzgz
    public final /* bridge */ /* synthetic */ boolean zzdo() {
        return super.zzdo();
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzdq();
        this.zzyd.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz zzag(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzyd);
        return new com.google.android.gms.internal.vision.zzhk((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Object obj = this.zzyd.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
            com.google.android.gms.internal.vision.zzfh zzfhVar = (com.google.android.gms.internal.vision.zzfh) obj;
            java.lang.String strZzer = zzfhVar.zzer();
            if (zzfhVar.zzes()) {
                this.zzyd.set(i, strZzer);
            }
            return strZzer;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strZzh = com.google.android.gms.internal.vision.zzgt.zzh(bArr);
        if (com.google.android.gms.internal.vision.zzgt.zzg(bArr)) {
            this.zzyd.set(i, strZzh);
        }
        return strZzh;
    }

    static {
        com.google.android.gms.internal.vision.zzhk zzhkVar = new com.google.android.gms.internal.vision.zzhk();
        zzyb = zzhkVar;
        zzhkVar.zzdp();
        zzyc = zzhkVar;
    }
}
