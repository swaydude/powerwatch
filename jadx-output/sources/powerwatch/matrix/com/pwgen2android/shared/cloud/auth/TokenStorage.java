package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: TokenStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H'¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;", "", "add", "", "passwordCredentials", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "delete", "deleteAll", "get", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface TokenStorage {
    void add(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials);

    void delete();

    void deleteAll();

    powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials get();
}
