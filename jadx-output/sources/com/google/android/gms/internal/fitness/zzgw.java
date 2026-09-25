package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgw extends com.google.android.gms.internal.fitness.zzfa<java.lang.String> implements com.google.android.gms.internal.fitness.zzgv, java.util.RandomAccess {
    private static final com.google.android.gms.internal.fitness.zzgw zzww;
    private static final com.google.android.gms.internal.fitness.zzgv zzwx;
    private final java.util.List<java.lang.Object> zzwy;

    public zzgw() {
        this(10);
    }

    public zzgw(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    private zzgw(java.util.ArrayList<java.lang.Object> arrayList) {
        this.zzwy = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzwy.size();
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        zzam();
        if (collection instanceof com.google.android.gms.internal.fitness.zzgv) {
            collection = ((com.google.android.gms.internal.fitness.zzgv) collection).zzbx();
        }
        boolean zAddAll = this.zzwy.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzam();
        this.zzwy.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.zzgv
    public final java.lang.Object zzad(int i) {
        return this.zzwy.get(i);
    }

    private static java.lang.String zze(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
            return ((com.google.android.gms.internal.fitness.zzff) obj).zzap();
        }
        return com.google.android.gms.internal.fitness.zzgk.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.fitness.zzgv
    public final java.util.List<?> zzbx() {
        return java.util.Collections.unmodifiableList(this.zzwy);
    }

    @Override // com.google.android.gms.internal.fitness.zzgv
    public final com.google.android.gms.internal.fitness.zzgv zzby() {
        return zzak() ? new com.google.android.gms.internal.fitness.zziv(this) : this;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zzam();
        return zze(this.zzwy.set(i, (java.lang.String) obj));
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzam();
        java.lang.Object objRemove = this.zzwy.remove(i);
        this.modCount++;
        return zze(objRemove);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, com.google.android.gms.internal.fitness.zzgl
    public final /* bridge */ /* synthetic */ boolean zzak() {
        return super.zzak();
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzam();
        this.zzwy.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.fitness.zzgl
    public final /* synthetic */ com.google.android.gms.internal.fitness.zzgl zzac(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzwy);
        return new com.google.android.gms.internal.fitness.zzgw((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Object obj = this.zzwy.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
            com.google.android.gms.internal.fitness.zzff zzffVar = (com.google.android.gms.internal.fitness.zzff) obj;
            java.lang.String strZzap = zzffVar.zzap();
            if (zzffVar.zzaq()) {
                this.zzwy.set(i, strZzap);
            }
            return strZzap;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strZzd = com.google.android.gms.internal.fitness.zzgk.zzd(bArr);
        if (com.google.android.gms.internal.fitness.zzgk.zzc(bArr)) {
            this.zzwy.set(i, strZzd);
        }
        return strZzd;
    }

    static {
        com.google.android.gms.internal.fitness.zzgw zzgwVar = new com.google.android.gms.internal.fitness.zzgw();
        zzww = zzgwVar;
        zzgwVar.zzal();
        zzwx = zzgwVar;
    }
}
