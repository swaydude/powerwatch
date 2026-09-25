package powerwatch.matrix.com.pwgen2android.main.dashboard.sync;

/* JADX INFO: compiled from: SyncViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "()V", "syncProgressField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getSyncProgressField", "()Landroidx/databinding/ObservableField;", "syncProgressText", "", "getSyncProgressText", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SyncViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final androidx.databinding.ObservableField<java.lang.Integer> syncProgressField;
    private final androidx.databinding.ObservableField<java.lang.String> syncProgressText;

    public SyncViewModel() {
        super(null, null, 3, null);
        this.syncProgressField = new androidx.databinding.ObservableField<>(0);
        this.syncProgressText = new androidx.databinding.ObservableField<>("Syncing...");
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getSyncProgressField() {
        return this.syncProgressField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSyncProgressText() {
        return this.syncProgressText;
    }
}
