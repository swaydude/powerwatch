package com.crashlytics.android;

/* JADX INFO: loaded from: classes.dex */
class ManifestEnabledCheckStrategy implements com.crashlytics.android.CrashlyticsInitProvider.EnabledCheckStrategy {
    ManifestEnabledCheckStrategy() {
    }

    @Override // com.crashlytics.android.CrashlyticsInitProvider.EnabledCheckStrategy
    public boolean isCrashlyticsEnabled(android.content.Context context) {
        return io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(context).shouldAutoInitialize();
    }
}
