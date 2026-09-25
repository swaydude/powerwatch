package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public interface x<K> {
    java.util.Map<java.lang.String, ?> a(boolean z);

    boolean a(K k, java.lang.Boolean bool);

    boolean a(K k, java.lang.Float f);

    boolean a(K k, java.lang.Integer num);

    boolean a(K k, java.lang.String str);

    boolean a(java.lang.String str);

    java.util.Map<java.lang.String, ?> getAll();

    boolean remove(java.lang.String str);
}
