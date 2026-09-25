package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents;

/* JADX INFO: compiled from: BaseChartPeriodsViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00028\u0002072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00028\u0001072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010:\u001a\u00020;H\u0002J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010=\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000fH$J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00028\u0002072\u0006\u0010=\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000fH$J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00028\u0001072\u0006\u0010=\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000fH$J\b\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010C\u001a\u00020AJ\u0010\u0010D\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010E\u001a\u00020AJ\u0006\u0010F\u001a\u00020AJ\u0006\u0010G\u001a\u00020AJ\u0006\u0010H\u001a\u00020AJ\n\u0010I\u001a\u00020A*\u00020JJ\n\u0010K\u001a\u00020A*\u00020JJ\n\u0010L\u001a\u00020A*\u00020JJ\n\u0010M\u001a\u00020A*\u00020JJ\n\u0010N\u001a\u00020A*\u00020JR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R)\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000 X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00020 X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u001f\u0010)\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\"\u0010+\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r0,X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\"\u0010/\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u0001010100X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00010 X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"¨\u0006O"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;", "DAY_CHART_CONFIG", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "WEEK_CHART_CONFIG", "MONTH_CHART_CONFIG", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "(Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;)V", "currentDateText", "Landroidx/databinding/ObservableField;", "", "getCurrentDateText", "()Landroidx/databinding/ObservableField;", "currentPeriodType", "", "kotlin.jvm.PlatformType", "getCurrentPeriodType", "currentPeriodsConfiguration", "Lkotlin/Triple;", "getCurrentPeriodsConfiguration", "dayPeriodCacheMap", "", "getDayPeriodCacheMap", "()Ljava/util/Map;", "getGoalConfigurationRepository", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "languageField", "getLanguageField", "monthPeriodCacheMap", "getMonthPeriodCacheMap", "navigationColor", "getNavigationColor", "parentFragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "getParentFragmentManagerWeakReference", "()Ljava/lang/ref/WeakReference;", "selectedDayDate", "Lio/reactivex/subjects/BehaviorSubject;", "Ljava/util/Calendar;", "getSelectedDayDate", "()Lio/reactivex/subjects/BehaviorSubject;", "weekPeriodCacheMap", "getWeekPeriodCacheMap", "getDayObservable", "Lio/reactivex/Observable;", "getMonthObservable", "getWeekObservable", "isDateOverflow", "", "loadDayPeriod", "date", "loadMonthPeriod", "loadWeekPeriod", "onBackClicked", "", "onCreateView", "onDayPeriodSelected", "onDestroyView", "onMonthPeriodSelected", "onNextItemClicked", "onPreviousItemClicked", "onWeekPeriodSelected", "onDayPeriodClicked", "Landroid/view/View;", "onMonthPeriodClicked", "onNextClicked", "onPreviousClicked", "onWeekPeriodClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseChartPeriodsViewModel<DAY_CHART_CONFIG extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig, WEEK_CHART_CONFIG extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig, MONTH_CHART_CONFIG extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig> extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel {
    private final androidx.databinding.ObservableField<java.lang.String> currentDateText;
    private final androidx.databinding.ObservableField<java.lang.Integer> currentPeriodType;
    private final androidx.databinding.ObservableField<kotlin.Triple<DAY_CHART_CONFIG, WEEK_CHART_CONFIG, MONTH_CHART_CONFIG>> currentPeriodsConfiguration;
    private final java.util.Map<java.lang.String, DAY_CHART_CONFIG> dayPeriodCacheMap;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final androidx.databinding.ObservableField<java.lang.String> languageField;
    private final java.util.Map<java.lang.String, MONTH_CHART_CONFIG> monthPeriodCacheMap;
    private final androidx.databinding.ObservableField<java.lang.Integer> navigationColor;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private final io.reactivex.subjects.BehaviorSubject<java.util.Calendar> selectedDayDate;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;
    private final java.util.Map<java.lang.String, WEEK_CHART_CONFIG> weekPeriodCacheMap;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1690onCreateView$lambda2(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-5, reason: not valid java name */
    public static final void m1693onCreateView$lambda5(java.lang.Throwable th) {
    }

    protected abstract io.reactivex.Observable<DAY_CHART_CONFIG> loadDayPeriod(java.util.Calendar date, android.content.Context context);

    protected abstract io.reactivex.Observable<MONTH_CHART_CONFIG> loadMonthPeriod(java.util.Calendar date, android.content.Context context);

    protected abstract io.reactivex.Observable<WEEK_CHART_CONFIG> loadWeekPeriod(java.util.Calendar date, android.content.Context context);

    protected final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository getGoalConfigurationRepository() {
        return this.goalConfigurationRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChartPeriodsViewModel(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, androidx.fragment.app.FragmentManager parentFragmentManager, android.content.Context context, android.app.Activity activity) {
        super(activity, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.String strMonthDayYearFormatText = null;
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.dayPeriodCacheMap = new java.util.LinkedHashMap();
        this.weekPeriodCacheMap = new java.util.LinkedHashMap();
        this.monthPeriodCacheMap = new java.util.LinkedHashMap();
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(selectedDateProvider.getSelectedDate());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(selectedDateProvider.selectedDate)");
        this.selectedDayDate = behaviorSubjectCreateDefault;
        this.navigationColor = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.green_chart)));
        this.currentPeriodsConfiguration = new androidx.databinding.ObservableField<>();
        androidx.databinding.ObservableField<java.lang.String> observableField = new androidx.databinding.ObservableField<>("en");
        this.languageField = observableField;
        java.util.Calendar value = behaviorSubjectCreateDefault.getValue();
        if (value != null) {
            java.lang.String str = observableField.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            strMonthDayYearFormatText = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText(value, str);
        }
        this.currentDateText = new androidx.databinding.ObservableField<>(strMonthDayYearFormatText);
        this.currentPeriodType = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()));
    }

    protected final java.util.Map<java.lang.String, DAY_CHART_CONFIG> getDayPeriodCacheMap() {
        return this.dayPeriodCacheMap;
    }

    protected final java.util.Map<java.lang.String, WEEK_CHART_CONFIG> getWeekPeriodCacheMap() {
        return this.weekPeriodCacheMap;
    }

    protected final java.util.Map<java.lang.String, MONTH_CHART_CONFIG> getMonthPeriodCacheMap() {
        return this.monthPeriodCacheMap;
    }

    protected final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> getParentFragmentManagerWeakReference() {
        return this.parentFragmentManagerWeakReference;
    }

    protected final io.reactivex.subjects.BehaviorSubject<java.util.Calendar> getSelectedDayDate() {
        return this.selectedDayDate;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getNavigationColor() {
        return this.navigationColor;
    }

    public final androidx.databinding.ObservableField<kotlin.Triple<DAY_CHART_CONFIG, WEEK_CHART_CONFIG, MONTH_CHART_CONFIG>> getCurrentPeriodsConfiguration() {
        return this.currentPeriodsConfiguration;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getLanguageField() {
        return this.languageField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getCurrentDateText() {
        return this.currentDateText;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getCurrentPeriodType() {
        return this.currentPeriodType;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(this.userPrefsUtils.getLanguage().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$VaF0Xt9XkZckT5fYd3u2ctwpZ7s
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1688onCreateView$lambda0((powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$OQQhi6YXdd92cAHoUGWL2aNY6PE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1689onCreateView$lambda1(this.f$0, (java.lang.String) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$mCnMpzHVGPn_i3-krQsGLzQkdI0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1690onCreateView$lambda2((java.lang.Throwable) obj);
            }
        }));
        getCompositeDisposable().add(io.reactivex.Observable.combineLatest(getDayObservable(context), getWeekObservable(context), getMonthObservable(context), new io.reactivex.functions.Function3() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c
            @Override // io.reactivex.functions.Function3
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1691onCreateView$lambda3((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj2, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj3);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$PcAGpAy-7-d3J3dNpNWsyc47-5k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1692onCreateView$lambda4(this.f$0, (kotlin.Triple) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$2Tn2otGWvgqqh6whm2LOpd8sY9c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1693onCreateView$lambda5((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final java.lang.String m1688onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.utils.LanguageInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getLanguageKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1689onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.lang.String it) {
        java.lang.String strMonthDayYearFormatText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getLanguageField().set(it);
        androidx.databinding.ObservableField<java.lang.String> currentDateText = this$0.getCurrentDateText();
        java.util.Calendar value = this$0.getSelectedDayDate().getValue();
        if (value == null) {
            strMonthDayYearFormatText = null;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            strMonthDayYearFormatText = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText(value, it);
        }
        currentDateText.set(strMonthDayYearFormatText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final kotlin.Triple m1691onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig day, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig week, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig month) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(day, "day");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(week, "week");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "month");
        return new kotlin.Triple(day, week, month);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-4, reason: not valid java name */
    public static final void m1692onCreateView$lambda4(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, kotlin.Triple triple) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCurrentPeriodsConfiguration().set(triple);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().clear();
    }

    private final io.reactivex.Observable<MONTH_CHART_CONFIG> getMonthObservable(final android.content.Context context) {
        io.reactivex.Observable<MONTH_CHART_CONFIG> observableFlatMap = this.selectedDayDate.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$Emx0c_tp6PkjZKs-7nUa42F_oHA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1672getMonthObservable$lambda6((java.util.Calendar) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$qxS3oFBpXflcUKZwPiRwFn5YojE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1673getMonthObservable$lambda7(this.f$0, (java.util.Calendar) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$iCOCyl6TfXcyGtkV5Z8PT2moTqo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1669getMonthObservable$lambda10(this.f$0, context, (java.util.Calendar) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "selectedDayDate\n                .map { it.copy() }\n                .doOnNext {\n                    if (currentPeriodType.get()!! == ChartPeriodMode.MONTH.ordinal) {\n                        currentDateText.set(it.monthYearFormatText())\n                    }\n                }\n                .flatMap { date ->\n                    val monthUniqueID = date.monthUniqueID()\n                    if (monthPeriodCacheMap.containsKey(monthUniqueID)) {\n                        return@flatMap Observable.just(monthPeriodCacheMap[monthUniqueID])\n                    }\n\n                    loadMonthPeriod(date, context)\n                            .doOnNext {\n                                monthPeriodCacheMap[date.monthUniqueID()] = it\n                            }\n                            .flatMap {\n                                var result = Observable.empty<MONTH_CHART_CONFIG>()\n                                val selectedMonthKey = selectedDayDate.value?.monthUniqueID()\n\n                                if (monthPeriodCacheMap.containsKey(selectedMonthKey) && selectedMonthKey == date.monthUniqueID()) {\n                                    result = Observable.just(monthPeriodCacheMap[selectedMonthKey])\n                                }\n                                result\n                            }\n                            // above flatMap must be executed on Main thread, since it uses selectedDay value\n                            .observeOn(AndroidSchedulers.mainThread())\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMonthObservable$lambda-6, reason: not valid java name */
    public static final java.util.Calendar m1672getMonthObservable$lambda6(java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.copy(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMonthObservable$lambda-7, reason: not valid java name */
    public static final void m1673getMonthObservable$lambda7(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.Integer num = this$0.getCurrentPeriodType().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        if (num.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()) {
            androidx.databinding.ObservableField<java.lang.String> currentDateText = this$0.getCurrentDateText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            currentDateText.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthYearFormatText(it));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMonthObservable$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1669getMonthObservable$lambda10(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, android.content.Context context, final java.util.Calendar date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.lang.String strMonthUniqueID = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthUniqueID(date);
        if (this$0.getMonthPeriodCacheMap().containsKey(strMonthUniqueID)) {
            return io.reactivex.Observable.just(this$0.getMonthPeriodCacheMap().get(strMonthUniqueID));
        }
        return this$0.loadMonthPeriod(date, context).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$ITdLmd68_Lwefrh21d1AjkVY248
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1670getMonthObservable$lambda10$lambda8(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$CYcuqZtN5rlwBn4xN7K_vmpIn_s
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1671getMonthObservable$lambda10$lambda9(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMonthObservable$lambda-10$lambda-8, reason: not valid java name */
    public static final void m1670getMonthObservable$lambda10$lambda8(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar date, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        java.util.Map<java.lang.String, MONTH_CHART_CONFIG> monthPeriodCacheMap = this$0.getMonthPeriodCacheMap();
        java.lang.String strMonthUniqueID = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthUniqueID(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        monthPeriodCacheMap.put(strMonthUniqueID, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMonthObservable$lambda-10$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1671getMonthObservable$lambda10$lambda9(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar date, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.Observable observableEmpty = io.reactivex.Observable.empty();
        java.util.Calendar value = this$0.getSelectedDayDate().getValue();
        java.lang.String strMonthUniqueID = value == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthUniqueID(value);
        java.util.Map<java.lang.String, MONTH_CHART_CONFIG> monthPeriodCacheMap = this$0.getMonthPeriodCacheMap();
        java.util.Objects.requireNonNull(monthPeriodCacheMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        if (monthPeriodCacheMap.containsKey(strMonthUniqueID) && kotlin.jvm.internal.Intrinsics.areEqual(strMonthUniqueID, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthUniqueID(date))) {
            observableEmpty = io.reactivex.Observable.just(this$0.getMonthPeriodCacheMap().get(strMonthUniqueID));
        }
        return observableEmpty;
    }

    private final io.reactivex.Observable<WEEK_CHART_CONFIG> getWeekObservable(final android.content.Context context) {
        io.reactivex.Observable<WEEK_CHART_CONFIG> observableFlatMap = this.selectedDayDate.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$S1aAZVZPtdp0A_LM_ohcQY-37bo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1674getWeekObservable$lambda11((java.util.Calendar) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$Ry_AVO4_iY2ifrifeEPCXP3pXqA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1675getWeekObservable$lambda12(this.f$0, (java.util.Calendar) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$cuqJUyD4vjFdH82s7bepIeuDkS8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1676getWeekObservable$lambda15(this.f$0, context, (java.util.Calendar) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "selectedDayDate\n                .map { it.copy() }\n\n                .doOnNext {\n                    if (currentPeriodType.get()!! == ChartPeriodMode.WEEK.ordinal) {\n                        currentDateText.set(it.monthWeekYearFormatText())\n                    }\n                }\n                .flatMap { date ->\n                    val weekKey = date.weekUniqueID()\n                    if (weekPeriodCacheMap.containsKey(weekKey)) {\n                        return@flatMap Observable.just(weekPeriodCacheMap[weekKey])\n                    }\n\n                    loadWeekPeriod(date, context)\n                            .doOnNext {\n                                weekPeriodCacheMap[date.weekUniqueID()] = it\n                            }\n                            .flatMap {\n                                var result = Observable.empty<WEEK_CHART_CONFIG>()\n                                val selectedWeekKey = selectedDayDate.value?.weekUniqueID()\n                                if (weekPeriodCacheMap.containsKey(selectedWeekKey) && selectedWeekKey == date.weekUniqueID()) {\n                                    result = Observable.just(weekPeriodCacheMap[selectedWeekKey])\n                                }\n                                result\n                            }\n                            // above flatMap must be executed on Main thread, since it uses selectedDay value\n                            .observeOn(AndroidSchedulers.mainThread())\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getWeekObservable$lambda-11, reason: not valid java name */
    public static final java.util.Calendar m1674getWeekObservable$lambda11(java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.copy(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getWeekObservable$lambda-12, reason: not valid java name */
    public static final void m1675getWeekObservable$lambda12(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.Integer num = this$0.getCurrentPeriodType().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        if (num.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()) {
            androidx.databinding.ObservableField<java.lang.String> currentDateText = this$0.getCurrentDateText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            currentDateText.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthWeekYearFormatText(it));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getWeekObservable$lambda-15, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1676getWeekObservable$lambda15(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, android.content.Context context, final java.util.Calendar date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.lang.String strWeekUniqueID = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekUniqueID(date);
        if (this$0.getWeekPeriodCacheMap().containsKey(strWeekUniqueID)) {
            return io.reactivex.Observable.just(this$0.getWeekPeriodCacheMap().get(strWeekUniqueID));
        }
        return this$0.loadWeekPeriod(date, context).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$-f4WaXSe4XSCWzc05JfmufrfDi8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1677getWeekObservable$lambda15$lambda13(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$Y08CQgHMdpJBTqkU3b4b99NpYC4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1678getWeekObservable$lambda15$lambda14(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getWeekObservable$lambda-15$lambda-13, reason: not valid java name */
    public static final void m1677getWeekObservable$lambda15$lambda13(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar date, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        java.util.Map<java.lang.String, WEEK_CHART_CONFIG> weekPeriodCacheMap = this$0.getWeekPeriodCacheMap();
        java.lang.String strWeekUniqueID = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekUniqueID(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        weekPeriodCacheMap.put(strWeekUniqueID, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getWeekObservable$lambda-15$lambda-14, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1678getWeekObservable$lambda15$lambda14(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar date, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.Observable observableEmpty = io.reactivex.Observable.empty();
        java.util.Calendar value = this$0.getSelectedDayDate().getValue();
        java.lang.String strWeekUniqueID = value == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekUniqueID(value);
        java.util.Map<java.lang.String, WEEK_CHART_CONFIG> weekPeriodCacheMap = this$0.getWeekPeriodCacheMap();
        java.util.Objects.requireNonNull(weekPeriodCacheMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        if (weekPeriodCacheMap.containsKey(strWeekUniqueID) && kotlin.jvm.internal.Intrinsics.areEqual(strWeekUniqueID, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekUniqueID(date))) {
            observableEmpty = io.reactivex.Observable.just(this$0.getWeekPeriodCacheMap().get(strWeekUniqueID));
        }
        return observableEmpty;
    }

    private final io.reactivex.Observable<DAY_CHART_CONFIG> getDayObservable(final android.content.Context context) {
        io.reactivex.Observable<DAY_CHART_CONFIG> observableFlatMap = this.selectedDayDate.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1661getDayObservable$lambda16((java.util.Calendar) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$7N9LOUPqu1AU2gkyW2YQM4ghD8Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1662getDayObservable$lambda18(this.f$0, (java.util.Calendar) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$kXb3T5gSk4TRpEzq7EcqmnJZgXE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1664getDayObservable$lambda19(this.f$0, (kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$QTdhc87uoZg21PcG8P4W2sgtD4w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1665getDayObservable$lambda20((kotlin.Pair) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$B6BJPESLh4RkhoNcvD1CBjKW4MM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1666getDayObservable$lambda23(this.f$0, context, (java.util.Calendar) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "selectedDayDate\n                .map { it.copy() }\n                .flatMap {calendar ->\n                    userPrefsUtils.language\n                            .map { language -> Pair(language.languageKey, calendar) }\n                }\n                .doOnNext {\n                    if (currentPeriodType.get()!! == ChartPeriodMode.DAY.ordinal)\n                        currentDateText.set(it.second.monthDayYearFormatText(it.first))\n                }\n                .map { it.second }\n                .flatMap { date ->\n                    val dayUniqueID = date.dayUniqueID()\n                    if (dayPeriodCacheMap.containsKey(dayUniqueID)) {\n                        return@flatMap Observable.just(dayPeriodCacheMap[dayUniqueID])\n                    }\n                    loadDayPeriod(date, context)\n                            .doOnNext {\n                                dayPeriodCacheMap[date.dayUniqueID()] = it\n                            }\n                            .flatMap {\n                                var result = Observable.empty<DAY_CHART_CONFIG>()\n                                val selectedDayKey = selectedDayDate.value?.dayUniqueID()\n                                if (dayPeriodCacheMap.containsKey(selectedDayKey) && selectedDayKey == date.dayUniqueID()) {\n                                    result = Observable.just(dayPeriodCacheMap[selectedDayKey])\n                                }\n                                result\n                            }\n                            // above flatMap must be executed on Main thread, since it uses selectedDay value\n                            .observeOn(AndroidSchedulers.mainThread())\n\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-16, reason: not valid java name */
    public static final java.util.Calendar m1661getDayObservable$lambda16(java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.copy(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-18, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1662getDayObservable$lambda18(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, final java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "calendar");
        return this$0.userPrefsUtils.getLanguage().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$ucsNz1_MQd4m-LFM8Tk8Vh3IZaM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1663getDayObservable$lambda18$lambda17(calendar, (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-18$lambda-17, reason: not valid java name */
    public static final kotlin.Pair m1663getDayObservable$lambda18$lambda17(java.util.Calendar calendar, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "$calendar");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        return new kotlin.Pair(language.getLanguageKey(), calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-19, reason: not valid java name */
    public static final void m1664getDayObservable$lambda19(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.Integer num = this$0.getCurrentPeriodType().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        if (num.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()) {
            androidx.databinding.ObservableField<java.lang.String> currentDateText = this$0.getCurrentDateText();
            java.lang.Object second = pair.getSecond();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "it.second");
            currentDateText.set(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText((java.util.Calendar) second, (java.lang.String) pair.getFirst()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-20, reason: not valid java name */
    public static final java.util.Calendar m1665getDayObservable$lambda20(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (java.util.Calendar) it.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-23, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1666getDayObservable$lambda23(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, android.content.Context context, final java.util.Calendar date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.lang.String strDayUniqueID = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayUniqueID(date);
        if (this$0.getDayPeriodCacheMap().containsKey(strDayUniqueID)) {
            return io.reactivex.Observable.just(this$0.getDayPeriodCacheMap().get(strDayUniqueID));
        }
        return this$0.loadDayPeriod(date, context).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$cOTDSAkDZFX-5FMwQQiHuuLvyVI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1667getDayObservable$lambda23$lambda21(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.-$$Lambda$BaseChartPeriodsViewModel$EybpYOVB8FmC7-i4EilpU0AWV68
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel.m1668getDayObservable$lambda23$lambda22(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDayObservable$lambda-23$lambda-21, reason: not valid java name */
    public static final void m1667getDayObservable$lambda23$lambda21(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar date, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        java.util.Map<java.lang.String, DAY_CHART_CONFIG> dayPeriodCacheMap = this$0.getDayPeriodCacheMap();
        java.lang.String strDayUniqueID = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayUniqueID(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        dayPeriodCacheMap.put(strDayUniqueID, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDayObservable$lambda-23$lambda-22, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1668getDayObservable$lambda23$lambda22(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel this$0, java.util.Calendar date, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.Observable observableEmpty = io.reactivex.Observable.empty();
        java.util.Calendar value = this$0.getSelectedDayDate().getValue();
        java.lang.String strDayUniqueID = value == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayUniqueID(value);
        java.util.Map<java.lang.String, DAY_CHART_CONFIG> dayPeriodCacheMap = this$0.getDayPeriodCacheMap();
        java.util.Objects.requireNonNull(dayPeriodCacheMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        if (dayPeriodCacheMap.containsKey(strDayUniqueID) && kotlin.jvm.internal.Intrinsics.areEqual(strDayUniqueID, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayUniqueID(date))) {
            observableEmpty = io.reactivex.Observable.just(this$0.getDayPeriodCacheMap().get(strDayUniqueID));
        }
        return observableEmpty;
    }

    public final void onDayPeriodSelected() {
        java.lang.String strMonthDayYearFormatText;
        androidx.databinding.ObservableField<java.lang.String> observableField = this.currentDateText;
        java.util.Calendar value = this.selectedDayDate.getValue();
        if (value == null) {
            strMonthDayYearFormatText = null;
        } else {
            java.lang.String str = this.languageField.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            strMonthDayYearFormatText = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText(value, str);
        }
        observableField.set(strMonthDayYearFormatText);
        this.currentPeriodType.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()));
    }

    public final void onWeekPeriodSelected() {
        androidx.databinding.ObservableField<java.lang.String> observableField = this.currentDateText;
        java.util.Calendar value = this.selectedDayDate.getValue();
        observableField.set(value == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthWeekYearFormatText(value));
        this.currentPeriodType.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()));
    }

    public final void onMonthPeriodSelected() {
        androidx.databinding.ObservableField<java.lang.String> observableField = this.currentDateText;
        java.util.Calendar value = this.selectedDayDate.getValue();
        observableField.set(value == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthYearFormatText(value));
        this.currentPeriodType.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onDayPeriodClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.currentPeriodType.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()));
    }

    public final void onWeekPeriodClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.currentPeriodType.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()));
    }

    public final void onMonthPeriodClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.currentPeriodType.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()));
    }

    public final void onPreviousClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        onPreviousItemClicked();
    }

    public final void onNextClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        onNextItemClicked();
    }

    public final void onPreviousItemClicked() {
        java.lang.Integer num = this.currentPeriodType.get();
        int iOrdinal = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubject = this.selectedDayDate;
            java.util.Calendar value = behaviorSubject.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            behaviorSubject.onNext(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minusDay(value));
            return;
        }
        int iOrdinal2 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal();
        if (num != null && num.intValue() == iOrdinal2) {
            io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubject2 = this.selectedDayDate;
            java.util.Calendar value2 = behaviorSubject2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
            behaviorSubject2.onNext(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minusWeek(value2));
            return;
        }
        int iOrdinal3 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal();
        if (num != null && num.intValue() == iOrdinal3) {
            io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubject3 = this.selectedDayDate;
            java.util.Calendar value3 = behaviorSubject3.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value3);
            behaviorSubject3.onNext(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minusMonth(value3));
        }
    }

    public final void onNextItemClicked() {
        if (isDateOverflow()) {
            return;
        }
        java.lang.Integer num = this.currentPeriodType.get();
        int iOrdinal = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubject = this.selectedDayDate;
            java.util.Calendar value = behaviorSubject.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            behaviorSubject.onNext(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.plusDay(value));
            return;
        }
        int iOrdinal2 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal();
        if (num != null && num.intValue() == iOrdinal2) {
            io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubject2 = this.selectedDayDate;
            java.util.Calendar value2 = behaviorSubject2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
            behaviorSubject2.onNext(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.plusWeek(value2));
            return;
        }
        int iOrdinal3 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal();
        if (num != null && num.intValue() == iOrdinal3) {
            io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubject3 = this.selectedDayDate;
            java.util.Calendar value3 = behaviorSubject3.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value3);
            behaviorSubject3.onNext(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.plusMonth(value3));
        }
    }

    private final boolean isDateOverflow() {
        java.util.Calendar value = this.selectedDayDate.getValue();
        java.util.Calendar calendarCopy = value == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.copy(value);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.lang.Integer num = this.currentPeriodType.get();
        int iOrdinal = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            java.util.Calendar value2 = this.selectedDayDate.getValue();
            return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (value2 != null ? java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isToday(value2)) : null), (java.lang.Object) true);
        }
        int iOrdinal2 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal();
        if (num != null && num.intValue() == iOrdinal2) {
            java.util.Calendar calendarPlusWeek = calendarCopy != null ? powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.plusWeek(calendarCopy) : null;
            if ((calendarPlusWeek != null ? calendarPlusWeek.getTimeInMillis() : 0L) <= calendar.getTimeInMillis()) {
                return false;
            }
        } else {
            int iOrdinal3 = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal();
            if (num != null && num.intValue() == iOrdinal3) {
                java.util.Calendar calendarPlusMonth = calendarCopy != null ? powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.plusMonth(calendarCopy) : null;
                if ((calendarPlusMonth != null ? calendarPlusMonth.getTimeInMillis() : 0L) <= calendar.getTimeInMillis()) {
                    return false;
                }
            }
        }
        return true;
    }
}
