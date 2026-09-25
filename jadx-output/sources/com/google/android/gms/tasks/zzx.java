package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzx implements com.google.android.gms.tasks.Continuation<java.lang.Void, com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>>> {
    private final /* synthetic */ java.util.Collection zzae;

    zzx(java.util.Collection collection) {
        this.zzae = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> then(com.google.android.gms.tasks.Task<java.lang.Void> task) throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zzae);
        return com.google.android.gms.tasks.Tasks.forResult(arrayList);
    }
}
