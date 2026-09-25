package com.google.android.play.core.missingsplits;

/* JADX INFO: loaded from: classes2.dex */
public class MissingSplitsManagerFactory {
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> a = new java.util.concurrent.atomic.AtomicReference<>(null);

    public static com.google.android.play.core.missingsplits.MissingSplitsManager create(android.content.Context context) {
        return new com.google.android.play.core.missingsplits.b(context, java.lang.Runtime.getRuntime(), new com.google.android.play.core.missingsplits.a(context, context.getPackageManager()), a);
    }
}
