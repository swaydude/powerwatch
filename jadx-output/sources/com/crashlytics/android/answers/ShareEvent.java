package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class ShareEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.ShareEvent> {
    static final java.lang.String CONTENT_ID_ATTRIBUTE = "contentId";
    static final java.lang.String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final java.lang.String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final java.lang.String METHOD_ATTRIBUTE = "method";
    static final java.lang.String TYPE = "share";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return "share";
    }

    public com.crashlytics.android.answers.ShareEvent putMethod(java.lang.String str) {
        this.predefinedAttributes.put("method", str);
        return this;
    }

    public com.crashlytics.android.answers.ShareEvent putContentId(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_ID_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.ShareEvent putContentName(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_NAME_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.ShareEvent putContentType(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_TYPE_ATTRIBUTE, str);
        return this;
    }
}
