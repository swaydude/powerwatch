package com.google.android.play.core.listener;

/* JADX INFO: loaded from: classes2.dex */
final class b extends android.content.BroadcastReceiver {
    private final /* synthetic */ com.google.android.play.core.listener.a a;

    private b(com.google.android.play.core.listener.a aVar) {
        this.a = aVar;
    }

    /* synthetic */ b(com.google.android.play.core.listener.a aVar, byte b) {
        this(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.a(context, intent);
    }
}
