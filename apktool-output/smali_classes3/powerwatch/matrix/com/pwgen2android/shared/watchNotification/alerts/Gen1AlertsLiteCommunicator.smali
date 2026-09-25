.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;
.super Ljava/lang/Object;
.source "AlertsLiteCommunicator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertsLiteCommunicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsLiteCommunicator.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1547#2:94\n1618#2,3:95\n*S KotlinDebug\n*F\n+ 1 AlertsLiteCommunicator.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator\n*L\n54#1:94\n54#1:95,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u0019\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J@\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010 \u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J(\u0010!\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\u0008\u0012\u0004\u0012\u00020$`%H\u0002J@\u0010&\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010\'\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010(\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010)\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010*\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u000e\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "alertsMessageFormatter",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;",
        "alarmsCommunicator",
        "alertsConfiguration",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;)V",
        "disableAlarm",
        "Lio/reactivex/Completable;",
        "deviceId",
        "",
        "enableAlarm",
        "alarm",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;",
        "initAlerts",
        "alertsConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;",
        "sendClearCallIconAlert",
        "uid",
        "",
        "title",
        "subTitle",
        "body",
        "postTime",
        "",
        "notificationTime",
        "sendClearMessageIconAlert",
        "sendImportantCallAlert",
        "sendImportantMessageAlert",
        "sendMessageToComm",
        "data",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "sendPreExistingCallAlert",
        "sendPreExistingMessageAlert",
        "sendSilentCallAlert",
        "sendSilentIncomingCallAlert",
        "sendSilentMessageAlert",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final alarmsCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;

.field private final alertsConfiguration:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

.field private final alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator$Companion;

    .line 89
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsMessageFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmsCommunicator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsConfiguration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 38
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    .line 39
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alarmsCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;

    .line 40
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsConfiguration:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 38
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;-><init>()V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 39
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

    invoke-direct {p3, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 40
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;

    invoke-direct {p4, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

    .line 37
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;)V

    return-void
.end method

.method private final sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "[B>;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 54
    check-cast p2, Ljava/lang/Iterable;

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 95
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 96
    check-cast v2, [B

    .line 54
    invoke-static {v2}, Lkotlin/collections/ArraysKt;->toMutableList([B)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 97
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 94
    check-cast v1, Ljava/util/Collection;

    .line 54
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toByteArray(Ljava/util/Collection;)[B

    move-result-object p2

    .line 53
    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicatorKt;->createMessage(Ljava/lang/String;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p1

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public disableAlarm(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alarmsCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;->disableAlarm(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public enableAlarm(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alarmsCommunicator:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;->enableAlarm(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public initAlerts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsConfiguration:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;->initAlerts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendClearCallIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "title"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "subTitle"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "body"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->clearCallIcon()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendClearMessageIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "title"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "subTitle"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "body"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->clearMessageIcon()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendImportantCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "title"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "subTitle"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "body"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-virtual {p2, p3, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->createIncomingCall(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendImportantMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "title"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "subTitle"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "body"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-virtual {p2, p3, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->createMessagePayload(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendPreExistingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "subTitle"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "body"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "An operation is not implemented: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "not implemented"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public sendPreExistingMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "subTitle"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "body"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "An operation is not implemented: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "not implemented"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public sendSilentCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "title"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "subTitle"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "body"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-virtual {p2, p3, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->createMissedCall(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sendSilentIncomingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "subTitle"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "body"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "An operation is not implemented: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "Not yet implemented"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public sendSilentMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
    .locals 0

    const-string p2, "deviceId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "title"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "subTitle"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "body"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->alertsMessageFormatter:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;

    invoke-virtual {p2, p3, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;->createMissedMessagePayload(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;->sendMessageToComm(Ljava/lang/String;Ljava/util/ArrayList;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
