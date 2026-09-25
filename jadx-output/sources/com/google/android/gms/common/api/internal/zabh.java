package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabh implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaia;

    zabh(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager) {
        this.zaia = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        this.zaia.handler.sendMessage(this.zaia.handler.obtainMessage(1, java.lang.Boolean.valueOf(z)));
    }
}
