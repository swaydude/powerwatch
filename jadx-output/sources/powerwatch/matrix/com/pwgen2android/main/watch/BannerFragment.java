package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: BannerFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDeviceBannerBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;", "()V", "bannerViewModel", "getBannerViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;", "bannerViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BannerFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding, powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment.Companion(null);

    /* JADX INFO: renamed from: bannerViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy bannerViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_device_banner;
    }

    public BannerFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment bannerFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment$bannerViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[2];
                androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
                objArr[0] = parentFragment == null ? null : parentFragment.getFragmentManager();
                objArr[1] = this.this$0.getActivity();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.bannerViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(bannerFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel getBannerViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel) this.bannerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel getViewModel() {
        return getBannerViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        final android.widget.ImageView imageView = viewOnCreateView == null ? null : (android.widget.ImageView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.banner_image);
        getBannerViewModel().getImageField().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment.onCreateView.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Integer num = powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment.this.getBannerViewModel().getImageField().get();
                if (num == null) {
                    return;
                }
                int iIntValue = num.intValue();
                android.widget.ImageView imageView2 = imageView;
                if (imageView2 == null) {
                    return;
                }
                imageView2.setImageResource(iIntValue);
            }
        });
        powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel bannerViewModel = getBannerViewModel();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        bannerViewModel.onCreateView(activity);
        if (viewOnCreateView != null) {
            viewOnCreateView.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.-$$Lambda$BannerFragment$p3qvbwEHA6Ht5jShFDGVZzWu14k
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment.m1915onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1915onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBannerViewModel().onClick();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel bannerViewModel = getBannerViewModel();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        bannerViewModel.onDestroyView(activity);
    }

    /* JADX INFO: compiled from: BannerFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment();
        }
    }
}
