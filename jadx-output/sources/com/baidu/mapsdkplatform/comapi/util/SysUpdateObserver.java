package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public interface SysUpdateObserver {
    void init();

    void updateNetworkInfo(android.content.Context context);

    void updateNetworkProxy(android.content.Context context);

    void updatePhoneInfo();
}
