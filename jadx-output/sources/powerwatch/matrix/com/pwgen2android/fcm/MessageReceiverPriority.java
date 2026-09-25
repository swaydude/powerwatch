package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: PushRemoteMessageFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;", "", "value", "", "(I)V", "getValue", "()I", "Highest", "Low", "Medium", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Highest;", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Medium;", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Low;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class MessageReceiverPriority {
    private final int value;

    public /* synthetic */ MessageReceiverPriority(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: PushRemoteMessageFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Highest;", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Highest extends powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority {
        public static final powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Highest INSTANCE = new powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Highest();

        private Highest() {
            super(3, null);
        }
    }

    private MessageReceiverPriority(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: PushRemoteMessageFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Medium;", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Medium extends powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority {
        public static final powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Medium INSTANCE = new powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Medium();

        private Medium() {
            super(2, null);
        }
    }

    /* JADX INFO: compiled from: PushRemoteMessageFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Low;", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Low extends powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority {
        public static final powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Low INSTANCE = new powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Low();

        private Low() {
            super(1, null);
        }
    }
}
