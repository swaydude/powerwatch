package powerwatch.matrix.com.pwgen2android.pair.ui.gen1;

/* JADX INFO: compiled from: Gen1PairingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBinding;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;", "()V", "gen1PairingViewModel", "getGen1PairingViewModel", "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;", "gen1PairingViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1PairingFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.Companion(null);

    /* JADX INFO: renamed from: gen1PairingViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy gen1PairingViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment newInstance() {
        return INSTANCE.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2043onCreateView$lambda2(java.lang.Throwable th) {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pairing;
    }

    public Gen1PairingFragment() {
        final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment gen1PairingFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment$gen1PairingViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                androidx.fragment.app.FragmentActivity activity = this.this$0.getActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), activity.getSupportFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.gen1PairingViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(gen1PairingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel getGen1PairingViewModel() {
        return (powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel) this.gen1PairingViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel getViewModel() {
        return getGen1PairingViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        final android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        ((android.widget.Button) ((powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.login_toolbar)).findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairingFragment$98RFoCVpuNIlcaNNP7Z7vNAV1xM
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.m2041onCreateView$lambda0(this.f$0, view);
            }
        });
        getCompositeDisposable().add(new com.tbruyelle.rxpermissions2.RxPermissions(this).request("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairingFragment$LkDm_UUVAT-m4TTo146Ms9YMWfw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.m2042onCreateView$lambda1(viewOnCreateView, this, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairingFragment$gKl1_bDUPAH-QSQRl0ppIwV1foo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.m2043onCreateView$lambda2((java.lang.Throwable) obj);
            }
        }));
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2041onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2042onCreateView$lambda1(android.view.View rootView, final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment this$0, java.lang.Boolean approved) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "$rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(approved, "approved");
        if (approved.booleanValue()) {
            android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
            if (textView != null) {
                textView.setText(this$0.getString(powerwatch.matrix.com.pwgen2android.R.string.pairing_scanning));
            }
            java.util.List<java.lang.String> list = this$0.getGen1PairingViewModel().getFoundDevices().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            android.content.Context context = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.FoundDevicesRecyclerAdapter foundDevicesRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.FoundDevicesRecyclerAdapter(list, context, new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment$onCreateView$2$adapter$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                    invoke(num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    this.this$0.getGen1PairingViewModel().onDeviceChosen(i);
                }
            });
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.devices_list);
            recyclerView.setAdapter(foundDevicesRecyclerAdapter);
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this$0.getContext());
            linearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(linearLayoutManager);
            this$0.getGen1PairingViewModel().getFoundDevices().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment$onCreateView$2$1
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    powerwatch.matrix.com.pwgen2android.pair.ui.gen1.FoundDevicesRecyclerAdapter foundDevicesRecyclerAdapter2 = foundDevicesRecyclerAdapter;
                    java.util.List<java.lang.String> list2 = this$0.getGen1PairingViewModel().getFoundDevices().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                    foundDevicesRecyclerAdapter2.setItems(list2);
                }
            });
            powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel gen1PairingViewModel = this$0.getGen1PairingViewModel();
            android.content.Context context2 = this$0.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
            gen1PairingViewModel.onCreateView(context2);
        }
    }

    /* JADX INFO: compiled from: Gen1PairingFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment();
        }
    }
}
