package powerwatch.matrix.com.pwgen2android.pair;

/* JADX INFO: compiled from: PairingActivityViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PairingActivityViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseActivityViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairingActivityViewModel(powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(languageController, activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 8, null);
    }
}
