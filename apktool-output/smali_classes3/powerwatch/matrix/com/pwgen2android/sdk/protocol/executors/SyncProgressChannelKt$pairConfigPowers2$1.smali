.class final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SyncProgressChannel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)F
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2StartAmDTPCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2StartAmDTPCommandId;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x3dcccccd    # 0.1f

    goto :goto_0

    .line 34
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2GetUserAndGoalsCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2GetUserAndGoalsCommandId;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p1, 0x3e99999a    # 0.3f

    goto :goto_0

    .line 35
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserPrefsAndGoalsCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserPrefsAndGoalsCommandId;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const p1, 0x3ecccccd    # 0.4f

    goto :goto_0

    .line 36
    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2StopPairingCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2StopPairingCommandId;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
