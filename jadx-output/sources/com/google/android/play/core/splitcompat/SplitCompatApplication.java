package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
public class SplitCompatApplication extends android.app.Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        com.google.android.play.core.splitcompat.SplitCompat.install(this);
    }
}
