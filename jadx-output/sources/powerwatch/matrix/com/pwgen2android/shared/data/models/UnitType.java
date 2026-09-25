package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "IMPERIAL", "METRIC", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class UnitType {
    private final java.lang.String type;

    public /* synthetic */ UnitType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: UserAccount.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class METRIC extends powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC();

        private METRIC() {
            super("METRIC", null);
        }
    }

    private UnitType(java.lang.String str) {
        this.type = str;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: UserAccount.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class IMPERIAL extends powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.IMPERIAL INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.IMPERIAL();

        private IMPERIAL() {
            super("IMPERIAL", null);
        }
    }
}
