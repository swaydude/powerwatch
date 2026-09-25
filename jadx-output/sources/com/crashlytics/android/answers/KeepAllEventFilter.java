package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class KeepAllEventFilter implements com.crashlytics.android.answers.EventFilter {
    @Override // com.crashlytics.android.answers.EventFilter
    public boolean skipEvent(com.crashlytics.android.answers.SessionEvent sessionEvent) {
        return false;
    }

    KeepAllEventFilter() {
    }
}
