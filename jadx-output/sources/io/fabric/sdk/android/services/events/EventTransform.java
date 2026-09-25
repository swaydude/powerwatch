package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public interface EventTransform<T> {
    byte[] toBytes(T t) throws java.io.IOException;
}
