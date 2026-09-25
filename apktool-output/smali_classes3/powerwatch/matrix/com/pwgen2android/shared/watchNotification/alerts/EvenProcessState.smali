.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;
.super Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;
.source "EvenProcessState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;",
        "()V",
        "process",
        "Ljava/util/ArrayList;",
        "",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;-><init>()V

    return-void
.end method


# virtual methods
.method public process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "[B>;[BZ)",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    array-length v0, p2

    const/4 v1, 0x0

    const/16 v2, 0x13

    if-gt v0, v2, :cond_0

    .line 10
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/FinalProcessState;

    invoke-direct {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/FinalProcessState;-><init>()V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;->setNextState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;)V

    .line 11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;->getNextState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p3, p1, p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;->process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v2, [B

    .line 14
    invoke-static {p2, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, -0x3

    .line 15
    invoke-virtual {p0, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;->prependData([BB)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    array-length v0, p2

    if-le v0, v2, :cond_1

    .line 17
    array-length v0, p2

    sub-int/2addr v0, v2

    new-array v3, v0, [B

    .line 18
    invoke-static {p2, v2, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/OddProcessState;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/OddProcessState;-><init>()V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;->setNextState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;)V

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/EvenProcessState;->getNextState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    xor-int/lit8 p3, p3, 0x1

    invoke-virtual {p2, p1, v3, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;->process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method
