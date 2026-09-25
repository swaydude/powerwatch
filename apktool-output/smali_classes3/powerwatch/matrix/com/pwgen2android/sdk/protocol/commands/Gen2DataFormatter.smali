.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;
.super Ljava/lang/Object;
.source "DataFormatter.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u0008\u001a\u00020\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;",
        "dataFormatter",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;)V",
        "extractFirmwareInfo",
        "Lkotlin/Pair;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;",
        "firmwareVersionBytes",
        "",
        "formatFwVersion",
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
.field private final dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;)V
    .locals 1

    const-string v0, "dataFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;->dataFormatter:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 45
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;-><init>()V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;

    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;)V

    return-void
.end method


# virtual methods
.method public final extractFirmwareInfo([B)Lkotlin/Pair;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "firmwareVersionBytes"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    array-length v1, v0

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-ge v1, v3, :cond_0

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v2, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 66
    :cond_0
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-array v1, v3, [B

    .line 68
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-object/from16 v4, p0

    .line 69
    invoke-virtual {v4, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;->formatFwVersion([B)Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    const/4 v6, 0x3

    if-ge v5, v6, :cond_1

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 73
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    int-to-short v8, v2

    .line 74
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    int-to-short v9, v2

    .line 75
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    int-to-short v10, v2

    .line 77
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x18

    const/4 v14, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v14}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;-><init>(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    const/4 v7, 0x4

    if-ge v5, v7, :cond_2

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 80
    :cond_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    .line 81
    invoke-virtual {v2, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->setTimestamp(I)V

    .line 83
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "AGPS time read: "

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v8, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 85
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    const/16 v8, 0x24

    if-ge v5, v8, :cond_3

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 87
    :cond_3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 89
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    .line 91
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 92
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 93
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 94
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v12

    .line 95
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v13

    .line 96
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 99
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    new-array v3, v3, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    const/4 v15, 0x0

    .line 100
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v16, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontCoreLib;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontCoreLib;

    move-object/from16 v6, v16

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v4, v5

    invoke-direct {v7, v6, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    aput-object v7, v3, v15

    const/4 v4, 0x1

    .line 101
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$ClockFonts;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$ClockFonts;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v7, v8

    invoke-direct {v5, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    aput-object v5, v3, v4

    const/4 v4, 0x2

    .line 102
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Gauges;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Gauges;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v7, v9

    invoke-direct {v5, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    aput-object v5, v3, v4

    .line 103
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Icons;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Icons;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v6, v10

    invoke-direct {v4, v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    const/4 v5, 0x3

    aput-object v4, v3, v5

    .line 104
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation1;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v6, v11

    invoke-direct {v4, v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    const/4 v5, 0x4

    aput-object v4, v3, v5

    const/4 v4, 0x5

    .line 105
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation2;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation2;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v7, v12

    invoke-direct {v5, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    aput-object v5, v3, v4

    const/4 v4, 0x6

    .line 106
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation3;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation3;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v7, v13

    invoke-direct {v5, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    aput-object v5, v3, v4

    const/4 v4, 0x7

    .line 107
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontLookupTable;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontLookupTable;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    int-to-long v7, v0

    invoke-direct {v5, v6, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    aput-object v5, v3, v4

    .line 99
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;-><init>(Ljava/util/List;)V

    .line 111
    invoke-virtual {v2, v14}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->setSections(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V

    .line 112
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public formatFwVersion([B)Ljava/lang/String;
    .locals 8

    const-string v0, "firmwareVersionBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "UTF_8"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v3, "\u0000"

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
