.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;
.source "Protocol.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0016J\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;",
        "characteristicTypeMap",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
        "",
        "bleProtocolParser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
        "(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V",
        "getType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "sendMessage",
        "Lio/reactivex/Single;",
        "message",
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
.field private final characteristicTypeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
            "Ljava/lang/String;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
            ")V"
        }
    .end annotation

    const-string v0, "characteristicTypeMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleProtocolParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    .line 127
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->characteristicTypeMap:Ljava/util/Map;

    return-void
.end method

.method public static synthetic lambda$GpvI53ve8y0x1pOvXT244Bkaq_0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->sendMessage$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$SY6Er7MK-fjPiUWKDLH8lmmz-KE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->sendMessage$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method

.method public static synthetic lambda$Tc-22GvZKhjsppozQkkgy4DP6vA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Ljava/lang/String;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->sendMessage$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Ljava/lang/String;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$iXfTC4_wDwMoTvC-rfc1XRbj4Gg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->sendMessage$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sVTTf2TliOM5ukzKOXiuYLBpuFU(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->sendMessage$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method

.method private static final sendMessage$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Sending message to parser"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final sendMessage$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Ljava/lang/String;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getMessageType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 141
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->characteristicTypeMap:Ljava/util/Map;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SETTINGS_INFO:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    .line 142
    :cond_0
    new-instance p0, Lkotlin/NotImplementedError;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "An operation is not implemented: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Unsupported type"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 140
    :cond_1
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->characteristicTypeMap:Ljava/util/Map;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SERIAL:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    .line 139
    :cond_2
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->characteristicTypeMap:Ljava/util/Map;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->FIRMWARE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    :goto_0
    return-object p0
.end method

.method private static final sendMessage$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Ljava/lang/String;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->read(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p2

    .line 148
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$GpvI53ve8y0x1pOvXT244Bkaq_0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$GpvI53ve8y0x1pOvXT244Bkaq_0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    .line 149
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$sVTTf2TliOM5ukzKOXiuYLBpuFU;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$sVTTf2TliOM5ukzKOXiuYLBpuFU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final sendMessage$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-direct {v0, v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    return-object v0
.end method

.method private static final sendMessage$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 1

    const-string v0, "$message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getMessageType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SETTINGS_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    if-ne p0, v0, :cond_0

    .line 151
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString([BZ)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Received settings: "

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 130
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ">;"
        }
    .end annotation

    .line 158
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Calling messageOutput, but channel is not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "error(Throwable(\"Calling messageOutput, but channel is not initialized!\"))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 159
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "complete().toObservable()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ">;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "Calling sendMessage, but channel is not initialized!"

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "error(Throwable(\"Calling sendMessage, but channel is not initialized!\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 135
    :cond_0
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 136
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$SY6Er7MK-fjPiUWKDLH8lmmz-KE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$SY6Er7MK-fjPiUWKDLH8lmmz-KE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 137
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$iXfTC4_wDwMoTvC-rfc1XRbj4Gg;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$iXfTC4_wDwMoTvC-rfc1XRbj4Gg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 146
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$Tc-22GvZKhjsppozQkkgy4DP6vA;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$Tc-22GvZKhjsppozQkkgy4DP6vA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "just(message)\n                .doOnSuccess { Log.d(javaClass.simpleName, \"Sending message to parser\") }\n                .map {\n                    when (it.messageType) {\n                        ProtocolMessageType.GEN2_FIRMWARE_REQUEST -> characteristicTypeMap[CharacteristicType.FIRMWARE]\n                        ProtocolMessageType.GEN2_SERIAL_REQUEST -> characteristicTypeMap[CharacteristicType.SERIAL]\n                        ProtocolMessageType.GEN2_SETTINGS_REQUEST -> characteristicTypeMap[CharacteristicType.SETTINGS_INFO]\n                        else -> TODO(\"Unsupported type\")\n                    }\n\n                }\n                .flatMap {\n                    channel!!.read(it)\n                            .map { message -> ProtocolMessage(ProtocolPayload(message), type = getType(), messageType = ProtocolMessageType.RESPONSE) }\n                            .doOnSuccess {\n                                if (message.messageType == ProtocolMessageType.GEN2_SETTINGS_REQUEST){\n                                    println(\"Received settings: ${it.payload.data.formatToString(false)}\")\n                                }\n                            }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
