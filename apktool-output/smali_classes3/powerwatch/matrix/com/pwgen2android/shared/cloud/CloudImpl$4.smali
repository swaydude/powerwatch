.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl$4;
.super Lkotlin/jvm/internal/Lambda;
.source "Cloud.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl$4;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 318
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl$4;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 319
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl$4;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->access$getTokenRequestSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
