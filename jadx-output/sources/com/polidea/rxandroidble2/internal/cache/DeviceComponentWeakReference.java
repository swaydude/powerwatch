package com.polidea.rxandroidble2.internal.cache;

/* JADX INFO: loaded from: classes2.dex */
class DeviceComponentWeakReference extends java.lang.ref.WeakReference<com.polidea.rxandroidble2.internal.DeviceComponent> {

    public interface Provider {
        com.polidea.rxandroidble2.internal.cache.DeviceComponentWeakReference provide(com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent);
    }

    DeviceComponentWeakReference(com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent) {
        super(deviceComponent);
    }

    DeviceComponentWeakReference(com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent, java.lang.ref.ReferenceQueue<? super com.polidea.rxandroidble2.internal.DeviceComponent> referenceQueue) {
        super(deviceComponent, referenceQueue);
    }

    boolean contains(java.lang.Object obj) {
        com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent = (com.polidea.rxandroidble2.internal.DeviceComponent) get();
        return (obj instanceof com.polidea.rxandroidble2.internal.DeviceComponent) && deviceComponent != null && deviceComponent.provideDevice() == ((com.polidea.rxandroidble2.internal.DeviceComponent) obj).provideDevice();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.lang.ref.WeakReference)) {
            return false;
        }
        com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent = (com.polidea.rxandroidble2.internal.DeviceComponent) get();
        java.lang.Object obj2 = ((java.lang.ref.WeakReference) obj).get();
        return deviceComponent != null && (obj2 instanceof com.polidea.rxandroidble2.internal.DeviceComponent) && deviceComponent.provideDevice().equals(((com.polidea.rxandroidble2.internal.DeviceComponent) obj2).provideDevice());
    }

    public int hashCode() {
        if (get() != null) {
            return ((com.polidea.rxandroidble2.internal.DeviceComponent) get()).hashCode();
        }
        return 0;
    }

    public boolean isEmpty() {
        return get() == null;
    }
}
