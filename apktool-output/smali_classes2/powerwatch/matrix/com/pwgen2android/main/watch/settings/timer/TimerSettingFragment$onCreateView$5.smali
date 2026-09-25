.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "TimerSettingFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
        "powerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5",
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
.field final synthetic $pauseButton:Landroid/widget/TextView;

.field final synthetic $resetButton:Landroid/widget/TextView;

.field final synthetic $startButton:Landroid/widget/TextView;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$startButton:Landroid/widget/TextView;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$pauseButton:Landroid/widget/TextView;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$resetButton:Landroid/widget/TextView;

    .line 103
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 2

    .line 105
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimerStateField()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 107
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Idle;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Idle;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 108
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$startButton:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 109
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$pauseButton:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 110
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$resetButton:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_0

    .line 112
    :cond_0
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Running;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Running;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 113
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$startButton:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 114
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$resetButton:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 115
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$pauseButton:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 117
    :cond_1
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Pause;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Pause;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 118
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$startButton:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$pauseButton:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 120
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;->$resetButton:Landroid/widget/TextView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_2
    :goto_0
    return-void
.end method
