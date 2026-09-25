package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public interface ExclusionStrategy {
    boolean shouldSkipClass(java.lang.Class<?> cls);

    boolean shouldSkipField(com.google.gson.FieldAttributes fieldAttributes);
}
