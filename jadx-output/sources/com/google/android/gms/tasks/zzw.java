package com.google.android.gms.tasks;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* JADX INFO: loaded from: classes.dex */
final class zzw<TResult> implements com.google.android.gms.tasks.Continuation<java.lang.Void, java.util.List<TResult>> {
    private final /* synthetic */ java.util.Collection zzae;

    zzw(java.util.Collection collection) {
        this.zzae = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task<java.lang.Void> task) throws java.lang.Exception {
        if (this.zzae.size() == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zzae.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.tasks.Task) it.next()).getResult());
        }
        return arrayList;
    }
}
