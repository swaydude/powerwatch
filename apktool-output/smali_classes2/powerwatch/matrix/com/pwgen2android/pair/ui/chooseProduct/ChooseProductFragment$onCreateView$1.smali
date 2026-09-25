.class final Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$onCreateView$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ChooseProductFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$onCreateView$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0f00b8

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
