package powerwatch.matrix.com.pwgen2android.pair.ui.gen2;

/* JADX INFO: compiled from: QRCodeTutorialFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J$\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;", "()V", "qrCodeViewModel", "getQrCodeViewModel", "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;", "qrCodeViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "insertImageIntoText", "", "stepTitleText", "Landroid/widget/TextView;", "stepOrder", "stepBodyText", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class QRCodeTutorialFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment.Companion(null);

    /* JADX INFO: renamed from: qrCodeViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy qrCodeViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_qr_code_tutorial;
    }

    public QRCodeTutorialFragment() {
        final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment qRCodeTutorialFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment$qrCodeViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[1];
                androidx.fragment.app.FragmentActivity activity = this.this$0.getActivity();
                objArr[0] = activity == null ? null : activity.getSupportFragmentManager();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.qrCodeViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(qRCodeTutorialFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel.class), qualifier, function0);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel getQrCodeViewModel() {
        return (powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel) this.qrCodeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel getViewModel() {
        return getQrCodeViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        android.view.View rootView = getRootView();
        android.widget.TextView textView = rootView == null ? null : (android.widget.TextView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.step_one_title);
        android.view.View rootView2 = getRootView();
        android.widget.TextView textView2 = rootView2 == null ? null : (android.widget.TextView) rootView2.findViewById(powerwatch.matrix.com.pwgen2android.R.id.step_two_title);
        android.view.View rootView3 = getRootView();
        android.widget.TextView textView3 = rootView3 == null ? null : (android.widget.TextView) rootView3.findViewById(powerwatch.matrix.com.pwgen2android.R.id.step_three_title);
        android.view.View rootView4 = getRootView();
        android.widget.TextView textView4 = rootView4 == null ? null : (android.widget.TextView) rootView4.findViewById(powerwatch.matrix.com.pwgen2android.R.id.step_one_body);
        android.view.View rootView5 = getRootView();
        android.widget.TextView textView5 = rootView5 == null ? null : (android.widget.TextView) rootView5.findViewById(powerwatch.matrix.com.pwgen2android.R.id.step_two_body);
        android.view.View rootView6 = getRootView();
        android.widget.TextView textView6 = rootView6 != null ? (android.widget.TextView) rootView6.findViewById(powerwatch.matrix.com.pwgen2android.R.id.step_three_body) : null;
        insertImageIntoText(textView, 1, textView4);
        insertImageIntoText(textView2, 2, textView5);
        insertImageIntoText(textView3, 3, textView6);
        return getRootView();
    }

    private final void insertImageIntoText(android.widget.TextView stepTitleText, int stepOrder, android.widget.TextView stepBodyText) {
        if (stepTitleText != null) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.tutorial_step);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.tutorial_step)");
            java.lang.String str = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(stepOrder)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            stepTitleText.setText(str);
        }
        java.lang.CharSequence text = stepBodyText == null ? null : stepBodyText.getText();
        if (text != null) {
            java.lang.CharSequence charSequence = text;
            int iIndexOf$default = kotlin.text.StringsKt.indexOf$default(charSequence, '{', 0, false, 6, (java.lang.Object) null);
            int iIndexOf$default2 = kotlin.text.StringsKt.indexOf$default(charSequence, '}', 0, false, 6, (java.lang.Object) null);
            int i = kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.substring(text, new kotlin.ranges.IntRange(iIndexOf$default, iIndexOf$default2)), "{stepOne}") ? powerwatch.matrix.com.pwgen2android.R.drawable.down : powerwatch.matrix.com.pwgen2android.R.drawable.check;
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(context, i, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString(text);
            spannableString.setSpan(imageSpan, iIndexOf$default, iIndexOf$default2 + 1, 33);
            stepBodyText.setText(spannableString);
        }
    }

    /* JADX INFO: compiled from: QRCodeTutorialFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeTutorialFragment();
        }
    }
}
