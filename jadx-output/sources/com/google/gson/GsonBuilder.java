package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class GsonBuilder {
    private java.lang.String datePattern;
    private com.google.gson.internal.Excluder excluder = com.google.gson.internal.Excluder.DEFAULT;
    private com.google.gson.LongSerializationPolicy longSerializationPolicy = com.google.gson.LongSerializationPolicy.DEFAULT;
    private com.google.gson.FieldNamingStrategy fieldNamingPolicy = com.google.gson.FieldNamingPolicy.IDENTITY;
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators = new java.util.HashMap();
    private final java.util.List<com.google.gson.TypeAdapterFactory> factories = new java.util.ArrayList();
    private final java.util.List<com.google.gson.TypeAdapterFactory> hierarchyFactories = new java.util.ArrayList();
    private boolean serializeNulls = false;
    private int dateStyle = 2;
    private int timeStyle = 2;
    private boolean complexMapKeySerialization = false;
    private boolean serializeSpecialFloatingPointValues = false;
    private boolean escapeHtmlChars = true;
    private boolean prettyPrinting = false;
    private boolean generateNonExecutableJson = false;
    private boolean lenient = false;

    public com.google.gson.GsonBuilder setVersion(double d) {
        this.excluder = this.excluder.withVersion(d);
        return this;
    }

    public com.google.gson.GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        this.excluder = this.excluder.withModifiers(iArr);
        return this;
    }

    public com.google.gson.GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public com.google.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public com.google.gson.GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public com.google.gson.GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public com.google.gson.GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public com.google.gson.GsonBuilder setLongSerializationPolicy(com.google.gson.LongSerializationPolicy longSerializationPolicy) {
        this.longSerializationPolicy = longSerializationPolicy;
        return this;
    }

    public com.google.gson.GsonBuilder setFieldNamingPolicy(com.google.gson.FieldNamingPolicy fieldNamingPolicy) {
        this.fieldNamingPolicy = fieldNamingPolicy;
        return this;
    }

    public com.google.gson.GsonBuilder setFieldNamingStrategy(com.google.gson.FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public com.google.gson.GsonBuilder setExclusionStrategies(com.google.gson.ExclusionStrategy... exclusionStrategyArr) {
        for (com.google.gson.ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
        }
        return this;
    }

    public com.google.gson.GsonBuilder addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public com.google.gson.GsonBuilder addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public com.google.gson.GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public com.google.gson.GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public com.google.gson.GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public com.google.gson.GsonBuilder setDateFormat(java.lang.String str) {
        this.datePattern = str;
        return this;
    }

    public com.google.gson.GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public com.google.gson.GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public com.google.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type type, java.lang.Object obj) {
        boolean z = obj instanceof com.google.gson.JsonSerializer;
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(z || (obj instanceof com.google.gson.JsonDeserializer) || (obj instanceof com.google.gson.InstanceCreator) || (obj instanceof com.google.gson.TypeAdapter));
        if (obj instanceof com.google.gson.InstanceCreator) {
            this.instanceCreators.put(type, (com.google.gson.InstanceCreator) obj);
        }
        if (z || (obj instanceof com.google.gson.JsonDeserializer)) {
            this.factories.add(com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken.get(type), obj));
        }
        if (obj instanceof com.google.gson.TypeAdapter) {
            this.factories.add(com.google.gson.internal.bind.TypeAdapters.newFactory(com.google.gson.reflect.TypeToken.get(type), (com.google.gson.TypeAdapter) obj));
        }
        return this;
    }

    public com.google.gson.GsonBuilder registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory typeAdapterFactory) {
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public com.google.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> cls, java.lang.Object obj) {
        boolean z = obj instanceof com.google.gson.JsonSerializer;
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(z || (obj instanceof com.google.gson.JsonDeserializer) || (obj instanceof com.google.gson.TypeAdapter));
        if ((obj instanceof com.google.gson.JsonDeserializer) || z) {
            this.hierarchyFactories.add(com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof com.google.gson.TypeAdapter) {
            this.factories.add(com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(cls, (com.google.gson.TypeAdapter) obj));
        }
        return this;
    }

    public com.google.gson.GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public com.google.gson.Gson create() {
        java.util.List<com.google.gson.TypeAdapterFactory> arrayList = new java.util.ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.hierarchyFactories);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new com.google.gson.Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.longSerializationPolicy, arrayList);
    }

    private void addTypeAdaptersForDate(java.lang.String str, int i, int i2, java.util.List<com.google.gson.TypeAdapterFactory> list) {
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter;
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2;
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter3;
        if (str != null && !"".equals(str.trim())) {
            defaultDateTypeAdapter = new com.google.gson.DefaultDateTypeAdapter((java.lang.Class<? extends java.util.Date>) java.util.Date.class, str);
            defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((java.lang.Class<? extends java.util.Date>) java.sql.Timestamp.class, str);
            defaultDateTypeAdapter3 = new com.google.gson.DefaultDateTypeAdapter((java.lang.Class<? extends java.util.Date>) java.sql.Date.class, str);
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter4 = new com.google.gson.DefaultDateTypeAdapter((java.lang.Class<? extends java.util.Date>) java.util.Date.class, i, i2);
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((java.lang.Class<? extends java.util.Date>) java.sql.Timestamp.class, i, i2);
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter6 = new com.google.gson.DefaultDateTypeAdapter((java.lang.Class<? extends java.util.Date>) java.sql.Date.class, i, i2);
            defaultDateTypeAdapter = defaultDateTypeAdapter4;
            defaultDateTypeAdapter2 = defaultDateTypeAdapter5;
            defaultDateTypeAdapter3 = defaultDateTypeAdapter6;
        }
        list.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.util.Date.class, defaultDateTypeAdapter));
        list.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.sql.Timestamp.class, defaultDateTypeAdapter2));
        list.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.sql.Date.class, defaultDateTypeAdapter3));
    }
}
