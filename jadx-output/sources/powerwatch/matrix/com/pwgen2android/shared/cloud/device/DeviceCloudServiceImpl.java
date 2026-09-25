package powerwatch.matrix.com.pwgen2android.shared.cloud.device;

/* JADX INFO: compiled from: DeviceCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;", "deviceService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;", "deviceConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;)V", "allDevices", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "getDevice", "serialNumber", "", "registerDevice", "Lio/reactivex/Completable;", "device", "removeDevice", "updateDevice", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService deviceService;

    public DeviceCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService deviceService, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig deviceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceConfig, "deviceConfig");
        this.deviceService = deviceService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Completable updateDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return this.deviceService.update(device);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getDevice(java.lang.String serialNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService.DefaultImpls.get$default(this.deviceService, null, 1, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Completable registerDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService.DefaultImpls.add$default(this.deviceService, device, null, 2, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Completable removeDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return this.deviceService.delete(device, kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("deviceSerial", device.getSerialNumber())));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> allDevices() {
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService.DefaultImpls.all$default(this.deviceService, null, 1, null);
    }
}
