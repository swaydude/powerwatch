package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class ContentViewEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.ContentViewEvent> {
    static final java.lang.String CONTENT_ID_ATTRIBUTE = "contentId";
    static final java.lang.String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final java.lang.String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final java.lang.String TYPE = "contentView";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return TYPE;
    }

    public com.crashlytics.android.answers.ContentViewEvent putContentId(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_ID_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.ContentViewEvent putContentName(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_NAME_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.ContentViewEvent putContentType(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_TYPE_ATTRIBUTE, str);
        return this;
    }
}
