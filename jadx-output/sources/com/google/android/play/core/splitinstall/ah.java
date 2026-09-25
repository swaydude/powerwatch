package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class ah extends com.google.android.play.core.splitinstall.ai<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> {
    ah(com.google.android.play.core.splitinstall.r rVar, com.google.android.play.core.tasks.h<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> hVar) {
        super(rVar, hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.splitinstall.ai, com.google.android.play.core.internal.bd
    public final void a(java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
        super.a(list);
        java.util.List arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<android.os.Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.play.core.splitinstall.SplitInstallSessionState.a(it.next()));
        }
        this.a.a((T) arrayList);
    }
}
