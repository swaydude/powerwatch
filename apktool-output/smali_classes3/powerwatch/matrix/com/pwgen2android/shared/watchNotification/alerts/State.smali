.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;
.super Ljava/lang/Object;
.source "State.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008 \u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000cH\u0004J,\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;",
        "",
        "()V",
        "nextState",
        "getNextState",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;",
        "setNextState",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;)V",
        "prependData",
        "",
        "data",
        "headerByte",
        "",
        "process",
        "Ljava/util/ArrayList;",
        "list",
        "payload",
        "nextIsEven",
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
.field private nextState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNextState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;
    .locals 1

    .line 10
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;->nextState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    return-object v0
.end method

.method protected final prependData([BB)[B
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x14

    new-array v0, v0, [B

    .line 15
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte p2, v0, v2

    return-object v0
.end method

.method public abstract process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "[B>;[BZ)",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation
.end method

.method public final setNextState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;->nextState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    return-void
.end method
