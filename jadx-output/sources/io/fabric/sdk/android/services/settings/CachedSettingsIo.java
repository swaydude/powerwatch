package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public interface CachedSettingsIo {
    org.json.JSONObject readCachedSettings();

    void writeCachedSettings(long j, org.json.JSONObject jSONObject);
}
