.class public final Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "SingleWheelFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSingleWheelFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleWheelFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,107:1\n54#2,3:108\n*S KotlinDebug\n*F\n+ 1 SingleWheelFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment\n*L\n27#1:108,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;",
        "()V",
        "singleWheelViewModel",
        "getSingleWheelViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;",
        "singleWheelViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

.field private static final WHEEL_CONFIG_PARAM:Ljava/lang/String; = "WHEEL_CONFIG_PARAM"


# instance fields
.field private final singleWheelViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 25
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 27
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$singleWheelViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$singleWheelViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 108
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 110
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 27
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->singleWheelViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getSingleWheelViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->singleWheelViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    return-object v0
.end method

.method public static synthetic lambda$atg4SSv_FvM43GnTY3AqJD4na-k(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$nJbeLedimdYFkLzinSupWRg1zVk(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$config"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$currentValue"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    move-result-object p0

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onSaveClicked(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;Ljava/lang/String;)V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;
    .locals 1

    .line 31
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getSingleWheelViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0079

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080165

    .line 39
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7f0f0060

    .line 41
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.button_save)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 43
    :cond_1
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelFragment$nJbeLedimdYFkLzinSupWRg1zVk;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelFragment$nJbeLedimdYFkLzinSupWRg1zVk;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 48
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p3

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$onCreateView$2;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$onCreateView$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    const p3, 0x7f080204

    .line 58
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    const-string v1, "WHEEL_CONFIG_PARAM"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    :goto_2
    if-eqz v0, :cond_12

    .line 62
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    move-result-object v1

    .line 63
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez p2, :cond_3

    goto/16 :goto_3

    :cond_3
    const v1, 0x7f0f00dd

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.gender)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 64
    :cond_4
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-nez p2, :cond_5

    goto/16 :goto_3

    :cond_5
    const v1, 0x7f0f0031

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.age)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 65
    :cond_6
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-nez p2, :cond_7

    goto/16 :goto_3

    :cond_7
    const v1, 0x7f0f01ee

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.weight)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 66
    :cond_8
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    if-nez p2, :cond_9

    goto :goto_3

    :cond_9
    const v1, 0x7f0f00f0

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.height)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto :goto_3

    .line 67
    :cond_a
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    if-nez p2, :cond_b

    goto :goto_3

    :cond_b
    const v1, 0x7f0f0102

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.language)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto :goto_3

    .line 68
    :cond_c
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    if-nez p2, :cond_d

    goto :goto_3

    :cond_d
    const v1, 0x7f0f0076

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.clock)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto :goto_3

    .line 69
    :cond_e
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    if-nez p2, :cond_f

    goto :goto_3

    :cond_f
    const v1, 0x7f0f0198

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.sleep_time_header)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 73
    :cond_10
    :goto_3
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getCurrentValue()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 74
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$onCreateView$3;

    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$onCreateView$3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v2, Lcom/super_rabbit/wheel_picker/OnValueChangeListener;

    invoke-virtual {p3, v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setOnValueChangeListener(Lcom/super_rabbit/wheel_picker/OnValueChangeListener;)V

    .line 81
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getWheelItemCount()I

    move-result v2

    invoke-virtual {p3, v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setWheelItemCount(I)V

    .line 82
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getMaxValue()I

    move-result v2

    invoke-virtual {p3, v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setMax(I)V

    .line 83
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getMinValue()I

    move-result v2

    invoke-virtual {p3, v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setMin(I)V

    .line 84
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getAdapter()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    move-result-object v2

    check-cast v2, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {p3, v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 85
    invoke-virtual {p3}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    .line 86
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getCurrentValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->scrollToValue(Ljava/lang/String;)V

    if-nez p2, :cond_11

    goto :goto_4

    .line 88
    :cond_11
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelFragment$atg4SSv_FvM43GnTY3AqJD4na-k;

    invoke-direct {p3, p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelFragment$atg4SSv_FvM43GnTY3AqJD4na-k;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 92
    :goto_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1

    .line 60
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wheel config must be provided."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
