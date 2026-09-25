package powerwatch.matrix.com.pwgen2android.sdk.communicator;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "accessory", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V", "getAccessory", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "setAccessory", "connections", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "deviceInfoSubject", "Lio/reactivex/subjects/PublishSubject;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "messageOutputSubject", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "kotlin.jvm.PlatformType", "addConnection", "", "connection", "attachOutput", "connectionToAttach", "messageOutput", "Lio/reactivex/Observable;", "refresh", "removeConnections", "resubscribeCharacteristics", "Lio/reactivex/Completable;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "sendMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "updateInfo", "updateWithAccessory", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceImpl implements powerwatch.matrix.com.pwgen2android.sdk.communicator.Device, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.class).getSimpleName();
    private powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> connections;
    private powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> deviceInfoSubject;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutputSubject;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachOutput$lambda-4, reason: not valid java name */
    public static final void m2259attachOutput$lambda4(java.lang.Throwable th) {
    }

    public DeviceImpl(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.accessory = accessory;
        this.disposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create()");
        this.deviceInfoSubject = publishSubjectCreate;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<CommunicationMessage>()");
        this.messageOutputSubject = publishSubjectCreate2;
        this.connections = new java.util.ArrayList();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Device created with: " + this.accessory.getDeviceInfo().getUid() + ", connection count: " + this.accessory.getConnections().size(), null, 2, null);
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = this.accessory.getDeviceInfo();
        this.deviceInfo = deviceInfo.copy((255 & 1) != 0 ? deviceInfo.uid : null, (255 & 2) != 0 ? deviceInfo.pairingCode : null, (255 & 4) != 0 ? deviceInfo.protocolVersion : (short) 0, (255 & 8) != 0 ? deviceInfo.time : 0, (255 & 16) != 0 ? deviceInfo.deviceName : null, (255 & 32) != 0 ? deviceInfo.extendedDeviceInfo : null, (255 & 64) != 0 ? deviceInfo.connectionInfos : null, (255 & 128) != 0 ? deviceInfo.sectionInfoMap : null);
        for (powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection : this.accessory.getConnections()) {
            addConnection(connection);
            attachOutput(connection);
        }
        this.deviceInfoSubject.onNext(this.deviceInfo);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.Accessory getAccessory() {
        return this.accessory;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final void setAccessory(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessory, "<set-?>");
        this.accessory = accessory;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    public io.reactivex.Completable resubscribeCharacteristics(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connectionPrevious;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> list = this.connections;
        java.util.ListIterator<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                connectionPrevious = null;
                break;
            }
            connectionPrevious = listIterator.previous();
        } while (!(connectionPrevious.getConnectionInfo().getProtocolType() == protocolType));
        powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection = connectionPrevious;
        io.reactivex.Completable completableResubscribeCharacteristics = connection != null ? connection.resubscribeCharacteristics() : null;
        if (completableResubscribeCharacteristics != null) {
            return completableResubscribeCharacteristics;
        }
        io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
        return completableComplete;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    public void refresh() {
        powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection = (powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.connections);
        if (connection == null) {
            return;
        }
        connection.refresh();
    }

    private final void addConnection(powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection) {
        powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection2;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Adding new connection, type: ", connection.getConnectionInfo().getTechnologyType()), null, 2, null);
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection> list = this.connections;
        boolean z = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                connection2 = (powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) it.next();
            } while (!(connection2.getConnectionInfo().getProtocolType() == connection.getConnectionInfo().getProtocolType() && connection2.getConnectionInfo().getTechnologyType() == connection.getConnectionInfo().getTechnologyType()));
        } else {
            z = false;
            break;
        }
        if (z) {
            return;
        }
        this.connections.add(connection);
        this.deviceInfo.getConnectionInfos().add(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo.copy$default(connection.getConnectionInfo(), null, null, 3, null));
    }

    private final void attachOutput(powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connectionToAttach) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Subscribing to connection: ", connectionToAttach.getConnectionInfo().getTechnologyType()), null, 2, null);
        this.disposable.add(connectionToAttach.messageOutput().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$DeviceImpl$gZKNY38XlkieKhWH1yT0TFikyv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.m2258attachOutput$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$DeviceImpl$D6fmMHcxHh-k-Pc6UizQlhA_vZw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.m2259attachOutput$lambda4((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachOutput$lambda-3, reason: not valid java name */
    public static final void m2258attachOutput$lambda3(powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.messageOutputSubject.onNext(communicationMessage);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    /* JADX INFO: renamed from: deviceInfo, reason: from getter */
    public powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> updateInfo() {
        return this.deviceInfoSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutput() {
        io.reactivex.Observable map = this.messageOutputSubject.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$DeviceImpl$6pRlsX6pzvHJnK3A5-FUBb3niVU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.m2262messageOutput$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "messageOutputSubject.map {\n                it.uid = deviceInfo.uid\n                it\n            }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messageOutput$lambda-5, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage m2262messageOutput$lambda5(powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.setUid(this$0.deviceInfo.getUid());
        return it;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    public io.reactivex.Completable sendMessage(final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.m2263sendMessage$lambda7(this.f$0, message);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n            val resultConnection = this.connections\n                    .firstOrNull {\n                        it.connectionInfo.protocolType == message.protocolType\n                                && it.connectionInfo.technologyType == message.technologyType\n                    }\n            resultConnection?.sendMessage(message) ?: Completable.error(Throwable())\n        }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-7, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2263sendMessage$lambda7(powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        java.lang.Object next;
        powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        java.util.Iterator<T> it = this$0.connections.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            connection = (powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) next;
        } while (!(connection.getConnectionInfo().getProtocolType() == message.getProtocolType() && connection.getConnectionInfo().getTechnologyType() == message.getTechnologyType()));
        powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection2 = (powerwatch.matrix.com.pwgen2android.sdk.connection.Connection) next;
        io.reactivex.Completable completableSendMessage = connection2 != null ? connection2.sendMessage(message) : null;
        return completableSendMessage == null ? io.reactivex.Completable.error(new java.lang.Throwable()) : completableSendMessage;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Device
    public void updateWithAccessory(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessory, "accessory");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = accessory.getDeviceInfo();
        this.deviceInfo = deviceInfo.copy((255 & 1) != 0 ? deviceInfo.uid : null, (255 & 2) != 0 ? deviceInfo.pairingCode : null, (255 & 4) != 0 ? deviceInfo.protocolVersion : (short) 0, (255 & 8) != 0 ? deviceInfo.time : 0, (255 & 16) != 0 ? deviceInfo.deviceName : null, (255 & 32) != 0 ? deviceInfo.extendedDeviceInfo : null, (255 & 64) != 0 ? deviceInfo.connectionInfos : null, (255 & 128) != 0 ? deviceInfo.sectionInfoMap : null);
        if (!accessory.getHasConnections()) {
            removeConnections(accessory);
        } else {
            for (powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection : accessory.getConnections()) {
                addConnection(connection);
                attachOutput(connection);
            }
        }
        this.deviceInfoSubject.onNext(this.deviceInfo);
    }

    private final void removeConnections(final powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Removing connections from accessory, type: ", accessory.getTechnologyType()), null, 2, null);
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.connections, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.connection.Connection, java.lang.Boolean>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.removeConnections.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(powerwatch.matrix.com.pwgen2android.sdk.connection.Connection connection) {
                return java.lang.Boolean.valueOf(invoke2(connection));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(powerwatch.matrix.com.pwgen2android.sdk.connection.Connection it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return it.getConnectionInfo().getTechnologyType() == accessory.getTechnologyType();
            }
        });
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.deviceInfo.getConnectionInfos(), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo, java.lang.Boolean>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl.removeConnections.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo) {
                return java.lang.Boolean.valueOf(invoke2(connectionInfo));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return it.getTechnologyType() == accessory.getTechnologyType();
            }
        });
        this.disposable.clear();
    }
}
