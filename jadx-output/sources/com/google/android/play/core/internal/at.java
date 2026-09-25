package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class at implements com.google.android.play.core.internal.ak {
    at() {
    }

    @Override // com.google.android.play.core.internal.ak
    public final boolean a(java.lang.Object obj, java.io.File file, java.io.File file2) {
        try {
            return !((java.lang.Boolean) com.google.android.play.core.internal.ba.a(java.lang.Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", java.lang.Boolean.class, (java.lang.Class<java.lang.String>) java.lang.String.class, file.getPath())).booleanValue();
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
