package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
interface Report {

    public enum Type {
        JAVA,
        NATIVE
    }

    java.util.Map<java.lang.String, java.lang.String> getCustomHeaders();

    java.io.File getFile();

    java.lang.String getFileName();

    java.io.File[] getFiles();

    java.lang.String getIdentifier();

    com.crashlytics.android.core.Report.Type getType();

    void remove();
}
