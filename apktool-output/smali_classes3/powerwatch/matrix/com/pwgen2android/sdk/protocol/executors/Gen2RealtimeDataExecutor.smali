.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;
.super Ljava/lang/Object;
.source "Gen2RealtimeDataExecutor.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u000c\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "settingsDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;)V",
        "parser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;",
        "readData",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
        "deviceID",
        "",
        "readSettingsData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
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

.field private final parser:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;

.field private final settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDataProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    .line 25
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->parser:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;

    return-void
.end method

.method public static synthetic lambda$5hONqitXIr48mZZhsNrdjhvwA0U(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Neukcr4SuPyg75wpLMy-M6iZk70(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$RWRxEhJW3JgNoYZlOXXf0YAoZPs(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$VOFeDjjKbOJES325gLuCjqBCLNc(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$lrRW15ylnRQSXQlTUwVoARyso6U(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V

    return-void
.end method

.method public static synthetic lambda$vAuqmX2UwQbNBXNCSOJGOnO7oGw(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$zSSa9mGV2LdCdfdjKaAJ-VV5q8I(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$zttXhlhIYM1Jd6IvTV6fbf9luDY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final readData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    const/4 v8, 0x0

    new-array v1, v8, [B

    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    .line 31
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SERIAL_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v7

    .line 30
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 33
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 30
    invoke-direct {v0, p1, v7, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    new-array p1, v8, [B

    .line 34
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final readData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    return-void
.end method

.method private static final readData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->parser:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractData([B)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method private static final readData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 1

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final readData$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readSettingsData(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$vAuqmX2UwQbNBXNCSOJGOnO7oGw;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$vAuqmX2UwQbNBXNCSOJGOnO7oGw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$lrRW15ylnRQSXQlTUwVoARyso6U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$lrRW15ylnRQSXQlTUwVoARyso6U;

    .line 56
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readData$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 1

    const-string v0, "$data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setSettingsData(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-object p0
.end method

.method private static final readData$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getSettingsData()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private final readSettingsData(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
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

.method public final readData(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$zttXhlhIYM1Jd6IvTV6fbf9luDY;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$zttXhlhIYM1Jd6IvTV6fbf9luDY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(deviceID, ProtocolMessage(ProtocolPayload(byteArrayOf()),\n                    messageType = ProtocolMessageType.GEN2_SERIAL_REQUEST),\n                    TechnologyType.BLE_COMMUNICATION,\n                    ProtocolType.GEN2_STANDARD_BASICS))\n                    .toSingleDefault(byteArrayOf())\n                    .toObservable()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object v1

    .line 39
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xa

    invoke-virtual {v1, v3, v4, v2}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$zSSa9mGV2LdCdfdjKaAJ-VV5q8I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$zSSa9mGV2LdCdfdjKaAJ-VV5q8I;

    .line 40
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$VOFeDjjKbOJES325gLuCjqBCLNc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$VOFeDjjKbOJES325gLuCjqBCLNc;

    .line 41
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 44
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$Neukcr4SuPyg75wpLMy-M6iZk70;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$Neukcr4SuPyg75wpLMy-M6iZk70;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v1

    .line 46
    invoke-virtual {v1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "communicator.messageOutput()\n                .timeout(10, TimeUnit.SECONDS)\n                .filter { it.protocolType == ProtocolType.GEN2_STANDARD_BASICS }\n                .doOnNext {\n//                    debug(\"Realtime data: ${it.protocolMessage.payload.data.formatToString()}\")\n                }\n                .map { parser.extractData(it.protocolMessage.payload.data) }\n                .firstOrError()\n                .toObservable()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    check-cast v1, Lio/reactivex/ObservableSource;

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$RWRxEhJW3JgNoYZlOXXf0YAoZPs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$RWRxEhJW3JgNoYZlOXXf0YAoZPs;

    invoke-static {v1, v0, v2}, Lio/reactivex/Observable;->zip(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 51
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$5hONqitXIr48mZZhsNrdjhvwA0U;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$5hONqitXIr48mZZhsNrdjhvwA0U;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "zip(responseObservable, requestObservable,\n                BiFunction<RealtimeWatchData, ByteArray, RealtimeWatchData> { response, _ -> response })\n                .flatMap { data ->\n                    readSettingsData(deviceID).map { settingsData ->\n                        data.apply {\n                            this.settingsData = settingsData\n                        }\n                    }.doOnNext {\n                        println(\"settings_data_load_new_exec: ${it?.settingsData?.homeScreen ?: -1}\")\n                    }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
