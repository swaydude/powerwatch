.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "SyncFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;",
        "()V",
        "syncViewModel",
        "getSyncViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;",
        "syncViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;


# instance fields
.field private final syncViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 22
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 11
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 22
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$syncViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$syncViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->syncViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getSyncViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->syncViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;
    .locals 1

    .line 18
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->getSyncViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b007c

    return v0
.end method
