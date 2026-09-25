package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: ExecutorsFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory;", "", "()V", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExecutorsFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.Companion(null);

    /* JADX INFO: compiled from: ExecutorsFactory.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;", "", "()V", "createPairExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "version", "", "createSyncExecutor", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor createPairExecutor$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ExecutorsFactory.Companion companion, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput pWLoggerInput, int i, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                i = 1;
            }
            return companion.createPairExecutor(deviceInfo, communicator, pWLoggerInput, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor createPairExecutor(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, int version) {
            powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl gen2PairExecutorImpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
            int i = 2;
            powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor baseDataTransferExecutor = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            if (deviceInfo.isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP)) {
                if (version == 0 || version == 1) {
                    gen2PairExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl(communicator);
                } else if (version == 2) {
                    gen2PairExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version2PairExecutorImpl(communicator);
                } else {
                    gen2PairExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl(communicator);
                }
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2PairExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Created pair executor: ", gen2PairExecutorImpl.getClass().getSimpleName()), null, 2, null);
                return gen2PairExecutorImpl;
            }
            if (deviceInfo.isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X)) {
                return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingExecutor(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor(communicator, baseDataTransferExecutor, i, objArr3 == true ? 1 : 0));
            }
            if (deviceInfo.isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP)) {
                return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingExecutor(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ClassicDataTransferExecutor(communicator, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
            }
            throw new kotlin.NotImplementedError("An operation is not implemented: Unsupported pair protocol ");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor createSyncExecutor(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider) {
            powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl gen2ExecutorImpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "locationInfoProvider");
            int i = 2;
            powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor baseDataTransferExecutor = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            if (deviceInfo.isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP)) {
                short protocolVersion = deviceInfo.getProtocolVersion();
                if (protocolVersion == 0 || protocolVersion == 1) {
                    gen2ExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl(communicator);
                } else if (protocolVersion == 2) {
                    gen2ExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl(communicator);
                } else if (protocolVersion == 3) {
                    gen2ExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl(communicator, locationInfoProvider);
                } else {
                    gen2ExecutorImpl = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl(communicator, locationInfoProvider);
                }
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Created sync executor: ", gen2ExecutorImpl.getClass().getSimpleName()), null, 2, null);
                return gen2ExecutorImpl;
            }
            if (deviceInfo.isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X)) {
                return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncXExecutor(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor(communicator, baseDataTransferExecutor, i, objArr3 == true ? 1 : 0), logger);
            }
            if (deviceInfo.isProtocolSupported(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP)) {
                return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncExecutor(new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ClassicDataTransferExecutor(communicator, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), logger);
            }
            throw new kotlin.NotImplementedError("An operation is not implemented: Unsupported sync executor");
        }
    }
}
