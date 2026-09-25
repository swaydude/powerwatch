package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public interface SettingsJsonTransform {
    io.fabric.sdk.android.services.settings.SettingsData buildFromJson(io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider, org.json.JSONObject jSONObject) throws org.json.JSONException;

    org.json.JSONObject toJson(io.fabric.sdk.android.services.settings.SettingsData settingsData) throws org.json.JSONException;
}
