package com.polidea.rxandroidble2.internal.cache;

/* JADX INFO: loaded from: classes2.dex */
class CacheEntry implements java.util.Map.Entry<java.lang.String, com.polidea.rxandroidble2.internal.DeviceComponent> {
    private final com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference deviceComponentWeakReference;
    private final java.lang.String string;

    CacheEntry(java.lang.String str, com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference deviceComponentWeakReference) {
        this.string = str;
        this.deviceComponentWeakReference = deviceComponentWeakReference;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.polidea.rxandroidble2.internal.cache.CacheEntry)) {
            return false;
        }
        com.polidea.rxandroidble2.internal.cache.CacheEntry cacheEntry = (com.polidea.rxandroidble2.internal.cache.CacheEntry) obj;
        return this.string.equals(cacheEntry.getKey()) && this.deviceComponentWeakReference.equals(cacheEntry.deviceComponentWeakReference);
    }

    @Override // java.util.Map.Entry
    public java.lang.String getKey() {
        return this.string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map.Entry
    public com.polidea.rxandroidble2.internal.DeviceComponent getValue() {
        return (com.polidea.rxandroidble2.internal.DeviceComponent) this.deviceComponentWeakReference.get();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.string.hashCode() * 31) + this.deviceComponentWeakReference.hashCode();
    }

    @Override // java.util.Map.Entry
    public com.polidea.rxandroidble2.internal.DeviceComponent setValue(com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent) {
        throw new java.lang.UnsupportedOperationException("Not implemented");
    }
}
