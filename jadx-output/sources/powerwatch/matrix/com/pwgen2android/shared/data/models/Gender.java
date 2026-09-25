package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;", "", "description", "", "displayResource", "", "(Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getDisplayResource", "()I", "Female", "Male", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Gender {
    private final java.lang.String description;
    private final int displayResource;

    public /* synthetic */ Gender(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* JADX INFO: compiled from: UserAccount.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Male extends powerwatch.matrix.com.pwgen2android.shared.data.models.Gender {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male();

        private Male() {
            super("male", powerwatch.matrix.com.pwgen2android.R.string.male, null);
        }
    }

    private Gender(java.lang.String str, int i) {
        this.description = str;
        this.displayResource = i;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final int getDisplayResource() {
        return this.displayResource;
    }

    /* JADX INFO: compiled from: UserAccount.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Female extends powerwatch.matrix.com.pwgen2android.shared.data.models.Gender {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Female();

        private Female() {
            super("female", powerwatch.matrix.com.pwgen2android.R.string.female, null);
        }
    }
}
