package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class RatingEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.RatingEvent> {
    static final java.lang.String CONTENT_ID_ATTRIBUTE = "contentId";
    static final java.lang.String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final java.lang.String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final java.lang.String RATING_ATTRIBUTE = "rating";
    static final java.lang.String TYPE = "rating";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return "rating";
    }

    public com.crashlytics.android.answers.RatingEvent putContentId(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_ID_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.RatingEvent putContentName(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_NAME_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.RatingEvent putContentType(java.lang.String str) {
        this.predefinedAttributes.put(CONTENT_TYPE_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.RatingEvent putRating(int i) {
        this.predefinedAttributes.put("rating", java.lang.Integer.valueOf(i));
        return this;
    }
}
