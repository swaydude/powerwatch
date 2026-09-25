package powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals;

/* JADX INFO: compiled from: DailyGoalsSettingsFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "scrollView", "Landroid/widget/ScrollView;", "watchViewModel", "getWatchViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;", "watchViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DailyGoalsSettingsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding, powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment.Companion(null);
    private static final java.lang.String WATCH_SCROLL_POSITION = "watch_scroll_position";
    private android.widget.ScrollView scrollView;

    /* JADX INFO: renamed from: watchViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy watchViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_daily_goals_settings;
    }

    public DailyGoalsSettingsFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment dailyGoalsSettingsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment$watchViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.watchViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(dailyGoalsSettingsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM getWatchViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM) this.watchViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM getViewModel() {
        return getWatchViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (toolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(toolbar);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.daily_goals_settings);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.daily_goals_settings)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.-$$Lambda$DailyGoalsSettingsFragment$xdHWYDAR1zpPQZHOb_nHLKGKbJY
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment.m1974onCreateView$lambda0(this.f$0, view);
            }
        });
        powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM watchViewModel = getWatchViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        watchViewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1974onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: compiled from: DailyGoalsSettingsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment$Companion;", "", "()V", "WATCH_SCROLL_POSITION", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsFragment();
        }
    }
}
