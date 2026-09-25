package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeAdapterFactory {
    <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken);
}
