package powerwatch.matrix.com.pwgen2android.secret.debugdb;

/* JADX INFO: compiled from: DBDebugFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DBDebugFragment extends androidx.fragment.app.Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment newInstance(java.lang.String str) {
        return INSTANCE.newInstance(str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_dbdebug, container, false);
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.app_secret_screen_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.app_secret_screen_title)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(toolbar);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.secret.debugdb.-$$Lambda$DBDebugFragment$YyG_lM301gA2VZF3eGQGLRiZhgQ
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment.m2789onCreateView$lambda0(this.f$0, view);
            }
        });
        android.webkit.WebView webView = (android.webkit.WebView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        android.os.Bundle arguments = getArguments();
        java.lang.String string2 = arguments == null ? null : arguments.getString("page_url");
        if (string2 == null) {
            throw new java.lang.IllegalArgumentException("URL must be provided!");
        }
        webView.loadUrl(string2);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2789onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.fragment.app.FragmentManager fragmentManager = this$0.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    /* JADX INFO: compiled from: DBDebugFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;", "url", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment newInstance(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment dBDebugFragment = new powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("page_url", url);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            dBDebugFragment.setArguments(bundle);
            return dBDebugFragment;
        }
    }
}
