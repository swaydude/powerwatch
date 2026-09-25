package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersAttributes {
    final java.util.Map<java.lang.String, java.lang.Object> attributes = new java.util.concurrent.ConcurrentHashMap();
    final com.crashlytics.android.answers.AnswersEventValidator validator;

    public AnswersAttributes(com.crashlytics.android.answers.AnswersEventValidator answersEventValidator) {
        this.validator = answersEventValidator;
    }

    void put(java.lang.String str, java.lang.String str2) {
        if (this.validator.isNull(str, "key") || this.validator.isNull(str2, "value")) {
            return;
        }
        putAttribute(this.validator.limitStringLength(str), this.validator.limitStringLength(str2));
    }

    void put(java.lang.String str, java.lang.Number number) {
        if (this.validator.isNull(str, "key") || this.validator.isNull(number, "value")) {
            return;
        }
        putAttribute(this.validator.limitStringLength(str), number);
    }

    void putAttribute(java.lang.String str, java.lang.Object obj) {
        if (this.validator.isFullMap(this.attributes, str)) {
            return;
        }
        this.attributes.put(str, obj);
    }

    public java.lang.String toString() {
        return new org.json.JSONObject(this.attributes).toString();
    }
}
