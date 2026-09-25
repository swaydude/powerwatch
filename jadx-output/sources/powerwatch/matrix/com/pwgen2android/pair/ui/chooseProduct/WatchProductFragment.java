package powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct;

/* JADX INFO: compiled from: WatchProductFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;", "Landroidx/fragment/app/Fragment;", "()V", "watchProduct", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchProductFragment extends androidx.fragment.app.Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment.Companion(null);
    private static final java.lang.String WATCH_PRODUCT_KEY = "watch_product";
    private powerwatch.matrix.com.pwgen2android.shared.WatchProduct watchProduct;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment newInstance(powerwatch.matrix.com.pwgen2android.shared.WatchProduct watchProduct) {
        return INSTANCE.newInstance(watchProduct);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_product, container, false);
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments == null ? null : arguments.getSerializable(WATCH_PRODUCT_KEY);
        powerwatch.matrix.com.pwgen2android.shared.WatchProduct watchProduct = serializable instanceof powerwatch.matrix.com.pwgen2android.shared.WatchProduct ? (powerwatch.matrix.com.pwgen2android.shared.WatchProduct) serializable : null;
        if (watchProduct == null) {
            throw new java.lang.IllegalArgumentException("Watch product must be provided.");
        }
        this.watchProduct = watchProduct;
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.watch_product_title);
        powerwatch.matrix.com.pwgen2android.shared.WatchProduct watchProduct2 = this.watchProduct;
        if (watchProduct2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchProduct");
            throw null;
        }
        fontableTextView.setText(watchProduct2.getName());
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.watch_image);
        powerwatch.matrix.com.pwgen2android.shared.WatchProduct watchProduct3 = this.watchProduct;
        if (watchProduct3 != null) {
            imageView.setImageResource(watchProduct3.getImage());
            return viewInflate;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchProduct");
        throw null;
    }

    /* JADX INFO: compiled from: WatchProductFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;", "", "()V", "WATCH_PRODUCT_KEY", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;", "product", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment newInstance(powerwatch.matrix.com.pwgen2android.shared.WatchProduct product) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "product");
            powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment watchProductFragment = new powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment.WATCH_PRODUCT_KEY, product);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            watchProductFragment.setArguments(bundle);
            return watchProductFragment;
        }
    }
}
