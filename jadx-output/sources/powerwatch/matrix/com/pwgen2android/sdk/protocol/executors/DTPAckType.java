package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;", "", "value", "", "([B)V", "getValue", "()[B", "AckCRCInvalid", "AckGood", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckCRCInvalid;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DTPAckType {
    private final byte[] value;

    public /* synthetic */ DTPAckType(byte[] bArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    /* JADX INFO: compiled from: Gen2Executor.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AckGood extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckGood INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckGood();

        private AckGood() {
            super(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorKt.mapToBytes("05000020008DEF02D2"), null);
        }
    }

    private DTPAckType(byte[] bArr) {
        this.value = bArr;
    }

    public final byte[] getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: Gen2Executor.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckCRCInvalid;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AckCRCInvalid extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckCRCInvalid INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckCRCInvalid();

        private AckCRCInvalid() {
            super(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorKt.mapToBytes("05000020011BDF05A5"), null);
        }
    }
}
