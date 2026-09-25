package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public com.google.gson.JsonElement serialize(java.lang.Long l) {
            return new com.google.gson.JsonPrimitive((java.lang.Number) l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public com.google.gson.JsonElement serialize(java.lang.Long l) {
            return new com.google.gson.JsonPrimitive(java.lang.String.valueOf(l));
        }
    };

    public abstract com.google.gson.JsonElement serialize(java.lang.Long l);
}
