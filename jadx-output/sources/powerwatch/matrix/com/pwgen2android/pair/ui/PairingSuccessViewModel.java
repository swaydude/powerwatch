package powerwatch.matrix.com.pwgen2android.pair.ui;

/* JADX INFO: compiled from: PairingSuccessViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\n\u0010\r\u001a\u00020\f*\u00020\u000eR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingSuccessViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "fragmentManagerWeakReference", "onBackClicked", "", "onContinueClicked", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PairingSuccessViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairingSuccessViewModel(android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onContinueClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.app.Activity activity = this.contextWeakReference.get();
        if (activity != null) {
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class));
        }
        if (activity == null) {
            return;
        }
        activity.finish();
    }
}
