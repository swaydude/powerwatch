package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: DataFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;", "dataFormatter", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;)V", "extractFirmwareInfo", "Lkotlin/Pair;", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;", "firmwareVersionBytes", "", "formatFwVersion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2DataFormatter implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataFormatter {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataFormatter dataFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    public Gen2DataFormatter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Gen2DataFormatter(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataFormatter dataFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataFormatter, "dataFormatter");
        this.dataFormatter = dataFormatter;
    }

    public /* synthetic */ Gen2DataFormatter(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen1DataFormatter gen1DataFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen1DataFormatter() : gen1DataFormatter);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataFormatter
    public java.lang.String formatFwVersion(byte[] firmwareVersionBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionBytes, "firmwareVersionBytes");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return kotlin.text.StringsKt.replace$default(new java.lang.String(firmwareVersionBytes, UTF_8), "\u0000", "", false, 4, (java.lang.Object) null);
    }

    public final kotlin.Pair<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion> extractFirmwareInfo(byte[] firmwareVersionBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionBytes, "firmwareVersionBytes");
        if (firmwareVersionBytes.length < 8) {
            return new kotlin.Pair<>(null, null);
        }
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(firmwareVersionBytes);
        byte[] bArr = new byte[8];
        byteBufferWrap.get(bArr);
        java.lang.String fwVersion = formatFwVersion(bArr);
        if (byteBufferWrap.remaining() < 3) {
            return new kotlin.Pair<>(fwVersion, null);
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion(byteBufferWrap.get(), byteBufferWrap.get(), byteBufferWrap.get(), 0, null, 24, null);
        if (byteBufferWrap.remaining() < 4) {
            return new kotlin.Pair<>(fwVersion, dISTableVersion);
        }
        int i = byteBufferWrap.getInt();
        dISTableVersion.setTimestamp(i);
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("AGPS time read: ", java.lang.Integer.valueOf(i)));
        if (byteBufferWrap.remaining() < 36) {
            return new kotlin.Pair<>(fwVersion, dISTableVersion);
        }
        byteBufferWrap.getInt();
        dISTableVersion.setSections(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SectionsInfo(kotlin.collections.CollectionsKt.mutableListOf(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.FontCoreLib.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.ClockFonts.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.Gauges.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.Icons.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation1.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation2.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation3.INSTANCE, byteBufferWrap.getInt()), new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.FontLookupTable.INSTANCE, byteBufferWrap.getInt()))));
        return new kotlin.Pair<>(fwVersion, dISTableVersion);
    }
}
