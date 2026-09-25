.class public final Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "SingleGoalEditFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1",
        "Landroidx/databinding/Observable$OnPropertyChangedCallback;",
        "onPropertyChanged",
        "",
        "sender",
        "Landroidx/databinding/Observable;",
        "propertyId",
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
.field final synthetic $toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;->$toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    .line 68
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 70
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 72
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;->$toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->showRightProgress()V

    goto :goto_0

    .line 74
    :cond_2
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;->$toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->hideRightProgress()V

    :goto_0
    return-void
.end method
