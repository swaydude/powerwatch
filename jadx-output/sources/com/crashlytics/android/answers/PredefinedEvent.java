package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public abstract class PredefinedEvent<T extends com.crashlytics.android.answers.PredefinedEvent> extends com.crashlytics.android.answers.AnswersEvent<T> {
    final com.crashlytics.android.answers.AnswersAttributes predefinedAttributes = new com.crashlytics.android.answers.AnswersAttributes(this.validator);

    abstract java.lang.String getPredefinedType();

    java.util.Map<java.lang.String, java.lang.Object> getPredefinedAttributes() {
        return this.predefinedAttributes.attributes;
    }

    public java.lang.String toString() {
        return "{type:\"" + getPredefinedType() + kotlin.text.Typography.quote + ", predefinedAttributes:" + this.predefinedAttributes + ", customAttributes:" + this.customAttributes + "}";
    }
}
