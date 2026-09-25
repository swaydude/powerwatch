.class final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$onCreateView$1;
.super Lkotlin/jvm/internal/Lambda;
.source "UnpairDialogFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$onCreateView$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;)V
    .locals 0

    .line 39
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method
