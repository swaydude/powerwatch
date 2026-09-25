.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/FinalProcessState;
.super Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;
.source "FinalProcessState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/FinalProcessState;",
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

    const-string p3, "list"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payload"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0x14

    new-array v0, p3, [B

    .line 12
    array-length v1, p2

    const/16 v2, 0x13

    if-gt v1, v2, :cond_0

    .line 13
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p2, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, -0x4

    aput-byte v1, v0, v2

    .line 15
    array-length p2, p2

    add-int/2addr p2, v3

    invoke-static {v0, p2, p3, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 16
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p1
.end method
