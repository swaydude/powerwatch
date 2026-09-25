package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat;", "", "format", "", "(I)V", "getFormat", "()I", "Twelve", "TwentyFour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class HourFormat {
    private final int format;

    public /* synthetic */ HourFormat(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: UserAccount.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Twelve extends powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve();

        private Twelve() {
            super(12, null);
        }
    }

    private HourFormat(int i) {
        this.format = i;
    }

    public final int getFormat() {
        return this.format;
    }

    /* JADX INFO: compiled from: UserAccount.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TwentyFour extends powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.TwentyFour INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.TwentyFour();

        private TwentyFour() {
            super(24, null);
        }
    }
}
