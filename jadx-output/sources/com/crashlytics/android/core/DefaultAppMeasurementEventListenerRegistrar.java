package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class DefaultAppMeasurementEventListenerRegistrar implements com.crashlytics.android.core.AppMeasurementEventListenerRegistrar {
    private static final java.lang.String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    private static final java.lang.String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
    private static final java.lang.String CRASH_ORIGIN = "crash";
    private static final java.lang.String ERROR_PREFIX = "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ";
    private static final java.lang.String GET_INSTANCE_METHOD = "getInstance";
    private static final java.lang.String METHOD_EQUALS = "equals";
    private static final java.lang.String METHOD_HASHCODE = "hashCode";
    private static final java.lang.String METHOD_ONEVENT = "onEvent";
    private static final java.lang.String METHOD_TOSTRING = "toString";
    private static final java.lang.String NAME = "name";
    private static final java.util.List<java.lang.Class<?>> ONEVENT_EXPECTED_ARGTYPES = java.util.Collections.unmodifiableList(java.util.Arrays.asList(java.lang.String.class, java.lang.String.class, android.os.Bundle.class, java.lang.Long.class));
    private static final java.lang.String PARAMETERS = "parameters";
    private static final java.lang.String REGISTER_METHOD = "registerOnMeasurementEventListener";
    private final com.crashlytics.android.core.CrashlyticsCore crashlyticsCore;
    private java.lang.Object eventListenerProxy;

    public DefaultAppMeasurementEventListenerRegistrar(com.crashlytics.android.core.CrashlyticsCore crashlyticsCore) {
        this.crashlyticsCore = crashlyticsCore;
    }

    @Override // com.crashlytics.android.core.AppMeasurementEventListenerRegistrar
    public boolean register() {
        java.lang.Class<?> cls = getClass(ANALYTIC_CLASS);
        if (cls == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        java.lang.Object defaultAppMeasurementEventListenerRegistrar = getInstance(cls);
        if (defaultAppMeasurementEventListenerRegistrar == null) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
            return false;
        }
        java.lang.Class<?> cls2 = getClass(ANALYTIC_CLASS_ON_EVENT_LISTENER);
        if (cls2 == null) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            cls.getDeclaredMethod(REGISTER_METHOD, cls2).invoke(defaultAppMeasurementEventListenerRegistrar, getOnEventListenerProxy(cls2));
        } catch (java.lang.NoSuchMethodException e) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
            return false;
        } catch (java.lang.Exception e2) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, ERROR_PREFIX + e2.getMessage(), e2);
        }
        return true;
    }

    private java.lang.Class<?> getClass(java.lang.String str) {
        try {
            return this.crashlyticsCore.getContext().getClassLoader().loadClass(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.Object getInstance(java.lang.Class<?> cls) {
        try {
            return cls.getDeclaredMethod(GET_INSTANCE_METHOD, android.content.Context.class).invoke(cls, this.crashlyticsCore.getContext());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    synchronized java.lang.Object getOnEventListenerProxy(java.lang.Class cls) {
        if (this.eventListenerProxy == null) {
            this.eventListenerProxy = java.lang.reflect.Proxy.newProxyInstance(this.crashlyticsCore.getContext().getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.1
                @Override // java.lang.reflect.InvocationHandler
                public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                    java.lang.String name = method.getName();
                    if (objArr == null) {
                        objArr = new java.lang.Object[0];
                    }
                    if (objArr.length == 1 && name.equals(com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.METHOD_EQUALS)) {
                        return java.lang.Boolean.valueOf(equalsImpl(obj, objArr[0]));
                    }
                    if (objArr.length == 0 && name.equals(com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.METHOD_HASHCODE)) {
                        return java.lang.Integer.valueOf(super.hashCode());
                    }
                    if (objArr.length == 0 && name.equals(com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.METHOD_TOSTRING)) {
                        return super.toString();
                    }
                    if (objArr.length == 4 && name.equals(com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.METHOD_ONEVENT) && com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.validateOnEventArgTypes(objArr)) {
                        java.lang.String str = (java.lang.String) objArr[0];
                        java.lang.String str2 = (java.lang.String) objArr[1];
                        android.os.Bundle bundle = (android.os.Bundle) objArr[2];
                        if (str != null && !str.equals("crash")) {
                            com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
                            return null;
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected method invoked on AppMeasurement.EventListener: " + name + "(");
                    for (int i = 0; i < objArr.length; i++) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(objArr[i].getClass().getName());
                    }
                    sb.append("); returning null");
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, sb.toString());
                    return null;
                }

                public boolean equalsImpl(java.lang.Object obj, java.lang.Object obj2) {
                    if (obj == obj2) {
                        return true;
                    }
                    return obj2 != null && java.lang.reflect.Proxy.isProxyClass(obj2.getClass()) && super.equals(java.lang.reflect.Proxy.getInvocationHandler(obj2));
                }
            });
        }
        return this.eventListenerProxy;
    }

    static boolean validateOnEventArgTypes(java.lang.Object[] objArr) {
        int length = objArr.length;
        java.util.List<java.lang.Class<?>> list = ONEVENT_EXPECTED_ARGTYPES;
        if (length != list.size()) {
            return false;
        }
        java.util.Iterator<java.lang.Class<?>> it = list.iterator();
        for (java.lang.Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeEventToUserLog(com.crashlytics.android.core.CrashlyticsCore crashlyticsCore, java.lang.String str, android.os.Bundle bundle) {
        try {
            crashlyticsCore.log("$A$:" + serializeEvent(str, bundle));
        } catch (org.json.JSONException unused) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Unable to serialize Firebase Analytics event; " + str);
        }
    }

    private static java.lang.String serializeEvent(java.lang.String str, android.os.Bundle bundle) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }
}
