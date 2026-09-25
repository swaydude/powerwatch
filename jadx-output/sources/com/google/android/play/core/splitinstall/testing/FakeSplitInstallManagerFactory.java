package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: loaded from: classes2.dex */
public class FakeSplitInstallManagerFactory {
    public static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager create(android.content.Context context, java.io.File file) {
        try {
            return new com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager(context, file);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
