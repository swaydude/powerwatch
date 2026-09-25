package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpRequestFactory {
    io.fabric.sdk.android.services.network.HttpRequest buildHttpRequest(io.fabric.sdk.android.services.network.HttpMethod httpMethod, java.lang.String str);

    io.fabric.sdk.android.services.network.HttpRequest buildHttpRequest(io.fabric.sdk.android.services.network.HttpMethod httpMethod, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    io.fabric.sdk.android.services.network.PinningInfoProvider getPinningInfoProvider();

    void setPinningInfoProvider(io.fabric.sdk.android.services.network.PinningInfoProvider pinningInfoProvider);
}
