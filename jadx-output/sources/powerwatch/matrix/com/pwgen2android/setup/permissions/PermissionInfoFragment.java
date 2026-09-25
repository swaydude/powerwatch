package powerwatch.matrix.com.pwgen2android.setup.permissions;

/* JADX INFO: compiled from: PermissionInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "permissionsInfoViewModel", "getPermissionsInfoViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;", "permissionsInfoViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PermissionInfoFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.Companion(null);

    /* JADX INFO: renamed from: permissionsInfoViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy permissionsInfoViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_permission_info;
    }

    public PermissionInfoFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment permissionInfoFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment$permissionsInfoViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = this.this$0.getActivity();
                powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment permissionInfoFragment2 = this.this$0;
                objArr[1] = permissionInfoFragment2;
                androidx.fragment.app.FragmentActivity activity = permissionInfoFragment2.getActivity();
                objArr[2] = activity == null ? null : activity.getSupportFragmentManager();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.permissionsInfoViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(permissionInfoFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel getPermissionsInfoViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel) this.permissionsInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel getViewModel() {
        return getPermissionsInfoViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.login_toolbar);
        android.widget.TextView textView = (android.widget.TextView) toolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.enable_permissions_title));
        }
        if (textView != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            textView.setTextColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.black));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.removeBackground(toolbar);
        android.widget.Button button = (android.widget.Button) toolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button);
        if (button != null) {
            button.setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.permissions_list);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list = getViewModel().getPermissionsList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter(list, context2);
        permissionInfoRecyclerAdapter.setClickListener(new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.onCreateView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                invoke(num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i) {
                java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.this.getViewModel().getPermissionsList().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo = list2.get(i);
                powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel viewModel = powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.this.getViewModel();
                android.content.Context context3 = powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.this.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
                final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter2 = permissionInfoRecyclerAdapter;
                viewModel.onPermissionChecked(context3, uIPermissionInfo, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.onCreateView.1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        permissionInfoRecyclerAdapter2.notifyDataSetChanged();
                    }
                });
            }
        });
        recyclerView.setAdapter(permissionInfoRecyclerAdapter);
        getViewModel().getPermissionsList().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.onCreateView.2
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter2 = permissionInfoRecyclerAdapter;
                java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = this.getViewModel().getPermissionsList().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                permissionInfoRecyclerAdapter2.setItems(list2);
            }
        });
        powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel viewModel = getViewModel();
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
        viewModel.onCreateView(context3);
        return viewOnCreateView;
    }

    /* JADX INFO: compiled from: PermissionInfoFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment();
        }
    }
}
