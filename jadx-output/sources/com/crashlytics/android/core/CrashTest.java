package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
public class CrashTest {
    public void throwRuntimeException(java.lang.String str) {
        throw new java.lang.RuntimeException(str);
    }

    public int stackOverflow() {
        return stackOverflow() + ((int) java.lang.Math.random());
    }

    public void indexOutOfBounds() {
        int i = new int[2][10];
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Out of bounds value: " + i);
    }

    public void crashAsyncTask(final long j) {
        new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() { // from class: com.crashlytics.android.core.CrashTest.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public java.lang.Void doInBackground(java.lang.Void... voidArr) {
                try {
                    java.lang.Thread.sleep(j);
                } catch (java.lang.InterruptedException unused) {
                }
                com.crashlytics.android.core.CrashTest.this.throwRuntimeException("Background thread crash");
                return null;
            }
        }.execute((java.lang.Void) null);
    }

    public void throwFiveChainedExceptions() {
        try {
            privateMethodThatThrowsException("1");
        } catch (java.lang.Exception e) {
            try {
                throw new java.lang.RuntimeException("2", e);
            } catch (java.lang.Exception e2) {
                try {
                    throw new java.lang.RuntimeException("3", e2);
                } catch (java.lang.Exception e3) {
                    try {
                        throw new java.lang.RuntimeException("4", e3);
                    } catch (java.lang.Exception e4) {
                        throw new java.lang.RuntimeException("5", e4);
                    }
                }
            }
        }
    }

    private void privateMethodThatThrowsException(java.lang.String str) {
        throw new java.lang.RuntimeException(str);
    }
}
