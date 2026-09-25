package powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger;

/* JADX INFO: compiled from: InternalLoggerFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentInternalLoggerBinding;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;", "()V", "internalLoggerViewModel", "getInternalLoggerViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;", "internalLoggerViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class InternalLoggerFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding, powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.Companion(null);

    /* JADX INFO: renamed from: internalLoggerViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy internalLoggerViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_internal_logger;
    }

    public InternalLoggerFragment() {
        final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment internalLoggerFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment$internalLoggerViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.internalLoggerViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(internalLoggerFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel getInternalLoggerViewModel() {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel) this.internalLoggerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel getViewModel() {
        return getInternalLoggerViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        final androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.logs_list);
        java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerRecyclerAdapter internalLoggerRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerRecyclerAdapter(listEmptyList, context, new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment$onCreateView$adapter$1
            public final void invoke(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                invoke(num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        });
        recyclerView.setAdapter(internalLoggerRecyclerAdapter);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        final powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner multiSelectionSpinner = (powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.level_selection);
        multiSelectionSpinner.setTitle("Select LOG LEVELS");
        java.util.List<java.lang.String> list = getInternalLoggerViewModel().getLogLevelFilterList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        multiSelectionSpinner.setItems(list);
        java.util.List<java.lang.String> list2 = getInternalLoggerViewModel().getLogLevelFilterList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
        multiSelectionSpinner.setSelection(list2);
        multiSelectionSpinner.setCloseSpinnerListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.onCreateView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.this.getInternalLoggerViewModel().onLogLevelFilterChanged(multiSelectionSpinner.getSelectedStrings());
            }
        });
        getInternalLoggerViewModel().getLogsObservableField().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.onCreateView.2
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerRecyclerAdapter internalLoggerRecyclerAdapter2 = internalLoggerRecyclerAdapter;
                java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView> list3 = this.getInternalLoggerViewModel().getLogsObservableField().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
                internalLoggerRecyclerAdapter2.setItems(list3);
            }
        });
        final powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner multiSelectionSpinner2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.tag_selection);
        multiSelectionSpinner2.setTitle("Select TAGS");
        kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair = getInternalLoggerViewModel().getTagsList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pair);
        multiSelectionSpinner2.setItems(kotlin.collections.CollectionsKt.toList(pair.getFirst()));
        kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair2 = getInternalLoggerViewModel().getTagsList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pair2);
        multiSelectionSpinner2.setSelection(kotlin.collections.CollectionsKt.toList(pair2.getSecond()));
        multiSelectionSpinner2.setCloseSpinnerListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.onCreateView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.this.getInternalLoggerViewModel().onTagsFilterChanged(multiSelectionSpinner2.getSelectedStrings(), multiSelectionSpinner.getSelectedStrings());
            }
        });
        getInternalLoggerViewModel().getTagsList().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.onCreateView.4
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner multiSelectionSpinner3 = multiSelectionSpinner2;
                kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair3 = this.getInternalLoggerViewModel().getTagsList().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(pair3);
                multiSelectionSpinner3.setItems(kotlin.collections.CollectionsKt.toList(pair3.getFirst()));
                powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner multiSelectionSpinner4 = multiSelectionSpinner2;
                kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair4 = this.getInternalLoggerViewModel().getTagsList().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(pair4);
                multiSelectionSpinner4.setSelection(kotlin.collections.CollectionsKt.toList(pair4.getSecond()));
            }
        });
        ((androidx.appcompat.widget.AppCompatButton) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.scroll_button)).setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.-$$Lambda$InternalLoggerFragment$hP6487mFVIDGn3UGXz1XFYI7-NY
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.m3476onCreateView$lambda0(recyclerView, internalLoggerRecyclerAdapter, view);
            }
        });
        powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel internalLoggerViewModel = getInternalLoggerViewModel();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        internalLoggerViewModel.onCreateView(context2);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3476onCreateView$lambda0(androidx.recyclerview.widget.RecyclerView recyclerView, powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerRecyclerAdapter adapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "$adapter");
        recyclerView.scrollToPosition(adapter.getItemCount() - 1);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel internalLoggerViewModel = getInternalLoggerViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        internalLoggerViewModel.onDestroyView(context);
    }

    /* JADX INFO: compiled from: InternalLoggerFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment newInstance() {
            powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment internalLoggerFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            internalLoggerFragment.setArguments(bundle);
            return internalLoggerFragment;
        }
    }
}
