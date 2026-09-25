.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;
.super Ljava/lang/Object;
.source "StateController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;",
        "",
        "()V",
        "startState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;",
        "process",
        "Ljava/util/ArrayList;",
        "",
        "data",
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
.field private final startState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;-><init>()V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->startState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    return-void
.end method


# virtual methods
.method public final process([B)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;->startState:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;->process(Ljava/util/ArrayList;[BZ)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
