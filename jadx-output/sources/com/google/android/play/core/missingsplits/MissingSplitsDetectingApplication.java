package com.google.android.play.core.missingsplits;

/* JADX INFO: loaded from: classes2.dex */
public class MissingSplitsDetectingApplication extends android.app.Application {
    private boolean onCreateCalled = false;

    @Override // android.app.Application
    public final void onCreate() {
        if (this.onCreateCalled) {
            throw new java.lang.IllegalStateException("The onCreate method must be invoked at most once.");
        }
        this.onCreateCalled = true;
        if (com.google.android.play.core.missingsplits.MissingSplitsManagerFactory.create(this).disableAppIfMissingRequiredSplits()) {
            return;
        }
        super.onCreate();
        onCreateCustom();
    }

    public void onCreateCustom() {
    }
}
