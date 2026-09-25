package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: BaseActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "activity", "Landroid/app/Activity;", "(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V", "resetLanguage", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseActivityViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivityViewModel(powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, android.app.Activity activity) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.languageController = languageController;
        languageController.initSetLanguage(activity);
    }

    public final void resetLanguage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.languageController.initSetLanguage(context);
    }
}
