package powerwatch.matrix.com.pwgen2android.main.appupdate;

/* JADX INFO: compiled from: AppUpdateController.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "onResume", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;", "activity", "Landroid/app/Activity;", "updateRequestCode", "", "startUpdate", "Lio/reactivex/Completable;", "activityContext", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "requestCode", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppUpdateController implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Completable startUpdate(final android.app.Activity activityContext, final com.google.android.play.core.appupdate.AppUpdateInfo updateInfo, final int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.main.appupdate.-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) throws android.content.IntentSender.SendIntentException {
                powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController.m1634startUpdate$lambda0(activityContext, updateInfo, requestCode, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create {\n            println(\"AppUpdateInfo: Starting update\")\n            val manager = AppUpdateManagerFactory.create(activityContext)\n            manager.startUpdateFlowForResult(\n                    updateInfo,\n                    AppUpdateType.IMMEDIATE,\n                    activityContext,\n                    requestCode)\n            it.onComplete()\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-0, reason: not valid java name */
    public static final void m1634startUpdate$lambda0(android.app.Activity activityContext, com.google.android.play.core.appupdate.AppUpdateInfo updateInfo, int i, io.reactivex.CompletableEmitter it) throws android.content.IntentSender.SendIntentException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "$activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "$updateInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.System.out.println((java.lang.Object) "AppUpdateInfo: Starting update");
        com.google.android.play.core.appupdate.AppUpdateManagerFactory.create(activityContext).startUpdateFlowForResult(updateInfo, 1, activityContext, i);
        it.onComplete();
    }

    public final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState> onResume(final android.app.Activity activity, final int updateRequestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState> singleFlatMap = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.main.appupdate.-$$Lambda$AppUpdateController$-fwA-h7S9MPn3ZYJBp5J-i53Su0
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController.m1630onResume$lambda3(activity, this, singleEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.appupdate.-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController.m1633onResume$lambda4(this.f$0, activity, updateRequestCode, (powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "create<UpdateState> {\n            val manager = AppUpdateManagerFactory.create(activity)\n            manager.appUpdateInfo.addOnSuccessListener { updateInfo ->\n\n                println(\"********AppUpdateInfo*******\")\n\n                if (updateInfo.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) {\n                    debug(\"AppUpdateInfo: in progress\")\n                    it.onSuccess(UpdateState.Running(updateInfo))\n                } else if (updateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) {\n                    if (updateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)) {\n                        debug(\"App update is available\")\n                        it.onSuccess(UpdateState.Available(updateInfo))\n                    } else {\n                        debug(\"App update type not immediate, report not available\")\n                        it.onSuccess(UpdateState.NotAvailable())\n                    }\n                } else {\n                    debug(\"App update not available\")\n                    it.onSuccess(UpdateState.NotAvailable())\n                }\n\n\n            }.addOnFailureListener { it.printStackTrace() }\n        }.flatMap {\n            if (it is UpdateState.Running)\n                startUpdate(activity, it.updateInfo!!, updateRequestCode).toSingleDefault(it)\n            else Single.just(it)\n        }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResume$lambda-3, reason: not valid java name */
    public static final void m1630onResume$lambda3(android.app.Activity activity, final powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController this$0, final io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.google.android.play.core.appupdate.AppUpdateManagerFactory.create(activity).getAppUpdateInfo().addOnSuccessListener(new com.google.android.play.core.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.main.appupdate.-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0
            @Override // com.google.android.play.core.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController.m1631onResume$lambda3$lambda1(this.f$0, it, (com.google.android.play.core.appupdate.AppUpdateInfo) obj);
            }
        }).addOnFailureListener(new com.google.android.play.core.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.main.appupdate.-$$Lambda$AppUpdateController$54t3krmJ2BUwMMBKDGOm4F5Vqsk
            @Override // com.google.android.play.core.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                exc.printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResume$lambda-3$lambda-1, reason: not valid java name */
    public static final void m1631onResume$lambda3$lambda1(powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController this$0, io.reactivex.SingleEmitter it, com.google.android.play.core.appupdate.AppUpdateInfo updateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        java.lang.System.out.println((java.lang.Object) "********AppUpdateInfo*******");
        if (updateInfo.updateAvailability() == 3) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "AppUpdateInfo: in progress", null, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(updateInfo, "updateInfo");
            it.onSuccess(new powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState.Running(updateInfo));
        } else {
            if (updateInfo.updateAvailability() == 2) {
                if (updateInfo.isUpdateTypeAllowed(1)) {
                    powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "App update is available", null, 2, null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(updateInfo, "updateInfo");
                    it.onSuccess(new powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState.Available(updateInfo));
                    return;
                } else {
                    powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "App update type not immediate, report not available", null, 2, null);
                    it.onSuccess(new powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState.NotAvailable());
                    return;
                }
            }
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "App update not available", null, 2, null);
            it.onSuccess(new powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState.NotAvailable());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResume$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m1633onResume$lambda4(powerwatch.matrix.com.pwgen2android.main.appupdate.AppUpdateController this$0, android.app.Activity activity, int i, powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState it) {
        io.reactivex.Single singleJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState.Running) {
            com.google.android.play.core.appupdate.AppUpdateInfo updateInfo = it.getUpdateInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNull(updateInfo);
            singleJust = this$0.startUpdate(activity, updateInfo, i).toSingleDefault(it);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "startUpdate(activity, it.updateInfo!!, updateRequestCode).toSingleDefault(it)");
        } else {
            singleJust = io.reactivex.Single.just(it);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "just(it)");
        }
        return singleJust;
    }
}
