package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class CustomEvent extends com.crashlytics.android.answers.AnswersEvent<com.crashlytics.android.answers.CustomEvent> {
    private final java.lang.String eventName;

    public CustomEvent(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "eventName must not be null");
        this.eventName = this.validator.limitStringLength(str);
    }

    java.lang.String getCustomType() {
        return this.eventName;
    }

    public java.lang.String toString() {
        return "{eventName:\"" + this.eventName + kotlin.text.Typography.quote + ", customAttributes:" + this.customAttributes + "}";
    }
}
