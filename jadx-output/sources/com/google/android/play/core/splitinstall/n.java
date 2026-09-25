package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends com.google.android.play.core.listener.a<com.google.android.play.core.splitinstall.SplitInstallSessionState> {
    private static com.google.android.play.core.splitinstall.n b;
    private final android.os.Handler c;
    private final com.google.android.play.core.splitinstall.c d;

    private n(android.content.Context context, com.google.android.play.core.splitinstall.c cVar) {
        super(new com.google.android.play.core.splitcompat.a("SplitInstallListenerRegistry"), new android.content.IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.d = cVar;
    }

    public static synchronized com.google.android.play.core.splitinstall.n a(android.content.Context context) {
        if (b == null) {
            b = new com.google.android.play.core.splitinstall.n(context, com.google.android.play.core.splitinstall.g.a);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.c.post(new com.google.android.play.core.splitinstall.m(this, splitInstallSessionState, i, i2));
    }

    @Override // com.google.android.play.core.listener.a
    protected final void a(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionStateA = com.google.android.play.core.splitinstall.SplitInstallSessionState.a(bundleExtra);
        this.a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", splitInstallSessionStateA);
        com.google.android.play.core.splitinstall.a aVarA = this.d.a();
        if (splitInstallSessionStateA.status() != 3 || aVarA == null) {
            a(splitInstallSessionStateA);
        } else {
            aVarA.a(splitInstallSessionStateA.c(), new com.google.android.play.core.splitinstall.e(this, splitInstallSessionStateA, intent, context));
        }
    }
}
