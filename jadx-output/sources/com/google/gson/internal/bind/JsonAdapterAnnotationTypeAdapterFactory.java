package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
        com.google.gson.annotations.JsonAdapter jsonAdapter = (com.google.gson.annotations.JsonAdapter) typeToken.getRawType().getAnnotation(com.google.gson.annotations.JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (com.google.gson.TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
    }

    com.google.gson.TypeAdapter<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor constructorConstructor, com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<?> typeToken, com.google.gson.annotations.JsonAdapter jsonAdapter) {
        com.google.gson.TypeAdapter<?> treeTypeAdapter;
        java.lang.Object objConstruct = constructorConstructor.get(com.google.gson.reflect.TypeToken.get((java.lang.Class) jsonAdapter.value())).construct();
        if (objConstruct instanceof com.google.gson.TypeAdapter) {
            treeTypeAdapter = (com.google.gson.TypeAdapter) objConstruct;
        } else if (objConstruct instanceof com.google.gson.TypeAdapterFactory) {
            treeTypeAdapter = ((com.google.gson.TypeAdapterFactory) objConstruct).create(gson, typeToken);
        } else {
            boolean z = objConstruct instanceof com.google.gson.JsonSerializer;
            if (z || (objConstruct instanceof com.google.gson.JsonDeserializer)) {
                treeTypeAdapter = new com.google.gson.internal.bind.TreeTypeAdapter<>(z ? (com.google.gson.JsonSerializer) objConstruct : null, objConstruct instanceof com.google.gson.JsonDeserializer ? (com.google.gson.JsonDeserializer) objConstruct : null, gson, typeToken, null);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (treeTypeAdapter == null || !jsonAdapter.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }
}
