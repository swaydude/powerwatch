.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "UserInfoCommands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "pairingConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V",
        "innerCommand",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;",
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
.field private final innerCommand:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;

.field private final pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V
    .locals 1

    const-string v0, "pairingConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserPrefsAndGoalsVer3CommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserPrefsAndGoalsVer3CommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    .line 214
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;->innerCommand:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 2

    const/16 v0, 0x20

    .line 217
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 218
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;->innerCommand:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->createPayload()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 219
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getSleepTimeSelection()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 220
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "dataBuffer.array()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
