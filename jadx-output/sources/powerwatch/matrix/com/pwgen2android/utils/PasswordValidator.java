package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: LoginValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;", "", "()V", "isPasswordValid", "", "password", "", "Length", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PasswordValidator {
    private static final int PASSWORD_MIN_LENGTH = 8;

    public final boolean isPasswordValid(java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        return password.length() >= 8;
    }
}
