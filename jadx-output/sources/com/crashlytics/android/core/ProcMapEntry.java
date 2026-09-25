package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class ProcMapEntry {
    public final long address;
    public final java.lang.String path;
    public final java.lang.String perms;
    public final long size;

    public ProcMapEntry(long j, long j2, java.lang.String str, java.lang.String str2) {
        this.address = j;
        this.size = j2;
        this.perms = str;
        this.path = str2;
    }
}
