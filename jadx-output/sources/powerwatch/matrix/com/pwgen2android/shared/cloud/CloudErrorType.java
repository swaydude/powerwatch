package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudErrorResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "AccountAlreadyExists", "BadCredentials", "Forbidden", "InvalidGrant", "MigrationRequired", "PasswordEmptyChar", "PasswordNotMatch", "Unauthorized", "Unknown", "UserNotEnabled", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Forbidden;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class CloudErrorType extends java.lang.Throwable {
    private final java.lang.String error;

    public /* synthetic */ CloudErrorType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unauthorized extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unauthorized INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unauthorized();

        private Unauthorized() {
            super("401 Unauthorized", null);
        }
    }

    private CloudErrorType(java.lang.String str) {
        super(str);
        this.error = str;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Forbidden;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Forbidden extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Forbidden INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Forbidden();

        private Forbidden() {
            super("403 Forbidden", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BadCredentials extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.BadCredentials INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.BadCredentials();

        private BadCredentials() {
            super("400 Bad Credentials", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UserNotEnabled extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.UserNotEnabled INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.UserNotEnabled();

        private UserNotEnabled() {
            super("400 User is disabled", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MigrationRequired extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.MigrationRequired INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.MigrationRequired();

        private MigrationRequired() {
            super("Migration required", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AccountAlreadyExists extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.AccountAlreadyExists INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.AccountAlreadyExists();

        private AccountAlreadyExists() {
            super(" 400 User already exists", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PasswordNotMatch extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordNotMatch INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordNotMatch();

        private PasswordNotMatch() {
            super("400 Password not match", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PasswordEmptyChar extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordEmptyChar INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordEmptyChar();

        private PasswordEmptyChar() {
            super("400 Password contains a whitespace character.", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unknown INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unknown();

        private Unknown() {
            super("Unknown server authRequiredError", null);
        }
    }

    /* JADX INFO: compiled from: CloudErrorResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class InvalidGrant extends powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType {
        public static final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.InvalidGrant INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.InvalidGrant();

        private InvalidGrant() {
            super("400 Invalid Grant", null);
        }
    }
}
