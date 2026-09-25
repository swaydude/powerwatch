.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "TimerSettingFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimerSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimerSettingFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,160:1\n54#2,3:161\n*S KotlinDebug\n*F\n+ 1 TimerSettingFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment\n*L\n30#1:161,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000f\u001a\u00020\u0010H\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0014J\u0008\u0010\u0013\u001a\u00020\u0003H\u0014J\u0008\u0010\u0014\u001a\u00020\u0012H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "alarmViewModel",
        "getAlarmViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;",
        "alarmViewModel$delegate",
        "Lkotlin/Lazy;",
        "hourPicker",
        "Lcom/super_rabbit/wheel_picker/WheelPicker;",
        "minutePicker",
        "secondsPicker",
        "copyValuesToVM",
        "",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;


# instance fields
.field private final alarmViewModel$delegate:Lkotlin/Lazy;

.field private hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field private minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field private secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 25
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 30
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$alarmViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$alarmViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 161
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 163
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 30
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->alarmViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getHourPicker$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)Lcom/super_rabbit/wheel_picker/WheelPicker;
    .locals 0

    .line 25
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    return-object p0
.end method

.method public static final synthetic access$getMinutePicker$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)Lcom/super_rabbit/wheel_picker/WheelPicker;
    .locals 0

    .line 25
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    return-object p0
.end method

.method public static final synthetic access$getSecondsPicker$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)Lcom/super_rabbit/wheel_picker/WheelPicker;
    .locals 0

    .line 25
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    return-object p0
.end method

.method private final copyValuesToVM()V
    .locals 4

    .line 152
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getHourValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/super_rabbit/wheel_picker/WheelPicker;->getCurrentItem()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 153
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getMinuteValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/super_rabbit/wheel_picker/WheelPicker;->getCurrentItem()Ljava/lang/String;

    move-result-object v1

    :goto_2
    if-nez v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 154
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getSecondsValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/super_rabbit/wheel_picker/WheelPicker;->getCurrentItem()Ljava/lang/String;

    move-result-object v2

    :goto_4
    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    :goto_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private final getAlarmViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;
    .locals 1

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->alarmViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    return-object v0
.end method

.method public static synthetic lambda$4b8l12iWJcdQYandWuCiEIdsysk(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$N07sGPUenq1QbwyskmFegrPKefA(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$QWMUsysE0MrsBa9E3fxbIHjASpk(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$czKhwRUaXgSu4Ri_8LMUwdJGA-k(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->copyValuesToVM()V

    .line 89
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->onStartButtonClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->onPauseButtonClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->onResetButtonClicked()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 25
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;
    .locals 1

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getAlarmViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b007e

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->onCreateView(Landroid/content/Context;)V

    const p2, 0x7f080165

    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string p3, "toolbar"

    .line 46
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0f01bb

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.timer_set)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 48
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    const-string p3, ""

    .line 49
    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 52
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$N07sGPUenq1QbwyskmFegrPKefA;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$N07sGPUenq1QbwyskmFegrPKefA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    const p2, 0x7f080139

    .line 56
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->loadHourValues()[Ljava/lang/String;

    move-result-object v5

    .line 58
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/4 p3, 0x2

    const/4 v8, 0x0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    .line 59
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v0, v10

    move-object v2, v5

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    invoke-direct {v9, v10, v8, p3, v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v9, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {p2, v9}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 64
    :goto_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    :goto_1
    const p2, 0x7f080170

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->loadMinuteValues()[Ljava/lang/String;

    move-result-object v5

    .line 68
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    .line 69
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v0, v10

    move-object v2, v5

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    invoke-direct {v9, v10, v8, p3, v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v9, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {p2, v9}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 74
    :goto_2
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    :goto_3
    const p2, 0x7f0801f8

    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 77
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->loadSecondsValues()[Ljava/lang/String;

    move-result-object v5

    .line 78
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez p2, :cond_4

    goto :goto_4

    :cond_4
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    .line 79
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v0, v10

    move-object v2, v5

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    invoke-direct {v9, v10, v8, p3, v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v9, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {p2, v9}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 84
    :goto_4
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez p2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    :goto_5
    const p2, 0x7f080222

    .line 86
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 87
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$4b8l12iWJcdQYandWuCiEIdsysk;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$4b8l12iWJcdQYandWuCiEIdsysk;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p3, 0x7f0801b5

    .line 92
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 93
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$czKhwRUaXgSu4Ri_8LMUwdJGA-k;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$czKhwRUaXgSu4Ri_8LMUwdJGA-k;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0801d4

    .line 97
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 98
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$QWMUsysE0MrsBa9E3fxbIHjASpk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingFragment$QWMUsysE0MrsBa9E3fxbIHjASpk;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimerStateField()Landroidx/databinding/ObservableField;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;

    invoke-direct {v2, p0, p2, p3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    check-cast v2, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 126
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getHourValue()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$6;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 132
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getMinuteValue()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$7;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$7;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 138
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getSecondsValue()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$8;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$onCreateView$8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    return-object p1
.end method
