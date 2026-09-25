.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;
.super Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;
.source "HeaderProcessState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;",
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

    .line 8
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;-><init>()V

    return-void
.end method


# virtual methods
.method public process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "[B>;[BZ)",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string p3, "list"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payload"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    array-length p3, p2

    const/4 v0, -0x1

    const/16 v1, 0x14

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge p3, v1, :cond_0

    new-array p3, v1, [B

    .line 13
    array-length v4, p2

    invoke-static {p2, v3, p3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte v0, p3, v3

    .line 15
    array-length p2, p2

    add-int/2addr p2, v2

    invoke-static {p3, p2, v1, v3}, Ljava/util/Arrays;->fill([BIIB)V

    .line 16
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_0
    const/16 p3, 0x13

    new-array v1, p3, [B

    .line 19
    invoke-static {p2, v3, v1, v3, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    invoke-virtual {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;->prependData([BB)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    array-length v0, p2

    sub-int/2addr v0, p3

    new-array v1, v0, [B

    .line 23
    invoke-static {p2, p3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/OddProcessState;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/OddProcessState;-><init>()V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;->setNextState(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;)V

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;->getNextState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p1, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;->process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
