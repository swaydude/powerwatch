package powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods;

/* JADX INFO: compiled from: BaseDashboardActivityPeriodItemViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\b\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0015\u0010(\u001a\u00020&2\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010-\u001a\u00020&*\u00020.R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u000e0\u000e0\u001cX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00060\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00060\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00060\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006/"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "CHART_CONFIG", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "periodFormatter", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "context", "Landroid/content/Context;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "configuration", "Landroidx/databinding/ObservableField;", "getConfiguration", "()Landroidx/databinding/ObservableField;", "dataDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "headerColor", "", "getHeaderColor", "parentFragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getParentFragmentManagerWeakReference", "()Ljava/lang/ref/WeakReference;", "subTitle", "getSubTitle", "subTitleValue", "getSubTitleValue", "getTitle", "goToDrillDown", "", "loadData", "onConfigurationArrived", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;)V", "onCreateView", "onDataReload", "onDestroyView", "onOpenDrillDownScreen", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseDashboardActivityPeriodItemViewModel<CHART_CONFIG extends powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig> extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final androidx.databinding.ObservableField<CHART_CONFIG> configuration;
    private io.reactivex.disposables.CompositeDisposable dataDisposable;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<CHART_CONFIG> periodFormatter;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider;
    private final androidx.databinding.ObservableField<java.lang.String> subTitle;
    private final androidx.databinding.ObservableField<java.lang.String> subTitleValue;
    private final androidx.databinding.ObservableField<java.lang.String> title;

    public abstract androidx.databinding.ObservableField<java.lang.Integer> getHeaderColor();

    public abstract void goToDrillDown();

    protected void onConfigurationArrived(CHART_CONFIG configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    public /* synthetic */ BaseDashboardActivityPeriodItemViewModel(java.lang.String str, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel periodFormatterViewModel, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, periodFormatterViewModel, selectedDateProvider, context, fragmentManager, (i & 32) != 0 ? null : rxBus);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDashboardActivityPeriodItemViewModel(java.lang.String title, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<CHART_CONFIG> periodFormatter, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, android.content.Context context, androidx.fragment.app.FragmentManager parentFragmentManager, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        super(context, rxBus);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodFormatter, "periodFormatter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        this.periodFormatter = periodFormatter;
        this.selectedDateProvider = selectedDateProvider;
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        this.title = new androidx.databinding.ObservableField<>(title);
        this.subTitle = new androidx.databinding.ObservableField<>("");
        this.subTitleValue = new androidx.databinding.ObservableField<>("");
        this.configuration = new androidx.databinding.ObservableField<>();
        this.dataDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    protected final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> getParentFragmentManagerWeakReference() {
        return this.parentFragmentManagerWeakReference;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getTitle() {
        return this.title;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSubTitle() {
        return this.subTitle;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSubTitleValue() {
        return this.subTitleValue;
    }

    public final androidx.databinding.ObservableField<CHART_CONFIG> getConfiguration() {
        return this.configuration;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        loadData(context);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDataReload(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDataReload(context);
        loadData(context);
    }

    private final void loadData(final android.content.Context context) {
        this.dataDisposable.dispose();
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.dataDisposable = compositeDisposable;
        compositeDisposable.add(this.selectedDateProvider.getSelectedDateObservable().switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.-$$Lambda$BaseDashboardActivityPeriodItemViewModel$BKc7hP-_Aiz0HIZoHnFYEOF_kwc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel.m3439loadData$lambda0(this.f$0, context, (java.util.Calendar) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).retry().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.-$$Lambda$BaseDashboardActivityPeriodItemViewModel$o7xjKa5uUbDWGHOXe8xjPM1ep64
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel.m3440loadData$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.-$$Lambda$BaseDashboardActivityPeriodItemViewModel$CawoK5gkUykpdXMn9t2aurs1lUs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel.m3441loadData$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3439loadData$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel this$0, android.content.Context context, java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.periodFormatter.getPeriodConfig(it, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: loadData$lambda-1, reason: not valid java name */
    public static final void m3440loadData$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getConfiguration().set(it);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.onConfigurationArrived(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-2, reason: not valid java name */
    public static final void m3441loadData$lambda2(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Day graph dashboard config error: ", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.dataDisposable.clear();
    }

    public final void onOpenDrillDownScreen(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        goToDrillDown();
    }
}
