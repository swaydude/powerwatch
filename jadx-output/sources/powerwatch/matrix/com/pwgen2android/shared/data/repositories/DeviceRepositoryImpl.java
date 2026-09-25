package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: DeviceRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\f0\f0\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J<\u0010\u001d\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\f0\f \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\f0\f\u0018\u00010\n0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;", "deviceCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;", "defaultPhoneWatchDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;)V", "all", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "fromCache", "", "count", "", "defaultDevice", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", "delete", "Lio/reactivex/Completable;", "item", "getOne", "id", "", "isEmpty", "load", "forceCache", "notSyncedCount", "", "save", "toCacheOnly", "sync", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository {
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao defaultPhoneWatchDao;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService deviceCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao deviceDao;

    public DeviceRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao deviceDao, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService deviceCloudService, powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao defaultPhoneWatchDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceDao, "deviceDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCloudService, "deviceCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultPhoneWatchDao, "defaultPhoneWatchDao");
        this.deviceDao = deviceDao;
        this.deviceCloudService = deviceCloudService;
        this.defaultPhoneWatchDao = defaultPhoneWatchDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> load(boolean fromCache, boolean forceCache) {
        return this.deviceDao.observeFirst().subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> defaultDevice() {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> singleSubscribeOn = this.deviceDao.getFirst().subscribeOn(io.reactivex.schedulers.Schedulers.io());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "deviceDao.getFirst()\n            .subscribeOn(Schedulers.io())");
        return singleSubscribeOn;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public long notSyncedCount() {
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public io.reactivex.Completable sync() {
        io.reactivex.Completable completableFlatMapCompletable = this.deviceDao.getNotRegisteredDevices().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$4X_V7a4ZwXi2yMSaUmOnpTgXww4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3200sync$lambda1(this.f$0, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "deviceDao.getNotRegisteredDevices()\n                .flatMapCompletable { devices ->\n                    val devicesRequest = if (devices.isEmpty()) {\n                        Completable.complete()\n                    } else {\n                        all(fromCache = false).ignoreElements()\n                    }\n                    Observable.fromIterable(devices)\n                            .flatMapCompletable { deviceToSync ->\n                                deviceCloudService.registerDevice(deviceToSync)\n                                        // after it is registered, update local storage\n                                        .andThen(deviceDao.addDeviceCompletable(deviceToSync.copy(shouldSync = false)))\n                            }\n                            .andThen(devicesRequest)\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3200sync$lambda1(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, java.util.List devices) {
        io.reactivex.Completable completableIgnoreElements;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(devices, "devices");
        if (devices.isEmpty()) {
            completableIgnoreElements = io.reactivex.Completable.complete();
        } else {
            completableIgnoreElements = powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this$0, null, false, 1, null).ignoreElements();
        }
        return io.reactivex.Observable.fromIterable(devices).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$SpxkifP71S3Sq24Tq1oZPXKXKx0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3201sync$lambda1$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).andThen(completableIgnoreElements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-1$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3201sync$lambda1$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device deviceToSync) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceToSync, "deviceToSync");
        return this$0.deviceCloudService.registerDevice(deviceToSync).andThen(this$0.deviceDao.addDeviceCompletable(deviceToSync.copy((1535 & 1) != 0 ? deviceToSync.uid : 0L, (1535 & 2) != 0 ? deviceToSync.serialNumber : null, (1535 & 4) != 0 ? deviceToSync.bluetoothAddress : null, (1535 & 8) != 0 ? deviceToSync.pid : 0, (1535 & 16) != 0 ? deviceToSync.firmwareVersion : null, (1535 & 32) != 0 ? deviceToSync.productName : null, (1535 & 64) != 0 ? deviceToSync.shouldSync : false, (1535 & 128) != 0 ? deviceToSync.callNotification : false, (1535 & 256) != 0 ? deviceToSync.messageNotification : false, (1535 & 512) != 0 ? deviceToSync.activityGoalNotification : false, (1535 & 1024) != 0 ? deviceToSync.alarmNotification : false)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository
    public boolean isEmpty() {
        return count() == 0;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.CountRepository
    public int count() {
        return this.deviceDao.count();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository
    public io.reactivex.Completable save(final powerwatch.matrix.com.pwgen2android.shared.data.models.Device item, boolean toCacheOnly) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        if (toCacheOnly) {
            io.reactivex.Completable completableAndThen = this.deviceDao.addDeviceCompletable(item.copy((1535 & 1) != 0 ? item.uid : 0L, (1535 & 2) != 0 ? item.serialNumber : null, (1535 & 4) != 0 ? item.bluetoothAddress : null, (1535 & 8) != 0 ? item.pid : 0, (1535 & 16) != 0 ? item.firmwareVersion : null, (1535 & 32) != 0 ? item.productName : null, (1535 & 64) != 0 ? item.shouldSync : true, (1535 & 128) != 0 ? item.callNotification : false, (1535 & 256) != 0 ? item.messageNotification : false, (1535 & 512) != 0 ? item.activityGoalNotification : false, (1535 & 1024) != 0 ? item.alarmNotification : false)).andThen(this.defaultPhoneWatchDao.addCompletable(new powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch(0L, item.getBluetoothAddress(), item.getSerialNumber(), 1, null)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "deviceDao.addDeviceCompletable(item.copy(shouldSync = true))\n                    .andThen(\n                            defaultPhoneWatchDao.addCompletable(\n                                    DefaultPhoneWatch(\n                                            bluetoothAddress = item.bluetoothAddress,\n                                            serialNumber = item.serialNumber))\n                    )");
            return completableAndThen;
        }
        io.reactivex.Completable completableOnErrorResumeNext = this.deviceCloudService.registerDevice(item).andThen(this.deviceDao.addDeviceCompletable(item)).andThen(this.defaultPhoneWatchDao.addCompletable(new powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch(0L, item.getBluetoothAddress(), item.getSerialNumber(), 1, null))).andThen(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this, null, false, 1, null).ignoreElements()).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$JXfWiNoUtP5Av0usNouzkLToQus
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3199save$lambda2(this.f$0, item, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "deviceCloudService.registerDevice(item)\n                // be sure to store it in local cache even if error occurs\n                .andThen(deviceDao.addDeviceCompletable(item))\n                .andThen(\n                        defaultPhoneWatchDao.addCompletable(\n                                DefaultPhoneWatch(\n                                        bluetoothAddress = item.bluetoothAddress,\n                                        serialNumber = item.serialNumber))\n                )\n                .andThen(all(fromCache = false).ignoreElements())\n                .onErrorResumeNext {\n                    deviceDao.addDeviceCompletable(item.copy(shouldSync = true))\n                            .andThen(\n                                    defaultPhoneWatchDao.addCompletable(\n                                            DefaultPhoneWatch(\n                                                    bluetoothAddress = item.bluetoothAddress,\n                                                    serialNumber = item.serialNumber))\n                            )\n                }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3199save$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device item, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.deviceDao.addDeviceCompletable(item.copy((1535 & 1) != 0 ? item.uid : 0L, (1535 & 2) != 0 ? item.serialNumber : null, (1535 & 4) != 0 ? item.bluetoothAddress : null, (1535 & 8) != 0 ? item.pid : 0, (1535 & 16) != 0 ? item.firmwareVersion : null, (1535 & 32) != 0 ? item.productName : null, (1535 & 64) != 0 ? item.shouldSync : true, (1535 & 128) != 0 ? item.callNotification : false, (1535 & 256) != 0 ? item.messageNotification : false, (1535 & 512) != 0 ? item.activityGoalNotification : false, (1535 & 1024) != 0 ? item.alarmNotification : false)).andThen(this$0.defaultPhoneWatchDao.addCompletable(new powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch(0L, item.getBluetoothAddress(), item.getSerialNumber(), 1, null)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> all(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        if (!fromCache) {
            io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> observable = this.deviceCloudService.allDevices().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$pVpYJCDtM5Zx84Ldez0w-FvEg5Q
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3190all$lambda6(this.f$0, (java.util.List) obj);
                }
            }).onErrorResumeNext((io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends R>>) new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$y42qyD3HI3dzv8qSwcJgzj0LxB4
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3192all$lambda7(this.f$0, (java.lang.Throwable) obj);
                }
            }).toObservable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "deviceCloudService.allDevices()\n                    .flatMap { cloudDevices ->\n                        val defaultDeviceUUID = defaultPhoneWatchDao.getFirst()\n                        val foundDevice = cloudDevices.findLast { cloudDevice ->\n                            defaultDeviceUUID?.serialNumber != null && defaultDeviceUUID.serialNumber == cloudDevice.serialNumber\n                        }\n\n                        (foundDevice?.let {\n                            deviceDao.addDeviceCompletable(it.copy(bluetoothAddress = defaultDeviceUUID!!.bluetoothAddress))\n                        } ?: Completable.fromAction {\n                            deviceDao.deleteAll()\n                        }).toSingleDefault(cloudDevices)\n                    }\n                    .onErrorResumeNext { deviceDao.getAllDevices() }\n                    .toObservable()");
            return observable;
        }
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> observable2 = this.deviceDao.getAllDevices().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable2, "deviceDao.getAllDevices().toObservable()");
        return observable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-6, reason: not valid java name */
    public static final io.reactivex.SingleSource m3190all$lambda6(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, java.util.List cloudDevices) {
        io.reactivex.Completable completableFromAction;
        java.lang.Object objPrevious;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudDevices, "cloudDevices");
        powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch first = this$0.defaultPhoneWatchDao.getFirst();
        java.util.ListIterator listIterator = cloudDevices.listIterator(cloudDevices.size());
        do {
            completableFromAction = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((first == null ? null : first.getSerialNumber()) != null && kotlin.jvm.internal.Intrinsics.areEqual(first.getSerialNumber(), ((powerwatch.matrix.com.pwgen2android.shared.data.models.Device) objPrevious).getSerialNumber())));
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) objPrevious;
        if (device != null) {
            powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao deviceDao = this$0.deviceDao;
            kotlin.jvm.internal.Intrinsics.checkNotNull(first);
            completableFromAction = deviceDao.addDeviceCompletable(device.copy((1535 & 1) != 0 ? device.uid : 0L, (1535 & 2) != 0 ? device.serialNumber : null, (1535 & 4) != 0 ? device.bluetoothAddress : first.getBluetoothAddress(), (1535 & 8) != 0 ? device.pid : 0, (1535 & 16) != 0 ? device.firmwareVersion : null, (1535 & 32) != 0 ? device.productName : null, (1535 & 64) != 0 ? device.shouldSync : null, (1535 & 128) != 0 ? device.callNotification : false, (1535 & 256) != 0 ? device.messageNotification : false, (1535 & 512) != 0 ? device.activityGoalNotification : false, (1535 & 1024) != 0 ? device.alarmNotification : false));
        }
        if (completableFromAction == null) {
            completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$T5VRitr37a0gp0il86gqAx_FeQg
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3191all$lambda6$lambda5(this.f$0);
                }
            });
        }
        return completableFromAction.toSingleDefault(cloudDevices);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3191all$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deviceDao.deleteAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-7, reason: not valid java name */
    public static final io.reactivex.SingleSource m3192all$lambda7(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.deviceDao.getAllDevices();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getOne(final java.lang.String id, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        if (!fromCache) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> observable = this.deviceCloudService.getDevice(id).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3194getOne$lambda8(this.f$0, id, (java.lang.Throwable) obj);
                }
            }).toObservable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "deviceCloudService.getDevice(id)\n                    .onErrorResumeNext { deviceDao.getDevice(id).toSingle() }\n                    .toObservable()");
            return observable;
        }
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> observable2 = this.deviceDao.getDevice(id).switchIfEmpty(this.deviceCloudService.getDevice(id)).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable2, "deviceDao.getDevice(id).switchIfEmpty(deviceCloudService.getDevice(id)).toObservable()");
        return observable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOne$lambda-8, reason: not valid java name */
    public static final io.reactivex.SingleSource m3194getOne$lambda8(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, java.lang.String id, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "$id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.deviceDao.getDevice(id).toSingle();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeleteRepository
    public io.reactivex.Completable delete(final powerwatch.matrix.com.pwgen2android.shared.data.models.Device item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableAndThen = this.deviceCloudService.removeDevice(item).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$nrr6xkCi53VFnOJbbJ-KzlyRwG4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3193delete$lambda9(this.f$0, item, (java.lang.Throwable) obj);
            }
        }).andThen(this.deviceDao.deleteDeviceCompletable(item.getSerialNumber()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "deviceCloudService.removeDevice(item)\n                .onErrorResumeNext { deviceDao.deleteDeviceCompletable(item.serialNumber) }\n                .andThen(deviceDao.deleteDeviceCompletable(item.serialNumber))");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: delete$lambda-9, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3193delete$lambda9(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device item, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.deviceDao.deleteDeviceCompletable(item.getSerialNumber());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateRepository
    public io.reactivex.Completable update(final powerwatch.matrix.com.pwgen2android.shared.data.models.Device item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableOnErrorResumeNext = this.deviceCloudService.updateDevice(item).andThen(this.deviceDao.addDeviceCompletable(item)).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$DeviceRepositoryImpl$RUbn3pYndcU-mc6zfsqW_RnSegE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl.m3202update$lambda10(this.f$0, item, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "deviceCloudService.updateDevice(item)\n                .andThen(deviceDao.addDeviceCompletable(item))\n                // be sure to store it in local cache even if error occurs\n                .onErrorResumeNext { deviceDao.addDeviceCompletable(item.copy(shouldSync = true)) }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: update$lambda-10, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3202update$lambda10(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device item, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.deviceDao.addDeviceCompletable(item.copy((1535 & 1) != 0 ? item.uid : 0L, (1535 & 2) != 0 ? item.serialNumber : null, (1535 & 4) != 0 ? item.bluetoothAddress : null, (1535 & 8) != 0 ? item.pid : 0, (1535 & 16) != 0 ? item.firmwareVersion : null, (1535 & 32) != 0 ? item.productName : null, (1535 & 64) != 0 ? item.shouldSync : true, (1535 & 128) != 0 ? item.callNotification : false, (1535 & 256) != 0 ? item.messageNotification : false, (1535 & 512) != 0 ? item.activityGoalNotification : false, (1535 & 1024) != 0 ? item.alarmNotification : false));
    }
}
