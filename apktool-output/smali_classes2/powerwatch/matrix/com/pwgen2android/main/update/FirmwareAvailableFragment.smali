.class public final Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "FirmwareAvailableFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareAvailableFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareAvailableFragment.kt\npowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,105:1\n54#2,3:106\n*S KotlinDebug\n*F\n+ 1 FirmwareAvailableFragment.kt\npowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment\n*L\n24#1:106,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;",
        "()V",
        "firmwareAvailableViewModel",
        "getFirmwareAvailableViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;",
        "firmwareAvailableViewModel$delegate",
        "Lkotlin/Lazy;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;

.field private static final DEVICE_DATA:Ljava/lang/String; = "device_data"

.field private static final UPDATE_AVAILABLE:Ljava/lang/String; = "update_available"

.field private static final VERSION_FIELD:Ljava/lang/String; = "firmware_version"


# instance fields
.field private final firmwareAvailableViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 24
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$firmwareAvailableViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$firmwareAvailableViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 106
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 108
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->firmwareAvailableViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getFirmwareAvailableViewModel(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;)Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;
    .locals 0

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->firmwareAvailableViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    return-object v0
.end method

.method public static synthetic lambda$ZMq0n17VpDigdrSyIemSRzIVOh8(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onBackClicked()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;
    .locals 1

    .line 75
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b005a

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 30
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    const-string v0, "firmware_version"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    :goto_0
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, p3

    goto :goto_1

    :cond_1
    const-string v1, "device_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    :goto_1
    const-string v1, "null cannot be cast to non-null type powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView(Landroid/content/Context;)V

    if-eqz p2, :cond_6

    .line 36
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v1

    invoke-virtual {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->setVersionRelease(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    .line 38
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateAvailable()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 39
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getReleaseNotes()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getReleaseNotes()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 40
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateInfo()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const p3, 0x7f0f013b

    invoke-virtual {v1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    :goto_2
    invoke-virtual {v0, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_5

    .line 42
    :cond_3
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getFirmwareVersion()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 43
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getReleaseNotes()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v1, p3

    goto :goto_3

    :cond_4
    const v2, 0x7f0f00a8

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 44
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateInfo()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    const p3, 0x7f0f01d5

    invoke-virtual {v1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    :goto_4
    invoke-virtual {v0, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 47
    :goto_5
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->hasUpdate()Z

    move-result p2

    .line 48
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object p3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p3, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->prepareUpdateInfo(Landroid/content/Context;Z)V

    :cond_6
    const p2, 0x7f0801c7

    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    .line 53
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getFirmwareAvailableViewModel()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaProgressValue()Landroidx/databinding/ObservableField;

    move-result-object p3

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$onCreateView$1;

    invoke-direct {v0, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$onCreateView$1;-><init>(Landroid/widget/ProgressBar;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    const p2, 0x7f080165

    .line 60
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string p3, "toolbar"

    .line 62
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    const p3, 0x7f0f01f0

    .line 63
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.whats_new)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 65
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableFragment$ZMq0n17VpDigdrSyIemSRzIVOh8;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableFragment$ZMq0n17VpDigdrSyIemSRzIVOh8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    return-object p1
.end method
