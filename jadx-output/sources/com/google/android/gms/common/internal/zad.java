package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zad extends com.google.android.gms.common.internal.DialogRedirect {
    private final /* synthetic */ android.app.Activity val$activity;
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ android.content.Intent zaos;

    zad(android.content.Intent intent, android.app.Activity activity, int i) {
        this.zaos = intent;
        this.val$activity = activity;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        android.content.Intent intent = this.zaos;
        if (intent != null) {
            this.val$activity.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
