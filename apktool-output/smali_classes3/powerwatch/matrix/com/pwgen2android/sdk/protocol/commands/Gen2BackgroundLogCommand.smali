.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "Gen2BackgroundLogCommand.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen2BackgroundLogCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen2BackgroundLogCommand.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,238:1\n1557#2:239\n1588#2,4:240\n1849#2,2:244\n1475#2:246\n1500#2,3:247\n1503#2,3:257\n1858#2,3:261\n355#3,7:250\n211#4:260\n212#4:264\n*S KotlinDebug\n*F\n+ 1 Gen2BackgroundLogCommand.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand\n*L\n74#1:239\n74#1:240,4\n119#1:244,2\n123#1:246\n123#1:247,3\n123#1:257,3\n132#1:261,3\n123#1:250,7\n127#1:260\n127#1:264\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "rtlData",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;",
        "(Ljava/util/List;)V",
        "timestampData",
        "",
        "",
        "",
        "extractResponse",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
        "payloadData",
        "",
        "dataInfo",
        "parseSingleLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;",
        "sendFinalProgress",
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
.field private final timestampData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rtlData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2BackgroundLogCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2BackgroundLogCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    .line 71
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 73
    check-cast p1, Ljava/lang/Iterable;

    .line 239
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 241
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    .line 242
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;->getTimestamp()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    .line 243
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 78
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 72
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->timestampData:Ljava/util/Map;

    return-void
.end method

.method private final parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;
    .locals 24

    .line 170
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 172
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 174
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 175
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    .line 176
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 177
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move v2, v0

    .line 180
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v18

    const/4 v3, 0x7

    const/16 v4, 0xc

    .line 181
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v2

    .line 182
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->getGenerationArray()[I

    move-result-object v3

    aget v14, v3, v2

    const/16 v3, 0xd

    const/16 v4, 0x15

    move v2, v0

    .line 184
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v2

    const/16 v3, 0xff

    if-le v2, v3, :cond_0

    add-int/lit16 v2, v2, -0x200

    :cond_0
    move v12, v2

    const/16 v3, 0x16

    const/16 v4, 0x19

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move v2, v0

    .line 187
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v0

    .line 188
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto/16 :goto_0

    .line 189
    :cond_1
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 190
    :cond_2
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_3

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 191
    :cond_3
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_4

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 192
    :cond_4
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_5

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 193
    :cond_5
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_6

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 194
    :cond_6
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_7

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 195
    :cond_7
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_8

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 196
    :cond_8
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;->getEnumValue()I

    move-result v2

    if-ne v0, v2, :cond_9

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    .line 197
    :cond_9
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$StateUnknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$StateUnknown;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    :goto_0
    const/4 v3, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move v2, v9

    .line 201
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v11

    const/16 v3, 0x9

    const/16 v4, 0x10

    .line 202
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v2

    .line 203
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->getConsumptionArray()[I

    move-result-object v3

    aget v15, v3, v2

    const/16 v3, 0x11

    const/16 v4, 0x18

    move v2, v9

    .line 205
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v21

    const/16 v3, 0x19

    const/16 v4, 0x1f

    .line 206
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v23

    const/4 v3, 0x0

    const/16 v4, 0xe

    move v2, v8

    .line 208
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v19

    const/16 v3, 0xf

    const/16 v4, 0x19

    .line 209
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v20

    const/16 v3, 0x1a

    const/16 v4, 0x1f

    .line 210
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v2

    .line 212
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommandKt;->getGenerationArray()[I

    move-result-object v3

    aget v13, v3, v2

    const/4 v3, 0x0

    const/4 v4, 0x6

    move v2, v1

    .line 214
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v8

    const/4 v3, 0x7

    const/16 v4, 0xe

    .line 215
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v9

    const/16 v3, 0xf

    const/16 v4, 0x16

    .line 216
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v16

    const/16 v3, 0x17

    const/16 v4, 0x1f

    .line 217
    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v17

    .line 219
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "RTL index: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "gen2_pair"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    new-instance v22, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-object/from16 v10, v22

    invoke-direct/range {v10 .. v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIII)V

    .line 221
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    const-wide/16 v13, 0x0

    move-object v10, v1

    move-object v11, v0

    move v12, v8

    move v15, v9

    invoke-direct/range {v10 .. v23}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)V

    return-object v1
.end method


# virtual methods
.method public extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "payloadData"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dataInfo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    array-length v3, v3

    const/16 v4, 0x10

    .line 91
    rem-int/2addr v3, v4

    if-nez v3, :cond_e

    new-array v3, v4, [B

    .line 98
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    .line 99
    :goto_0
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v6

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v7

    sub-int/2addr v6, v7

    if-lt v6, v4, :cond_0

    .line 100
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 101
    invoke-direct {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    move-result-object v6

    .line 103
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getGen2LogsCount()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;->getBackgroundLogs()J

    .line 106
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    goto :goto_0

    .line 110
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 111
    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->roundMillisToSeconds(J)J

    move-result-wide v2

    .line 113
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v4

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 114
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v4

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 116
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "Parsing background log, size: "

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-static {v4, v8, v9, v10, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 118
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    check-cast v5, Ljava/lang/Iterable;

    .line 244
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    .line 120
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v11, "Background logs: \n"

    .line 122
    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8, v9, v10, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 246
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v4, Ljava/util/Map;

    .line 247
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 248
    move-object v10, v8

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    .line 124
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getLogTimeIndex()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 250
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2

    .line 249
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/List;

    .line 253
    invoke-interface {v4, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    :cond_2
    check-cast v11, Ljava/util/List;

    .line 257
    invoke-interface {v11, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 260
    :cond_3
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 128
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    .line 129
    iget-object v12, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->timestampData:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    if-nez v12, :cond_4

    move-object v12, v9

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->roundMillisToSeconds(J)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    :goto_4
    if-eqz v12, :cond_c

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 132
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 262
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v14, 0x0

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v31, v14, 0x1

    if-gez v14, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_5
    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    .line 134
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getLogType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    move-result-object v14

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;

    invoke-static {v14, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getLogType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    move-result-object v6

    sget-object v14, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getLogType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    move-result-object v6

    sget-object v14, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_6

    :cond_6
    const/4 v6, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    const/4 v6, 0x1

    .line 136
    :goto_7
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getLogType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    move-result-object v14

    .line 137
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, 0x5

    const/16 v18, 0x5

    goto :goto_8

    .line 138
    :cond_8
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, 0x3

    const/16 v18, 0x3

    goto :goto_8

    .line 139
    :cond_9
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v18, 0x1

    goto :goto_8

    :cond_a
    const/16 v18, 0x0

    .line 146
    :goto_8
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getBattery()I

    move-result v19

    .line 147
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getActiveCalories()I

    move-result v20

    .line 148
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getBmrCalories()I

    move-result v21

    .line 149
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getHeartRate()I

    move-result v23

    .line 150
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getHrv()I

    move-result v22

    .line 151
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getWalkStepDelta()I

    move-result v7

    int-to-long v9, v7

    move-wide/from16 v24, v9

    .line 152
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getRunningStepDelta()I

    move-result v7

    int-to-long v9, v7

    move-wide/from16 v26, v9

    .line 153
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getDistanceDelta()I

    move-result v7

    int-to-long v9, v7

    move-wide/from16 v28, v9

    .line 154
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->getPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v30

    .line 142
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    move-object v14, v7

    move v15, v6

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v30}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;-><init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V

    .line 156
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-wide/32 v6, 0xea60

    add-long/2addr v12, v6

    move/from16 v14, v31

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    goto/16 :goto_5

    .line 159
    :cond_b
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->timestampData:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    goto/16 :goto_3

    .line 130
    :cond_c
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;

    throw v1

    .line 163
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivitySummary()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;->setLastLogTime(J)V

    .line 164
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v2

    const-wide/32 v3, 0xea60

    invoke-virtual {v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setActivityLogInterval(J)V

    return-object v1

    .line 92
    :cond_e
    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;

    move-object v7, v1

    check-cast v7, Ljava/lang/Throwable;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "Wrong background data size"

    invoke-static/range {v5 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 93
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;

    throw v1
.end method

.method protected sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 3

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getGen2LogsCount()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;->getBackgroundLogs()J

    move-result-wide v0

    long-to-int p1, v0

    .line 83
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->getSyncChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;->getCommandId()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v2, p1

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->onProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;F)V

    return-void
.end method
