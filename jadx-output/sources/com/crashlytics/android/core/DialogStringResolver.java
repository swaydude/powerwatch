package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class DialogStringResolver {
    private static final java.lang.String PROMPT_MESSAGE_RES_NAME = "com.crashlytics.CrashSubmissionPromptMessage";
    private static final java.lang.String PROMPT_TITLE_RES_NAME = "com.crashlytics.CrashSubmissionPromptTitle";
    private static final java.lang.String SUBMISSION_ALWAYS_SEND_RES_NAME = "com.crashlytics.CrashSubmissionAlwaysSendTitle";
    private static final java.lang.String SUBMISSION_CANCEL_RES_NAME = "com.crashlytics.CrashSubmissionCancelTitle";
    private static final java.lang.String SUBMISSION_SEND_RES_NAME = "com.crashlytics.CrashSubmissionSendTitle";
    private final android.content.Context context;
    private final io.fabric.sdk.android.services.settings.PromptSettingsData promptData;

    public DialogStringResolver(android.content.Context context, io.fabric.sdk.android.services.settings.PromptSettingsData promptSettingsData) {
        this.context = context;
        this.promptData = promptSettingsData;
    }

    public java.lang.String getTitle() {
        return resourceOrFallbackValue(PROMPT_TITLE_RES_NAME, this.promptData.title);
    }

    public java.lang.String getMessage() {
        return resourceOrFallbackValue(PROMPT_MESSAGE_RES_NAME, this.promptData.message);
    }

    public java.lang.String getSendButtonTitle() {
        return resourceOrFallbackValue(SUBMISSION_SEND_RES_NAME, this.promptData.sendButtonTitle);
    }

    public java.lang.String getAlwaysSendButtonTitle() {
        return resourceOrFallbackValue(SUBMISSION_ALWAYS_SEND_RES_NAME, this.promptData.alwaysSendButtonTitle);
    }

    public java.lang.String getCancelButtonTitle() {
        return resourceOrFallbackValue(SUBMISSION_CANCEL_RES_NAME, this.promptData.cancelButtonTitle);
    }

    private java.lang.String resourceOrFallbackValue(java.lang.String str, java.lang.String str2) {
        return stringOrFallback(io.fabric.sdk.android.services.common.CommonUtils.getStringsFileValue(this.context, str), str2);
    }

    private java.lang.String stringOrFallback(java.lang.String str, java.lang.String str2) {
        return isNullOrEmpty(str) ? str2 : str;
    }

    private boolean isNullOrEmpty(java.lang.String str) {
        return str == null || str.length() == 0;
    }
}
