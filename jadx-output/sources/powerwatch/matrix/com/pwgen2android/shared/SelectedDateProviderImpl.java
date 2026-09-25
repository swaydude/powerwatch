package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: SelectedDateProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\t0\t0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isToday", "", "selectedDate", "Ljava/util/Calendar;", "getSelectedDate", "()Ljava/util/Calendar;", "selectedDateObservable", "Lio/reactivex/Observable;", "getSelectedDateObservable", "()Lio/reactivex/Observable;", "selectedDateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "reset", "", "setDate", "date", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SelectedDateProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.SelectDate {
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private boolean isToday;
    private final io.reactivex.subjects.BehaviorSubject<java.util.Calendar> selectedDateSubject;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m2968_init_$lambda1(java.lang.Throwable th) {
    }

    public SelectedDateProviderImpl() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        io.reactivex.subjects.BehaviorSubject<java.util.Calendar> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(Calendar.getInstance().midnight())");
        this.selectedDateSubject = behaviorSubjectCreateDefault;
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        compositeDisposable.add(getSelectedDateObservable().repeat().retry().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.-$$Lambda$SelectedDateProviderImpl$3iDUFCt9yqM0bbzZGpjzBLvXTZs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl.m2967_init_$lambda0(this.f$0, (java.util.Calendar) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.-$$Lambda$SelectedDateProviderImpl$WoYIcFYRlv9YN8TQqZ9-tBdErU8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl.m2968_init_$lambda1((java.lang.Throwable) obj);
            }
        }));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider
    public java.util.Calendar getSelectedDate() {
        java.util.Calendar value = this.selectedDateSubject.getValue();
        java.lang.Object objClone = value == null ? null : value.clone();
        java.util.Calendar calendar = objClone instanceof java.util.Calendar ? (java.util.Calendar) objClone : null;
        if (calendar != null) {
            return calendar;
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance()");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2967_init_$lambda0(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl this$0, java.util.Calendar it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        this$0.isToday = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(it, calendar);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.SelectDate
    public void reset() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        setDate(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.midnight(calendar));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.SelectDate
    public void update() {
        if (this.isToday) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
            if (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.isSameDay(calendar, getSelectedDate())) {
                return;
            }
            reset();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider
    public io.reactivex.Observable<java.util.Calendar> getSelectedDateObservable() {
        return this.selectedDateSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.SelectDate
    public void setDate(java.util.Calendar date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        this.selectedDateSubject.onNext(date);
    }
}
