package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor constructorConstructor, com.google.gson.FieldNamingStrategy fieldNamingStrategy, com.google.gson.internal.Excluder excluder, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public boolean excludeField(java.lang.reflect.Field field, boolean z) {
        return excludeField(field, z, this.excluder);
    }

    static boolean excludeField(java.lang.reflect.Field field, boolean z, com.google.gson.internal.Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field field) {
        com.google.gson.annotations.SerializedName serializedName = (com.google.gson.annotations.SerializedName) field.getAnnotation(com.google.gson.annotations.SerializedName.class);
        if (serializedName == null) {
            return java.util.Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        java.lang.String strValue = serializedName.value();
        java.lang.String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return java.util.Collections.singletonList(strValue);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (java.lang.String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (java.lang.Object.class.isAssignableFrom(rawType)) {
            return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType));
        }
        return null;
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(final com.google.gson.Gson gson, final java.lang.reflect.Field field, java.lang.String str, final com.google.gson.reflect.TypeToken<?> typeToken, boolean z, boolean z2) {
        final boolean zIsPrimitive = com.google.gson.internal.Primitives.isPrimitive(typeToken.getRawType());
        com.google.gson.annotations.JsonAdapter jsonAdapter = (com.google.gson.annotations.JsonAdapter) field.getAnnotation(com.google.gson.annotations.JsonAdapter.class);
        com.google.gson.TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter) : null;
        final boolean z3 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        final com.google.gson.TypeAdapter<?> typeAdapter2 = typeAdapter;
        return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField(str, z, z2) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException {
                (z3 ? typeAdapter2 : new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, typeToken.getType())).write(jsonWriter, field.get(obj));
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void read(com.google.gson.stream.JsonReader jsonReader, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException {
                java.lang.Object obj2 = typeAdapter2.read(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                field.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public boolean writeField(java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException {
                return this.serialized && field.get(obj) != obj;
            }
        };
    }

    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<?> typeToken, java.lang.Class<?> cls) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        java.lang.reflect.Type type = typeToken.getType();
        com.google.gson.reflect.TypeToken<?> typeToken2 = typeToken;
        java.lang.Class<?> rawType = cls;
        while (rawType != java.lang.Object.class) {
            java.lang.reflect.Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                java.lang.reflect.Field field = declaredFields[i];
                boolean zExcludeField = excludeField(field, true);
                boolean zExcludeField2 = excludeField(field, z);
                if (zExcludeField || zExcludeField2) {
                    field.setAccessible(true);
                    java.lang.reflect.Type typeResolve = com.google.gson.internal.C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                    java.util.List<java.lang.String> fieldNames = getFieldNames(field);
                    int size = fieldNames.size();
                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField = null;
                    int i2 = 0;
                    while (i2 < size) {
                        java.lang.String str = fieldNames.get(i2);
                        boolean z2 = i2 != 0 ? false : zExcludeField;
                        int i3 = i2;
                        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField2 = boundField;
                        int i4 = size;
                        java.util.List<java.lang.String> list = fieldNames;
                        java.lang.reflect.Field field2 = field;
                        boundField = boundField2 == null ? (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) linkedHashMap.put(str, createBoundField(gson, field, str, com.google.gson.reflect.TypeToken.get(typeResolve), z2, zExcludeField2)) : boundField2;
                        i2 = i3 + 1;
                        zExcludeField = z2;
                        fieldNames = list;
                        size = i4;
                        field = field2;
                    }
                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField3 = boundField;
                    if (boundField3 != null) {
                        throw new java.lang.IllegalArgumentException(type + " declares multiple JSON fields named " + boundField3.name);
                    }
                }
                i++;
                z = false;
            }
            typeToken2 = com.google.gson.reflect.TypeToken.get(com.google.gson.internal.C$Gson$Types.resolve(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    static abstract class BoundField {
        final boolean deserialized;
        final java.lang.String name;
        final boolean serialized;

        abstract void read(com.google.gson.stream.JsonReader jsonReader, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException;

        abstract void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException;

        abstract boolean writeField(java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException;

        protected BoundField(java.lang.String str, boolean z, boolean z2) {
            this.name = str;
            this.serialized = z;
            this.deserialized = z2;
        }
    }

    public static final class Adapter<T> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        Adapter(com.google.gson.internal.ObjectConstructor<T> objectConstructor, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T tConstruct = this.constructor.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField == null || !boundField.deserialized) {
                        jsonReader.skipValue();
                    } else {
                        boundField.read(jsonReader, tConstruct);
                    }
                }
                jsonReader.endObject();
                return tConstruct;
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.google.gson.JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField : this.boundFields.values()) {
                    if (boundField.writeField(t)) {
                        jsonWriter.name(boundField.name);
                        boundField.write(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }
}
