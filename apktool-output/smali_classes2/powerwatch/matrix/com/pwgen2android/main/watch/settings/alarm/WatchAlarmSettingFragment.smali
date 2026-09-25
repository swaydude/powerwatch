.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "WatchAlarmSettingFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchAlarmSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchAlarmSettingFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,150:1\n54#2,3:151\n*S KotlinDebug\n*F\n+ 1 WatchAlarmSettingFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment\n*L\n29#1:151,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000f\u001a\u00020\u0010H\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0014J\u0008\u0010\u0013\u001a\u00020\u0003H\u0014J\u0008\u0010\u0014\u001a\u00020\u0012H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "alarmViewModel",
        "getAlarmViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;",
        "alarmViewModel$delegate",
        "Lkotlin/Lazy;",
        "amPicker",
        "Lcom/super_rabbit/wheel_picker/WheelPicker;",
        "hourPicker",
        "minutePicker",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;


# instance fields
.field private final alarmViewModel$delegate:Lkotlin/Lazy;

.field private amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field private hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field private minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 24
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 29
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$alarmViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$alarmViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 151
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 153
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 29
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->alarmViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final copyValuesToVM()V
    .locals 4

    .line 143
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getHourValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

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

    .line 144
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getMinuteValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/super_rabbit/wheel_picker/WheelPicker;->getCurrentItem()Ljava/lang/String;

    move-result-object v2

    :goto_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 145
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getAmPm()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    const-string v2, ""

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/super_rabbit/wheel_picker/WheelPicker;->getCurrentItem()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    move-object v2, v1

    :goto_4
    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private final getAlarmViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->alarmViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    return-object v0
.end method

.method public static synthetic lambda$Mcl-QiK-84lV7VDz8Qo1AH0QlBI(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$O1clM48NwKv4v05EhLGRUc6FAyE(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$OZtdpQjVG4CrpAHPz56dCenQ3ks(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->copyValuesToVM()V

    .line 60
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onDoneClicked()V

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

    .line 24
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;
    .locals 1

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getAlarmViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0082

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "inflater"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-super/range {p0 .. p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 42
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onCreateView(Landroid/content/Context;)V

    const v2, 0x7f080165

    .line 43
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string v3, "toolbar"

    .line 45
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0f0032

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(R.string.alarm_set)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    const v3, 0x7f0f005e

    .line 46
    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(R.string.button_done)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    const v3, 0x7f0f005c

    .line 47
    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(R.string.button_cancel)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 50
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmSettingFragment$O1clM48NwKv4v05EhLGRUc6FAyE;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmSettingFragment$O1clM48NwKv4v05EhLGRUc6FAyE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;)V

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 54
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmSettingFragment$Mcl-QiK-84lV7VDz8Qo1AH0QlBI;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmSettingFragment$Mcl-QiK-84lV7VDz8Qo1AH0QlBI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;)V

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonTextClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 58
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmSettingFragment$OZtdpQjVG4CrpAHPz56dCenQ3ks;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmSettingFragment$OZtdpQjVG4CrpAHPz56dCenQ3ks;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;)V

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 63
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v3

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$onCreateView$4;

    invoke-direct {v4, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$onCreateView$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v4, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v3, v4}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    const v2, 0x7f080139

    .line 75
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 76
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->loadHourValues()[Ljava/lang/String;

    move-result-object v8

    .line 77
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/4 v11, 0x2

    const/4 v12, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    .line 78
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    move-object v3, v14

    move-object v5, v8

    invoke-direct/range {v3 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    invoke-direct {v13, v14, v12, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v13, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {v2, v13}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 83
    :goto_0
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    :goto_1
    const v2, 0x7f080170

    .line 85
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 86
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->loadMinuteValues()[Ljava/lang/String;

    move-result-object v8

    .line 87
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    .line 88
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    move-object v3, v14

    move-object v5, v8

    invoke-direct/range {v3 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    invoke-direct {v13, v14, v12, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v13, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {v2, v13}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 93
    :goto_2
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    .line 95
    :goto_3
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    const-string v3, "java.lang.String.format(format, *args)"

    const/4 v4, 0x1

    const-string v5, "%02d"

    const/4 v6, 0x0

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    sget-object v7, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array v7, v4, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getInitialHourValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Lcom/super_rabbit/wheel_picker/WheelPicker;->scrollToValue(Ljava/lang/String;)V

    .line 96
    :goto_4
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    sget-object v7, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array v7, v4, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getInitialMinuteValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/super_rabbit/wheel_picker/WheelPicker;->scrollToValue(Ljava/lang/String;)V

    :goto_5
    const v2, 0x7f080054

    .line 98
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 100
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isAMPMUSed()Z

    move-result v2

    const/16 v3, 0x8

    if-eqz v2, :cond_9

    .line 102
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2, v6}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setVisibility(I)V

    .line 103
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->loadAMValues()[Ljava/lang/String;

    move-result-object v18

    .line 104
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    .line 105
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0xd

    const/16 v20, 0x0

    move-object v13, v5

    move-object/from16 v15, v18

    invoke-direct/range {v13 .. v20}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    invoke-direct {v4, v5, v12, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {v2, v4}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 110
    :goto_7
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getInitialAM()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/super_rabbit/wheel_picker/WheelPicker;->scrollToValue(Ljava/lang/String;)V

    goto :goto_8

    .line 112
    :cond_9
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->amPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    if-nez v2, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v2, v3}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setVisibility(I)V

    :goto_8
    const v2, 0x7f0801c5

    .line 116
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v4, 0x7f08019f

    .line 117
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0801a0

    .line 118
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f08019e

    .line 119
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 121
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isOldAlarmSet()Z

    move-result v7

    if-eqz v7, :cond_12

    .line 122
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getOldAlarmTime()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getOldAlarmActive()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v2

    .line 124
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, ""

    if-eqz v3, :cond_b

    const v2, 0x7f0f0147

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    goto :goto_9

    .line 125
    :cond_b
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$On;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$On;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    const v2, 0x7f0f014a

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    goto :goto_9

    .line 126
    :cond_c
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Once;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Once;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const v2, 0x7f0f014b

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    goto :goto_9

    .line 127
    :cond_d
    move-object v2, v4

    check-cast v2, Ljava/lang/CharSequence;

    .line 123
    :goto_9
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getOldAlarmRepetition()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v2

    .line 131
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    const v2, 0x7f0f00c6

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    goto :goto_a

    .line 132
    :cond_e
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    const v2, 0x7f0f00c7

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    goto :goto_a

    .line 133
    :cond_f
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const v2, 0x7f0f00c8

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    goto :goto_a

    :cond_10
    if-nez v2, :cond_11

    .line 134
    move-object v2, v4

    check-cast v2, Ljava/lang/CharSequence;

    .line 130
    :goto_a
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_b

    .line 134
    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 136
    :cond_12
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_b
    return-object v1
.end method
