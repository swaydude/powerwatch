package com.google.firebase.platforminfo;

/* JADX INFO: compiled from: com.google.firebase:firebase-common@@19.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static java.lang.String detectVersion() {
        try {
            return kotlin.KotlinVersion.CURRENT.toString();
        } catch (java.lang.NoClassDefFoundError unused) {
            return null;
        }
    }
}
