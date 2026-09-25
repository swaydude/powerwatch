package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class LevelEndEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.LevelEndEvent> {
    static final java.lang.String LEVEL_NAME_ATTRIBUTE = "levelName";
    static final java.lang.String SCORE_ATTRIBUTE = "score";
    static final java.lang.String SUCCESS_ATTRIBUTE = "success";
    static final java.lang.String TYPE = "levelEnd";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return TYPE;
    }

    public com.crashlytics.android.answers.LevelEndEvent putLevelName(java.lang.String str) {
        this.predefinedAttributes.put(LEVEL_NAME_ATTRIBUTE, str);
        return this;
    }

    public com.crashlytics.android.answers.LevelEndEvent putScore(java.lang.Number number) {
        this.predefinedAttributes.put("score", number);
        return this;
    }

    public com.crashlytics.android.answers.LevelEndEvent putSuccess(boolean z) {
        this.predefinedAttributes.put("success", z ? "true" : "false");
        return this;
    }
}
