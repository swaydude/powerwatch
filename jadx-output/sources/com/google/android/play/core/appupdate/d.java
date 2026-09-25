package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class d implements com.google.android.play.core.common.IntentSenderForResultStarter {
    private final /* synthetic */ android.app.Activity a;

    d(android.app.Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.play.core.common.IntentSenderForResultStarter
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        this.a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
