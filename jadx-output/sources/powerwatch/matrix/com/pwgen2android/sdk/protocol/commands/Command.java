package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "extractProgress", "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "getCommandType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;", "getSendingData", "", "parseReceivedData", "dataToParse", "printCommandId", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Command extends powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo);

    powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType();

    byte[] getSendingData();

    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo);

    java.lang.String printCommandId();

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.String printCommandId(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "this");
            return "";
        }

        public static org.koin.core.Koin getKoin(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "this");
            return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(command);
        }

        public static float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            return dataInfo.getParsingFinished() ? 1.0f : 0.0f;
        }

        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, byte[] bArr, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, int i, java.lang.Object obj) {
            if (obj == null) {
                return command.parseReceivedData(bArr, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(null, null, null, null, 0, null, 63, null), 0.0f, null, null, null, 0L, null, 507, null) : dataInfo);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseReceivedData");
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            dataInfo.setParsingStarted(true);
            dataInfo.setParsingFinished(false);
            if (dataToParse.length == 4 && java.util.Arrays.equals(dataToParse, new byte[]{1, 0, 5, 2})) {
                dataInfo.setParsingFinished(true);
                dataInfo.setParsingStarted(false);
            }
            return dataInfo;
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "this");
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.SETTING;
        }
    }
}
