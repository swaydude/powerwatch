.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;
.super Ljava/lang/Object;
.source "Commands.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0008H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
        "()V",
        "dataFormatter",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;",
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
.field private final dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;->dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;

    return-void
.end method


# virtual methods
.method public extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F
    .locals 0

    .line 171
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F

    move-result p1

    return p1
.end method

.method public getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    .line 171
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getCommandType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 171
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSendingData()[B
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 176
    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x7ct
        0x10t
    .end array-data
.end method

.method public parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "dataToParse"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dataInfo"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    new-instance v2, Ljava/lang/String;

    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 183
    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v4, "Running: "

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v1, v4, v5, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v4, "#QT:Q,0"

    const/4 v7, 0x1

    .line 184
    invoke-static {v2, v4, v7}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 185
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    const-string v2, ","

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 186
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x6

    if-lt v4, v7, :cond_0

    .line 187
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v7, 0x3

    .line 188
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Ljava/lang/String;

    const/4 v7, 0x5

    .line 189
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    const-string v2, "Returning true"

    .line 190
    invoke-static {v1, v2, v5, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 192
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 193
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v8

    const/4 v9, 0x0

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;->dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;

    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v7, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v4, v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const-string v6, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;->formatFwVersion([B)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x31

    const/16 v16, 0x0

    invoke-static/range {v8 .. v16}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1f8

    const/16 v25, 0x0

    move-object v13, v1

    move v14, v2

    move v15, v5

    .line 192
    invoke-direct/range {v13 .. v25}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;-><init>(ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    const-string v2, "Returning false"

    .line 198
    invoke-static {v1, v2, v5, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x1fd

    const/4 v15, 0x0

    move-object/from16 v3, p2

    .line 200
    invoke-static/range {v3 .. v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v1

    return-object v1
.end method

.method public printCommandId()Ljava/lang/String;
    .locals 1

    .line 171
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->printCommandId(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
