package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: DeviceDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u0011H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\r\u001a\u00020\u000eH'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u0011H'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H'¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;", "", "()V", "addDevice", "", "device", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "addDeviceCompletable", "Lio/reactivex/Completable;", "count", "", "deleteAll", "deleteDevice", "serialNumber", "", "deleteDeviceCompletable", "getAllDevices", "Lio/reactivex/Single;", "", "getDevice", "Lio/reactivex/Maybe;", "getFirst", "getNotRegisteredDevices", "observeFirst", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DeviceDao {
    public abstract void addDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device);

    public abstract int count();

    public abstract void deleteAll();

    public abstract void deleteDevice(java.lang.String serialNumber);

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> getAllDevices();

    public abstract io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getDevice(java.lang.String serialNumber);

    public abstract io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getFirst();

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> getNotRegisteredDevices();

    public abstract io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> observeFirst();

    public final io.reactivex.Completable addDeviceCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DeviceDao$yfVIt6TeidUdFSsDp6InGZzbWYk
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao.m3109addDeviceCompletable$lambda0(this.f$0, device);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            addDevice(device)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addDeviceCompletable$lambda-0, reason: not valid java name */
    public static final void m3109addDeviceCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "$device");
        this$0.addDevice(device);
    }

    public final io.reactivex.Completable deleteDeviceCompletable(final java.lang.String serialNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DeviceDao$WugXy_0K45EyccPpCrsdWqOd2j8
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao.m3110deleteDeviceCompletable$lambda1(this.f$0, serialNumber);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            deleteDevice(serialNumber)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteDeviceCompletable$lambda-1, reason: not valid java name */
    public static final void m3110deleteDeviceCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao this$0, java.lang.String serialNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "$serialNumber");
        this$0.deleteDevice(serialNumber);
    }
}
