package powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty;

/* JADX INFO: compiled from: ThirdPartyPermissionFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "adapter", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;", "permissionsInfoViewModel", "getPermissionsInfoViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;", "permissionsInfoViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ThirdPartyPermissionFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentThirdPartyPermissionBinding, powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.Companion(null);
    private powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter adapter;

    /* JADX INFO: renamed from: permissionsInfoViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy permissionsInfoViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_third_party_permission;
    }

    public ThirdPartyPermissionFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment thirdPartyPermissionFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment$permissionsInfoViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.permissionsInfoViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(thirdPartyPermissionFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel getPermissionsInfoViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel) this.permissionsInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel getViewModel() {
        return getPermissionsInfoViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.login_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.removeBackground(toolbar);
        android.widget.Button button = (android.widget.Button) toolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button);
        if (button != null) {
            button.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) toolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.enable_permissions_title));
        }
        if (textView != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            textView.setTextColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.black));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.permissions_list);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list = getViewModel().getPermissionsList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter(list, context2);
        this.adapter = permissionInfoRecyclerAdapter;
        if (permissionInfoRecyclerAdapter != null) {
            permissionInfoRecyclerAdapter.setClickListener(new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.onCreateView.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                    invoke(num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.getViewModel().getPermissionsList().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                    powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.getViewModel().onPermissionChecked(list2.get(i));
                }
            });
            powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter2 = this.adapter;
            if (permissionInfoRecyclerAdapter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                throw null;
            }
            recyclerView.setAdapter(permissionInfoRecyclerAdapter2);
            getViewModel().getPermissionsList().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.onCreateView.2
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter3 = powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.adapter;
                    if (permissionInfoRecyclerAdapter3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        throw null;
                    }
                    java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.getViewModel().getPermissionsList().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                    permissionInfoRecyclerAdapter3.setItems(list2);
                }
            });
            getViewModel().getListChanged().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.onCreateView.3
                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter3 = powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.adapter;
                    if (permissionInfoRecyclerAdapter3 != null) {
                        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.getViewModel().getPermissionsList().get();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                        permissionInfoRecyclerAdapter3.setItems(list2);
                        powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter4 = powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.this.adapter;
                        if (permissionInfoRecyclerAdapter4 != null) {
                            permissionInfoRecyclerAdapter4.notifyDataSetChanged();
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    throw null;
                }
            });
            powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel viewModel = getViewModel();
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context3);
            viewModel.onCreateView(context3);
            return viewOnCreateView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234) {
            if (resultCode == -1) {
                getPermissionsInfoViewModel().authorizationSuccess();
            }
            powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoRecyclerAdapter permissionInfoRecyclerAdapter = this.adapter;
            if (permissionInfoRecyclerAdapter != null) {
                permissionInfoRecyclerAdapter.notifyDataSetChanged();
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: ThirdPartyPermissionFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment();
        }
    }
}
