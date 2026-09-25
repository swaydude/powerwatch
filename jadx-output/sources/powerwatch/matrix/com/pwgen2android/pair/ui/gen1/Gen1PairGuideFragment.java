package powerwatch.matrix.com.pwgen2android.pair.ui.gen1;

/* JADX INFO: compiled from: Gen1PairGuideFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1PairGuideFragment extends androidx.fragment.app.Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment newInstance() {
        return INSTANCE.newInstance();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.widget.ImageView imageView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pair_guide, container, false);
        if (viewInflate != null && (imageView = (android.widget.ImageView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)) != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairGuideFragment$QTHW2jnEWoE1vjOBP0Fytk7DaTc
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment.m2037onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        android.widget.TextView textView = viewInflate == null ? null : (android.widget.TextView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.choose_product_screen_title));
        }
        ((android.widget.Button) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.start_search_button)).setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairGuideFragment$NgG3Fy86YQYTIZH1lO2FPJFzefE
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment.m2038onCreateView$lambda1(this.f$0, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2037onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.fragment.app.FragmentManager fragmentManager = this$0.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2038onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.fragment.app.FragmentManager fragmentManager = this$0.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, true, null, 8, null);
    }

    /* JADX INFO: compiled from: Gen1PairGuideFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairGuideFragment();
        }
    }
}
