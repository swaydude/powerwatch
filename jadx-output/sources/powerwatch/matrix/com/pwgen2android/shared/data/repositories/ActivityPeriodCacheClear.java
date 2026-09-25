package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: ActivityPeriodCacheClear.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;", "", "walkingRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;", "restingRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;", "sleepRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;", "userActivitySessionRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;)V", "clear", "Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityPeriodCacheClear {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository restingRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository walkingRepository;

    public ActivityPeriodCacheClear(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository walkingRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository restingRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository sleepRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingRepository, "walkingRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingRepository, "restingRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepRepository, "sleepRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "userActivitySessionRepository");
        this.walkingRepository = walkingRepository;
        this.restingRepository = restingRepository;
        this.sleepRepository = sleepRepository;
        this.userActivitySessionRepository = userActivitySessionRepository;
    }

    public final io.reactivex.Completable clear() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$ActivityPeriodCacheClear$41MX1N23eNK0vSGWMgdI2SA4AhU
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear.m3189clear$lambda0(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        walkingRepository.clearCache()\n        restingRepository.clearCache()\n        sleepRepository.clearCache()\n        userActivitySessionRepository.clearCache()\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clear$lambda-0, reason: not valid java name */
    public static final void m3189clear$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.walkingRepository.clearCache();
        this$0.restingRepository.clearCache();
        this$0.sleepRepository.clearCache();
        this$0.userActivitySessionRepository.clearCache();
    }
}
