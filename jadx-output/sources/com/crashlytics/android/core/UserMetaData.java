package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
public class UserMetaData {
    public static final com.crashlytics.android.core.UserMetaData EMPTY = new com.crashlytics.android.core.UserMetaData();
    public final java.lang.String email;
    public final java.lang.String id;
    public final java.lang.String name;

    public UserMetaData() {
        this(null, null, null);
    }

    public UserMetaData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.id = str;
        this.name = str2;
        this.email = str3;
    }

    public boolean isEmpty() {
        return this.id == null && this.name == null && this.email == null;
    }
}
