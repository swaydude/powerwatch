package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zae extends com.google.android.gms.common.internal.DialogRedirect {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ android.content.Intent zaos;
    private final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleFragment zaot;

    zae(android.content.Intent intent, com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, int i) {
        this.zaos = intent;
        this.zaot = lifecycleFragment;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        android.content.Intent intent = this.zaos;
        if (intent != null) {
            this.zaot.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
