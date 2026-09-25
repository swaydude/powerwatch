.class public final Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;
.source "PairingActivity.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivityPairingBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPairingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairingActivity.kt\npowerwatch/matrix/com/pwgen2android/pair/PairingActivity\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,92:1\n54#2,3:93\n*S KotlinDebug\n*F\n+ 1 PairingActivity.kt\npowerwatch/matrix/com/pwgen2android/pair/PairingActivity\n*L\n24#1:93,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000c\u001a\u00020\u000bH\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J\u0008\u0010\u000e\u001a\u00020\u0003H\u0014J\u0012\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivityPairingBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;",
        "()V",
        "pairingActivityViewModel",
        "getPairingActivityViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;",
        "pairingActivityViewModel$delegate",
        "Lkotlin/Lazy;",
        "updateCode",
        "",
        "getBindingVariable",
        "getLayoutId",
        "getViewModel",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field private final pairingActivityViewModel$delegate:Lkotlin/Lazy;

.field private final updateCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;-><init>()V

    .line 24
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity$pairingActivityViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity$pairingActivityViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 93
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 95
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;->pairingActivityViewModel$delegate:Lkotlin/Lazy;

    const/16 v0, 0x4d2

    .line 28
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;->updateCode:I

    return-void
.end method

.method private final getPairingActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;->pairingActivityViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;

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

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0b001e

    return v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;
    .locals 1

    .line 29
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;->getPairingActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001e

    .line 37
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;->setContentView(I)V

    return-void
.end method
