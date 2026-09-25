package powerwatch.matrix.com.pwgen2android.setup;

/* JADX INFO: compiled from: SavePreferencesViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "showSaveProgress", "Landroidx/databinding/ObservableField;", "", "(Landroidx/databinding/ObservableField;)V", "getShowSaveProgress", "()Landroidx/databinding/ObservableField;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SavePreferencesViewModelImpl implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final androidx.databinding.ObservableField<java.lang.Boolean> showSaveProgress;

    /* JADX WARN: Multi-variable type inference failed */
    public SavePreferencesViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SavePreferencesViewModelImpl(androidx.databinding.ObservableField<java.lang.Boolean> showSaveProgress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showSaveProgress, "showSaveProgress");
        this.showSaveProgress = showSaveProgress;
    }

    public /* synthetic */ SavePreferencesViewModelImpl(androidx.databinding.ObservableField observableField, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.databinding.ObservableField(false) : observableField);
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.showSaveProgress;
    }
}
