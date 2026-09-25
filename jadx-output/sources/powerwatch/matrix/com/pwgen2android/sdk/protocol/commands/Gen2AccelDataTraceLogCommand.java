package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2HeaderTraceLogCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AccelDataTraceLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "()V", "logger", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "getLogger", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "logger$delegate", "Lkotlin/Lazy;", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2AccelDataTraceLogCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy logger;

    public Gen2AccelDataTraceLogCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2AccelTraceLogId.INSTANCE);
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = getKoin().getRootScope();
        this.logger = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AccelDataTraceLogCommand$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger.class), qualifier, function0);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger getLogger() {
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger) this.logger.getValue();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("Data received in Accel Trace Log: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString(payloadData, false)));
        getLogger().log(powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString(payloadData, false), powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
        return dataInfo;
    }
}
