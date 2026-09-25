package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
public interface PinningInfoProvider {
    public static final long PIN_CREATION_TIME_UNDEFINED = -1;

    java.lang.String getKeyStorePassword();

    java.io.InputStream getKeyStoreStream();

    long getPinCreationTimeInMillis();

    java.lang.String[] getPins();
}
