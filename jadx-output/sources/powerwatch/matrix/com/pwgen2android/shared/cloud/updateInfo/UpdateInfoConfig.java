package powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo;

/* JADX INFO: compiled from: UpdateInfoConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;", "", "crudServiceConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V", "getCrudServiceConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UpdateInfoConfig {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig;

    public UpdateInfoConfig(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudServiceConfig, "crudServiceConfig");
        this.crudServiceConfig = crudServiceConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig getCrudServiceConfig() {
        return this.crudServiceConfig;
    }
}
