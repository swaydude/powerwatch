.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl;
.super Ljava/lang/Object;
.source "ProtocolCreator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProtocolCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtocolCreator.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n286#2,2:88\n286#2,2:90\n286#2,2:92\n286#2,2:94\n286#2,2:96\n286#2,2:98\n*S KotlinDebug\n*F\n+ 1 ProtocolCreator.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl\n*L\n32#1:88,2\n37#1:90,2\n38#1:92,2\n39#1:94,2\n59#1:96,2\n64#1:98,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
        "()V",
        "createProtocols",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "bleCreatorConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createProtocols(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;",
            ">;"
        }
    .end annotation

    const-string v0, "technologyType"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleCreatorConfig"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 22
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;->getService()Ljava/util/UUID;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 24
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;

    invoke-direct {v5, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v5

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;->getService()Ljava/util/UUID;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    if-eqz v5, :cond_16

    if-eqz v2, :cond_14

    .line 31
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 88
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "-"

    const-string v7, "it.toString()"

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/util/UUID;

    .line 33
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v9

    check-cast v10, Ljava/lang/CharSequence;

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    const-string v10, "180a"

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v9, v10, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_2
    move-object v5, v4

    .line 32
    :goto_0
    check-cast v5, Ljava/util/UUID;

    const-string v2, "char.toString()"

    if-eqz v5, :cond_e

    .line 37
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Set;

    if-nez v9, :cond_3

    move-object v10, v4

    goto :goto_2

    :cond_3
    check-cast v9, Ljava/lang/Iterable;

    .line 90
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/util/UUID;

    .line 37
    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/CharSequence;

    const-string v12, "2a26"

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v11, v12, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_1

    :cond_5
    move-object v10, v4

    .line 91
    :goto_1
    check-cast v10, Ljava/util/UUID;

    .line 38
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Set;

    if-nez v9, :cond_6

    move-object v11, v4

    goto :goto_4

    :cond_6
    check-cast v9, Ljava/lang/Iterable;

    .line 92
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/util/UUID;

    .line 38
    invoke-virtual {v12}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/CharSequence;

    const-string v13, "2a25"

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v12, v13, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_3

    :cond_8
    move-object v11, v4

    .line 93
    :goto_3
    check-cast v11, Ljava/util/UUID;

    .line 39
    :goto_4
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    if-nez v5, :cond_9

    move-object v9, v4

    goto :goto_6

    :cond_9
    check-cast v5, Ljava/lang/Iterable;

    .line 94
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Ljava/util/UUID;

    .line 39
    invoke-virtual {v12}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/CharSequence;

    const-string v13, "2a24"

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v12, v13, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_5

    :cond_b
    move-object v9, v4

    .line 95
    :goto_5
    check-cast v9, Ljava/util/UUID;

    :goto_6
    if-eqz v10, :cond_e

    .line 41
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    new-instance v12, Lkotlin/Pair;

    sget-object v13, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->FIRMWARE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v12}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;

    invoke-direct {v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;-><init>()V

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    invoke-direct {v5, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;-><init>(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-array v5, v3, [Lkotlin/Pair;

    .line 43
    new-instance v12, Lkotlin/Pair;

    sget-object v13, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->FIRMWARE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v12, v13, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v12, v5, v8

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    if-eqz v11, :cond_c

    .line 45
    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SERIAL:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "serialChar.toString()"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    if-eqz v9, :cond_d

    .line 49
    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SETTINGS_INFO:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v11, "settingsInfoChar.toString()"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_d
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;

    invoke-direct {v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;-><init>()V

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    invoke-direct {v9, v5, v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;-><init>(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_e
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 96
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/util/UUID;

    .line 60
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v10

    check-cast v11, Ljava/lang/CharSequence;

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "180d"

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_7

    :cond_10
    move-object v9, v4

    .line 59
    :goto_7
    check-cast v9, Ljava/util/UUID;

    if-eqz v9, :cond_16

    .line 64
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-nez v1, :cond_11

    move-object v5, v4

    goto :goto_9

    :cond_11
    check-cast v1, Ljava/lang/Iterable;

    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/UUID;

    .line 65
    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/CharSequence;

    const-string v7, "2a37"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v6, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_12

    goto :goto_8

    :cond_13
    move-object v5, v4

    .line 99
    :goto_8
    check-cast v5, Ljava/util/UUID;

    :goto_9
    if-eqz v5, :cond_16

    .line 67
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;

    const/4 v2, 0x2

    invoke-direct {v1, v5, v4, v2, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;-><init>(Ljava/util/UUID;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    const-string v1, "00002760-08C2-11E1-9073-0E8AC72E0013"

    .line 71
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 72
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;

    invoke-direct {v1, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 74
    :cond_15
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPProtocol;

    invoke-direct {v1, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPProtocol;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    :goto_a
    return-object v0
.end method
