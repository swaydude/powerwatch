package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class UUIDUtil_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.UUIDUtil> {
    private static final com.polidea.rxandroidble2.internal.util.UUIDUtil_Factory INSTANCE = new com.polidea.rxandroidble2.internal.util.UUIDUtil_Factory();

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.UUIDUtil get() {
        return new com.polidea.rxandroidble2.internal.util.UUIDUtil();
    }

    public static com.polidea.rxandroidble2.internal.util.UUIDUtil_Factory create() {
        return INSTANCE;
    }
}
