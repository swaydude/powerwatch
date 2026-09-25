package powerwatch.matrix.com.pwgen2android.sdk.technologies.operations;

/* JADX INFO: compiled from: BleAccessoryCreatorOperationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;", "()V", "createBleCreatorConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;", "gattServices", "", "Landroid/bluetooth/BluetoothGattService;", "executeOperation", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "bleConnection", "Lcom/polidea/rxandroidble2/RxBleConnection;", "protocolCreator", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;", "bleDevice", "Lcom/polidea/rxandroidble2/RxBleDevice;", "technologyType", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "resolveCommunicationChannel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleAccessoryCreatorOperationImpl implements powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperation {

    /* JADX INFO: compiled from: BleAccessoryCreatorOperationImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA.ordinal()] = 3;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS.ordinal()] = 4;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP.ordinal()] = 5;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_HEART_RATE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-5$lambda-3$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl m2768executeOperation$lambda5$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl connection, powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "$connection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return connection;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperation
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> executeOperation(final com.polidea.rxandroidble2.RxBleConnection bleConnection, final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator protocolCreator, final com.polidea.rxandroidble2.RxBleDevice bleDevice, final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleConnection, "bleConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolCreator, "protocolCreator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> singleFlatMap = bleConnection.discoverServices().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.m2764executeOperation$lambda0(protocolCreator, technologyType, this, (com.polidea.rxandroidble2.RxBleDeviceServices) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.m2765executeOperation$lambda5(this.f$0, bleConnection, technologyType, bleDevice, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "bleConnection.discoverServices()\n                .map {\n                    protocolCreator.createProtocols(technologyType,\n                            bleCreatorConfig = createBleCreatorConfig(it.bluetoothGattServices))\n                }\n                .flatMap { protocols ->\n                    Observable.fromIterable(protocols)\n                            .map { protocol ->\n                                val channel = resolveCommunicationChannel(protocol.getType(), bleConnection)\n                                ConnectionImpl(protocol, channel, technologyType, protocol.getType())\n                            }\n                            .flatMap { connection ->\n                                connection.open()\n                                        .toObservable()\n                                        .map {\n                                            connection\n                                        }\n                            }\n                            .toList()\n                            .map { connections ->\n                                val deviceID = bleDevice.bluetoothDevice.address\n                                val deviceName = bleDevice.bluetoothDevice.name ?: \"Powerwatch\"\n                                val deviceInfo = DeviceInfo(deviceID, deviceName = deviceName)\n                                Accessory(deviceInfo, connections, TechnologyType.BLE_COMMUNICATION)\n                            }\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-0, reason: not valid java name */
    public static final java.util.List m2764executeOperation$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator protocolCreator, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl this$0, com.polidea.rxandroidble2.RxBleDeviceServices it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolCreator, "$protocolCreator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "$technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.List<android.bluetooth.BluetoothGattService> bluetoothGattServices = it.getBluetoothGattServices();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bluetoothGattServices, "it.bluetoothGattServices");
        return protocolCreator.createProtocols(technologyType, this$0.createBleCreatorConfig(bluetoothGattServices));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-5, reason: not valid java name */
    public static final io.reactivex.SingleSource m2765executeOperation$lambda5(final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl this$0, final com.polidea.rxandroidble2.RxBleConnection bleConnection, final powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, final com.polidea.rxandroidble2.RxBleDevice bleDevice, java.util.List protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleConnection, "$bleConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "$technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "$bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        return io.reactivex.Observable.fromIterable(protocols).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.m2766executeOperation$lambda5$lambda1(this.f$0, bleConnection, technologyType, (powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleAccessoryCreatorOperationImpl$EHL_Ttni7eG9nMB1ioOE2Scfmr0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.m2767executeOperation$lambda5$lambda3((powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl) obj);
            }
        }).toList().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleAccessoryCreatorOperationImpl$OtQyhDgb9OEwufUqYmoykY4DPig
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.m2769executeOperation$lambda5$lambda4(bleDevice, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-5$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl m2766executeOperation$lambda5$lambda1(powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl this$0, com.polidea.rxandroidble2.RxBleConnection bleConnection, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleConnection, "$bleConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "$technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl(protocol, this$0.resolveCommunicationChannel(protocol.getType(), bleConnection), technologyType, protocol.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-5$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2767executeOperation$lambda5$lambda3(final powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        return connection.open().toObservable().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleAccessoryCreatorOperationImpl$qCMTjxNbT_2sklQaZCvG0-gWJnM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.m2768executeOperation$lambda5$lambda3$lambda2(connection, (powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-5$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.Accessory m2769executeOperation$lambda5$lambda4(com.polidea.rxandroidble2.RxBleDevice bleDevice, java.util.List connections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "$bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connections, "connections");
        java.lang.String deviceID = bleDevice.getBluetoothDevice().getAddress();
        java.lang.String name = bleDevice.getBluetoothDevice().getName();
        if (name == null) {
            name = "Powerwatch";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceID, "deviceID");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.Accessory(new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo(deviceID, null, (short) 0, 0, name, null, null, null, 238, null), connections, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION);
    }

    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig createBleCreatorConfig(java.util.List<? extends android.bluetooth.BluetoothGattService> gattServices) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig bleCreatorConfig = new powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig(null, 1, null);
        for (android.bluetooth.BluetoothGattService bluetoothGattService : gattServices) {
            java.util.UUID uuid = bluetoothGattService.getUuid();
            java.util.List<android.bluetooth.BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(characteristics, "bluetoothGattService.characteristics");
            java.util.List<android.bluetooth.BluetoothGattCharacteristic> list = characteristics;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((android.bluetooth.BluetoothGattCharacteristic) it.next()).getUuid());
            }
            bleCreatorConfig = bleCreatorConfig.copy(kotlin.collections.MapsKt.plus(bleCreatorConfig.getServices(), kotlin.collections.MapsKt.mapOf(new kotlin.Pair(uuid, kotlin.collections.CollectionsKt.toSet(arrayList)))));
        }
        return bleCreatorConfig;
    }

    private final powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel resolveCommunicationChannel(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, com.polidea.rxandroidble2.RxBleConnection bleConnection) {
        powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel bLECommunicationChannel = new powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel(bleConnection, null, null, null, 14, null);
        switch (powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl.WhenMappings.$EnumSwitchMapping$0[protocolType.ordinal()]) {
            case 1:
                return new powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel(bLECommunicationChannel, null, 2, null);
            case 2:
                return new powerwatch.matrix.com.pwgen2android.sdk.channels.SimpleBLECommunicationChannel(bLECommunicationChannel);
            case 3:
                return new powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel(bleConnection, powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_OTA_SERVICE_RX, powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_OTA_SERVICE_TX, null);
            case 4:
                return new powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel(bleConnection);
            case 5:
                return new powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel(bLECommunicationChannel, null, 2, null);
            case 6:
                return new powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel(bleConnection);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
