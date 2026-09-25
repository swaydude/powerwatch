.class public final Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;
.super Ljava/lang/Object;
.source "AppUpdateController.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "onResume",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;",
        "activity",
        "Landroid/app/Activity;",
        "updateRequestCode",
        "",
        "startUpdate",
        "Lio/reactivex/Completable;",
        "activityContext",
        "updateInfo",
        "Lcom/google/android/play/core/appupdate/AppUpdateInfo;",
        "requestCode",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$-fwA-h7S9MPn3ZYJBp5J-i53Su0(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->onResume$lambda-3(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$54t3krmJ2BUwMMBKDGOm4F5Vqsk(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->onResume$lambda-3$lambda-2(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$JyVN1AOGpAG1081_SpHiZkSxCI8(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Landroid/app/Activity;ILpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->onResume$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Landroid/app/Activity;ILpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Mqn0avduCUZrXfjB1BOiNAoQ4p0(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->onResume$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V

    return-void
.end method

.method public static synthetic lambda$_FNOA9D3H2tafMlbE-yDB8UjVv0(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->startUpdate$lambda-0(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method private static final onResume$lambda-3(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "$activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/google/android/play/core/appupdate/AppUpdateManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/appupdate/AppUpdateManager;

    move-result-object p0

    .line 41
    invoke-interface {p0}, Lcom/google/android/play/core/appupdate/AppUpdateManager;->getAppUpdateInfo()Lcom/google/android/play/core/tasks/Task;

    move-result-object p0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;

    invoke-direct {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;)V

    invoke-virtual {p0, v0}, Lcom/google/android/play/core/tasks/Task;->addOnSuccessListener(Lcom/google/android/play/core/tasks/OnSuccessListener;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$54t3krmJ2BUwMMBKDGOm4F5Vqsk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$54t3krmJ2BUwMMBKDGOm4F5Vqsk;

    .line 62
    invoke-virtual {p0, p1}, Lcom/google/android/play/core/tasks/Task;->addOnFailureListener(Lcom/google/android/play/core/tasks/OnFailureListener;)Lcom/google/android/play/core/tasks/Task;

    return-void
.end method

.method private static final onResume$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "********AppUpdateInfo*******"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 45
    invoke-virtual {p2}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->updateAvailability()I

    move-result v0

    const-string v1, "updateInfo"

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-ne v0, v4, :cond_0

    .line 46
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "AppUpdateInfo: in progress"

    invoke-static {p0, v0, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 47
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;-><init>(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V

    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p2}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->updateAvailability()I

    move-result v0

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    .line 49
    invoke-virtual {p2, v0}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->isUpdateTypeAllowed(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "App update is available"

    invoke-static {p0, v0, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 51
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Available;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Available;-><init>(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V

    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 53
    :cond_1
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "App update type not immediate, report not available"

    invoke-static {p0, p2, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 54
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;-><init>()V

    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 57
    :cond_2
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "App update not available"

    invoke-static {p0, p2, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;-><init>()V

    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final onResume$lambda-3$lambda-2(Ljava/lang/Exception;)V
    .locals 0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private static final onResume$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Landroid/app/Activity;ILpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;->getUpdateInfo()Lcom/google/android/play/core/appupdate/AppUpdateInfo;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->startUpdate(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;I)Lio/reactivex/Completable;

    move-result-object p0

    invoke-virtual {p0, p3}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    const-string p1, "startUpdate(activity, it.updateInfo!!, updateRequestCode).toSingleDefault(it)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 66
    :cond_0
    invoke-static {p3}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    const-string p1, "just(it)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final startUpdate$lambda-0(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILio/reactivex/CompletableEmitter;)V
    .locals 2

    const-string v0, "$activityContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "AppUpdateInfo: Starting update"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 28
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/play/core/appupdate/AppUpdateManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/appupdate/AppUpdateManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 29
    invoke-interface {v0, p1, v1, p0, p2}, Lcom/google/android/play/core/appupdate/AppUpdateManager;->startUpdateFlowForResult(Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILandroid/app/Activity;I)Z

    .line 34
    invoke-interface {p3}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 23
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final onResume(Landroid/app/Activity;I)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "I)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;",
            ">;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$-fwA-h7S9MPn3ZYJBp5J-i53Su0;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$-fwA-h7S9MPn3ZYJBp5J-i53Su0;-><init>(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    .line 63
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;

    invoke-direct {v1, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Landroid/app/Activity;I)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "create<UpdateState> {\n            val manager = AppUpdateManagerFactory.create(activity)\n            manager.appUpdateInfo.addOnSuccessListener { updateInfo ->\n\n                println(\"********AppUpdateInfo*******\")\n\n                if (updateInfo.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) {\n                    debug(\"AppUpdateInfo: in progress\")\n                    it.onSuccess(UpdateState.Running(updateInfo))\n                } else if (updateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) {\n                    if (updateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)) {\n                        debug(\"App update is available\")\n                        it.onSuccess(UpdateState.Available(updateInfo))\n                    } else {\n                        debug(\"App update type not immediate, report not available\")\n                        it.onSuccess(UpdateState.NotAvailable())\n                    }\n                } else {\n                    debug(\"App update not available\")\n                    it.onSuccess(UpdateState.NotAvailable())\n                }\n\n\n            }.addOnFailureListener { it.printStackTrace() }\n        }.flatMap {\n            if (it is UpdateState.Running)\n                startUpdate(activity, it.updateInfo!!, updateRequestCode).toSingleDefault(it)\n            else Single.just(it)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final startUpdate(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;I)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;-><init>(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;I)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create {\n            println(\"AppUpdateInfo: Starting update\")\n            val manager = AppUpdateManagerFactory.create(activityContext)\n            manager.startUpdateFlowForResult(\n                    updateInfo,\n                    AppUpdateType.IMMEDIATE,\n                    activityContext,\n                    requestCode)\n            it.onComplete()\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
