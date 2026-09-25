package powerwatch.matrix.com.pwgen2android.main.dashboard.calendar;

/* JADX INFO: compiled from: CalendarFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0014J&\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;", "()V", "calendarViewModel", "getCalendarViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;", "calendarViewModel$delegate", "Lkotlin/Lazy;", "configChangeListener", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "getConfigChangeListener", "()Landroidx/databinding/Observable$OnPropertyChangedCallback;", "setConfigChangeListener", "(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "fillInWeekDays", "", "calendarView", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;", "rootView", "Landroid/view/View;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CalendarFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.Companion(null);

    /* JADX INFO: renamed from: calendarViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy calendarViewModel;
    private androidx.databinding.Observable.OnPropertyChangedCallback configChangeListener;
    private io.reactivex.disposables.Disposable disposable;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_calendar;
    }

    public CalendarFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment calendarFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment$calendarViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.calendarViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(calendarFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel getCalendarViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel) this.calendarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel getViewModel() {
        return getCalendarViewModel();
    }

    public final androidx.databinding.Observable.OnPropertyChangedCallback getConfigChangeListener() {
        return this.configChangeListener;
    }

    public final void setConfigChangeListener(androidx.databinding.Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        this.configChangeListener = onPropertyChangedCallback;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        final android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonText(toolbar, "");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.removeBackButtonDrawable(toolbar, false);
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.today);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.today)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(toolbar, string);
        io.reactivex.subjects.PublishSubject publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Int>()");
        publishSubjectCreate.take(12L).ignoreElements().timeout(6000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.-$$Lambda$CalendarFragment$LRLQJs3vn0bzjozU_az43o1u5rM
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.m1655onCreateView$lambda0(this.f$0, view);
            }
        });
        final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView calendarView = (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.calendar_view);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendarView, "calendarView");
        fillInWeekDays(calendarView, viewOnCreateView);
        calendarView.setListener(new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.onCreateView.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell dayCell) {
                invoke2(dayCell);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                if (it.getDate().after(calendar.getTime())) {
                    return;
                }
                calendar.setTime(it.getDate());
                powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel calendarViewModel = powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.this.getCalendarViewModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
                calendarViewModel.onRightButtonClicked(calendar);
            }
        });
        this.configChangeListener = new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.onCreateView.3
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration calendarConfiguration = powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.this.getViewModel().getConfig().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(calendarConfiguration);
                calendarView.configure(calendarConfiguration);
                powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment calendarFragment = powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.this;
                powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView calendarView2 = calendarView;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendarView2, "calendarView");
                calendarFragment.fillInWeekDays(calendarView2, viewOnCreateView);
            }
        };
        androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration> config = getViewModel().getConfig();
        androidx.databinding.Observable.OnPropertyChangedCallback onPropertyChangedCallback = this.configChangeListener;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onPropertyChangedCallback);
        config.addOnPropertyChangedCallback(onPropertyChangedCallback);
        getCompositeDisposable().add(calendarView.getScrollChangeObservable().distinctUntilChanged().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.-$$Lambda$CalendarFragment$W_5VLulmRgks0kj59zijKzrc4H8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.m1656onCreateView$lambda1(toolbar, (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell) obj);
            }
        }));
        powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1655onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel calendarViewModel = this$0.getCalendarViewModel();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        calendarViewModel.onRightButtonClicked(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1656onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar, powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell monthCell) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, java.lang.String.valueOf(monthCell.getYear()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillInWeekDays(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView calendarView, android.view.View rootView) {
        for (kotlin.Pair pair : kotlin.collections.CollectionsKt.zip(kotlin.collections.ArraysKt.slice((java.lang.Object[]) calendarView.getDayInWeekLabels(), new kotlin.ranges.IntRange(1, 7)), new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_one), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_two), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_three), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_four), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_five), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_six), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.id.day_seven)})) {
            ((android.widget.Button) rootView.findViewById(((java.lang.Number) pair.getSecond()).intValue())).setText(kotlin.text.StringsKt.take((java.lang.String) pair.getFirst(), 1));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCompositeDisposable().clear();
        if (this.configChangeListener != null) {
            androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration> config = getViewModel().getConfig();
            androidx.databinding.Observable.OnPropertyChangedCallback onPropertyChangedCallback = this.configChangeListener;
            kotlin.jvm.internal.Intrinsics.checkNotNull(onPropertyChangedCallback);
            config.removeOnPropertyChangedCallback(onPropertyChangedCallback);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = activity instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) activity : null;
        if (mainActivity == null) {
            return;
        }
        mainActivity.showTab(false);
    }

    /* JADX INFO: compiled from: CalendarFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment();
        }
    }
}
