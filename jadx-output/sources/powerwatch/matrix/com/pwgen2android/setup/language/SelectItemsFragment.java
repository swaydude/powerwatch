package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: SelectItemsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSelectItemsBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;", "()V", "mChooseLanguageViewModel", "getMChooseLanguageViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;", "mChooseLanguageViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SelectItemsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding, powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel> {

    /* JADX INFO: renamed from: mChooseLanguageViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mChooseLanguageViewModel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.Companion(null);
    private static final java.lang.String TYPE_KEY = "type";
    private static final java.lang.String ACTIVE_VALUE_KEY = "active_value";
    private static final java.lang.String TITLE_KEY = "title_key";

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment newInstance(powerwatch.matrix.com.pwgen2android.setup.language.SupportedType supportedType, java.lang.String str, byte b) {
        return INSTANCE.newInstance(supportedType, str, b);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_select_items;
    }

    public SelectItemsFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment selectItemsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment$mChooseLanguageViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.mChooseLanguageViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(selectItemsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel getMChooseLanguageViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel) this.mChooseLanguageViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel getViewModel() {
        return getMChooseLanguageViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel viewModel = getViewModel();
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND dnd = (powerwatch.matrix.com.pwgen2android.setup.language.SupportedType) (arguments == null ? null : arguments.getSerializable(TYPE_KEY));
        if (dnd == null) {
            dnd = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE;
        }
        viewModel.setType(dnd);
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel viewModel2 = getViewModel();
        android.os.Bundle arguments2 = getArguments();
        viewModel2.setActiveValue(arguments2 != null ? java.lang.Byte.valueOf(arguments2.getByte(ACTIVE_VALUE_KEY)) : null);
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str = "";
        if (arguments3 != null && (string = arguments3.getString(TITLE_KEY)) != null) {
            str = string;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel viewModel3 = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel3.onCreateView(context);
        final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.button_save);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.button_save)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar, string2);
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, str);
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$SelectItemsFragment$oM9se4RJyEiJFOE2hPR04SFRKRY
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.m2899onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$SelectItemsFragment$VkmM-GOr9Q8N9jQB5EebVhAib64
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.m2900onCreateView$lambda1(this.f$0, view);
                }
            });
        }
        getViewModel().getShowSaveProgress().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.onCreateView.3
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.this.getViewModel().getShowSaveProgress().get();
                if (bool == null) {
                    bool = false;
                }
                if (bool.booleanValue()) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar2 = mainToolbar;
                    if (mainToolbar2 == null) {
                        return;
                    }
                    mainToolbar2.showRightProgress();
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar3 = mainToolbar;
                if (mainToolbar3 == null) {
                    return;
                }
                mainToolbar3.hideRightProgress();
            }
        });
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.language_list);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        final java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> list = getViewModel().getItems().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseItemRecyclerAdapter chooseItemRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseItemRecyclerAdapter(list, context2, true);
        recyclerView.setAdapter(chooseItemRecyclerAdapter);
        chooseItemRecyclerAdapter.setClickListener(new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.onCreateView.4
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
                int i2 = 0;
                for (java.lang.Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    ((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView) obj).setChecked(i2 == i);
                    i2 = i3;
                }
                chooseItemRecyclerAdapter.notifyDataSetChanged();
            }
        });
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2899onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMChooseLanguageViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2900onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel mChooseLanguageViewModel = this$0.getMChooseLanguageViewModel();
        android.content.Context context = this$0.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        mChooseLanguageViewModel.onSaveClicked(context);
    }

    /* JADX INFO: compiled from: SelectItemsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;", "", "()V", "ACTIVE_VALUE_KEY", "", "getACTIVE_VALUE_KEY", "()Ljava/lang/String;", "TITLE_KEY", "getTITLE_KEY", "TYPE_KEY", "getTYPE_KEY", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "activeValue", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getTYPE_KEY() {
            return powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.TYPE_KEY;
        }

        public final java.lang.String getACTIVE_VALUE_KEY() {
            return powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.ACTIVE_VALUE_KEY;
        }

        public final java.lang.String getTITLE_KEY() {
            return powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.TITLE_KEY;
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment newInstance(powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type, java.lang.String title, byte activeValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
            powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment selectItemsFragment = new powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.INSTANCE.getTYPE_KEY(), type);
            bundle.putByte(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.INSTANCE.getACTIVE_VALUE_KEY(), activeValue);
            bundle.putString(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsFragment.INSTANCE.getTITLE_KEY(), title);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            selectItemsFragment.setArguments(bundle);
            return selectItemsFragment;
        }
    }
}
