.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;
.super Ljava/lang/Object;
.source "SettingsDataProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;",
        "",
        "settingsDataRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "settingDataParser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;",
        "loadSettingsFromWatch",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "deviceID",
        "",
        "loadStoredSettings",
        "observe",
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

.field private final settingDataParser:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;

.field private final settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "settingsDataRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 18
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingDataParser:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;

    return-void
.end method

.method public static synthetic lambda$16ZSxsVVqwWwCmGnZY-i6RDvXWo(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$2W1bqYZEZihZs4vU-2b38SZAY98(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$5916lOi4WvjN9qj4OyEvm3f3Atw(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$O41941bYPn_IzgH4JYu9RgstWEk(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method public static synthetic lambda$R6z-TUx1WxflLnpR3LqNjpVwf_c(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$fEyjpOnZ-HyumEcPMWYqIQx9Si4(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadSettingsFromWatch$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final loadSettingsFromWatch$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    const/4 v8, 0x0

    new-array v1, v8, [B

    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    .line 27
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SETTINGS_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v7

    .line 26
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 29
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 26
    invoke-direct {v0, p1, v7, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    new-array p1, v8, [B

    .line 30
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadSettingsFromWatch$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
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

.method private static final loadSettingsFromWatch$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    return-void
.end method

.method private static final loadSettingsFromWatch$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingDataParser:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;->extractData([B)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p0

    return-object p0
.end method

.method private static final loadSettingsFromWatch$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->loadSettings(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object v0

    const/4 v1, -0x1

    if-nez p2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getHomeScreen()I

    move-result v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getHomeScreen()I

    move-result v1

    :goto_1
    .line 46
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->saveSettings(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    :cond_2
    return-void
.end method

.method private static final loadSettingsFromWatch$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 1

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final loadSettingsFromWatch(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 5
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

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(deviceID, ProtocolMessage(ProtocolPayload(byteArrayOf()),\n                    messageType = ProtocolMessageType.GEN2_SETTINGS_REQUEST),\n                    TechnologyType.BLE_COMMUNICATION,\n                    ProtocolType.GEN2_STANDARD_BASICS))\n                    .toSingleDefault(byteArrayOf())\n                    .toObservable()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object v1

    .line 35
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xa

    invoke-virtual {v1, v3, v4, v2}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$2W1bqYZEZihZs4vU-2b38SZAY98;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$2W1bqYZEZihZs4vU-2b38SZAY98;

    .line 36
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;

    .line 37
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 40
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$16ZSxsVVqwWwCmGnZY-i6RDvXWo;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$16ZSxsVVqwWwCmGnZY-i6RDvXWo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 41
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string v1, "communicator.messageOutput()\n                .timeout(10, TimeUnit.SECONDS)\n                .filter { it.protocolType == ProtocolType.GEN2_STANDARD_BASICS }\n                .doOnNext {\n//                    debug(\"Realtime data: ${it.protocolMessage.payload.data.formatToString()}\")\n                }\n                .map { settingDataParser.extractData(it.protocolMessage.payload.data) }\n                .doOnNext {\n                    val old = settingsDataRepository.loadSettings(deviceID)\n                    println(\"settings_data_load_new: ${it?.homeScreen ?: -1}\")\n                    println(\"settings_data_load_old: ${old?.homeScreen ?: -1}\")\n\n                    if (old != it) settingsDataRepository.saveSettings(deviceID, it)\n                }\n                .firstOrError()\n                .toObservable()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    check-cast p1, Lio/reactivex/ObservableSource;

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$5916lOi4WvjN9qj4OyEvm3f3Atw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$5916lOi4WvjN9qj4OyEvm3f3Atw;

    invoke-static {p1, v0, v1}, Lio/reactivex/Observable;->zip(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "zip(responseObservable, requestObservable,\n                BiFunction<SettingsData, ByteArray, SettingsData> { response, _ -> response })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final loadStoredSettings(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 1

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->loadSettings(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p1

    return-object p1
.end method

.method public final observe()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->listen()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
