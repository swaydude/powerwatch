package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class LevelStartEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.LevelStartEvent> {
    static final java.lang.String LEVEL_NAME_ATTRIBUTE = "levelName";
    static final java.lang.String TYPE = "levelStart";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return TYPE;
    }

    public com.crashlytics.android.answers.LevelStartEvent putLevelName(java.lang.String str) {
        this.predefinedAttributes.put(LEVEL_NAME_ATTRIBUTE, str);
        return this;
    }
}
