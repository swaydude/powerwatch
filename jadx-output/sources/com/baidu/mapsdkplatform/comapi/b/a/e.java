package com.baidu.mapsdkplatform.comapi.b.a;

/* JADX INFO: loaded from: classes.dex */
public class e implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        try {
            return ((java.io.File) obj2).getName().split(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)[2].compareTo(((java.io.File) obj).getName().split(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)[2]);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}
