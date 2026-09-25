package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class ae extends com.google.android.play.core.splitinstall.ai<com.google.android.play.core.splitinstall.SplitInstallSessionState> {
    ae(com.google.android.play.core.splitinstall.r rVar, com.google.android.play.core.tasks.h<com.google.android.play.core.splitinstall.SplitInstallSessionState> hVar) {
        super(rVar, hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.splitinstall.ai, com.google.android.play.core.internal.bd
    public final void b(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        super.b(i, bundle);
        this.a.a((T) com.google.android.play.core.splitinstall.SplitInstallSessionState.a(bundle));
    }
}
