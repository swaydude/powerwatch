package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnswersEvent<T extends com.crashlytics.android.answers.AnswersEvent> {
    public static final int MAX_NUM_ATTRIBUTES = 20;
    public static final int MAX_STRING_LENGTH = 100;
    final com.crashlytics.android.answers.AnswersAttributes customAttributes;
    final com.crashlytics.android.answers.AnswersEventValidator validator;

    public AnswersEvent() {
        com.crashlytics.android.answers.AnswersEventValidator answersEventValidator = new com.crashlytics.android.answers.AnswersEventValidator(20, 100, io.fabric.sdk.android.Fabric.isDebuggable());
        this.validator = answersEventValidator;
        this.customAttributes = new com.crashlytics.android.answers.AnswersAttributes(answersEventValidator);
    }

    java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        return this.customAttributes.attributes;
    }

    public T putCustomAttribute(java.lang.String str, java.lang.String str2) {
        this.customAttributes.put(str, str2);
        return this;
    }

    public T putCustomAttribute(java.lang.String str, java.lang.Number number) {
        this.customAttributes.put(str, number);
        return this;
    }
}
