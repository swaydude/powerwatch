package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zac extends com.google.android.gms.common.internal.DialogRedirect {
    private final /* synthetic */ androidx.fragment.app.Fragment val$fragment;
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ android.content.Intent zaos;

    zac(android.content.Intent intent, androidx.fragment.app.Fragment fragment, int i) {
        this.zaos = intent;
        this.val$fragment = fragment;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        android.content.Intent intent = this.zaos;
        if (intent != null) {
            this.val$fragment.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
