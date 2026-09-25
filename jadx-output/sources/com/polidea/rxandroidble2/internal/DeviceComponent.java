package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.DeviceScope
@bleshadow.dagger.Subcomponent(modules = {com.polidea.rxandroidble2.internal.DeviceModule.class})
public interface DeviceComponent {

    public interface Builder {
        com.polidea.rxandroidble2.internal.DeviceComponent build();

        @bleshadow.dagger.BindsInstance
        com.polidea.rxandroidble2.internal.DeviceComponent.Builder macAddress(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.DeviceModule.MAC_ADDRESS) java.lang.String str);
    }

    @com.polidea.rxandroidble2.internal.DeviceScope
    com.polidea.rxandroidble2.RxBleDevice provideDevice();
}
