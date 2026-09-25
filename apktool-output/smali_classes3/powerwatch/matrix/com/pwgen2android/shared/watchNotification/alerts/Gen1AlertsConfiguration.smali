.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;
.super Ljava/lang/Object;
.source "AlertsConfiguration.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsConfiguration.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1547#2:66\n1618#2,3:67\n1783#2,3:70\n*S KotlinDebug\n*F\n+ 1 AlertsConfiguration.kt\npowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration\n*L\n29#1:66\n29#1:67,3\n31#1:70,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "convert",
        "",
        "set",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;",
        "createNotificationToSend",
        "",
        "value",
        "initAlerts",
        "Lio/reactivex/Completable;",
        "deviceId",
        "",
        "alertsConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;",
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
.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    return-void
.end method

.method private final convert(Ljava/util/Set;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;",
            ">;)I"
        }
    .end annotation

    .line 29
    check-cast p1, Ljava/lang/Iterable;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 67
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 68
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;

    .line 30
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 69
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 66
    check-cast v0, Ljava/lang/Iterable;

    const/4 p1, 0x0

    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    or-int/2addr p1, v1

    goto :goto_1

    :cond_1
    return p1
.end method

.method private final createNotificationToSend(I)[B
    .locals 5

    const/16 v0, 0x14

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 47
    aput-byte v1, v0, v2

    const/16 v2, 0x13

    if-le v3, v2, :cond_0

    const/4 v2, -0x1

    aput-byte v2, v0, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    aput-byte v4, v0, v3

    aput-byte v3, v0, v4

    const/4 v4, 0x3

    aput-byte v3, v0, v4

    const/4 v3, 0x4

    const/16 v4, 0xa

    aput-byte v4, v0, v3

    const/4 v3, 0x5

    aput-byte v1, v0, v3

    const/4 v3, 0x6

    aput-byte v1, v0, v3

    const/4 v1, 0x7

    aput-byte v2, v0, v1

    const/16 v1, 0x8

    aput-byte v2, v0, v1

    const/16 v1, 0x9

    aput-byte v2, v0, v1

    int-to-byte p1, p1

    aput-byte p1, v0, v4

    return-object v0

    :cond_0
    move v2, v3

    goto :goto_0
.end method


# virtual methods
.method public initAlerts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;->getMutableSet()Ljava/util/Set;

    move-result-object p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;->convert(Ljava/util/Set;)I

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;->createNotificationToSend(I)[B

    move-result-object p2

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicatorKt;->createMessage(Ljava/lang/String;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p1

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
