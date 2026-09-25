.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6;
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
        "powerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;

    .line 126
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 3

    .line 128
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, "timer_flow: updating ui hours"

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 129
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->access$getHourPicker$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)Lcom/super_rabbit/wheel_picker/WheelPicker;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 p2, 0x1

    new-array v0, p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getHourValue()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aput-object v2, v0, v1

    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v0, "%02d"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "java.lang.String.format(format, *args)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->smoothScrollToValue(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
