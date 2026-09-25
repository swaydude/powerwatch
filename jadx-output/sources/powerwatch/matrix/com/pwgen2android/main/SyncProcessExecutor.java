package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: PairingProcessExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;", "", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;)V", "power", "", "getPower", "()F", "setPower", "(F)V", "execute", "Lio/reactivex/Observable;", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SyncProcessExecutor {
    private float power;
    private final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-1, reason: not valid java name */
    public static final kotlin.Triple m1624execute$lambda1(kotlin.Triple sync, kotlin.Unit noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sync, "sync");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return sync;
    }

    public SyncProcessExecutor(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        this.watchSynchronizer = watchSynchronizer;
        this.power = 1.0f;
    }

    public final float getPower() {
        return this.power;
    }

    public final void setPower(float f) {
        this.power = f;
    }

    public final io.reactivex.Observable<java.lang.Integer> execute() {
        io.reactivex.Observable observableCreate = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$SyncProcessExecutor$xkQaN_H8dhvyIs6hFb0eR4NcwJc
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor.m1623execute$lambda0(this.f$0, observableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableCreate, "create<Unit> {\n            watchSynchronizer.startSync(SyncConfig(false))\n            it.onNext(Unit)\n            it.onComplete()\n        }");
        io.reactivex.Observable<java.lang.Integer> observableFlatMap = io.reactivex.Observable.combineLatest(this.watchSynchronizer.syncOutput().skip(1L), observableCreate, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor.m1624execute$lambda1((kotlin.Triple) obj, (kotlin.Unit) obj2);
            }
        }).distinctUntilChanged().takeUntil(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor.m1625execute$lambda2((kotlin.Triple) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$SyncProcessExecutor$WdycbW_l09p2iBEqHkmvFEbtWzQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor.m1626execute$lambda3((kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "combineLatest(\n                watchSynchronizer.syncOutput()\n                        .skip(1),\n                requestObs,\n                BiFunction<Triple<Int, DataInfo?, Throwable?>, Unit, Triple<Int, DataInfo?, Throwable?>> { sync, _ ->\n                    sync\n                })\n                .distinctUntilChanged()\n                .takeUntil { it.second != null }\n                .flatMap {\n                    if (it.third != null) return@flatMap Observable.error<Int>(it.third)\n                    else return@flatMap Observable.just(it.first)\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m1623execute$lambda0(powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor this$0, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.watchSynchronizer.startSync(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig(false, null, null, false, false, 30, null));
        it.onNext(kotlin.Unit.INSTANCE);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-2, reason: not valid java name */
    public static final boolean m1625execute$lambda2(kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSecond() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1626execute$lambda3(kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getThird() != null ? io.reactivex.Observable.error((java.lang.Throwable) it.getThird()) : io.reactivex.Observable.just(it.getFirst());
    }
}
