.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "UserInfoCommands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "userInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V",
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
.field private final userInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V
    .locals 1

    const-string v0, "userInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendBiometricsCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendBiometricsCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;->userInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 6

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;->userInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getGenderMale()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 55
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;->userInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getAge()I

    move-result v1

    int-to-byte v1, v1

    .line 56
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;->userInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getWeight()F

    move-result v2

    float-to-int v2, v2

    int-to-short v2, v2

    .line 57
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;->userInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getHeight()I

    move-result v3

    int-to-short v3, v3

    mul-int/lit8 v3, v3, 0xa

    const/4 v4, 0x6

    .line 59
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 60
    sget-object v5, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 61
    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 62
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 63
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object v0

    int-to-short v1, v3

    .line 64
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 66
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "dataBuffer.array()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
