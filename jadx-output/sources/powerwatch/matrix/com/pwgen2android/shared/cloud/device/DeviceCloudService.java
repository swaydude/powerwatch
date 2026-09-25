package powerwatch.matrix.com.pwgen2android.shared.cloud.device;

/* JADX INFO: compiled from: DeviceCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;", "", "allDevices", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "getDevice", "serialNumber", "", "registerDevice", "Lio/reactivex/Completable;", "device", "removeDevice", "updateDevice", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DeviceCloudService {
    io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> allDevices();

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getDevice(java.lang.String serialNumber);

    io.reactivex.Completable registerDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device);

    io.reactivex.Completable removeDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device);

    io.reactivex.Completable updateDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device);
}
