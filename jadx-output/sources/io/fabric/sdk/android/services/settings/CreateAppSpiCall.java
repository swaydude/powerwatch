package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class CreateAppSpiCall extends io.fabric.sdk.android.services.settings.AbstractAppSpiCall {
    @Override // io.fabric.sdk.android.services.settings.AbstractAppSpiCall, io.fabric.sdk.android.services.settings.AppSpiCall
    public /* bridge */ /* synthetic */ boolean invoke(io.fabric.sdk.android.services.settings.AppRequestData appRequestData) {
        return super.invoke(appRequestData);
    }

    public CreateAppSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory) {
        super(kit, str, str2, httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod.POST);
    }
}
