package com.baidu.mapsdkvi;

/* JADX INFO: loaded from: classes.dex */
final class a extends android.content.BroadcastReceiver {
    a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.baidu.mapsdkvi.VDeviceAPI.onNetworkStateChanged();
    }
}
