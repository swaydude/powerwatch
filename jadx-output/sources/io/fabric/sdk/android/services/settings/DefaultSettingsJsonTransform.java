package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
class DefaultSettingsJsonTransform implements io.fabric.sdk.android.services.settings.SettingsJsonTransform {
    DefaultSettingsJsonTransform() {
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsJsonTransform
    public io.fabric.sdk.android.services.settings.SettingsData buildFromJson(io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider, org.json.JSONObject jSONObject) throws org.json.JSONException {
        int iOptInt = jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_VERSION, 0);
        int iOptInt2 = jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.CACHE_DURATION_KEY, 3600);
        return new io.fabric.sdk.android.services.settings.SettingsData(getExpiresAtFrom(currentTimeProvider, iOptInt2, jSONObject), buildAppDataFrom(jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY)), buildSessionDataFrom(jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY)), buildPromptDataFrom(jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_KEY)), buildFeaturesSessionDataFrom(jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_KEY)), buildAnalyticsSessionDataFrom(jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_KEY)), buildBetaSettingsDataFrom(jSONObject.getJSONObject("beta")), iOptInt, iOptInt2);
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsJsonTransform
    public org.json.JSONObject toJson(io.fabric.sdk.android.services.settings.SettingsData settingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.EXPIRES_AT_KEY, settingsData.expiresAtMillis).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.CACHE_DURATION_KEY, settingsData.cacheDuration).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_VERSION, settingsData.settingsVersion).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_KEY, toFeaturesJson(settingsData.featuresData)).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_KEY, toAnalyticsJson(settingsData.analyticsSettingsData)).put("beta", toBetaJson(settingsData.betaSettingsData)).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, toAppJson(settingsData.appData)).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, toSessionJson(settingsData.sessionData)).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_KEY, toPromptJson(settingsData.promptData));
    }

    private io.fabric.sdk.android.services.settings.AppSettingsData buildAppDataFrom(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new io.fabric.sdk.android.services.settings.AppSettingsData(jSONObject.getString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_IDENTIFIER_KEY), jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_REPORTS_URL_KEY), jSONObject.getString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_NDK_REPORTS_URL_KEY), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_UPDATE_REQUIRED_KEY, false), (jSONObject.has(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY) && jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY).has(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HASH_KEY)) ? buildIconDataFrom(jSONObject.getJSONObject(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY)) : null);
    }

    private io.fabric.sdk.android.services.settings.AppIconSettingsData buildIconDataFrom(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new io.fabric.sdk.android.services.settings.AppIconSettingsData(jSONObject.getString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HASH_KEY), jSONObject.getInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY), jSONObject.getInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY));
    }

    private io.fabric.sdk.android.services.settings.FeaturesSettingsData buildFeaturesSessionDataFrom(org.json.JSONObject jSONObject) {
        return new io.fabric.sdk.android.services.settings.FeaturesSettingsData(jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_PROMPT_ENABLED_KEY, false), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_COLLECT_LOGGED_EXCEPTIONS_KEY, true), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_COLLECT_REPORTS_KEY, true), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_COLLECT_ANALYTICS_KEY, false), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_FIREBASE_CRASHLYTICS_ENABLED_KEY, false));
    }

    private io.fabric.sdk.android.services.settings.AnalyticsSettingsData buildAnalyticsSessionDataFrom(org.json.JSONObject jSONObject) {
        return new io.fabric.sdk.android.services.settings.AnalyticsSettingsData(jSONObject.optString("url", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_URL_DEFAULT), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_MAX_BYTE_SIZE_PER_FILE_KEY, 8000), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_MAX_FILE_COUNT_PER_SEND_KEY, 1), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_MAX_PENDING_SEND_FILE_COUNT_KEY, 100), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_FORWARD_TO_GOOGLE_ANALYTICS_KEY, false), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_INCLUDE_PURCHASE_EVENTS_IN_FORWARDED_EVENTS_KEY, false), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_TRACK_CUSTOM_EVENTS_KEY, true), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_TRACK_PREDEFINED_EVENTS_KEY, true), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_SAMPLING_RATE_KEY, 1), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_FLUSH_ON_BACKGROUND_KEY, true));
    }

    private io.fabric.sdk.android.services.settings.SessionSettingsData buildSessionDataFrom(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new io.fabric.sdk.android.services.settings.SessionSettingsData(jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_LOG_BUFFER_SIZE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_LOG_BUFFER_SIZE_DEFAULT), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_CHAINED_EXCEPTION_DEPTH_KEY, 8), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_CUSTOM_EXCEPTION_EVENTS_KEY, 64), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_CUSTOM_KEY_VALUE_PAIRS_KEY, 64), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_IDENTIFIER_MASK_KEY, 255), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_SEND_SESSION_WITHOUT_CRASH_KEY, false), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_COMPLETE_SESSIONS_COUNT_KEY, 4));
    }

    private io.fabric.sdk.android.services.settings.PromptSettingsData buildPromptDataFrom(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new io.fabric.sdk.android.services.settings.PromptSettingsData(jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_DEFAULT), jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_DEFAULT), jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SEND_BUTTON_TITLE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SEND_BUTTON_TITLE_DEFAULT), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SHOW_CANCEL_BUTTON_KEY, true), jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_CANCEL_BUTTON_TITLE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_CANCEL_BUTTON_TITLE_DEFAULT), jSONObject.optBoolean(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SHOW_ALWAYS_SEND_BUTTON_KEY, true), jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_ALWAYS_SEND_BUTTON_TITLE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_ALWAYS_SEND_BUTTON_TITLE_DEFAULT));
    }

    private io.fabric.sdk.android.services.settings.BetaSettingsData buildBetaSettingsDataFrom(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new io.fabric.sdk.android.services.settings.BetaSettingsData(jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.BETA_UPDATE_ENDPOINT, io.fabric.sdk.android.services.settings.SettingsJsonConstants.BETA_UPDATE_ENDPOINT_DEFAULT), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.BETA_UPDATE_SUSPEND_DURATION, 3600));
    }

    private long getExpiresAtFrom(io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider, long j, org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject.has(io.fabric.sdk.android.services.settings.SettingsJsonConstants.EXPIRES_AT_KEY)) {
            return jSONObject.getLong(io.fabric.sdk.android.services.settings.SettingsJsonConstants.EXPIRES_AT_KEY);
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    private org.json.JSONObject toAppJson(io.fabric.sdk.android.services.settings.AppSettingsData appSettingsData) throws org.json.JSONException {
        org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_IDENTIFIER_KEY, appSettingsData.identifier).put("status", appSettingsData.status).put("url", appSettingsData.url).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_REPORTS_URL_KEY, appSettingsData.reportsUrl).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_NDK_REPORTS_URL_KEY, appSettingsData.ndkReportsUrl).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_UPDATE_REQUIRED_KEY, appSettingsData.updateRequired);
        if (appSettingsData.icon != null) {
            jSONObjectPut.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY, toIconJson(appSettingsData.icon));
        }
        return jSONObjectPut;
    }

    private org.json.JSONObject toIconJson(io.fabric.sdk.android.services.settings.AppIconSettingsData appIconSettingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HASH_KEY, appIconSettingsData.hash).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, appIconSettingsData.width).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, appIconSettingsData.height);
    }

    private org.json.JSONObject toFeaturesJson(io.fabric.sdk.android.services.settings.FeaturesSettingsData featuresSettingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_COLLECT_LOGGED_EXCEPTIONS_KEY, featuresSettingsData.collectLoggedException).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_COLLECT_REPORTS_KEY, featuresSettingsData.collectReports).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.FEATURES_COLLECT_ANALYTICS_KEY, featuresSettingsData.collectAnalytics);
    }

    private org.json.JSONObject toSessionJson(io.fabric.sdk.android.services.settings.SessionSettingsData sessionSettingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_LOG_BUFFER_SIZE_KEY, sessionSettingsData.logBufferSize).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_CHAINED_EXCEPTION_DEPTH_KEY, sessionSettingsData.maxChainedExceptionDepth).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_CUSTOM_EXCEPTION_EVENTS_KEY, sessionSettingsData.maxCustomExceptionEvents).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_MAX_CUSTOM_KEY_VALUE_PAIRS_KEY, sessionSettingsData.maxCustomKeyValuePairs).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_IDENTIFIER_MASK_KEY, sessionSettingsData.identifierMask).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SETTINGS_SEND_SESSION_WITHOUT_CRASH_KEY, sessionSettingsData.sendSessionWithoutCrash);
    }

    private org.json.JSONObject toAnalyticsJson(io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put("url", analyticsSettingsData.analyticsURL).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_KEY, analyticsSettingsData.flushIntervalSeconds).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_MAX_BYTE_SIZE_PER_FILE_KEY, analyticsSettingsData.maxByteSizePerFile).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_MAX_FILE_COUNT_PER_SEND_KEY, analyticsSettingsData.maxFileCountPerSend).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ANALYTICS_MAX_PENDING_SEND_FILE_COUNT_KEY, analyticsSettingsData.maxPendingSendFileCount);
    }

    private org.json.JSONObject toBetaJson(io.fabric.sdk.android.services.settings.BetaSettingsData betaSettingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.BETA_UPDATE_ENDPOINT, betaSettingsData.updateUrl).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.BETA_UPDATE_SUSPEND_DURATION, betaSettingsData.updateSuspendDurationSeconds);
    }

    private org.json.JSONObject toPromptJson(io.fabric.sdk.android.services.settings.PromptSettingsData promptSettingsData) throws org.json.JSONException {
        return new org.json.JSONObject().put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, promptSettingsData.title).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, promptSettingsData.message).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SEND_BUTTON_TITLE_KEY, promptSettingsData.sendButtonTitle).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SHOW_CANCEL_BUTTON_KEY, promptSettingsData.showCancelButton).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_CANCEL_BUTTON_TITLE_KEY, promptSettingsData.cancelButtonTitle).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_SHOW_ALWAYS_SEND_BUTTON_KEY, promptSettingsData.showAlwaysSendButton).put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_ALWAYS_SEND_BUTTON_TITLE_KEY, promptSettingsData.alwaysSendButtonTitle);
    }
}
