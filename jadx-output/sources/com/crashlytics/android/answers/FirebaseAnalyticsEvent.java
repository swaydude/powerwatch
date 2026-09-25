package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAnalyticsEvent {
    private final java.lang.String eventName;
    private final android.os.Bundle eventParams;

    FirebaseAnalyticsEvent(java.lang.String str, android.os.Bundle bundle) {
        this.eventName = str;
        this.eventParams = bundle;
    }

    public java.lang.String getEventName() {
        return this.eventName;
    }

    public android.os.Bundle getEventParams() {
        return this.eventParams;
    }
}
