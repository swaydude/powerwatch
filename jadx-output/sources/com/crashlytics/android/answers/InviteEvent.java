package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class InviteEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.InviteEvent> {
    static final java.lang.String METHOD_ATTRIBUTE = "method";
    static final java.lang.String TYPE = "invite";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return TYPE;
    }

    public com.crashlytics.android.answers.InviteEvent putMethod(java.lang.String str) {
        this.predefinedAttributes.put("method", str);
        return this;
    }
}
