.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;
.super Ljava/lang/Object;
.source "Commands.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
        "()V",
        "dataFormatter",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;",
        "getCommandType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;",
        "getSendingData",
        "",
        "parseReceivedData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "dataToParse",
        "dataInfo",
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
.field private final dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 686
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 688
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;->dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;

    return-void
.end method


# virtual methods
.method public extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F
    .locals 0

    .line 686
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F

    move-result p1

    return p1
.end method

.method public getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    .line 695
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_FIRMWARE_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 686
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSendingData()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 5

    const-string v0, "dataToParse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 699
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString([BZ)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Parsing firmware info data: "

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 700
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;->dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;->extractFirmwareInfo([B)Lkotlin/Pair;

    move-result-object p1

    .line 701
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->setFirmwareVersion(Ljava/lang/String;)V

    .line 702
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v0

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->setDisTableVersion(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;)V

    .line 703
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->setPid(I)V

    .line 704
    invoke-virtual {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    const/4 p1, 0x0

    .line 705
    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    return-object p2
.end method

.method public printCommandId()Ljava/lang/String;
    .locals 1

    .line 686
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->printCommandId(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
