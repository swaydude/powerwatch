package powerwatch.matrix.com.pwgen2android.pair.ui.gen2;

/* JADX INFO: compiled from: QRPairingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\n\u0010\u0015\u001a\u00020\u0012*\u00020\u0016R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "loginCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "extractQRCode", "", "qrCodeData", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "onBackClicked", "", "onPairingFailed", "onQRCodeResolved", "onPinCodeClicked", "Landroid/view/View;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class QRPairingViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel.Companion(null);
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel.class).getSimpleName();
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRPairingViewModel(androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        this.loginCloudService = loginCloudService;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
    }

    public final void onPairingFailed() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.PairingFailedFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
    }

    private final java.lang.Integer extractQRCode(java.lang.String qrCodeData) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String str;
        java.lang.String str2;
        java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) qrCodeData, new java.lang.String[]{"\n"}, false, 0, 6, (java.lang.Object) null);
        java.util.Iterator it = listSplit$default.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) next, (java.lang.CharSequence) "Pair code", true));
        java.lang.String str3 = (java.lang.String) next;
        if (str3 != null) {
            java.util.List listSplit$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
            return kotlin.text.StringsKt.toIntOrNull((java.lang.String) listSplit$default2.get(listSplit$default2.size() - 1));
        }
        java.util.Iterator it2 = listSplit$default.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!kotlin.text.StringsKt.contains((java.lang.CharSequence) next2, (java.lang.CharSequence) "open?", true));
        java.lang.String str4 = (java.lang.String) next2;
        java.util.List listSplit$default3 = str4 == null ? null : kotlin.text.StringsKt.split$default((java.lang.CharSequence) str4, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null);
        java.util.List listSplit$default4 = (listSplit$default3 == null || (str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(listSplit$default3, 1)) == null) ? null : kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default4 == null || (str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(listSplit$default4, 1)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toIntOrNull(str2);
    }

    public final void onQRCodeResolved(java.lang.String qrCodeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
        java.lang.Integer numExtractQRCode = extractQRCode(qrCodeData);
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressFragment.INSTANCE.newInstance(java.lang.String.valueOf(numExtractQRCode)), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
    }

    public final void onPinCodeClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    /* JADX INFO: compiled from: QRPairingViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getTAG() {
            return powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel.TAG;
        }
    }
}
