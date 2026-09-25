.class final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$onShareButtonClicked$1;
.super Lkotlin/jvm/internal/Lambda;
.source "UserActivityViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->onShareButtonClicked()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "data",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;"
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
.field final synthetic $shareDialogScreen:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$onShareButtonClicked$1;->$shareDialogScreen:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 402
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$onShareButtonClicked$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$onShareButtonClicked$1;->$shareDialogScreen:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->dismissAllowingStateLoss()V

    return-void
.end method
