package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentDiscovery<T> {
    private static final java.lang.String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final java.lang.String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    private static final java.lang.String TAG = "ComponentDiscovery";
    private final T context;
    private final com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> retriever;

    /* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
    interface RegistrarNameRetriever<T> {
        java.util.List<java.lang.String> retrieve(T t);
    }

    public static com.google.firebase.components.ComponentDiscovery<android.content.Context> forContext(android.content.Context context, java.lang.Class<? extends android.app.Service> cls) {
        return new com.google.firebase.components.ComponentDiscovery<>(context, new com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever(cls));
    }

    ComponentDiscovery(T t, com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> registrarNameRetriever) {
        this.context = t;
        this.retriever = registrarNameRetriever;
    }

    public java.util.List<com.google.firebase.components.ComponentRegistrar> discover() {
        return instantiate(this.retriever.retrieve(this.context));
    }

    private static java.util.List<com.google.firebase.components.ComponentRegistrar> instantiate(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str);
                if (!com.google.firebase.components.ComponentRegistrar.class.isAssignableFrom(cls)) {
                    android.util.Log.w(TAG, java.lang.String.format("Class %s is not an instance of %s", str, COMPONENT_SENTINEL_VALUE));
                } else {
                    arrayList.add((com.google.firebase.components.ComponentRegistrar) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                }
            } catch (java.lang.ClassNotFoundException e) {
                android.util.Log.w(TAG, java.lang.String.format("Class %s is not an found.", str), e);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.w(TAG, java.lang.String.format("Could not instantiate %s.", str), e2);
            } catch (java.lang.InstantiationException e3) {
                android.util.Log.w(TAG, java.lang.String.format("Could not instantiate %s.", str), e3);
            } catch (java.lang.NoSuchMethodException e4) {
                android.util.Log.w(TAG, java.lang.String.format("Could not instantiate %s", str), e4);
            } catch (java.lang.reflect.InvocationTargetException e5) {
                android.util.Log.w(TAG, java.lang.String.format("Could not instantiate %s", str), e5);
            }
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class MetadataRegistrarNameRetriever implements com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<android.content.Context> {
        private final java.lang.Class<? extends android.app.Service> discoveryService;

        private MetadataRegistrarNameRetriever(java.lang.Class<? extends android.app.Service> cls) {
            this.discoveryService = cls;
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public java.util.List<java.lang.String> retrieve(android.content.Context context) {
            android.os.Bundle metadata = getMetadata(context);
            if (metadata == null) {
                android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, "Could not retrieve metadata, returning empty list of registrars.");
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : metadata.keySet()) {
                if (com.google.firebase.components.ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(str)) && str.startsWith(com.google.firebase.components.ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private android.os.Bundle getMetadata(android.content.Context context) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, "Context has no PackageManager.");
                    return null;
                }
                android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, this.discoveryService), 128);
                if (serviceInfo == null) {
                    android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, this.discoveryService + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, "Application info not found.");
                return null;
            }
        }
    }
}
