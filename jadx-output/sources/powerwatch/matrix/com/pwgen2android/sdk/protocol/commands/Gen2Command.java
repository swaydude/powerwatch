package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u0018\u0010\r\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\fH\u0016J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "createCRC", "", "data", "createHeader", "createPayload", "extractAndCompareCRC", "", "response", "extractPayload", "Lkotlin/Pair;", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "payloadData", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "extractResponseType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;", "getCoreCommand", "getSendingData", "onSuccess", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;", "parseReceivedData", "dataToParse", "validateResponse", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Gen2Command extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    byte[] createPayload();

    boolean extractAndCompareCRC(byte[] response);

    kotlin.Pair<java.lang.Boolean, byte[]> extractPayload(byte[] response);

    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo);

    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo);

    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError extractResponseType(kotlin.Pair<java.lang.Boolean, byte[]> data);

    byte[] getCoreCommand();

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    byte[] getSendingData();

    powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData onSuccess(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo);

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo);

    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo parseReceivedData(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo);

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static byte[] createPayload(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            return new byte[0];
        }

        public static float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.extractProgress(gen2Command, dataInfo);
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getCommandType(gen2Command);
        }

        public static org.koin.core.Koin getKoin(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getKoin(gen2Command);
        }

        public static java.lang.String printCommandId(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.printCommandId(gen2Command);
        }

        public static byte[] getSendingData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            byte[] bArrCreatePayload = gen2Command.createPayload();
            byte[] coreCommand = gen2Command.getCoreCommand();
            return kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(createHeader(gen2Command, bArrCreatePayload), coreCommand), bArrCreatePayload), createCRC(gen2Command, kotlin.collections.ArraysKt.plus(coreCommand, bArrCreatePayload)));
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData onSuccess(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            dataInfo.getDataInfo().setParsingFinished(true);
            dataInfo.getDataInfo().setParsingStarted(false);
            return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData(dataInfo, true, false, null, 12, null);
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo extractResponse(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            dataInfo.setParsingFinished(true);
            dataInfo.setParsingStarted(false);
            return dataInfo;
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            dataInfo.setParsingStarted(true);
            dataInfo.setParsingFinished(false);
            kotlin.Pair<java.lang.Boolean, byte[]> pairExtractPayload = gen2Command.extractPayload(dataToParse);
            return pairExtractPayload.getFirst().booleanValue() ? gen2Command.extractResponse(pairExtractPayload.getSecond(), dataInfo) : dataInfo;
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo parseReceivedData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            dataInfo.getDataInfo().setParsingStarted(true);
            dataInfo.getDataInfo().setParsingFinished(false);
            kotlin.Pair<java.lang.Boolean, byte[]> pairExtractPayload = gen2Command.extractPayload(payloadData);
            return pairExtractPayload.getFirst().booleanValue() ? gen2Command.extractResponse(pairExtractPayload.getSecond(), dataInfo) : dataInfo;
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
            dataInfo.getDataInfo().setParsingStarted(false);
            dataInfo.getDataInfo().setParsingFinished(true);
            return dataInfo;
        }

        private static byte[] createHeader(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] bArr) {
            int length = ((short) bArr.length) + 2 + 4;
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
            byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN).putShort((short) length).putShort((short) 4160);
            byte[] bArrArray = byteBufferAllocate.array();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "headerBuffer.array()");
            return bArrArray;
        }

        private static byte[] createCRC(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] bArr) {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
            byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
            crc32.update(bArr);
            byteBufferAllocate.putInt((int) crc32.getValue());
            byte[] bArrArray = byteBufferAllocate.array();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "crcBuffer.array()");
            return bArrArray;
        }

        private static boolean validateResponse(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] bArr) {
            return bArr.length >= 8;
        }

        public static kotlin.Pair<java.lang.Boolean, byte[]> extractPayload(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            if (!validateResponse(gen2Command, response)) {
                return new kotlin.Pair<>(false, response);
            }
            int iM107constructorimpl = kotlin.UInt.m107constructorimpl((response[0] & kotlin.UByte.MAX_VALUE) | ((response[1] & kotlin.UByte.MAX_VALUE) << 8));
            byte[] bArrCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(response, 4, response.length - 4);
            return iM107constructorimpl != kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(bArrCopyOfRange.length) + 4) ? new kotlin.Pair<>(false, response) : new kotlin.Pair<>(true, bArrCopyOfRange);
        }

        public static boolean extractAndCompareCRC(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, byte[] response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            if (validateResponse(gen2Command, response) && kotlin.UInt.m107constructorimpl(((response[1] & kotlin.UByte.MAX_VALUE) << 8) | (response[0] & kotlin.UByte.MAX_VALUE)) == kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(kotlin.collections.ArraysKt.copyOfRange(response, 4, response.length - 4).length) + 4)) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ComandsKt.compareCRC(response);
            }
            return false;
        }

        public static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError extractResponseType(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, kotlin.Pair<java.lang.Boolean, byte[]> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Command, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            if (!data.getFirst().booleanValue() || data.getSecond().length < 2) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.Unknown.INSTANCE;
            }
            int iM291constructorimpl = kotlin.UShort.m291constructorimpl(java.nio.ByteBuffer.wrap(data.getSecond()).getShort()) & kotlin.UShort.MAX_VALUE;
            if (iM291constructorimpl == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.ERROR.INSTANCE.getHex()) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.Unknown.INSTANCE;
            }
            if (iM291constructorimpl == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.LOCKED.INSTANCE.getHex()) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked.INSTANCE;
            }
            if (iM291constructorimpl == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.WAIT.INSTANCE.getHex()) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy.INSTANCE;
            }
            if (iM291constructorimpl == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.PROCESSING.INSTANCE.getHex() || iM291constructorimpl == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.SUCCESS.INSTANCE.getHex()) {
                return null;
            }
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.Unknown.INSTANCE;
        }
    }
}
