package powerwatch.matrix.com.pwgen2android.shared.ui.notifications;

/* JADX INFO: compiled from: NotificationLoggerFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBinding;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;", "()V", "internalLoggerViewModel", "getInternalLoggerViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;", "internalLoggerViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationLoggerFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentNotificationLoggerBinding, powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment.Companion(null);

    /* JADX INFO: renamed from: internalLoggerViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy internalLoggerViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_notification_logger;
    }

    public NotificationLoggerFragment() {
        final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment notificationLoggerFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment$internalLoggerViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.internalLoggerViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(notificationLoggerFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel getInternalLoggerViewModel() {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel) this.internalLoggerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel getViewModel() {
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
        final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerRecyclerAdapter notificationLoggerRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerRecyclerAdapter(listEmptyList, context, new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment$onCreateView$adapter$1
            public final void invoke(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                invoke(num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        });
        recyclerView.setAdapter(notificationLoggerRecyclerAdapter);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        getInternalLoggerViewModel().getLogsObservableField().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment.onCreateView.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerRecyclerAdapter notificationLoggerRecyclerAdapter2 = notificationLoggerRecyclerAdapter;
                java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView> list = this.getInternalLoggerViewModel().getLogsObservableField().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                notificationLoggerRecyclerAdapter2.setItems(list);
            }
        });
        ((androidx.appcompat.widget.AppCompatButton) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.scroll_button)).setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment.m3512onCreateView$lambda0(recyclerView, notificationLoggerRecyclerAdapter, view);
            }
        });
        powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel internalLoggerViewModel = getInternalLoggerViewModel();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        internalLoggerViewModel.onCreateView(context2);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m3512onCreateView$lambda0(androidx.recyclerview.widget.RecyclerView recyclerView, powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerRecyclerAdapter adapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "$adapter");
        recyclerView.scrollToPosition(adapter.getItemCount() - 1);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel internalLoggerViewModel = getInternalLoggerViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        internalLoggerViewModel.onDestroyView(context);
    }

    /* JADX INFO: compiled from: NotificationLoggerFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment newInstance() {
            powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment notificationLoggerFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            notificationLoggerFragment.setArguments(bundle);
            return notificationLoggerFragment;
        }
    }
}
