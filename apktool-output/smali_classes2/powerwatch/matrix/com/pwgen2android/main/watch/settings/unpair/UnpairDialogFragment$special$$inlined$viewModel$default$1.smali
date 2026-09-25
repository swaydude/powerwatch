.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LifecycleOwnerExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLifecycleOwnerExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt$viewModel$2\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,94:1\n68#2:95\n*S KotlinDebug\n*F\n+ 1 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt$viewModel$2\n*L\n56#1:95\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "<anonymous>",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "invoke",
        "()Landroidx/lifecycle/ViewModel;",
        "org/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt$viewModel$2"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $parameters:Lkotlin/jvm/functions/Function0;

.field final synthetic $qualifier:Lorg/koin/core/qualifier/Qualifier;

.field final synthetic $this_viewModel:Landroidx/lifecycle/LifecycleOwner;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->$this_viewModel:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->$qualifier:Lorg/koin/core/qualifier/Qualifier;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->$parameters:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/ViewModel;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->$this_viewModel:Landroidx/lifecycle/LifecycleOwner;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->$qualifier:Lorg/koin/core/qualifier/Qualifier;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->$parameters:Lkotlin/jvm/functions/Function0;

    .line 95
    const-class v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-static {v0, v3, v1, v2}, Lorg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt;->getViewModel(Landroidx/lifecycle/LifecycleOwner;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$special$$inlined$viewModel$default$1;->invoke()Landroidx/lifecycle/ViewModel;

    move-result-object v0

    return-object v0
.end method
