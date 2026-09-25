.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "PersonalSettingsFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPersonalSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalSettingsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,58:1\n54#2,3:59\n*S KotlinDebug\n*F\n+ 1 PersonalSettingsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment\n*L\n25#1:59,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\r\u001a\u00020\u000eH\u0014J\u0008\u0010\u000f\u001a\u00020\u0003H\u0014J\u0008\u0010\u0010\u001a\u00020\u000eH\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "scrollView",
        "Landroid/widget/ScrollView;",
        "watchViewModel",
        "getWatchViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;",
        "watchViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;


# instance fields
.field private scrollView:Landroid/widget/ScrollView;

.field private final watchViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 25
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$watchViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$watchViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 59
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 61
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 25
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->watchViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;
    .locals 1

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->watchViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    return-object v0
.end method

.method public static synthetic lambda$rQyPkldVmhhflfcUXIQRYkOc1II(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->onBackClicked()V

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

    .line 21
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;
    .locals 1

    .line 29
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0071

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080165

    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p2, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    :goto_0
    const-string p3, "toolbar"

    .line 42
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0f0160

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.personal_pref_settings)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 43
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsFragment$rQyPkldVmhhflfcUXIQRYkOc1II;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsFragment$rQyPkldVmhhflfcUXIQRYkOc1II;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 47
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method
