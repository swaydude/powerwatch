package io.fabric.sdk.android.services.persistence;

/* JADX INFO: loaded from: classes2.dex */
public interface SerializationStrategy<T> {
    T deserialize(java.lang.String str);

    java.lang.String serialize(T t);
}
