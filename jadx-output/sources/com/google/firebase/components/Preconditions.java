package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    public static void checkArgument(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static <T> T checkNotNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static void checkState(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }
}
