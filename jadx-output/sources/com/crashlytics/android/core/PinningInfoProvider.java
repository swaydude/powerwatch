package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
public interface PinningInfoProvider {
    java.lang.String getKeyStorePassword();

    java.io.InputStream getKeyStoreStream();

    java.lang.String[] getPins();
}
