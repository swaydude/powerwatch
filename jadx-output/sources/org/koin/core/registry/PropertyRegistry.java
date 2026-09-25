package org.koin.core.registry;

/* JADX INFO: compiled from: PropertyRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u001b\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014J)\u0010\u0015\u001a\u00020\u0007\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u0002H\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "", "()V", "values", "", "", "close", "", "getProperty", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "loadEnvironmentProperties", "loadPropertiesFromFile", "fileName", "readDataFromFile", "Ljava/util/Properties;", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "saveProperties", "properties", "", "saveProperty", "value", "saveProperty$koin_core", "(Ljava/lang/String;Ljava/lang/Object;)V", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class PropertyRegistry {
    private final java.util.Map<java.lang.String, java.lang.Object> values = new java.util.concurrent.ConcurrentHashMap();

    public final void saveProperties(java.util.Map<java.lang.String, ? extends java.lang.Object> properties) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(properties, "properties");
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("load " + properties.size() + " properties");
        }
        this.values.putAll(properties);
    }

    public final void saveProperties(java.util.Properties properties) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(properties, "properties");
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("load " + properties.size() + " properties");
        }
        java.util.Map map = kotlin.collections.MapsKt.toMap(properties);
        if (map == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            if (org.koin.ext.StringExtKt.isInt(str2)) {
                saveProperty$koin_core(str, java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
            } else if (org.koin.ext.StringExtKt.isFloat(str2)) {
                saveProperty$koin_core(str, java.lang.Float.valueOf(java.lang.Float.parseFloat(str2)));
            } else {
                saveProperty$koin_core(str, org.koin.ext.StringExtKt.quoted(str2));
            }
        }
    }

    public final <T> void saveProperty$koin_core(java.lang.String key, T value) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        this.values.put(key, value);
    }

    public final <T> T getProperty(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        T t = (T) this.values.get(key);
        if (t instanceof java.lang.Object) {
            return t;
        }
        return null;
    }

    public final void loadPropertiesFromFile(java.lang.String fileName) throws org.koin.core.error.NoPropertyFileFoundException {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fileName, "fileName");
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("load properties from " + fileName);
        }
        java.net.URL resource = org.koin.core.Koin.class.getResource(fileName);
        if (resource != null) {
            str = new java.lang.String(kotlin.io.TextStreamsKt.readBytes(resource), kotlin.text.Charsets.UTF_8);
        } else {
            str = null;
        }
        if (str != null) {
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().info("loaded properties from file:'" + fileName + '\'');
            }
            saveProperties(readDataFromFile(str));
            return;
        }
        throw new org.koin.core.error.NoPropertyFileFoundException("No properties found for file '" + fileName + '\'');
    }

    private final java.util.Properties readDataFromFile(java.lang.String content) throws java.io.IOException {
        java.util.Properties properties = new java.util.Properties();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        if (content == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = content.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        properties.load(new java.io.ByteArrayInputStream(bytes));
        return properties;
    }

    public final void loadEnvironmentProperties() {
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("load properties from environment");
        }
        java.util.Properties sysProperties = java.lang.System.getProperties();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sysProperties, "sysProperties");
        saveProperties(sysProperties);
        java.util.Map<java.lang.String, java.lang.String> map = java.lang.System.getenv();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(map, "System.getenv()");
        java.util.Properties properties = new java.util.Properties();
        properties.putAll(map);
        saveProperties(properties);
    }

    public final void close() {
        this.values.clear();
    }
}
