package powerwatch.matrix.com.pwgen2android.sdk.channels.stream;

/* JADX INFO: compiled from: ChannelStream.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0003J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "headerAddition", "", "(I)V", "TAG", "", "kotlin.jvm.PlatformType", "accumulatedData", "", "messageList", "", "appendData", "", "data", "clearMessages", "destroy", "extractHeaderSize", "extractMessage", "size", "extractMessages", "extractSingleMessage", "", "getMessageList", "", "isDataValid", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChannelStreamImpl implements powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.String TAG;
    private byte[] accumulatedData;
    private final int headerAddition;
    private java.util.List<byte[]> messageList;

    public ChannelStreamImpl() {
        this(0, 1, null);
    }

    public ChannelStreamImpl(int i) {
        this.headerAddition = i;
        this.TAG = getClass().getSimpleName();
        this.messageList = new java.util.LinkedList();
        this.accumulatedData = new byte[0];
    }

    public /* synthetic */ ChannelStreamImpl(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4 : i);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream
    public void destroy() {
        this.accumulatedData = new byte[0];
        this.messageList.clear();
    }

    private final boolean isDataValid(byte[] data) {
        return !kotlin.text.StringsKt.startsWith$default(new java.lang.String(kotlin.collections.ArraysKt.plus(this.accumulatedData, data), kotlin.text.Charsets.UTF_8), "#QI:Notification", false, 2, (java.lang.Object) null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream
    public void appendData(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (isDataValid(data)) {
            byte[] bArrPlus = kotlin.collections.ArraysKt.plus(this.accumulatedData, data);
            this.accumulatedData = bArrPlus;
            android.util.Log.d(this.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("New data to process: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(bArrPlus, false, 1, null)));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream
    public void clearMessages() {
        this.messageList.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream
    public void extractMessages() {
        boolean zExtractSingleMessage = true;
        while (zExtractSingleMessage) {
            zExtractSingleMessage = extractSingleMessage();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream
    public java.util.List<byte[]> getMessageList() {
        return this.messageList;
    }

    private final boolean extractSingleMessage() {
        int iExtractHeaderSize = extractHeaderSize(this.accumulatedData);
        if (iExtractHeaderSize != -1) {
            int i = iExtractHeaderSize + this.headerAddition;
            byte[] bArrExtractMessage = extractMessage(i);
            android.util.Log.d(this.TAG, "Extracted message size: " + bArrExtractMessage.length + ", header size: " + i);
            if (bArrExtractMessage.length == i) {
                this.messageList.add(bArrExtractMessage);
                byte[] bArr = this.accumulatedData;
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i, bArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(accumulatedData, header, accumulatedData.size)");
                this.accumulatedData = bArrCopyOfRange;
                android.util.Log.d(this.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Batch data size after extract: ", java.lang.Integer.valueOf(bArrCopyOfRange.length)));
                return !(this.accumulatedData.length == 0);
            }
        } else {
            android.util.Log.d(this.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Received invalid data: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(this.accumulatedData, false, 1, null)));
            this.accumulatedData = new byte[0];
        }
        return false;
    }

    private final byte[] extractMessage(int size) {
        byte[] bArr = this.accumulatedData;
        if (size >= bArr.length) {
            size = bArr.length;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, size);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    private final int extractHeaderSize(byte[] data) {
        if (data.length <= 2) {
            return -1;
        }
        int iM107constructorimpl = kotlin.UInt.m107constructorimpl((data[0] & kotlin.UByte.MAX_VALUE) | ((data[1] & kotlin.UByte.MAX_VALUE) << 8));
        if (java.lang.Integer.compare(iM107constructorimpl ^ Integer.MIN_VALUE, kotlin.UInt.m107constructorimpl(37442) ^ Integer.MIN_VALUE) >= 0) {
            return -1;
        }
        return iM107constructorimpl;
    }
}
