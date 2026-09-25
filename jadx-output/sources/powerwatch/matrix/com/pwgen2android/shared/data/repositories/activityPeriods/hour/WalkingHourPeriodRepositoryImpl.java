package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour;

/* JADX INFO: compiled from: WalkingHourPeriodRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "walkingPeriodService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;", "walkingWeekPeriodDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)V", "activityIDs", "Lkotlin/Pair;", "", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "byUTC", "", "getCachePeriods", "Lio/reactivex/Single;", "", "startEndPair", "getCloudPeriods", "getLastPeriod", "getSavePeriodsCompletable", "Lio/reactivex/Completable;", "items", "notSyncedCount", "sync", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WalkingHourPeriodRepositoryImpl extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class).getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService walkingPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao walkingWeekPeriodDao;

    public /* synthetic */ WalkingHourPeriodRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService walkingHourPeriodCloudService, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao walkingHourPeriodDao, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Hour hour, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingHourPeriodCloudService, walkingHourPeriodDao, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Hour.INSTANCE : hour);
    }

    public WalkingHourPeriodRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService walkingPeriodService, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao walkingWeekPeriodDao, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingPeriodService, "walkingPeriodService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriodDao, "walkingWeekPeriodDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.walkingPeriodService = walkingPeriodService;
        this.walkingWeekPeriodDao = walkingWeekPeriodDao;
        this.type = type;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public long notSyncedCount() {
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.BaseActivityPeriodRepository
    public powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod getLastPeriod() {
        return this.walkingWeekPeriodDao.lastWalkingHour();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl
    public kotlin.Pair<java.lang.Long, java.lang.Long> activityIDs(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean byUTC) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.startEndTime(page);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>> getCachePeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, kotlin.Pair<java.lang.Long, java.lang.Long> startEndPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startEndPair, "startEndPair");
        return this.walkingWeekPeriodDao.getWalkingHourPeriods(startEndPair.getFirst().longValue(), startEndPair.getSecond().longValue());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>> getCloudPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        return this.walkingPeriodService.getAllWalkingPeriods(page, this.type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl
    public io.reactivex.Completable getSavePeriodsCompletable(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        return this.walkingWeekPeriodDao.addWalkingHourPeriodsCompletable(items);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public io.reactivex.Completable sync() {
        io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
        return completableComplete;
    }
}
