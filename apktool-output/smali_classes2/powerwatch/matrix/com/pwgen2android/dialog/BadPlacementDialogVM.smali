.class public final Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;
.super Landroidx/lifecycle/ViewModel;
.source "BadPlacementDialogVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u00020\u0006*\u00020\u000cR*\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;",
        "Landroidx/lifecycle/ViewModel;",
        "()V",
        "dialogClose",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
        "",
        "getDialogClose",
        "()Lkotlin/jvm/functions/Function1;",
        "setDialogClose",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onCancelClicked",
        "Landroid/view/View;",
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
.field private dialogClose:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDialogClose()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;->dialogClose:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final onCancelClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;->dialogClose:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction$None;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final setDialogClose(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 11
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;->dialogClose:Lkotlin/jvm/functions/Function1;

    return-void
.end method
