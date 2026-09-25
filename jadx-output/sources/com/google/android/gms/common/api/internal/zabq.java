package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zabq extends android.content.BroadcastReceiver {
    private android.content.Context mContext;
    private final com.google.android.gms.common.api.internal.zabp zajl;

    public zabq(com.google.android.gms.common.api.internal.zabp zabpVar) {
        this.zajl = zabpVar;
    }

    public final void zac(android.content.Context context) {
        this.mContext = context;
    }

    public final synchronized void unregister() {
        android.content.Context context = this.mContext;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.mContext = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.zajl.zas();
            unregister();
        }
    }
}
