.class final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;
.super Lkotlin/jvm/internal/Lambda;
.source "MainUserActivityFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lorg/koin/core/parameter/DefinitionParameters;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lorg/koin/core/parameter/DefinitionParameters;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;->invoke()Lorg/koin/core/parameter/DefinitionParameters;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/koin/core/parameter/DefinitionParameters;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    :goto_0
    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lorg/koin/core/parameter/DefinitionParametersKt;->parametersOf([Ljava/lang/Object;)Lorg/koin/core/parameter/DefinitionParameters;

    move-result-object v0

    return-object v0
.end method
