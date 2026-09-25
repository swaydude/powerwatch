.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/EnableMockCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "Gen2Executor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/EnableMockCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "enable",
        "",
        "(Z)V",
        "getEnable",
        "()Z",
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
.field private final enable:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1026
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$EnableMockCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$EnableMockCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/EnableMockCommand;->enable:Z

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 3

    .line 1029
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/EnableMockCommand;->enable:Z

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public final getEnable()Z
    .locals 1

    .line 1026
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/EnableMockCommand;->enable:Z

    return v0
.end method
