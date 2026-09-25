package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: AuthErrorHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthError;", "", "()V", "UnauthorizedError", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthError$UnauthorizedError;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AuthError extends java.lang.Throwable {
    public /* synthetic */ AuthError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: AuthErrorHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthError$UnauthorizedError;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UnauthorizedError extends powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthError {
        public UnauthorizedError() {
            super(null);
        }
    }

    private AuthError() {
    }
}
