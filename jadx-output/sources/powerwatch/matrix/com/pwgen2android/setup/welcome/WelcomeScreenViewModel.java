package powerwatch.matrix.com.pwgen2android.setup.welcome;

/* JADX INFO: compiled from: WelcomeScreenViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\b\u001a\u00020\t*\u00020\nJ\n\u0010\u000b\u001a\u00020\t*\u00020\nJ\n\u0010\f\u001a\u00020\t*\u00020\nR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "backClicked", "", "Landroid/view/View;", "onLoginClicked", "onSignUpClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WelcomeScreenViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeScreenViewModel(androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
    }

    public final void onLoginClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment signInFragmentNewInstance = powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, signInFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }

    public final void onSignUpClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountFragment createAccountFragmentNewInstance$default = powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountFragment.Companion.newInstance$default(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountFragment.INSTANCE, false, 1, null);
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, createAccountFragmentNewInstance$default, powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }

    public final void backClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}
