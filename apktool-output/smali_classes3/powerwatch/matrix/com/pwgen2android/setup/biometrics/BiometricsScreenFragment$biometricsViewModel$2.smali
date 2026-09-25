.class final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$biometricsViewModel$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BiometricsScreenFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;"
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$biometricsViewModel$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$biometricsViewModel$2;->invoke()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 2

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$biometricsViewModel$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/lifecycle/ViewModelProviders;->of(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/ViewModelProvider;

    move-result-object v0

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    const-string v1, "of(parentFragment!!).get(BiometricsViewModel::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    return-object v0
.end method
