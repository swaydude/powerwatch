package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersEventValidator {
    boolean failFast;
    final int maxNumAttributes;
    final int maxStringLength;

    public AnswersEventValidator(int i, int i2, boolean z) {
        this.maxNumAttributes = i;
        this.maxStringLength = i2;
        this.failFast = z;
    }

    public java.lang.String limitStringLength(java.lang.String str) {
        if (str.length() <= this.maxStringLength) {
            return str;
        }
        logOrThrowException(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "String is too long, truncating to %d characters", java.lang.Integer.valueOf(this.maxStringLength))));
        return str.substring(0, this.maxStringLength);
    }

    public boolean isNull(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return false;
        }
        logOrThrowException(new java.lang.NullPointerException(str + " must not be null"));
        return true;
    }

    public boolean isFullMap(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        if (map.size() < this.maxNumAttributes || map.containsKey(str)) {
            return false;
        }
        logOrThrowException(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Limit of %d attributes reached, skipping attribute", java.lang.Integer.valueOf(this.maxNumAttributes))));
        return true;
    }

    private void logOrThrowException(java.lang.RuntimeException runtimeException) {
        if (this.failFast) {
            throw runtimeException;
        }
        io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Invalid user input detected", runtimeException);
    }
}
