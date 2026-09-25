.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;
.source "WatchContainerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchContainerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchContainerFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,45:1\n54#2,3:46\n*S KotlinDebug\n*F\n+ 1 WatchContainerFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment\n*L\n19#1:46,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchContainerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;",
        "()V",
        "watchContainerViewModel",
        "getWatchContainerViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;",
        "watchContainerViewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;


# instance fields
.field private final watchContainerViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 19
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 12
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;-><init>()V

    .line 19
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$watchContainerViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$watchContainerViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 46
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 48
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 19
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;->watchContainerViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getWatchContainerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;->watchContainerViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;

    move-result-object v0

    return-object v0
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;
    .locals 1

    .line 23
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;->getWatchContainerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0083

    return v0
.end method
