.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "Gen2SendUserLocationCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "gpsPosition",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V",
        "getGpsPosition",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "createPayload",
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
.field private final gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V
    .locals 1

    const-string v0, "gpsPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserLocationCommand;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserLocationCommand;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 9

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr v0, v2

    const/16 v2, 0x10

    .line 17
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    long-to-int v1, v0

    .line 18
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v0

    const/high16 v3, 0x41200000    # 10.0f

    float-to-double v3, v3

    const/4 v5, 0x7

    int-to-double v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    double-to-float v7, v7

    float-to-double v7, v7

    mul-double v0, v0, v7

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-double v3, v3

    mul-double v0, v0, v3

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getAltitude()D

    move-result-wide v0

    const/16 v3, 0x64

    int-to-double v3, v3

    mul-double v0, v0, v3

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 23
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "dataBuffer.array()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getGpsPosition()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;
    .locals 1

    .line 11
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    return-object v0
.end method
