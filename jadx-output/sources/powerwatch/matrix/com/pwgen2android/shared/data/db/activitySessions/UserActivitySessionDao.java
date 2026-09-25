package powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions;

/* JADX INFO: compiled from: UserActivitySessionDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\bH'J\b\u0010\u0010\u001a\u00020\bH'J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH'J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'J\b\u0010\u001a\u001a\u00020\u000eH'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0014H'J\u0016\u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H'J\u0016\u0010\u001e\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0014\u0010 \u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0007J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\nH'J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006&"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;", "", "()V", "allActivityDates", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "delete", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "deleteActivityDateCompletable", "Lio/reactivex/Completable;", "startTime", "", "deleteAll", "deleteAllActivityDates", "deleteCompletable", "deleteSyngleActivityDate", "getAll", "Lio/reactivex/Single;", "endTime", "getOne", "Lio/reactivex/Maybe;", "id", "", "notSyncedCount", "notSyncedSessions", "save", "items", "saveActivityDates", "dates", "saveActivityDatesCompletable", "saveCompletable", "sessions", "update", "item", "updateCompletable", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class UserActivitySessionDao {
    public abstract io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> allActivityDates();

    public abstract void delete(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session);

    public abstract void deleteAll();

    public abstract void deleteAllActivityDates();

    public abstract void deleteSyngleActivityDate(long startTime);

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> getAll(long startTime, long endTime);

    public abstract io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getOne(java.lang.String id);

    public abstract long notSyncedCount();

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> notSyncedSessions();

    public abstract void save(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> items);

    public abstract void saveActivityDates(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> dates);

    public abstract void update(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession item);

    public final io.reactivex.Completable deleteCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "session");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.-$$Lambda$UserActivitySessionDao$CIdGF78n3vGPnvlzY7oSwzlKKCY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.m3139deleteCompletable$lambda0(this.f$0, session);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        delete(session)\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteCompletable$lambda-0, reason: not valid java name */
    public static final void m3139deleteCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "$session");
        this$0.delete(session);
    }

    public final io.reactivex.Completable updateCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "session");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.-$$Lambda$UserActivitySessionDao$RrJIyKbrsqe1MxFsppffR058sso
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.m3142updateCompletable$lambda1(this.f$0, session);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            update(session)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateCompletable$lambda-1, reason: not valid java name */
    public static final void m3142updateCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "$session");
        this$0.update(session);
    }

    public final io.reactivex.Completable saveCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> sessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessions, "sessions");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.-$$Lambda$UserActivitySessionDao$VBVEczuyHBBkzLywdIbZY9DibGk
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.m3141saveCompletable$lambda2(this.f$0, sessions);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            save(sessions)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveCompletable$lambda-2, reason: not valid java name */
    public static final void m3141saveCompletable$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao this$0, java.util.List sessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessions, "$sessions");
        this$0.save(sessions);
    }

    public final io.reactivex.Completable deleteActivityDateCompletable(final long startTime) {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.-$$Lambda$UserActivitySessionDao$L6XL3YuEjDGV7n05ORuFjSHcJ_M
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.m3138deleteActivityDateCompletable$lambda3(this.f$0, startTime);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            deleteSyngleActivityDate(startTime)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteActivityDateCompletable$lambda-3, reason: not valid java name */
    public static final void m3138deleteActivityDateCompletable$lambda3(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao this$0, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deleteSyngleActivityDate(j);
    }

    public final io.reactivex.Completable saveActivityDatesCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> dates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dates, "dates");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.-$$Lambda$UserActivitySessionDao$aFlNA5McXUqg_ujHjrPP1pDzOU8
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.m3140saveActivityDatesCompletable$lambda4(this.f$0, dates);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        saveActivityDates(dates)\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveActivityDatesCompletable$lambda-4, reason: not valid java name */
    public static final void m3140saveActivityDatesCompletable$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao this$0, java.util.List dates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dates, "$dates");
        this$0.saveActivityDates(dates);
    }
}
