package powerwatch.matrix.com.pwgen2android.shared.ui.calendar;

/* JADX INFO: compiled from: CalendarView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR7\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001d0\u001d0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;", "configuration", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;", "dayInWeekLabels", "", "", "getDayInWeekLabels", "()[Ljava/lang/String;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "dayCell", "", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "months", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;", "scrollChangeObservable", "Lio/reactivex/Observable;", "getScrollChangeObservable", "()Lio/reactivex/Observable;", "scrollPositionChange", "Lio/reactivex/subjects/ReplaySubject;", "kotlin.jvm.PlatformType", "configure", "configureRecycler", "getCurrentItemPosition", "", "scrollToSelectedMonth", "selectedIndex", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CalendarView extends androidx.recyclerview.widget.RecyclerView {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.class).getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter adapter;
    private powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration configuration;
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> listener;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell> months;
    private final io.reactivex.subjects.ReplaySubject<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell> scrollPositionChange;

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.months = new java.util.ArrayList();
        io.reactivex.subjects.ReplaySubject<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell> replaySubjectCreateWithSize = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize, "createWithSize<MonthCell>(1)");
        this.scrollPositionChange = replaySubjectCreateWithSize;
        this.adapter = new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter();
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell> getScrollChangeObservable() {
        return this.scrollPositionChange;
    }

    public final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> getListener() {
        return this.listener;
    }

    public final void setListener(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> function1) {
        this.listener = function1;
    }

    public final java.lang.String[] getDayInWeekLabels() {
        java.util.Locale locale;
        powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration calendarConfiguration = this.configuration;
        if (calendarConfiguration != null) {
            locale = calendarConfiguration == null ? null : calendarConfiguration.getLocale();
        } else {
            locale = java.util.Locale.getDefault();
        }
        java.lang.String[] weekdays = new java.text.DateFormatSymbols(locale).getWeekdays();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(weekdays, "DateFormatSymbols(if (configuration != null) configuration?.locale else Locale.getDefault()).weekdays");
        return weekdays;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentItemPosition() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        java.util.Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x018f A[LOOP:1: B:12:0x00a3->B:47:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x019a A[EDGE_INSN: B:62:0x019a->B:49:0x019a BREAK  A[LOOP:1: B:12:0x00a3->B:47:0x018f], SYNTHETIC] */
    public final void configure(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarConfiguration configuration) {
        int i;
        int i2;
        java.util.Calendar calendarPrevious;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.months.clear();
        powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(configuration.getStartDate());
        configuration.getStartDate().setTimeZone(configuration.getTimeZone());
        powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(configuration.getEndDate());
        configuration.getEndDate().setTimeZone(configuration.getTimeZone());
        powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(configuration.getCurrentDate());
        configuration.getCurrentDate().setTimeZone(configuration.getTimeZone());
        java.util.Calendar startDate = configuration.getStartDate();
        int iMonth = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.month(configuration.getEndDate());
        int i3 = 1;
        int i4 = configuration.getEndDate().get(1);
        int index = 0;
        while (true) {
            if ((powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.month(startDate) > iMonth && startDate.get(i3) >= i4) || startDate.get(i3) >= i4 + 1) {
                break;
            }
            java.util.Calendar currentMonthCalendar = java.util.Calendar.getInstance(configuration.getTimeZone(), configuration.getLocale());
            java.util.Date currentMonthTime = startDate.getTime();
            currentMonthCalendar.setTime(currentMonthTime);
            int i5 = currentMonthCalendar.get(4);
            currentMonthCalendar.add(2, i3);
            currentMonthCalendar.add(5, -1);
            int i6 = currentMonthCalendar.get(4);
            currentMonthCalendar.set(5, i3);
            int i7 = (i6 - i5) + i3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (i7 > 0) {
                int i8 = 0;
                while (true) {
                    i8 += i3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i9 = currentMonthCalendar.get(7);
                    int firstDayOfWeek = currentMonthCalendar.getFirstDayOfWeek() - i9;
                    if (currentMonthCalendar.getFirstDayOfWeek() == i3) {
                        firstDayOfWeek++;
                    }
                    if (firstDayOfWeek <= 0) {
                        do {
                            firstDayOfWeek++;
                            arrayList2.add(null);
                        } while (firstDayOfWeek <= 0);
                    }
                    if (i9 <= 7) {
                        while (true) {
                            i9 += i3;
                            boolean z = currentMonthCalendar.get(5) == currentMonthCalendar.getActualMaximum(5);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentMonthCalendar, "currentMonthCalendar");
                            boolean zIsSameDay = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(currentMonthCalendar, configuration.getCurrentDate());
                            java.util.Calendar calendar = java.util.Calendar.getInstance();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
                            boolean zIsSameDay2 = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(currentMonthCalendar, calendar);
                            java.util.List<java.util.Calendar> filledDates = configuration.getFilledDates();
                            java.util.ListIterator<java.util.Calendar> listIterator = filledDates.listIterator(filledDates.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    i = iMonth;
                                    calendarPrevious = null;
                                    break;
                                } else {
                                    calendarPrevious = listIterator.previous();
                                    i = iMonth;
                                    if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(currentMonthCalendar, calendarPrevious)) {
                                        break;
                                    } else {
                                        iMonth = i;
                                    }
                                }
                            }
                            boolean z2 = calendarPrevious != null;
                            int i10 = currentMonthCalendar.get(7);
                            int iDayOfMonth = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayOfMonth(currentMonthCalendar);
                            int iMonth2 = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.month(currentMonthCalendar);
                            int iYear = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.year(currentMonthCalendar);
                            java.util.Date time = currentMonthCalendar.getTime();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "currentMonthCalendar.time");
                            arrayList2.add(new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell(zIsSameDay, zIsSameDay2, i10, iDayOfMonth, iMonth2, iYear, time, z2, java.lang.String.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayOfMonth(currentMonthCalendar))));
                            if (!z) {
                                i2 = 1;
                                currentMonthCalendar.add(5, 1);
                                if (i9 > 7) {
                                    break;
                                }
                                iMonth = i;
                                i3 = 1;
                            }
                        }
                        int i11 = currentMonthCalendar.get(4);
                        int i12 = currentMonthCalendar.get(3);
                        int i13 = currentMonthCalendar.get(i2);
                        java.util.Date time2 = currentMonthCalendar.getTime();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time2, "currentMonthCalendar.time");
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow(i11, i12, i13, time2, arrayList2));
                        if (i8 >= i7) {
                            break;
                        }
                        iMonth = i;
                        i3 = 1;
                    } else {
                        i = iMonth;
                    }
                    i2 = 1;
                    int i14 = currentMonthCalendar.get(4);
                    int i15 = currentMonthCalendar.get(3);
                    int i16 = currentMonthCalendar.get(i2);
                    java.util.Date time3 = currentMonthCalendar.getTime();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time3, "currentMonthCalendar.time");
                    arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.WeekRow(i14, i15, i16, time3, arrayList2));
                    if (i8 >= i7) {
                        break;
                        break;
                    } else {
                        iMonth = i;
                        i3 = 1;
                    }
                }
            } else {
                i = iMonth;
            }
            boolean zIsSameMonth = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameMonth(startDate, configuration.getCurrentDate());
            int size = this.months.size();
            int iMonth3 = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.month(startDate);
            int i17 = startDate.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentMonthTime, "currentMonthTime");
            powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell monthCell = new powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCell(size, zIsSameMonth, iMonth3, i17, currentMonthTime, configuration.getMonthNameFormat().format(currentMonthTime), arrayList);
            if (monthCell.isCurrentMonth()) {
                index = monthCell.getIndex();
            }
            this.months.add(monthCell);
            startDate.add(2, 1);
            iMonth = i;
            i3 = 1;
        }
        configureRecycler();
        kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.shared.ui.calendar.DayCell, kotlin.Unit> function1 = this.listener;
        if (function1 != null) {
            powerwatch.matrix.com.pwgen2android.shared.ui.calendar.MonthCellRecyclerAdapter monthCellRecyclerAdapter = this.adapter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
            monthCellRecyclerAdapter.setListener(function1);
        }
        this.adapter.setData(this.months);
        scrollToSelectedMonth(index);
        addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.configure.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int newState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.this.months.isEmpty()) {
                    super.onScrollStateChanged(recyclerView, newState);
                    int currentItemPosition = powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.this.getCurrentItemPosition();
                    if (currentItemPosition < powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.this.adapter.getItemCount() - 1) {
                        currentItemPosition++;
                    }
                    powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.this.scrollPositionChange.onNext(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.this.adapter.getCurrentItem(currentItemPosition));
                }
            }
        });
    }

    private final void configureRecycler() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        setLayoutManager(linearLayoutManager);
        setAdapter(this.adapter);
        setItemViewCacheSize(this.months.size());
    }

    private final void scrollToSelectedMonth(final int selectedIndex) {
        post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.calendar.-$$Lambda$CalendarView$k__2qU8xJ66veLkTgHJzyzVmDMQ
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView.m3442scrollToSelectedMonth$lambda1(this.f$0, selectedIndex);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollToSelectedMonth$lambda-1, reason: not valid java name */
    public static final void m3442scrollToSelectedMonth$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView this$0, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.months.isEmpty()) {
            android.util.Log.d(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Scrolling to position ", java.lang.Integer.valueOf(i)));
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this$0.getLayoutManager();
            java.util.Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
            if (i < this$0.adapter.getItemCount() - 1) {
                i++;
            }
            this$0.scrollPositionChange.onNext(this$0.adapter.getCurrentItem(i));
        }
    }
}
