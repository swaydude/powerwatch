.class public final Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;
.super Ljava/lang/Object;
.source "OTAExecutor.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOTAExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTAExecutor.kt\npowerwatch/matrix/com/pwgen2android/main/OTAExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1741#2,3:148\n286#2,2:151\n1741#2,3:153\n*S KotlinDebug\n*F\n+ 1 OTAExecutor.kt\npowerwatch/matrix/com/pwgen2android/main/OTAExecutor\n*L\n80#1:148,3\n96#1:151,2\n121#1:153,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\t\u001a\u00020\nJ\u0008\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J2\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u0002J(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "otaCallback",
        "powerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;",
        "otaProgress",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;",
        "power",
        "",
        "getPower",
        "()F",
        "setPower",
        "(F)V",
        "service",
        "Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;",
        "executeOTA",
        "Lio/reactivex/Observable;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "data",
        "",
        "releaseResources",
        "",
        "sendGen1OTA",
        "Lio/reactivex/Completable;",
        "sendGen2OTA",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;",
        "startOtaProcess",
        "deviceId",
        "",
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


# instance fields
.field private final otaCallback:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

.field private otaProgress:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;",
            ">;"
        }
    .end annotation
.end field

.field private power:F

.field private final service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<OTAProgressData>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaProgress:Lio/reactivex/subjects/PublishSubject;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 27
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->power:F

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaCallback:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

    return-void
.end method

.method public static final synthetic access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 23
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaProgress:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static final synthetic access$getService$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;
    .locals 0

    .line 23
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    return-object p0
.end method

.method public static final synthetic access$releaseResources(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->releaseResources()V

    return-void
.end method

.method public static final synthetic access$setOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lio/reactivex/subjects/PublishSubject;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaProgress:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public static synthetic executeOTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BFILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/high16 p4, 0x3f800000    # 1.0f

    .line 76
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->executeOTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final executeOTA$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/ObservableSource;
    .locals 7

    const-string v0, "$deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;-><init>()V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 80
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 148
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 149
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 80
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne v1, v4, :cond_4

    const/4 v1, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    :goto_1
    if-eqz v2, :cond_5

    .line 81
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaCallback:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;

    move-object v1, p1

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen2OTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/Completable;

    move-result-object p0

    goto :goto_2

    .line 83
    :cond_5
    invoke-direct {p1, p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)Lio/reactivex/Completable;

    move-result-object p0

    .line 84
    :goto_2
    iget-object p2, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaProgress:Lio/reactivex/subjects/PublishSubject;

    check-cast p2, Lio/reactivex/ObservableSource;

    invoke-virtual {p0, p2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    .line 85
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$p2v2zZm8yi1S1rakOFqoGuDBXpI;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$p2v2zZm8yi1S1rakOFqoGuDBXpI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Observable;->doOnTerminate(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final executeOTA$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->releaseResources()V

    return-void
.end method

.method public static synthetic lambda$CkltSTqUhIXJaMuNDqsB7sHka1Y(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EhUd5qyom6jK5EqohK9sZ6pM_QQ(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;[B)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;[B)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$GIxjZDihcxvmShuQHop5adXfASU(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$NvO897UdTdfmxT8a5rPDHP2XXww(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Xea7oL57tPY03GqlCw_XyeJgafY(Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;FLpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen2OTA$lambda-15(Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;FLpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$ZwsswIRzPLS2ePdRgGcV_p41XD8(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$j6dQZ1oljgepFbqxHT4IgsZQ-bs(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->executeOTA$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mpsaXNvl3KoXiLlAwjY9FPoHAh0(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    return-void
.end method

.method public static synthetic lambda$nXR1dDU49bZbmlE4OLfZNBkYI0k(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-14$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$o1db-CZiAg6_NlMIpsL7yF0U71k(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-14$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$p2v2zZm8yi1S1rakOFqoGuDBXpI(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->executeOTA$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    return-void
.end method

.method public static synthetic lambda$qv1kPUy8wRjl_DhUGaoWsJ4_KHI(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$z5hWM9TgIZsA-0bboyb024OIjbc(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen1OTA$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method private final releaseResources()V
    .locals 1

    .line 71
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->dispose()V

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->amOtaStop()V

    return-void
.end method

.method private final sendGen1OTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)Lio/reactivex/Completable;
    .locals 2

    .line 94
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$qv1kPUy8wRjl_DhUGaoWsJ4_KHI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$qv1kPUy8wRjl_DhUGaoWsJ4_KHI;

    .line 95
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$CkltSTqUhIXJaMuNDqsB7sHka1Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$CkltSTqUhIXJaMuNDqsB7sHka1Y;

    .line 102
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 103
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$mpsaXNvl3KoXiLlAwjY9FPoHAh0;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$mpsaXNvl3KoXiLlAwjY9FPoHAh0;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 105
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$NvO897UdTdfmxT8a5rPDHP2XXww;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$NvO897UdTdfmxT8a5rPDHP2XXww;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 110
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$GIxjZDihcxvmShuQHop5adXfASU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$GIxjZDihcxvmShuQHop5adXfASU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 111
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;

    invoke-direct {v1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 118
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;

    invoke-direct {v0, p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "just(deviceInfo)\n                .flatMap { info ->\n                    val connectionInfo = info.connectionInfos.firstOrNull { it.protocolType == ProtocolType.BLE_DTP || it.protocolType == ProtocolType.BLE_DTP_X }\n                    if (connectionInfo == null) Observable.error(Exception(\"Error! No DTP service found on gen1 device\"))\n                    else {\n                        Observable.just(connectionInfo)\n                    }\n                }\n                .map { it.protocolType }\n                .doOnNext { otaCallback.connectingToDevice() }\n\n                .flatMap {\n                    Observable.just(CommunicationMessage(deviceInfo.uid, ProtocolMessage(ProtocolPayload(\n                            byteArrayOf(0x81.toByte(), 0x0F, 0x04, 0x00, 0x82.toByte()))), TechnologyType.BLE_COMMUNICATION, it))\n                            .delay(7, TimeUnit.SECONDS)\n                }\n                .doOnNext { debug(\"Sending command: ${it.protocolMessage.payload.data.formatToString()}\") }\n                .flatMap {\n                    communicator.sendMessage(it)\n                            .toSingleDefault(data)\n                            .toObservable()\n                            .delay(5, TimeUnit.SECONDS)\n\n                }\n                .flatMap { fileData ->\n                    communicator.connectedDevicesChange()\n                            .filter { it.uid == deviceInfo.uid }\n                            .filter { device -> device.connectionInfos.any { it.protocolType == ProtocolType.BLE_OTA } }\n                            .take(1)\n                            .timeout(45, TimeUnit.SECONDS)\n                            .doOnNext {\n                                otaCallback.otaStarted()\n                                startOtaProcess(it.uid, otaCallback, communicator, fileData)\n                            }\n                }\n                .ignoreElements()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final sendGen1OTA$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;[B)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "$communicator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevicesChange()Lio/reactivex/Observable;

    move-result-object v0

    .line 120
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$nXR1dDU49bZbmlE4OLfZNBkYI0k;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$nXR1dDU49bZbmlE4OLfZNBkYI0k;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;

    .line 121
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1

    .line 122
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object p1

    .line 123
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2d

    invoke-virtual {p1, v1, v2, v0}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    .line 124
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;

    invoke-direct {v0, p2, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendGen1OTA$lambda-14$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "$deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final sendGen1OTA$lambda-14$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 4

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 153
    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    .line 154
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 121
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v0

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    :goto_1
    return v1
.end method

.method private static final sendGen1OTA$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$fileData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaCallback:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->otaStarted()V

    .line 126
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaCallback:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;

    invoke-direct {p0, p3, v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->startOtaProcess(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V

    return-void
.end method

.method private static final sendGen1OTA$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 4

    const-string v0, "info"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 151
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 96
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    if-nez v0, :cond_4

    .line 97
    new-instance p0, Ljava/lang/Exception;

    const-string v0, "Error! No DTP service found on gen1 device"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_3

    .line 99
    :cond_4
    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_3
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendGen1OTA$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p0

    return-object p0
.end method

.method private static final sendGen1OTA$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->otaCallback:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->connectingToDevice()V

    return-void
.end method

.method private static final sendGen1OTA$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;
    .locals 8

    const-string v0, "$deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p0

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    const/4 v1, 0x5

    new-array v1, v1, [B

    .line 107
    fill-array-data v1, :array_0

    .line 106
    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 106
    invoke-direct {v0, p0, v7, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    .line 108
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x7

    invoke-virtual {p0, v0, v1, p1}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    nop

    :array_0
    .array-data 1
        -0x7ft
        0xft
        0x4t
        0x0t
        -0x7et
    .end array-data
.end method

.method private static final sendGen1OTA$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Sending command: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p0, p1, v2, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sendGen1OTA$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "$communicator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-interface {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    .line 113
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 114
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    .line 115
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x5

    invoke-virtual {p0, v0, v1, p1}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private final sendGen2OTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/Completable;
    .locals 8

    .line 134
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;

    move-object v0, v7

    move-object v1, p2

    move v2, p5

    move-object v3, p0

    move-object v4, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;FLpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V

    invoke-static {v7}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create {\n            otaCallback.phasePower = power\n            startOtaProcess(deviceInfo.uid, otaCallback, communicator, data)\n            it.onComplete()\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic sendGen2OTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BFILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/high16 p5, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    move v5, p5

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 133
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->sendGen2OTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method

.method private static final sendGen2OTA$lambda-15(Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;FLpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "$otaCallback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$communicator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;->setPhasePower(F)V

    .line 136
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0, p4, p5}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->startOtaProcess(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V

    .line 137
    invoke-interface {p6}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private final startOtaProcess(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V
    .locals 2

    .line 142
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;

    invoke-direct {v0, p3}, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    .line 143
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;

    invoke-virtual {p3, v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->registerToOTA(Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;)V

    .line 144
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->service:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    check-cast v1, Ljava/io/InputStream;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    invoke-virtual {p3, v1, v0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->amOtaStart(Ljava/io/InputStream;Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    return-void
.end method


# virtual methods
.method public final executeOTA(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
            "[BF)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p0

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "defer {\n            if (!deviceInfo.isConnected) return@defer Observable.error<OTAProgressData>(OTAError.DeviceNotConnected())\n\n            return@defer if (deviceInfo.connectionInfos.any { it.protocolType == ProtocolType.BLE_OTA }) { //gen2 has OTA service all the time\n                sendGen2OTA(deviceInfo, otaCallback, communicator, data, power)\n            } else {\n                sendGen1OTA(deviceInfo, communicator, data)\n            }.andThen(otaProgress)\n                    .doOnTerminate {\n                        releaseResources()\n                    }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 23
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getPower()F
    .locals 1

    .line 27
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->power:F

    return v0
.end method

.method public final setPower(F)V
    .locals 0

    .line 27
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->power:F

    return-void
.end method
