package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month;

/* JADX INFO: compiled from: SleepMonthPeriodRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JT\u0010\u0005\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \t*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/SleepMonthPeriodRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/SleepMonthPeriodRepository;", "sleepHourPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;)V", "all", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;", "kotlin.jvm.PlatformType", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "fromCache", "", "mapToMonth", "hours", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "hourOffset", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepMonthPeriodRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepository {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository.class).getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepHourPeriodRepository;

    public SleepMonthPeriodRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepHourPeriodRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodRepository, "sleepHourPeriodRepository");
        this.sleepHourPeriodRepository = sleepHourPeriodRepository;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod>> all(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        return this.sleepHourPeriodRepository.all(page, fromCache).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.-$$Lambda$SleepMonthPeriodRepositoryImpl$urvCfMkidatqkt1ttDSt2_lPC-o
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepositoryImpl.m3272all$lambda0(this.f$0, page, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-0, reason: not valid java name */
    public static final java.util.List m3272all$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.mapToMonth(it, page.getCorrectedOffset());
    }

    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod> mapToMonth(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> hours, int hourOffset) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepMonthPeriodFormatterImpl(new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepWeekPeriodFormatterImpl(new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepDayPeriodFormatterImpl(hours, hourOffset).format(), hourOffset).format(), hourOffset).format();
    }
}
