package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.google.android.play.core.listener.a<com.google.android.play.core.install.InstallState> {
    public a(android.content.Context context) {
        super(new com.google.android.play.core.splitcompat.a("AppUpdateListenerRegistry"), new android.content.IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // com.google.android.play.core.listener.a
    protected final void a(android.content.Context context, android.content.Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.a.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.a.b("List of extras in received intent:", new java.lang.Object[0]);
        for (java.lang.String str : intent.getExtras().keySet()) {
            this.a.b("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        com.google.android.play.core.splitcompat.a aVar = this.a;
        aVar.b("List of extras in received intent needed by fromUpdateIntent:", new java.lang.Object[0]);
        aVar.b("Key: %s; value: %s", "install.status", java.lang.Integer.valueOf(intent.getIntExtra("install.status", 0)));
        aVar.b("Key: %s; value: %s", "error.code", java.lang.Integer.valueOf(intent.getIntExtra("error.code", 0)));
        com.google.android.play.core.install.InstallState installStateA = com.google.android.play.core.install.InstallState.a(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", installStateA);
        a(installStateA);
    }
}
