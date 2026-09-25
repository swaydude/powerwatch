package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: UpdateInfoRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;", "updateInfoCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;", "updateInfoDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V", "delete", "Lio/reactivex/Completable;", "getOne", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "id", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;", "fromCache", "", "load", "forceCache", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UpdateInfoRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService updateInfoCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao updateInfoDao;

    public UpdateInfoRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService updateInfoCloudService, powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao updateInfoDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoCloudService, "updateInfoCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoDao, "updateInfoDao");
        this.updateInfoCloudService = updateInfoCloudService;
        this.updateInfoDao = updateInfoDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository
    public io.reactivex.Completable delete() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UpdateInfoRepositoryImpl$Aa8Imi5D_sLmVhBZ0AQAmNLacfU
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepositoryImpl.m3210delete$lambda0(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        updateInfoDao.delete()\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: delete$lambda-0, reason: not valid java name */
    public static final void m3210delete$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepositoryImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateInfoDao.delete();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> load(boolean fromCache, boolean forceCache) {
        return this.updateInfoDao.observeUpdateInfo();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> getOne(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoParams id, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        if (fromCache) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> observable = this.updateInfoDao.get().toObservable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "updateInfoDao.get().toObservable()");
            return observable;
        }
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> observableSubscribeOn = io.reactivex.Observable.concat(this.updateInfoDao.get().toObservable(), this.updateInfoCloudService.getUpdateInfo(id.getProductID(), id.getLanguage()).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UpdateInfoRepositoryImpl$bPtA32RaCt8PJWCln2I1v_R8NLw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepositoryImpl.m3211getOne$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo) obj);
            }
        }).toObservable()).subscribeOn(io.reactivex.schedulers.Schedulers.io());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "concat(updateInfoDao.get().toObservable(),\n                updateInfoCloudService.getUpdateInfo(id.productID, id.language).flatMap {\n                    updateInfoDao.addCompletable(it).toSingleDefault(it)\n                }.toObservable())\n                .subscribeOn(Schedulers.io())");
        return observableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOne$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m3211getOne$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.updateInfoDao.addCompletable(it).toSingleDefault(it);
    }
}
