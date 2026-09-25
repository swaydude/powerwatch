package powerwatch.matrix.com.pwgen2android.shared.ui.maps;

/* JADX INFO: compiled from: BaseMapViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "runningAnimator", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;)V", "locationAnimationObservable", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;", "", "getLocationAnimationObservable", "()Lio/reactivex/Observable;", "locationsSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;", "kotlin.jvm.PlatformType", "getLocationsSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "showProgressField", "Landroidx/databinding/ObservableField;", "getShowProgressField", "()Landroidx/databinding/ObservableField;", "zoomEnabled", "getZoomEnabled", "loadActivitySession", "", "activitySession", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BaseMapViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final io.reactivex.Observable<kotlin.Pair<powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation, java.lang.Boolean>> locationAnimationObservable;
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition>> locationsSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator;
    private final androidx.databinding.ObservableField<java.lang.Boolean> showProgressField;
    private final androidx.databinding.ObservableField<java.lang.Boolean> zoomEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMapViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningAnimator, "runningAnimator");
        this.runningAnimator = runningAnimator;
        this.showProgressField = new androidx.databinding.ObservableField<>(false);
        io.reactivex.Observable map = runningAnimator.runningAnimationEvents().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.-$$Lambda$BaseMapViewModel$pCDrxhsQOrgShhNfhHdtZFgPtiQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.m3486locationAnimationObservable$lambda0((powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "runningAnimator.runningAnimationEvents()\n            .map {\n                if (it.progress == 0) {\n                    Pair(it.currentAnimationItem, true)\n                } else {\n                    Pair(it.currentAnimationItem, false)\n                }\n            }");
        this.locationAnimationObservable = map;
        this.zoomEnabled = new androidx.databinding.ObservableField<>(true);
        io.reactivex.subjects.BehaviorSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition>> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<List<MapPosition>>()");
        this.locationsSubject = behaviorSubjectCreate;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getShowProgressField() {
        return this.showProgressField;
    }

    public final io.reactivex.Observable<kotlin.Pair<powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation, java.lang.Boolean>> getLocationAnimationObservable() {
        return this.locationAnimationObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: locationAnimationObservable$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m3486locationAnimationObservable$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.getProgress() == 0) {
            return new kotlin.Pair(it.getCurrentAnimationItem(), true);
        }
        return new kotlin.Pair(it.getCurrentAnimationItem(), false);
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getZoomEnabled() {
        return this.zoomEnabled;
    }

    public final io.reactivex.subjects.BehaviorSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition>> getLocationsSubject() {
        return this.locationsSubject;
    }

    public final void loadActivitySession(final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession activitySession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySession, "activitySession");
        io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.-$$Lambda$BaseMapViewModel$6ZXcHgTH9NMHaMQKa0HxqBQPQFE
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.m3484loadActivitySession$lambda1(activitySession, observableEmitter);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.computation()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.-$$Lambda$BaseMapViewModel$frFCAV3rHoFtteOqrlUOHzO2DYg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.m3485loadActivitySession$lambda2(this.f$0, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-1, reason: not valid java name */
    public static final void m3484loadActivitySession$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession activitySession, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySession, "$activitySession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = activitySession.getGpsPositions().size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition(new com.google.android.gms.maps.model.LatLng(activitySession.getGpsPositions().get(i).getLatitude(), activitySession.getGpsPositions().get(i).getLongitude()), activitySession.getHeartRates().get(i)));
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        it.onNext(arrayList);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadActivitySession$lambda-2, reason: not valid java name */
    public static final void m3485loadActivitySession$lambda2(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getLocationsSubject().onNext(list);
    }
}
