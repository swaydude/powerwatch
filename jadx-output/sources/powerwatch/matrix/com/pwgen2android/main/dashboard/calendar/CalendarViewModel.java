package powerwatch.matrix.com.pwgen2android.main.dashboard.calendar;

/* JADX INFO: compiled from: CalendarViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "selectDate", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "userActivitySessionRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Landroidx/fragment/app/FragmentManager;)V", "activityDatesDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "config", "Landroidx/databinding/ObservableField;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;", "kotlin.jvm.PlatformType", "getConfig", "()Landroidx/databinding/ObservableField;", "parentFragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "getSelectedDateProvider", "()Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "defaultCalendarConfig", "onCreateView", "", "context", "Landroid/content/Context;", "onDestroyView", "onRightButtonClicked", "date", "Ljava/util/Calendar;", "openSecretScreen", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CalendarViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final io.reactivex.disposables.CompositeDisposable activityDatesDisposable;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration> config;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate;
    private final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m1660onCreateView$lambda3(java.lang.Throwable th) {
    }

    public final void openSecretScreen() {
    }

    public final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider getSelectedDateProvider() {
        return this.selectedDateProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel(powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, androidx.fragment.app.FragmentManager parentFragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "userActivitySessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        this.selectDate = selectDate;
        this.selectedDateProvider = selectedDateProvider;
        this.userActivitySessionRepository = userActivitySessionRepository;
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        this.activityDatesDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.config = new androidx.databinding.ObservableField<>(defaultCalendarConfig());
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration> getConfig() {
        return this.config;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.config.set(defaultCalendarConfig());
        this.activityDatesDisposable.add(this.userActivitySessionRepository.activityDates(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(0, 0L, 0L, 0, 15, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.-$$Lambda$CalendarViewModel$nlXuup3rOqiQaI1w2gkUSSx-v8Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel.m1658onCreateView$lambda1(this.f$0, (java.util.List) obj);
            }
        }).distinctUntilChanged().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.-$$Lambda$CalendarViewModel$m_3c2OzLdAJUnb2itaApgXUQFQw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel.m1659onCreateView$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.-$$Lambda$CalendarViewModel$l4rQl8S_oYuVEE2gLqj_ohWdf_k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel.m1660onCreateView$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration m1658onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration calendarConfigurationDefaultCalendarConfig = this$0.defaultCalendarConfig();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> list = it;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate userActivityDate : list) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(userActivityDate.getStartTime());
            arrayList.add(calendar);
        }
        return powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration.copy$default(calendarConfigurationDefaultCalendarConfig, null, null, null, null, null, null, arrayList, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1659onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration calendarConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getConfig().set(calendarConfiguration);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.activityDatesDisposable.clear();
    }

    public final void onRightButtonClicked(java.util.Calendar date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        this.selectDate.setDate(date);
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(fragmentManager);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration defaultCalendarConfig() {
        java.util.Calendar lastYear = java.util.Calendar.getInstance();
        lastYear.add(2, -3);
        lastYear.set(6, 1);
        java.util.Calendar nextYear = java.util.Calendar.getInstance();
        nextYear.add(2, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastYear, "lastYear");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nextYear, "nextYear");
        java.util.Calendar selectedDate = this.selectedDateProvider.getSelectedDate();
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration(lastYear, nextYear, selectedDate, timeZone, locale, new java.text.SimpleDateFormat("MMM", java.util.Locale.getDefault()), kotlin.collections.CollectionsKt.emptyList());
    }
}
