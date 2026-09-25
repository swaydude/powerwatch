package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public interface JsonDeserializer<T> {
    T deserialize(com.google.gson.JsonElement jsonElement, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext jsonDeserializationContext) throws com.google.gson.JsonParseException;
}
