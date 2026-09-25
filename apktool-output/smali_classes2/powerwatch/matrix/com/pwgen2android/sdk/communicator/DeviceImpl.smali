.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;
.super Ljava/lang/Object;
.source "Device.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device.kt\npowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1849#2,2:134\n1741#2,3:137\n1849#2,2:140\n286#2,2:142\n1#3:136\n*S KotlinDebug\n*F\n+ 1 Device.kt\npowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl\n*L\n51#1:134,2\n60#1:137,3\n111#1:140,2\n96#1:142,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u000e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001bH\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "accessory",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V",
        "getAccessory",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "setAccessory",
        "connections",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "deviceInfoSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "messageOutputSubject",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "kotlin.jvm.PlatformType",
        "addConnection",
        "",
        "connection",
        "attachOutput",
        "connectionToAttach",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "refresh",
        "removeConnections",
        "resubscribeCharacteristics",
        "Lio/reactivex/Completable;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "sendMessage",
        "message",
        "updateInfo",
        "updateWithAccessory",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

.field private final connections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;"
        }
    .end annotation
.end field

.field private deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field private final deviceInfoSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final messageOutputSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$Companion;

    .line 35
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 11

    const-string v0, "accessory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    .line 38
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 40
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfoSubject:Lio/reactivex/subjects/PublishSubject;

    .line 41
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<CommunicationMessage>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->messageOutputSubject:Lio/reactivex/subjects/PublishSubject;

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    .line 46
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device created with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connection count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getConnections()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xff

    const/4 v10, 0x0

    invoke-static/range {v0 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 50
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getConnections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 134
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 52
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->addConnection(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)V

    .line 53
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->attachOutput(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)V

    goto :goto_0

    .line 55
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfoSubject:Lio/reactivex/subjects/PublishSubject;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private final addConnection(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)V
    .locals 7

    .line 59
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v1

    const-string v2, "Adding new connection, type: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 137
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    .line 138
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 61
    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v5

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v6

    if-ne v5, v6, :cond_3

    .line 62
    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v1

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v5

    if-ne v1, v5, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    :goto_1
    if-eqz v3, :cond_4

    return-void

    .line 65
    :cond_4
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object v0

    .line 67
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object p1

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final attachOutput(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)V
    .locals 4

    .line 71
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v1

    const-string v2, "Subscribing to connection: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 74
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->messageOutput()Lio/reactivex/Observable;

    move-result-object p1

    .line 75
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$gZKNY38XlkieKhWH1yT0TFikyv0;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$gZKNY38XlkieKhWH1yT0TFikyv0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$D6fmMHcxHh-k-Pc6UizQlhA_vZw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$D6fmMHcxHh-k-Pc6UizQlhA_vZw;

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final attachOutput$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->messageOutputSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final attachOutput$lambda-4(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$6pRlsX6pzvHJnK3A5-FUBb3niVU(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->messageOutput$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$D6fmMHcxHh-k-Pc6UizQlhA_vZw(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->attachOutput$lambda-4(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$VEyiaCb2CrfxrY6QqwjinMyiQuI(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->sendMessage$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$gZKNY38XlkieKhWH1yT0TFikyv0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->attachOutput$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method private static final messageOutput$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->setUid(Ljava/lang/String;)V

    return-object p1
.end method

.method private final removeConnections(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 4

    .line 122
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v1

    const-string v2, "Removing connections from accessory, type: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object v0

    .line 127
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$2;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 130
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method private static final sendMessage$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    .line 142
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 97
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v4

    if-ne v3, v4, :cond_1

    .line 98
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v3

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 96
    :goto_1
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    if-nez v0, :cond_3

    goto :goto_2

    .line 100
    :cond_3
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object v1

    :goto_2
    if-nez v1, :cond_4

    new-instance p0, Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    invoke-static {p0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_3

    :cond_4
    move-object p0, v1

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_3
    return-object p0
.end method


# virtual methods
.method public deviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object v0
.end method

.method public final getAccessory()Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 24
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->messageOutputSubject:Lio/reactivex/subjects/PublishSubject;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$6pRlsX6pzvHJnK3A5-FUBb3niVU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$6pRlsX6pzvHJnK3A5-FUBb3niVU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "messageOutputSubject.map {\n                it.uid = deviceInfo.uid\n                it\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public refresh()V
    .locals 1

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->refresh()V

    :goto_0
    return-void
.end method

.method public resubscribeCharacteristics(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Completable;
    .locals 4

    const-string v0, "protocolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->connections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v3

    if-ne v3, p1, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->resubscribeCharacteristics()Lio/reactivex/Completable;

    move-result-object v2

    :goto_2
    if-nez v2, :cond_4

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v2

    const-string p1, "complete()"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    return-object v2
.end method

.method public sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n            val resultConnection = this.connections\n                    .firstOrNull {\n                        it.connectionInfo.protocolType == message.protocolType\n                                && it.connectionInfo.technologyType == message.technologyType\n                    }\n            resultConnection?.sendMessage(message) ?: Completable.error(Throwable())\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setAccessory(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    return-void
.end method

.method public updateInfo()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfoSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public updateWithAccessory(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 12

    const-string v0, "accessory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xff

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 107
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getHasConnections()Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->removeConnections(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    goto :goto_1

    .line 110
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getConnections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 112
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->addConnection(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)V

    .line 113
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->attachOutput(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)V

    goto :goto_0

    .line 117
    :cond_1
    :goto_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfoSubject:Lio/reactivex/subjects/PublishSubject;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
