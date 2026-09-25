.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;
.super Ljava/lang/Object;
.source "SyncProgressChannel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\r\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0005\"\u001d\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0005\"\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0005\"\u001d\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0005\"\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0005\u00a8\u0006\u0010"
    }
    d2 = {
        "pairConfigPowers",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
        "",
        "getPairConfigPowers",
        "()Lkotlin/jvm/functions/Function1;",
        "pairConfigPowers2",
        "getPairConfigPowers2",
        "pairConfigPowers2Ver3",
        "getPairConfigPowers2Ver3",
        "syncConfigPowers2Ver3",
        "getSyncConfigPowers2Ver3",
        "syncConfigPowersV2",
        "getSyncConfigPowersV2",
        "syncPowers",
        "getSyncPowers",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final pairConfigPowers:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final pairConfigPowers2:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final pairConfigPowers2Ver3:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final syncConfigPowers2Ver3:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final syncConfigPowersV2:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final syncPowers:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->pairConfigPowers2:Lkotlin/jvm/functions/Function1;

    .line 41
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$syncConfigPowersV2$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$syncConfigPowersV2$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->syncConfigPowersV2:Lkotlin/jvm/functions/Function1;

    .line 66
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->pairConfigPowers:Lkotlin/jvm/functions/Function1;

    .line 82
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$syncPowers$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$syncPowers$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->syncPowers:Lkotlin/jvm/functions/Function1;

    .line 114
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2Ver3$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$pairConfigPowers2Ver3$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->pairConfigPowers2Ver3:Lkotlin/jvm/functions/Function1;

    .line 124
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$syncConfigPowers2Ver3$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt$syncConfigPowers2Ver3$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->syncConfigPowers2Ver3:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final getPairConfigPowers()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 66
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->pairConfigPowers:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final getPairConfigPowers2()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 31
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->pairConfigPowers2:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final getPairConfigPowers2Ver3()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 114
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->pairConfigPowers2Ver3:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final getSyncConfigPowers2Ver3()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 124
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->syncConfigPowers2Ver3:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final getSyncConfigPowersV2()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 41
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->syncConfigPowersV2:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final getSyncPowers()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 82
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->syncPowers:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
