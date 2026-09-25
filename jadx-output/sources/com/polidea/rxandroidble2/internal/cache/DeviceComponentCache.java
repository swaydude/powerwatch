package com.polidea.rxandroidble2.internal.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.ClientScope
public class DeviceComponentCache implements java.util.Map<java.lang.String, com.polidea.rxandroidble2.internal.DeviceComponent> {
    private final java.util.HashMap<java.lang.String, com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference> cache;
    private final com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference.Provider deviceComponentReferenceProvider;

    @bleshadow.javax.inject.Inject
    public DeviceComponentCache() {
        this(new com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference.Provider() { // from class: com.polidea.rxandroidble2.internal.cache.DeviceComponentCache.1
            @Override // com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference.Provider
            public com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference provide(com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent) {
                return new com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference(deviceComponent);
            }
        });
    }

    DeviceComponentCache(com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference.Provider provider) {
        this.cache = new java.util.HashMap<>();
        this.deviceComponentReferenceProvider = provider;
    }

    @Override // java.util.Map
    public void clear() {
        this.cache.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.cache.containsKey(obj) && get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Iterator<com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference> it = this.cache.values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, com.polidea.rxandroidble2.internal.DeviceComponent>> entrySet() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry<java.lang.String, com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference> entry : this.cache.entrySet()) {
            com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference value = entry.getValue();
            if (!value.isEmpty()) {
                hashSet.add(new com.polidea.rxandroidble2.internal.cache.CacheEntry(entry.getKey(), this.deviceComponentReferenceProvider.provide((com.polidea.rxandroidble2.internal.DeviceComponent) value.get())));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public com.polidea.rxandroidble2.internal.DeviceComponent get(java.lang.Object obj) {
        com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference deviceComponentWeakReference = this.cache.get(obj);
        if (deviceComponentWeakReference != null) {
            return (com.polidea.rxandroidble2.internal.DeviceComponent) deviceComponentWeakReference.get();
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        evictEmptyReferences();
        return this.cache.isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
        return this.cache.keySet();
    }

    @Override // java.util.Map
    public com.polidea.rxandroidble2.internal.DeviceComponent put(java.lang.String str, com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent) {
        this.cache.put(str, this.deviceComponentReferenceProvider.provide(deviceComponent));
        evictEmptyReferences();
        return deviceComponent;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends com.polidea.rxandroidble2.internal.DeviceComponent> map) {
        for (java.util.Map.Entry<? extends java.lang.String, ? extends com.polidea.rxandroidble2.internal.DeviceComponent> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public com.polidea.rxandroidble2.internal.DeviceComponent remove(java.lang.Object obj) {
        com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference deviceComponentWeakReferenceRemove = this.cache.remove(obj);
        evictEmptyReferences();
        if (deviceComponentWeakReferenceRemove != null) {
            return (com.polidea.rxandroidble2.internal.DeviceComponent) deviceComponentWeakReferenceRemove.get();
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        evictEmptyReferences();
        return this.cache.size();
    }

    @Override // java.util.Map
    public java.util.Collection<com.polidea.rxandroidble2.internal.DeviceComponent> values() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference deviceComponentWeakReference : this.cache.values()) {
            if (!deviceComponentWeakReference.isEmpty()) {
                arrayList.add(deviceComponentWeakReference.get());
            }
        }
        return arrayList;
    }

    private void evictEmptyReferences() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference>> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().isEmpty()) {
                it.remove();
            }
        }
    }
}
