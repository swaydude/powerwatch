package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class LoginEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.LoginEvent> {
    static final java.lang.String METHOD_ATTRIBUTE = "method";
    static final java.lang.String SUCCESS_ATTRIBUTE = "success";
    static final java.lang.String TYPE = "login";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return "login";
    }

    public com.crashlytics.android.answers.LoginEvent putMethod(java.lang.String str) {
        this.predefinedAttributes.put("method", str);
        return this;
    }

    public com.crashlytics.android.answers.LoginEvent putSuccess(boolean z) {
        this.predefinedAttributes.put("success", java.lang.Boolean.toString(z));
        return this;
    }
}
